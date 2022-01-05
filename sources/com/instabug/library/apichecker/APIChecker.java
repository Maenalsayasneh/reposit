package com.instabug.library.apichecker;

import android.util.Log;
import com.instabug.library.Instabug;
import com.instabug.library.util.InstabugSDKLogger;

public class APIChecker {
    public static final String NOT_BUILT_ERROR_MESSAGE = "Instabug API {%s} was called before the SDK is built. To build it, please call Instabug.Builder().build().";
    public static final String NOT_ENABLED_ERROR_MESSAGE = "Instabug API {%s} was called while the SDK is disabled. To enable it, please call Instabug.enable().";
    public static final String NOT_EXECUTED_ERROR_MESSAGE = "Instabug failed to execute {%s}";
    private static final String TAG = "API Checker";

    public static <T> T checkAndGet(String str, ReturnableRunnable<T> returnableRunnable, T t) {
        try {
            checkBuilt();
            checkEnabled();
            return returnableRunnable.run();
        } catch (a unused) {
            logSdkNotBuilt(str);
            return t;
        } catch (b unused2) {
            logSdkNotEnabled(str);
            return t;
        } catch (Exception e) {
            logExecutionException(str, e);
            return t;
        }
    }

    public static void checkAndRun(String str, VoidRunnable voidRunnable) {
        try {
            checkBuilt();
            checkEnabled();
            voidRunnable.run();
        } catch (a unused) {
            logSdkNotBuilt(str);
        } catch (b unused2) {
            logSdkNotEnabled(str);
        } catch (Exception e) {
            logExecutionException(str, e);
        }
    }

    public static void checkBuilt(String str, VoidRunnable voidRunnable) {
        try {
            checkBuilt();
            voidRunnable.run();
        } catch (a unused) {
            logSdkNotBuilt(str);
        } catch (Exception e) {
            logExecutionException(str, e);
        }
    }

    public static void checkEnable(String str, VoidRunnable voidRunnable) {
        try {
            checkEnabled();
            voidRunnable.run();
        } catch (b unused) {
            logSdkNotEnabled(str);
        } catch (Exception e) {
            logExecutionException(str, e);
        }
    }

    private static void checkEnabled() throws b {
        if (!Instabug.isEnabled()) {
            throw new b("Instabug API called while Instabug SDK was disabled");
        }
    }

    private static void logExecutionException(String str, Exception exc) {
        InstabugSDKLogger.e(TAG, String.format(NOT_EXECUTED_ERROR_MESSAGE, new Object[]{str}) + " due to" + exc.getMessage());
    }

    private static void logSdkNotBuilt(String str) {
        Log.e(TAG, String.format(NOT_BUILT_ERROR_MESSAGE, new Object[]{str}));
    }

    private static void logSdkNotEnabled(String str) {
        Log.e(TAG, String.format(NOT_ENABLED_ERROR_MESSAGE, new Object[]{str}));
    }

    private static void checkBuilt() throws a {
        if (!Instabug.isBuilt()) {
            throw new a("Instabug API called before Instabug.Builder().build() was called");
        }
    }
}
