package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.util.ConnectivityChecker;
import io.sentry.transport.ITransportGate;

public final class AndroidTransportGate implements ITransportGate {
    private final Context context;
    private final ILogger logger;

    /* renamed from: io.sentry.android.core.AndroidTransportGate$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$sentry$android$core$util$ConnectivityChecker$Status;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            /*
                io.sentry.android.core.util.ConnectivityChecker.Status.values()
                r0 = 4
                int[] r0 = new int[r0]
                $SwitchMap$io$sentry$android$core$util$ConnectivityChecker$Status = r0
                io.sentry.android.core.util.ConnectivityChecker$Status r1 = io.sentry.android.core.util.ConnectivityChecker.Status.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r0 = $SwitchMap$io$sentry$android$core$util$ConnectivityChecker$Status     // Catch:{ NoSuchFieldError -> 0x001c }
                io.sentry.android.core.util.ConnectivityChecker$Status r1 = io.sentry.android.core.util.ConnectivityChecker.Status.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x001c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r0 = $SwitchMap$io$sentry$android$core$util$ConnectivityChecker$Status     // Catch:{ NoSuchFieldError -> 0x0027 }
                io.sentry.android.core.util.ConnectivityChecker$Status r1 = io.sentry.android.core.util.ConnectivityChecker.Status.NO_PERMISSION     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.AndroidTransportGate.AnonymousClass1.<clinit>():void");
        }
    }

    public AndroidTransportGate(Context context2, ILogger iLogger) {
        this.context = context2;
        this.logger = iLogger;
    }

    public boolean isConnected() {
        return isConnected(ConnectivityChecker.getConnectionStatus(this.context, this.logger));
    }

    public boolean isConnected(ConnectivityChecker.Status status) {
        int ordinal = status.ordinal();
        return ordinal == 0 || ordinal == 2 || ordinal == 3;
    }
}
