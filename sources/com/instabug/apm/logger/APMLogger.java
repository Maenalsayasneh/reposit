package com.instabug.apm.logger;

import android.util.Log;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.g.a;

public final class APMLogger {
    private APMLogger() {
    }

    public static void d(String str) {
        if (a.i().c(4)) {
            Log.d("Instabug - APM", str);
        }
    }

    public static void e(String str) {
        if (a.i().c(1)) {
            Log.e("Instabug - APM", str);
        }
    }

    public static void i(String str) {
        if (a.i().c(3)) {
            Log.i("Instabug - APM", str);
        }
    }

    public static void logSDKDebug(String str) {
        a.i().e(str);
    }

    public static void logSDKError(String str, Throwable th) {
        a.i().b(str, th);
    }

    public static void logSDKInfo(String str) {
        if (a.i().c(3)) {
            Log.i("Instabug - APM", str);
        }
        InstabugSDKLogger.p("Instabug - APM", str);
    }

    public static void logSDKProtected(String str) {
        a.i();
        InstabugSDKLogger.p("Instabug - APM", str);
    }

    public static void logSDKVerbose(String str) {
        if (a.i().c(5)) {
            Log.v("Instabug - APM", str);
        }
        InstabugSDKLogger.p("Instabug - APM", str);
    }

    public static void logSDKWarning(String str) {
        a.i().g(str);
    }

    public static void v(String str) {
        if (a.i().c(5)) {
            Log.v("Instabug - APM", str);
        }
    }

    public static void w(String str) {
        if (a.i().c(2)) {
            Log.w("Instabug - APM", str);
        }
    }

    public static void logSDKError(String str) {
        a.i().f(str);
    }
}
