package q0.h0.j;

import java.util.List;
import q0.h0.f.a;

/* compiled from: TaskQueue.kt */
public final class g extends a {
    public final /* synthetic */ d e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ boolean h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str, boolean z, String str2, boolean z2, d dVar, int i, List list, boolean z3) {
        super(str2, z2);
        this.e = dVar;
        this.f = i;
        this.g = list;
        this.h = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a() {
        /*
            r4 = this;
            q0.h0.j.d r0 = r4.e
            q0.h0.j.q r0 = r0.g2
            int r1 = r4.f
            java.util.List r2 = r4.g
            boolean r3 = r4.h
            boolean r0 = r0.b(r1, r2, r3)
            if (r0 == 0) goto L_0x001b
            q0.h0.j.d r1 = r4.e     // Catch:{ IOException -> 0x0036 }
            q0.h0.j.n r1 = r1.u2     // Catch:{ IOException -> 0x0036 }
            int r2 = r4.f     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0036 }
            r1.l(r2, r3)     // Catch:{ IOException -> 0x0036 }
        L_0x001b:
            if (r0 != 0) goto L_0x0021
            boolean r0 = r4.h     // Catch:{ IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0036
        L_0x0021:
            q0.h0.j.d r0 = r4.e     // Catch:{ IOException -> 0x0036 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0036 }
            q0.h0.j.d r1 = r4.e     // Catch:{ all -> 0x0033 }
            java.util.Set<java.lang.Integer> r1 = r1.w2     // Catch:{ all -> 0x0033 }
            int r2 = r4.f     // Catch:{ all -> 0x0033 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0033 }
            r1.remove(r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0036 }
            goto L_0x0036
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0036 }
            throw r1     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.g.a():long");
    }
}
