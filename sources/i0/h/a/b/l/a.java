package i0.h.a.b.l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import h0.b0.v;
import i0.h.a.b.c.m.d;
import i0.h.a.b.c.m.e;
import i0.h.a.b.c.n.b;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    public static ScheduledExecutorService a;
    public final Object b;
    public final PowerManager.WakeLock c;
    public WorkSource d;
    public final int e;
    public final String f;
    public final Context g;
    public boolean h;
    public final Map<String, Integer[]> i;
    public int j;
    public AtomicInteger k;

    public a(Context context, int i2, String str) {
        i0.h.a.b.c.k.a aVar;
        WorkSource workSource = null;
        String packageName = context == null ? null : context.getPackageName();
        this.b = this;
        this.h = true;
        this.i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.k = new AtomicInteger(0);
        v.A(context, "WakeLock: context must not be null");
        v.y(str, "WakeLock: wakeLockName must not be empty");
        this.e = i2;
        this.g = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.f = str.length() != 0 ? "*gcore*:".concat(str) : new String("*gcore*:");
        } else {
            this.f = str;
        }
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(i2, str);
        if (e.a(context)) {
            packageName = d.a(packageName) ? context.getPackageName() : packageName;
            if (!(context.getPackageManager() == null || packageName == null)) {
                try {
                    ApplicationInfo applicationInfo = b.a(context).a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", packageName.length() != 0 ? "Could not get applicationInfo from package: ".concat(packageName) : new String("Could not get applicationInfo from package: "));
                    } else {
                        int i3 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method = e.b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, new Object[]{Integer.valueOf(i3), packageName});
                            } catch (Exception e2) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                            }
                        } else {
                            Method method2 = e.a;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, new Object[]{Integer.valueOf(i3)});
                                } catch (Exception e3) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", packageName.length() != 0 ? "Could not find package: ".concat(packageName) : new String("Could not find package: "));
                }
            }
            this.d = workSource;
            if (workSource != null && e.a(this.g)) {
                WorkSource workSource2 = this.d;
                if (workSource2 != null) {
                    workSource2.add(workSource);
                } else {
                    this.d = workSource;
                }
                try {
                    this.c.setWorkSource(this.d);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e4) {
                    Log.wtf("WakeLock", e4.toString());
                }
            }
        }
        if (a == null) {
            synchronized (v.class) {
                if (v.a == null) {
                    v.a = new i0.h.a.b.c.k.b();
                }
                aVar = v.a;
            }
            Objects.requireNonNull((i0.h.a.b.c.k.b) aVar);
            a = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r3 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r7.j == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        h0.b0.v.m0(r7.c, (java.lang.String) null);
        c();
        r7.j++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.k
            r0.incrementAndGet()
            boolean r0 = r7.h
            r1 = 0
            if (r0 == 0) goto L_0x000d
            android.text.TextUtils.isEmpty(r1)
        L_0x000d:
            java.lang.Object r0 = r7.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.i     // Catch:{ all -> 0x0087 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0087 }
            r3 = 0
            if (r2 == 0) goto L_0x001d
            int r2 = r7.j     // Catch:{ all -> 0x0087 }
            if (r2 <= 0) goto L_0x002c
        L_0x001d:
            android.os.PowerManager$WakeLock r2 = r7.c     // Catch:{ all -> 0x0087 }
            boolean r2 = r2.isHeld()     // Catch:{ all -> 0x0087 }
            if (r2 != 0) goto L_0x002c
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.i     // Catch:{ all -> 0x0087 }
            r2.clear()     // Catch:{ all -> 0x0087 }
            r7.j = r3     // Catch:{ all -> 0x0087 }
        L_0x002c:
            boolean r2 = r7.h     // Catch:{ all -> 0x0087 }
            r4 = 1
            if (r2 == 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.i     // Catch:{ all -> 0x0087 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0087 }
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch:{ all -> 0x0087 }
            if (r2 != 0) goto L_0x004a
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r7.i     // Catch:{ all -> 0x0087 }
            java.lang.Integer[] r5 = new java.lang.Integer[r4]     // Catch:{ all -> 0x0087 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0087 }
            r5[r3] = r6     // Catch:{ all -> 0x0087 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0087 }
            r3 = r4
            goto L_0x0057
        L_0x004a:
            r5 = r2[r3]     // Catch:{ all -> 0x0087 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0087 }
            int r5 = r5 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0087 }
            r2[r3] = r5     // Catch:{ all -> 0x0087 }
        L_0x0057:
            if (r3 != 0) goto L_0x0061
        L_0x0059:
            boolean r2 = r7.h     // Catch:{ all -> 0x0087 }
            if (r2 != 0) goto L_0x006e
            int r2 = r7.j     // Catch:{ all -> 0x0087 }
            if (r2 != 0) goto L_0x006e
        L_0x0061:
            android.os.PowerManager$WakeLock r2 = r7.c     // Catch:{ all -> 0x0087 }
            h0.b0.v.m0(r2, r1)     // Catch:{ all -> 0x0087 }
            r7.c()     // Catch:{ all -> 0x0087 }
            int r1 = r7.j     // Catch:{ all -> 0x0087 }
            int r1 = r1 + r4
            r7.j = r1     // Catch:{ all -> 0x0087 }
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            android.os.PowerManager$WakeLock r0 = r7.c
            r0.acquire()
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            java.util.concurrent.ScheduledExecutorService r0 = a
            i0.h.a.b.l.b r1 = new i0.h.a.b.l.b
            r1.<init>(r7)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r8, r2)
        L_0x0086:
            return
        L_0x0087:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.l.a.a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r4 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r6.j == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        h0.b0.v.m0(r6.c, (java.lang.String) null);
        c();
        r6.j--;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r6.k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0019
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r6.f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L_0x0019:
            boolean r0 = r6.h
            r1 = 0
            if (r0 == 0) goto L_0x0021
            android.text.TextUtils.isEmpty(r1)
        L_0x0021:
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            boolean r2 = r6.h     // Catch:{ all -> 0x006d }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r6.i     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x006d }
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch:{ all -> 0x006d }
            r4 = 0
            if (r2 != 0) goto L_0x0035
            goto L_0x0051
        L_0x0035:
            r5 = r2[r4]     // Catch:{ all -> 0x006d }
            int r5 = r5.intValue()     // Catch:{ all -> 0x006d }
            if (r5 != r3) goto L_0x0044
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r6.i     // Catch:{ all -> 0x006d }
            r2.remove(r1)     // Catch:{ all -> 0x006d }
            r4 = r3
            goto L_0x0051
        L_0x0044:
            r5 = r2[r4]     // Catch:{ all -> 0x006d }
            int r5 = r5.intValue()     // Catch:{ all -> 0x006d }
            int r5 = r5 - r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x006d }
            r2[r4] = r5     // Catch:{ all -> 0x006d }
        L_0x0051:
            if (r4 != 0) goto L_0x005b
        L_0x0053:
            boolean r2 = r6.h     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x0068
            int r2 = r6.j     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x0068
        L_0x005b:
            android.os.PowerManager$WakeLock r2 = r6.c     // Catch:{ all -> 0x006d }
            h0.b0.v.m0(r2, r1)     // Catch:{ all -> 0x006d }
            r6.c()     // Catch:{ all -> 0x006d }
            int r1 = r6.j     // Catch:{ all -> 0x006d }
            int r1 = r1 - r3
            r6.j = r1     // Catch:{ all -> 0x006d }
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            r6.d()
            return
        L_0x006d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.l.a.b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> c() {
        /*
            r11 = this;
            android.os.WorkSource r0 = r11.d
            java.lang.reflect.Method r1 = i0.h.a.b.c.m.e.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "null reference"
            java.lang.String r3 = "Unable to assign blame through WorkSource"
            java.lang.String r4 = "WorkSourceUtil"
            r5 = 0
            if (r0 != 0) goto L_0x0013
            goto L_0x002b
        L_0x0013:
            java.lang.reflect.Method r6 = i0.h.a.b.c.m.e.c
            if (r6 == 0) goto L_0x002b
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch:{ Exception -> 0x0027 }
            java.util.Objects.requireNonNull(r6, r2)     // Catch:{ Exception -> 0x0027 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0027 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0027 }
            goto L_0x002c
        L_0x0027:
            r6 = move-exception
            android.util.Log.wtf(r4, r3, r6)
        L_0x002b:
            r6 = r5
        L_0x002c:
            if (r6 != 0) goto L_0x002f
            goto L_0x005a
        L_0x002f:
            r7 = r5
        L_0x0030:
            if (r7 >= r6) goto L_0x005a
            java.lang.reflect.Method r8 = i0.h.a.b.c.m.e.d
            if (r8 == 0) goto L_0x004a
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0046 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0046 }
            r9[r5] = r10     // Catch:{ Exception -> 0x0046 }
            java.lang.Object r8 = r8.invoke(r0, r9)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0046 }
            goto L_0x004b
        L_0x0046:
            r8 = move-exception
            android.util.Log.wtf(r4, r3, r8)
        L_0x004a:
            r8 = 0
        L_0x004b:
            boolean r9 = i0.h.a.b.c.m.d.a(r8)
            if (r9 != 0) goto L_0x0057
            java.util.Objects.requireNonNull(r8, r2)
            r1.add(r8)
        L_0x0057:
            int r7 = r7 + 1
            goto L_0x0030
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.l.a.c():java.util.List");
    }

    public final void d() {
        if (this.c.isHeld()) {
            try {
                this.c.release();
            } catch (RuntimeException e2) {
                if (e2.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f).concat(" was already released!"), e2);
                } else {
                    throw e2;
                }
            }
            this.c.isHeld();
        }
    }
}
