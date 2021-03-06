package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.IEnvelopeSender;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.hints.ApplyScopeData;
import io.sentry.hints.Cached;
import io.sentry.hints.Flushable;
import io.sentry.hints.Resettable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.Objects;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class EnvelopeFileObserver extends FileObserver {
    private final IEnvelopeSender envelopeSender;
    private final long flushTimeoutMillis;
    private final ILogger logger;
    private final String rootPath;

    public static final class CachedEnvelopeHint implements Cached, Retryable, SubmissionResult, Flushable, ApplyScopeData, Resettable {
        private final long flushTimeoutMillis;
        private CountDownLatch latch;
        private final ILogger logger;
        public boolean retry;
        public boolean succeeded;

        public CachedEnvelopeHint(long j, ILogger iLogger) {
            reset();
            this.flushTimeoutMillis = j;
            this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required.");
        }

        public boolean isRetry() {
            return this.retry;
        }

        public boolean isSuccess() {
            return this.succeeded;
        }

        public void reset() {
            this.latch = new CountDownLatch(1);
            this.retry = false;
            this.succeeded = false;
        }

        public void setResult(boolean z) {
            this.succeeded = z;
            this.latch.countDown();
        }

        public void setRetry(boolean z) {
            this.retry = z;
        }

        public boolean waitFlush() {
            try {
                return this.latch.await(this.flushTimeoutMillis, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.logger.log(SentryLevel.ERROR, "Exception while awaiting on lock.", (Throwable) e);
                return false;
            }
        }
    }

    public EnvelopeFileObserver(String str, IEnvelopeSender iEnvelopeSender, ILogger iLogger, long j) {
        super(str);
        this.rootPath = (String) Objects.requireNonNull(str, "File path is required.");
        this.envelopeSender = (IEnvelopeSender) Objects.requireNonNull(iEnvelopeSender, "Envelope sender is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
        this.flushTimeoutMillis = j;
    }

    public void onEvent(int i, String str) {
        if (str != null && i == 8) {
            this.logger.log(SentryLevel.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i), this.rootPath, str);
            CachedEnvelopeHint cachedEnvelopeHint = new CachedEnvelopeHint(this.flushTimeoutMillis, this.logger);
            IEnvelopeSender iEnvelopeSender = this.envelopeSender;
            iEnvelopeSender.processEnvelopeFile(this.rootPath + File.separator + str, cachedEnvelopeHint);
        }
    }
}
