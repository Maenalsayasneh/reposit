package com.stripe.android;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/Logger;", "", "", "msg", "", "t", "Lm0/i;", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "info", "(Ljava/lang/String;)V", "debug", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Logger.kt */
public interface Logger {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0002\r\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/Logger$Companion;", "", "", "enableLogging", "Lcom/stripe/android/Logger;", "getInstance$payments_core_release", "(Z)Lcom/stripe/android/Logger;", "getInstance", "real$payments_core_release", "()Lcom/stripe/android/Logger;", "real", "noop$payments_core_release", "noop", "com/stripe/android/Logger$Companion$REAL_LOGGER$1", "REAL_LOGGER", "Lcom/stripe/android/Logger$Companion$REAL_LOGGER$1;", "com/stripe/android/Logger$Companion$NOOP_LOGGER$1", "NOOP_LOGGER", "Lcom/stripe/android/Logger$Companion$NOOP_LOGGER$1;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Logger.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE;
        private static final Logger$Companion$NOOP_LOGGER$1 NOOP_LOGGER = new Logger$Companion$NOOP_LOGGER$1();
        private static final Logger$Companion$REAL_LOGGER$1 REAL_LOGGER;
        private static final String TAG = "StripeSdk";

        static {
            Companion companion = new Companion();
            $$INSTANCE = companion;
            REAL_LOGGER = new Logger$Companion$REAL_LOGGER$1(companion);
        }

        private Companion() {
        }

        public final Logger getInstance$payments_core_release(boolean z) {
            if (z) {
                return real$payments_core_release();
            }
            return noop$payments_core_release();
        }

        public final Logger noop$payments_core_release() {
            return NOOP_LOGGER;
        }

        public final Logger real$payments_core_release() {
            return REAL_LOGGER;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    /* compiled from: Logger.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th = null;
                }
                logger.error(str, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
    }

    void debug(String str);

    void error(String str, Throwable th);

    void info(String str);
}
