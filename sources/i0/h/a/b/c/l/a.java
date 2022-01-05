package i0.h.a.b.c.l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;
import i0.h.a.b.c.i.l0;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class a {
    public static final Object a = new Object();
    public static volatile a b;
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> c = new ConcurrentHashMap<>();

    @RecentlyNonNull
    public static a b() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        a aVar = b;
        Objects.requireNonNull(aVar, "null reference");
        return aVar;
    }

    public boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof l0)) || !this.c.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService(this.c.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                this.c.remove(serviceConnection);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(@androidx.annotation.RecentlyNonNull android.content.Context r5, @androidx.annotation.RecentlyNonNull java.lang.String r6, @androidx.annotation.RecentlyNonNull android.content.Intent r7, @androidx.annotation.RecentlyNonNull android.content.ServiceConnection r8, int r9) {
        /*
            r4 = this;
            android.content.ComponentName r0 = r7.getComponent()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x0029
        L_0x0009:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = "com.google.android.gms"
            r3.equals(r0)
            i0.h.a.b.c.n.a r3 = i0.h.a.b.c.n.b.a(r5)     // Catch:{ NameNotFoundException -> 0x0029 }
            android.content.Context r3 = r3.a     // Catch:{ NameNotFoundException -> 0x0029 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0029 }
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0029 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x0029 }
            r3 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            java.lang.String r3 = "ConnectionTracker"
            if (r0 == 0) goto L_0x0034
            java.lang.String r5 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r3, r5)
            goto L_0x0074
        L_0x0034:
            boolean r0 = r8 instanceof i0.h.a.b.c.i.l0
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006f
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r4.c
            java.lang.Object r0 = r0.putIfAbsent(r8, r8)
            android.content.ServiceConnection r0 = (android.content.ServiceConnection) r0
            if (r0 == 0) goto L_0x005c
            if (r8 == r0) goto L_0x005c
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r8
            r0[r1] = r6
            r6 = 2
            java.lang.String r1 = r7.getAction()
            r0[r6] = r1
            java.lang.String r6 = "Duplicate binding with the same ServiceConnection: %s, %s, %s."
            java.lang.String r6 = java.lang.String.format(r6, r0)
            android.util.Log.w(r3, r6)
        L_0x005c:
            boolean r5 = r5.bindService(r7, r8, r9)     // Catch:{ all -> 0x0068 }
            if (r5 != 0) goto L_0x0073
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r6 = r4.c
            r6.remove(r8, r8)
            goto L_0x0073
        L_0x0068:
            r5 = move-exception
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r6 = r4.c
            r6.remove(r8, r8)
            throw r5
        L_0x006f:
            boolean r5 = r5.bindService(r7, r8, r9)
        L_0x0073:
            r2 = r5
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.l.a.d(android.content.Context, java.lang.String, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }
}
