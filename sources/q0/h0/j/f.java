package q0.h0.j;

import q0.h0.f.a;

/* compiled from: TaskQueue.kt */
public final class f extends a {
    public final /* synthetic */ d e;
    public final /* synthetic */ int f;
    public final /* synthetic */ r0.f g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, boolean z, String str2, boolean z2, d dVar, int i2, r0.f fVar, int i3, boolean z3) {
        super(str2, z2);
        this.e = dVar;
        this.f = i2;
        this.g = fVar;
        this.h = i3;
        this.i = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a() {
        /*
            r5 = this;
            q0.h0.j.d r0 = r5.e     // Catch:{ IOException -> 0x0038 }
            q0.h0.j.q r0 = r0.g2     // Catch:{ IOException -> 0x0038 }
            int r1 = r5.f     // Catch:{ IOException -> 0x0038 }
            r0.f r2 = r5.g     // Catch:{ IOException -> 0x0038 }
            int r3 = r5.h     // Catch:{ IOException -> 0x0038 }
            boolean r4 = r5.i     // Catch:{ IOException -> 0x0038 }
            boolean r0 = r0.d(r1, r2, r3, r4)     // Catch:{ IOException -> 0x0038 }
            if (r0 == 0) goto L_0x001d
            q0.h0.j.d r1 = r5.e     // Catch:{ IOException -> 0x0038 }
            q0.h0.j.n r1 = r1.u2     // Catch:{ IOException -> 0x0038 }
            int r2 = r5.f     // Catch:{ IOException -> 0x0038 }
            okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0038 }
            r1.l(r2, r3)     // Catch:{ IOException -> 0x0038 }
        L_0x001d:
            if (r0 != 0) goto L_0x0023
            boolean r0 = r5.i     // Catch:{ IOException -> 0x0038 }
            if (r0 == 0) goto L_0x0038
        L_0x0023:
            q0.h0.j.d r0 = r5.e     // Catch:{ IOException -> 0x0038 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0038 }
            q0.h0.j.d r1 = r5.e     // Catch:{ all -> 0x0035 }
            java.util.Set<java.lang.Integer> r1 = r1.w2     // Catch:{ all -> 0x0035 }
            int r2 = r5.f     // Catch:{ all -> 0x0035 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0035 }
            r1.remove(r2)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0038 }
            goto L_0x0038
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0038 }
            throw r1     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.f.a():long");
    }
}
