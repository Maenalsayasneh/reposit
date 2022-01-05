package com.stripe.android.stripe3ds2.transaction;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/stripe/android/stripe3ds2/transaction/Logger$Companion$NOOP_LOGGER$1", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "", "msg", "Lm0/i;", "info", "(Ljava/lang/String;)V", "", "t", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Logger.kt */
public final class Logger$Companion$NOOP_LOGGER$1 implements Logger {
    public void error(String str, Throwable th) {
        i.e(str, NotificationCompat.CATEGORY_MESSAGE);
    }

    public void info(String str) {
        i.e(str, NotificationCompat.CATEGORY_MESSAGE);
    }
}
