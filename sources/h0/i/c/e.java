package h0.i.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import h0.f.f;
import h0.i.b.d.h;
import h0.i.f.m;
import java.lang.reflect.Method;

@SuppressLint({"NewApi"})
/* compiled from: TypefaceCompat */
public class e {
    public static final l a;
    public static final f<String, Typeface> b = new f<>(16);

    /* compiled from: TypefaceCompat */
    public static class a extends m {
        public h.a a;

        public a(h.a aVar) {
            this.a = aVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new j();
        } else if (i >= 28) {
            a = new i();
        } else if (i >= 26) {
            a = new h();
        } else {
            Method method = g.d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new g();
            } else {
                a = new f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r6, h0.i.b.d.c r7, android.content.res.Resources r8, int r9, int r10, h0.i.b.d.h.a r11, android.os.Handler r12, boolean r13) {
        /*
            boolean r0 = r7 instanceof h0.i.b.d.f
            r1 = -3
            if (r0 == 0) goto L_0x0144
            h0.i.b.d.f r7 = (h0.i.b.d.f) r7
            java.lang.String r0 = r7.d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r11 == 0) goto L_0x002f
            r11.b(r0, r12)
        L_0x002f:
            return r0
        L_0x0030:
            r0 = 1
            if (r13 == 0) goto L_0x0038
            int r4 = r7.c
            if (r4 != 0) goto L_0x003b
            goto L_0x003a
        L_0x0038:
            if (r11 != 0) goto L_0x003b
        L_0x003a:
            r3 = r0
        L_0x003b:
            r0 = -1
            if (r13 == 0) goto L_0x0041
            int r13 = r7.b
            goto L_0x0042
        L_0x0041:
            r13 = r0
        L_0x0042:
            android.os.Handler r12 = h0.i.b.d.h.a.c(r12)
            h0.i.c.e$a r4 = new h0.i.c.e$a
            r4.<init>(r11)
            h0.i.f.e r7 = r7.a
            h0.i.f.c r11 = new h0.i.f.c
            r11.<init>(r4, r12)
            if (r3 == 0) goto L_0x00c8
            h0.f.f<java.lang.String, android.graphics.Typeface> r3 = h0.i.f.j.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.f
            r3.append(r5)
            java.lang.String r5 = "-"
            r3.append(r5)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            h0.f.f<java.lang.String, android.graphics.Typeface> r5 = h0.i.f.j.a
            java.lang.Object r5 = r5.a(r3)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 == 0) goto L_0x0081
            h0.i.f.a r6 = new h0.i.f.a
            r6.<init>(r11, r4, r5)
            r12.post(r6)
            r2 = r5
            goto L_0x0157
        L_0x0081:
            if (r13 != r0) goto L_0x008e
            h0.i.f.j$a r6 = h0.i.f.j.a(r3, r6, r7, r10)
            r11.a(r6)
            android.graphics.Typeface r2 = r6.a
            goto L_0x0157
        L_0x008e:
            h0.i.f.f r12 = new h0.i.f.f
            r12.<init>(r3, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = h0.i.f.j.b     // Catch:{ InterruptedException -> 0x00ba }
            java.util.concurrent.Future r6 = r6.submit(r12)     // Catch:{ InterruptedException -> 0x00ba }
            long r12 = (long) r13
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b3, InterruptedException -> 0x00b1, TimeoutException -> 0x00a9 }
            java.lang.Object r6 = r6.get(r12, r7)     // Catch:{ ExecutionException -> 0x00b3, InterruptedException -> 0x00b1, TimeoutException -> 0x00a9 }
            h0.i.f.j$a r6 = (h0.i.f.j.a) r6     // Catch:{ InterruptedException -> 0x00ba }
            r11.a(r6)     // Catch:{ InterruptedException -> 0x00ba }
            android.graphics.Typeface r2 = r6.a     // Catch:{ InterruptedException -> 0x00ba }
            goto L_0x0157
        L_0x00a9:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00ba }
            java.lang.String r7 = "timeout"
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x00ba }
            throw r6     // Catch:{ InterruptedException -> 0x00ba }
        L_0x00b1:
            r6 = move-exception
            throw r6     // Catch:{ InterruptedException -> 0x00ba }
        L_0x00b3:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00ba }
            r7.<init>(r6)     // Catch:{ InterruptedException -> 0x00ba }
            throw r7     // Catch:{ InterruptedException -> 0x00ba }
        L_0x00ba:
            h0.i.f.m r6 = r11.a
            android.os.Handler r7 = r11.b
            h0.i.f.b r12 = new h0.i.f.b
            r12.<init>(r11, r6, r1)
            r7.post(r12)
            goto L_0x0157
        L_0x00c8:
            h0.f.f<java.lang.String, android.graphics.Typeface> r13 = h0.i.f.j.a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r7.f
            r13.append(r0)
            java.lang.String r0 = "-"
            r13.append(r0)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            h0.f.f<java.lang.String, android.graphics.Typeface> r0 = h0.i.f.j.a
            java.lang.Object r0 = r0.a(r13)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f4
            h0.i.f.a r6 = new h0.i.f.a
            r6.<init>(r11, r4, r0)
            r12.post(r6)
            r2 = r0
            goto L_0x0157
        L_0x00f4:
            h0.i.f.g r12 = new h0.i.f.g
            r12.<init>(r11)
            java.lang.Object r0 = h0.i.f.j.c
            monitor-enter(r0)
            h0.f.h<java.lang.String, java.util.ArrayList<h0.i.h.a<h0.i.f.j$a>>> r11 = h0.i.f.j.d     // Catch:{ all -> 0x0141 }
            java.lang.Object r1 = r11.getOrDefault(r13, r2)     // Catch:{ all -> 0x0141 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0141 }
            if (r1 == 0) goto L_0x010b
            r1.add(r12)     // Catch:{ all -> 0x0141 }
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            goto L_0x0157
        L_0x010b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0141 }
            r1.<init>()     // Catch:{ all -> 0x0141 }
            r1.add(r12)     // Catch:{ all -> 0x0141 }
            r11.put(r13, r1)     // Catch:{ all -> 0x0141 }
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            h0.i.f.h r11 = new h0.i.f.h
            r11.<init>(r13, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = h0.i.f.j.b
            h0.i.f.i r7 = new h0.i.f.i
            r7.<init>(r13)
            android.os.Looper r12 = android.os.Looper.myLooper()
            if (r12 != 0) goto L_0x0133
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            goto L_0x0138
        L_0x0133:
            android.os.Handler r12 = new android.os.Handler
            r12.<init>()
        L_0x0138:
            h0.i.f.o r13 = new h0.i.f.o
            r13.<init>(r12, r11, r7)
            r6.execute(r13)
            goto L_0x0157
        L_0x0141:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            throw r6
        L_0x0144:
            h0.i.c.l r13 = a
            h0.i.b.d.d r7 = (h0.i.b.d.d) r7
            android.graphics.Typeface r2 = r13.a(r6, r7, r8, r10)
            if (r11 == 0) goto L_0x0157
            if (r2 == 0) goto L_0x0154
            r11.b(r2, r12)
            goto L_0x0157
        L_0x0154:
            r11.a(r1, r12)
        L_0x0157:
            if (r2 == 0) goto L_0x0162
            h0.f.f<java.lang.String, android.graphics.Typeface> r6 = b
            java.lang.String r7 = c(r8, r9, r10)
            r6.b(r7, r2)
        L_0x0162:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.c.e.a(android.content.Context, h0.i.b.d.c, android.content.res.Resources, int, int, h0.i.b.d.h$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i, String str, int i2) {
        Typeface d = a.d(context, resources, i, str, i2);
        if (d != null) {
            b.b(c(resources, i, i2), d);
        }
        return d;
    }

    public static String c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
