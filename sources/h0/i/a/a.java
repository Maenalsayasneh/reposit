package h0.i.a;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator */
public final class a {
    public static final Class<?> a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* renamed from: h0.i.a.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityRecreator */
    public class C0039a implements Runnable {
        public final /* synthetic */ c c;
        public final /* synthetic */ Object d;

        public C0039a(c cVar, Object obj) {
            this.c = cVar;
            this.d = obj;
        }

        public void run() {
            this.c.c = this.d;
        }
    }

    /* compiled from: ActivityRecreator */
    public class b implements Runnable {
        public final /* synthetic */ Application c;
        public final /* synthetic */ c d;

        public b(Application application, c cVar) {
            this.c = application;
            this.d = cVar;
        }

        public void run() {
            this.c.unregisterActivityLifecycleCallbacks(this.d);
        }
    }

    /* compiled from: ActivityRecreator */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public boolean Y1 = false;
        public Object c;
        public Activity d;
        public final int q;
        public boolean x = false;
        public boolean y = false;

        public c(Activity activity) {
            this.d = activity;
            this.q = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.d == activity) {
                this.d = null;
                this.y = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.y && !this.Y1 && !this.x) {
                Object obj = this.c;
                int i = this.q;
                boolean z = false;
                try {
                    Object obj2 = a.c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i) {
                            a.g.postAtFrontOfQueue(new b(a.b.get(activity), obj2));
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z) {
                    this.Y1 = true;
                    this.c = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.d == activity) {
                this.x = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r2 = r0
        L_0x0024:
            b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0032 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r2 = r0
        L_0x0033:
            c = r2
            java.lang.Class<?> r2 = a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r2 = r0
            goto L_0x0055
        L_0x0040:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003e }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003e }
            r7[r1] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003e }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003e }
            r2.setAccessible(r1)     // Catch:{ all -> 0x003e }
        L_0x0055:
            d = r2
            java.lang.Class<?> r2 = a
            if (r2 != 0) goto L_0x005d
        L_0x005b:
            r2 = r0
            goto L_0x006e
        L_0x005d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x005b }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x005b }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005b }
            r7[r1] = r8     // Catch:{ all -> 0x005b }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x005b }
            r2.setAccessible(r1)     // Catch:{ all -> 0x005b }
        L_0x006e:
            e = r2
            java.lang.Class<?> r2 = a
            boolean r4 = a()
            if (r4 == 0) goto L_0x00af
            if (r2 != 0) goto L_0x007b
            goto L_0x00af
        L_0x007b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00af }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00af }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch:{ all -> 0x00af }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00af }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00af }
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00af }
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00af }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00af }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00af }
            r2.setAccessible(r1)     // Catch:{ all -> 0x00af }
            r0 = r2
        L_0x00af:
            f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.a.a.<clinit>():void");
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean b(Activity activity) {
        Object obj;
        Application application;
        c cVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                cVar = new c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = g;
                handler.post(new C0039a(cVar, obj2));
                if (a()) {
                    Method method = f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
