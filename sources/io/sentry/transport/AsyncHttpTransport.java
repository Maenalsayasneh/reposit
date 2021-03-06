package io.sentry.transport;

import i0.d.a.a.a;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.hints.Cached;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.IOException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class AsyncHttpTransport implements ITransport {
    /* access modifiers changed from: private */
    public final HttpConnection connection;
    private final IEnvelopeCache envelopeCache;
    private final QueuedThreadPoolExecutor executor;
    /* access modifiers changed from: private */
    public final SentryOptions options;
    private final RateLimiter rateLimiter;
    /* access modifiers changed from: private */
    public final ITransportGate transportGate;

    public static final class AsyncConnectionThreadFactory implements ThreadFactory {
        private int cnt;

        private AsyncConnectionThreadFactory() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder P0 = a.P0("SentryAsyncConnection-");
            int i = this.cnt;
            this.cnt = i + 1;
            P0.append(i);
            Thread thread = new Thread(runnable, P0.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public final class EnvelopeSender implements Runnable {
        /* access modifiers changed from: private */
        public final SentryEnvelope envelope;
        private final IEnvelopeCache envelopeCache;
        private final TransportResult failedResult = TransportResult.error();
        /* access modifiers changed from: private */
        public final Object hint;

        public EnvelopeSender(SentryEnvelope sentryEnvelope, Object obj, IEnvelopeCache iEnvelopeCache) {
            this.envelope = (SentryEnvelope) Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
            this.hint = obj;
            this.envelopeCache = (IEnvelopeCache) Objects.requireNonNull(iEnvelopeCache, "EnvelopeCache is required.");
        }

        private TransportResult flush() {
            TransportResult transportResult = this.failedResult;
            this.envelopeCache.store(this.envelope, this.hint);
            Object obj = this.hint;
            if (obj instanceof DiskFlushNotification) {
                ((DiskFlushNotification) obj).markFlushed();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
            if (AsyncHttpTransport.this.transportGate.isConnected()) {
                try {
                    transportResult = AsyncHttpTransport.this.connection.send(this.envelope);
                    if (transportResult.isSuccess()) {
                        this.envelopeCache.discard(this.envelope);
                    } else {
                        String str = "The transport failed to send the envelope with response code " + transportResult.getResponseCode();
                        AsyncHttpTransport.this.options.getLogger().log(SentryLevel.ERROR, str, new Object[0]);
                        throw new IllegalStateException(str);
                    }
                } catch (IOException e) {
                    Object obj2 = this.hint;
                    if (obj2 instanceof Retryable) {
                        ((Retryable) obj2).setRetry(true);
                    } else {
                        LogUtils.logIfNotRetryable(AsyncHttpTransport.this.options.getLogger(), this.hint);
                    }
                    throw new IllegalStateException("Sending the event failed.", e);
                }
            } else {
                Object obj3 = this.hint;
                if (obj3 instanceof Retryable) {
                    ((Retryable) obj3).setRetry(true);
                } else {
                    LogUtils.logIfNotRetryable(AsyncHttpTransport.this.options.getLogger(), this.hint);
                }
            }
            return transportResult;
        }

        public void run() {
            TransportResult transportResult = this.failedResult;
            try {
                transportResult = flush();
                ILogger logger = AsyncHttpTransport.this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.log(sentryLevel, "Envelope flushed", new Object[0]);
                if (this.hint instanceof SubmissionResult) {
                    AsyncHttpTransport.this.options.getLogger().log(sentryLevel, "Marking envelope submission result: %s", Boolean.valueOf(transportResult.isSuccess()));
                    ((SubmissionResult) this.hint).setResult(transportResult.isSuccess());
                }
            } catch (Exception e) {
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.ERROR, e, "Envelope submission failed", new Object[0]);
                throw e;
            } catch (Throwable th) {
                if (this.hint instanceof SubmissionResult) {
                    AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(transportResult.isSuccess()));
                    ((SubmissionResult) this.hint).setResult(transportResult.isSuccess());
                }
                throw th;
            }
        }
    }

    public AsyncHttpTransport(SentryOptions sentryOptions, RateLimiter rateLimiter2, ITransportGate iTransportGate, RequestDetails requestDetails) {
        this(initExecutor(sentryOptions.getMaxQueueSize(), sentryOptions.getEnvelopeDiskCache(), sentryOptions.getLogger()), sentryOptions, rateLimiter2, iTransportGate, new HttpConnection(sentryOptions, requestDetails, rateLimiter2));
    }

    private static QueuedThreadPoolExecutor initExecutor(int i, IEnvelopeCache iEnvelopeCache, ILogger iLogger) {
        return new QueuedThreadPoolExecutor(1, i, new AsyncConnectionThreadFactory(), new k0.c.y.a(iEnvelopeCache, iLogger), iLogger);
    }

    public static /* synthetic */ void lambda$initExecutor$0(IEnvelopeCache iEnvelopeCache, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof EnvelopeSender) {
            EnvelopeSender envelopeSender = (EnvelopeSender) runnable;
            if (!(envelopeSender.hint instanceof Cached)) {
                iEnvelopeCache.store(envelopeSender.envelope, envelopeSender.hint);
            }
            markHintWhenSendingFailed(envelopeSender.hint, true);
            iLogger.log(SentryLevel.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    private static void markHintWhenSendingFailed(Object obj, boolean z) {
        if (obj instanceof SubmissionResult) {
            ((SubmissionResult) obj).setResult(false);
        }
        if (obj instanceof Retryable) {
            ((Retryable) obj).setRetry(z);
        }
    }

    public void close() throws IOException {
        this.executor.shutdown();
        this.options.getLogger().log(SentryLevel.DEBUG, "Shutting down", new Object[0]);
        try {
            if (!this.executor.awaitTermination(1, TimeUnit.MINUTES)) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
                this.executor.shutdownNow();
            }
        } catch (InterruptedException unused) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    public void flush(long j) {
        this.executor.waitTillIdle(j);
    }

    public void send(SentryEnvelope sentryEnvelope, Object obj) throws IOException {
        IEnvelopeCache iEnvelopeCache = this.envelopeCache;
        boolean z = false;
        if (obj instanceof Cached) {
            iEnvelopeCache = NoOpEnvelopeCache.getInstance();
            this.options.getLogger().log(SentryLevel.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        }
        SentryEnvelope filter = this.rateLimiter.filter(sentryEnvelope, obj);
        if (filter != null) {
            this.executor.submit(new EnvelopeSender(filter, obj, iEnvelopeCache));
        } else if (z) {
            this.envelopeCache.discard(sentryEnvelope);
        }
    }

    public AsyncHttpTransport(QueuedThreadPoolExecutor queuedThreadPoolExecutor, SentryOptions sentryOptions, RateLimiter rateLimiter2, ITransportGate iTransportGate, HttpConnection httpConnection) {
        this.executor = (QueuedThreadPoolExecutor) Objects.requireNonNull(queuedThreadPoolExecutor, "executor is required");
        this.envelopeCache = (IEnvelopeCache) Objects.requireNonNull(sentryOptions.getEnvelopeDiskCache(), "envelopeCache is required");
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options is required");
        this.rateLimiter = (RateLimiter) Objects.requireNonNull(rateLimiter2, "rateLimiter is required");
        this.transportGate = (ITransportGate) Objects.requireNonNull(iTransportGate, "transportGate is required");
        this.connection = (HttpConnection) Objects.requireNonNull(httpConnection, "httpConnection is required");
    }
}
