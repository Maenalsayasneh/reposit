package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;

public final class AndroidLogger implements ILogger {
    private static final String tag = "Sentry";

    /* renamed from: io.sentry.android.core.AndroidLogger$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$sentry$SentryLevel;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0032 */
        static {
            /*
                io.sentry.SentryLevel.values()
                r0 = 5
                int[] r1 = new int[r0]
                $SwitchMap$io$sentry$SentryLevel = r1
                io.sentry.SentryLevel r2 = io.sentry.SentryLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = $SwitchMap$io$sentry$SentryLevel     // Catch:{ NoSuchFieldError -> 0x001c }
                io.sentry.SentryLevel r2 = io.sentry.SentryLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = $SwitchMap$io$sentry$SentryLevel     // Catch:{ NoSuchFieldError -> 0x0027 }
                io.sentry.SentryLevel r2 = io.sentry.SentryLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r3 = 3
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r1 = $SwitchMap$io$sentry$SentryLevel     // Catch:{ NoSuchFieldError -> 0x0032 }
                io.sentry.SentryLevel r2 = io.sentry.SentryLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 4
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r1 = $SwitchMap$io$sentry$SentryLevel     // Catch:{ NoSuchFieldError -> 0x003c }
                io.sentry.SentryLevel r2 = io.sentry.SentryLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.AndroidLogger.AnonymousClass1.<clinit>():void");
        }
    }

    private int toLogcatLevel(SentryLevel sentryLevel) {
        int ordinal = sentryLevel.ordinal();
        if (ordinal == 1) {
            return 4;
        }
        if (ordinal != 2) {
            return ordinal != 4 ? 3 : 7;
        }
        return 5;
    }

    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        Log.println(toLogcatLevel(sentryLevel), tag, String.format(str, objArr));
    }

    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        log(sentryLevel, String.format(str, objArr), th);
    }

    public void log(SentryLevel sentryLevel, String str, Throwable th) {
        int ordinal = sentryLevel.ordinal();
        if (ordinal == 1) {
            Log.i(tag, str, th);
        } else if (ordinal == 2) {
            Log.w(tag, str, th);
        } else if (ordinal == 3) {
            Log.e(tag, str, th);
        } else if (ordinal != 4) {
            Log.d(tag, str, th);
        } else {
            Log.wtf(tag, str, th);
        }
    }
}
