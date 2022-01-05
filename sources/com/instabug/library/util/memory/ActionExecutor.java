package com.instabug.library.util.memory;

import android.content.Context;
import android.widget.Toast;
import com.instabug.library.Instabug;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.predicate.Predicate;

public class ActionExecutor {
    public static final String TAG = "ActionExecutor";
    public final Predicate[] a;

    public ActionExecutor(Predicate... predicateArr) {
        this.a = predicateArr;
    }

    public final void a(String str) {
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext == null) {
            InstabugSDKLogger.w(TAG, "unable to showWarningMessage due to null context");
        } else {
            Toast.makeText(applicationContext, str, 0).show();
        }
    }

    public final boolean b() {
        for (Predicate check : this.a) {
            if (!check.check()) {
                return false;
            }
        }
        return true;
    }

    public void doAction(Action action) {
        try {
            if (b()) {
                action.onAffirmed();
            } else {
                action.onDenied();
            }
        } catch (Throwable th) {
            InstabugSDKLogger.e(TAG, th.getClass().getSimpleName(), th);
        }
    }

    public void doActionWithWarning(String str, Action action) {
        try {
            if (b()) {
                action.onAffirmed();
                return;
            }
            a(str);
            action.onDenied();
        } catch (Throwable th) {
            InstabugSDKLogger.e(TAG, th.getClass().getSimpleName(), th);
        }
    }

    public void doAction(Action action, ThrowableAction throwableAction) {
        try {
            if (b()) {
                action.onAffirmed();
            } else {
                action.onDenied();
            }
        } catch (Throwable th) {
            InstabugSDKLogger.e(TAG, th.getClass().getSimpleName(), th);
            throwableAction.onDetected(th);
        }
    }

    public void doActionWithWarning(String str, Action action, ThrowableAction throwableAction) {
        try {
            if (b()) {
                action.onAffirmed();
                return;
            }
            a(str);
            action.onDenied();
        } catch (Throwable th) {
            InstabugSDKLogger.e(TAG, th.getClass().getSimpleName(), th);
            throwableAction.onDetected(th);
        }
    }
}
