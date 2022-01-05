package i0.h.a.a.i.s.h;

import i0.h.a.a.i.h;

/* compiled from: Uploader */
public final /* synthetic */ class f implements Runnable {
    public final k c;
    public final h d;
    public final int q;
    public final Runnable x;

    public f(k kVar, h hVar, int i, Runnable runnable) {
        this.c = kVar;
        this.d = hVar;
        this.q = i;
        this.x = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.d.a(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            i0.h.a.a.i.s.h.k r0 = r8.c
            i0.h.a.a.i.h r1 = r8.d
            int r2 = r8.q
            java.lang.Runnable r3 = r8.x
            r4 = 1
            i0.h.a.a.i.t.a r5 = r0.f     // Catch:{ SynchronizationException -> 0x0044 }
            i0.h.a.a.i.s.i.c r6 = r0.c     // Catch:{ SynchronizationException -> 0x0044 }
            r6.getClass()     // Catch:{ SynchronizationException -> 0x0044 }
            i0.h.a.a.i.s.h.i r7 = new i0.h.a.a.i.s.h.i     // Catch:{ SynchronizationException -> 0x0044 }
            r7.<init>(r6)     // Catch:{ SynchronizationException -> 0x0044 }
            r5.a(r7)     // Catch:{ SynchronizationException -> 0x0044 }
            android.content.Context r5 = r0.a     // Catch:{ SynchronizationException -> 0x0044 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ SynchronizationException -> 0x0044 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ SynchronizationException -> 0x0044 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x0044 }
            if (r5 == 0) goto L_0x0030
            boolean r5 = r5.isConnected()     // Catch:{ SynchronizationException -> 0x0044 }
            if (r5 == 0) goto L_0x0030
            r5 = r4
            goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r5 != 0) goto L_0x003e
            i0.h.a.a.i.t.a r5 = r0.f     // Catch:{ SynchronizationException -> 0x0044 }
            i0.h.a.a.i.s.h.j r6 = new i0.h.a.a.i.s.h.j     // Catch:{ SynchronizationException -> 0x0044 }
            r6.<init>(r0, r1, r2)     // Catch:{ SynchronizationException -> 0x0044 }
            r5.a(r6)     // Catch:{ SynchronizationException -> 0x0044 }
            goto L_0x004a
        L_0x003e:
            r0.a(r1, r2)     // Catch:{ SynchronizationException -> 0x0044 }
            goto L_0x004a
        L_0x0042:
            r0 = move-exception
            goto L_0x004e
        L_0x0044:
            i0.h.a.a.i.s.h.q r0 = r0.d     // Catch:{ all -> 0x0042 }
            int r2 = r2 + r4
            r0.a(r1, r2)     // Catch:{ all -> 0x0042 }
        L_0x004a:
            r3.run()
            return
        L_0x004e:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.a.i.s.h.f.run():void");
    }
}
