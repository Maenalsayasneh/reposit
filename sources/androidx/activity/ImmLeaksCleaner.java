package androidx.activity;

import android.app.Activity;
import h0.q.n;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements n {
    public static int c;
    public static Field d;
    public static Field q;
    public static Field x;
    public Activity y;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(h0.q.p r3, androidx.lifecycle.Lifecycle.Event r4) {
        /*
            r2 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = c
            r4 = 1
            if (r3 != 0) goto L_0x0036
            r3 = 2
            c = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            q = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            x = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            d = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            c = r4     // Catch:{ NoSuchFieldException -> 0x0036 }
        L_0x0036:
            int r3 = c
            if (r3 != r4) goto L_0x0077
            android.app.Activity r3 = r2.y
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = d     // Catch:{ IllegalAccessException -> 0x0077 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0077 }
            if (r4 != 0) goto L_0x004d
            return
        L_0x004d:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = q     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            if (r0 != 0) goto L_0x005a
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x005a:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0062
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0062:
            java.lang.reflect.Field r0 = x     // Catch:{ IllegalAccessException -> 0x006d }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            r3.isActive()
            goto L_0x0077
        L_0x006d:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x006f:
            r3 = move-exception
            goto L_0x0075
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0073:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0075:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r3
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.a(h0.q.p, androidx.lifecycle.Lifecycle$Event):void");
    }
}
