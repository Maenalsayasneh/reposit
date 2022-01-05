package i0.h.c.t;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class b0 implements Callable {
    public final c0 c;

    public b0(c0 c0Var) {
        this.c = c0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (r3.read() != -1) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        r3 = i0.h.a.b.g.f.c.a(r5, 2147483639);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r14 = this;
            i0.h.c.t.c0 r0 = r14.c
            java.net.URL r1 = r0.c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 22
            r3.<init>(r2)
            java.lang.String r2 = "Starting download of: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FirebaseMessaging"
            android.util.Log.i(r2, r1)
            java.net.URL r1 = r0.c
            java.net.URLConnection r1 = r1.openConnection()
            int r3 = r1.getContentLength()
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r3 > r4) goto L_0x0132
            java.io.InputStream r1 = r1.getInputStream()
            r0.q = r1     // Catch:{ all -> 0x0124 }
            int r3 = i0.h.a.b.g.f.c.a     // Catch:{ all -> 0x0124 }
            i0.h.a.b.g.f.b r3 = new i0.h.a.b.g.f.b     // Catch:{ all -> 0x0124 }
            r3.<init>(r1)     // Catch:{ all -> 0x0124 }
            java.util.ArrayDeque r5 = new java.util.ArrayDeque     // Catch:{ all -> 0x0124 }
            r6 = 20
            r5.<init>(r6)     // Catch:{ all -> 0x0124 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r7 = 0
            r8 = r7
        L_0x004a:
            r9 = -1
            r10 = 2147483639(0x7ffffff7, float:NaN)
            if (r8 >= r10) goto L_0x0086
            int r10 = r10 - r8
            int r10 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x0124 }
            byte[] r11 = new byte[r10]     // Catch:{ all -> 0x0124 }
            r5.add(r11)     // Catch:{ all -> 0x0124 }
            r12 = r7
        L_0x005b:
            if (r12 >= r10) goto L_0x006d
            int r13 = r10 - r12
            int r13 = r3.read(r11, r12, r13)     // Catch:{ all -> 0x0124 }
            if (r13 != r9) goto L_0x006a
            byte[] r3 = i0.h.a.b.g.f.c.a(r5, r8)     // Catch:{ all -> 0x0124 }
            goto L_0x0090
        L_0x006a:
            int r12 = r12 + r13
            int r8 = r8 + r13
            goto L_0x005b
        L_0x006d:
            long r9 = (long) r6     // Catch:{ all -> 0x0124 }
            long r9 = r9 + r9
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x007a
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x004a
        L_0x007a:
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0084
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x004a
        L_0x0084:
            int r6 = (int) r9     // Catch:{ all -> 0x0124 }
            goto L_0x004a
        L_0x0086:
            int r3 = r3.read()     // Catch:{ all -> 0x0124 }
            if (r3 != r9) goto L_0x011c
            byte[] r3 = i0.h.a.b.g.f.c.a(r5, r10)     // Catch:{ all -> 0x0124 }
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            r1.close()
        L_0x0095:
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x00c5
            java.net.URL r1 = r0.c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 34
            r6.<init>(r5)
            java.lang.String r5 = "Downloaded "
            r6.append(r5)
            int r5 = r3.length
            r6.append(r5)
            java.lang.String r5 = " bytes from "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            android.util.Log.v(r2, r1)
        L_0x00c5:
            int r1 = r3.length
            if (r1 > r4) goto L_0x0114
            int r1 = r3.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r7, r1)
            if (r1 == 0) goto L_0x00f7
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L_0x00f6
            java.net.URL r0 = r0.c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 31
            r4.<init>(r3)
            java.lang.String r3 = "Successfully downloaded image: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.d(r2, r0)
        L_0x00f6:
            return r1
        L_0x00f7:
            java.io.IOException r1 = new java.io.IOException
            java.net.URL r0 = r0.c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 24
            r3.<init>(r2)
            java.lang.String r2 = "Failed to decode image: "
            java.lang.String r0 = i0.d.a.a.a.y0(r3, r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0114:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Image exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        L_0x011c:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = "input is too large to fit in a byte array"
            r0.<init>(r2)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
            if (r1 == 0) goto L_0x0131
            r1.close()     // Catch:{ all -> 0x012b }
            goto L_0x0131
        L_0x012b:
            r1 = move-exception
            i0.h.a.b.g.f.e r2 = i0.h.a.b.g.f.k.a
            r2.a(r0, r1)
        L_0x0131:
            throw r0
        L_0x0132:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Content-Length exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.t.b0.call():java.lang.Object");
    }
}
