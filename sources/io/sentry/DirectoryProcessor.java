package io.sentry;

import io.sentry.hints.Cached;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import k0.c.a;

public abstract class DirectoryProcessor {
    private final long flushTimeoutMillis;
    private final ILogger logger;

    public static final class SendCachedEnvelopeHint implements Cached, Retryable, SubmissionResult, Flushable {
        private final long flushTimeoutMillis;
        private final CountDownLatch latch;
        private final ILogger logger;
        public boolean retry = false;
        public boolean succeeded = false;

        public SendCachedEnvelopeHint(long j, ILogger iLogger) {
            this.flushTimeoutMillis = j;
            this.latch = new CountDownLatch(1);
            this.logger = iLogger;
        }

        public boolean isRetry() {
            return this.retry;
        }

        public boolean isSuccess() {
            return this.succeeded;
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

    public DirectoryProcessor(ILogger iLogger, long j) {
        this.logger = iLogger;
        this.flushTimeoutMillis = j;
    }

    public abstract boolean isRelevantFileName(String str);

    public void processDirectory(File file) {
        try {
            ILogger iLogger = this.logger;
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            iLogger.log(sentryLevel, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.logger.log(SentryLevel.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (!file.isDirectory()) {
                this.logger.log(SentryLevel.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    this.logger.log(SentryLevel.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                    return;
                }
                File[] listFiles2 = file.listFiles(new a(this));
                ILogger iLogger2 = this.logger;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(listFiles2 != null ? listFiles2.length : 0);
                objArr[1] = file.getAbsolutePath();
                iLogger2.log(sentryLevel, "Processing %d items from cache dir %s", objArr);
                for (File file2 : listFiles) {
                    if (!file2.isFile()) {
                        this.logger.log(SentryLevel.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    } else {
                        this.logger.log(SentryLevel.DEBUG, "Processing file: %s", file2.getAbsolutePath());
                        processFile(file2, new SendCachedEnvelopeHint(this.flushTimeoutMillis, this.logger));
                    }
                }
            }
        } catch (Exception e) {
            this.logger.log(SentryLevel.ERROR, e, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    public abstract void processFile(File file, Object obj);
}
