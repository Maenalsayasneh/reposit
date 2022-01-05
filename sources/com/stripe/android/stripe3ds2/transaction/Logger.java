package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger;", "", "", "msg", "", "t", "Lm0/i;", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "info", "(Ljava/lang/String;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Logger.kt */
public interface Logger {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;", "", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "real$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/Logger;", "real", "noop$3ds2sdk_release", "noop", "com/stripe/android/stripe3ds2/transaction/Logger$Companion$REAL_LOGGER$1", "REAL_LOGGER", "Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion$REAL_LOGGER$1;", "com/stripe/android/stripe3ds2/transaction/Logger$Companion$NOOP_LOGGER$1", "NOOP_LOGGER", "Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion$NOOP_LOGGER$1;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
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

        public final Logger noop$3ds2sdk_release() {
            return NOOP_LOGGER;
        }

        public final Logger real$3ds2sdk_release() {
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

    void error(String str, Throwable th);

    void info(String str);
}
