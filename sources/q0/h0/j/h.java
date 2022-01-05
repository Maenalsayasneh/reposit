package q0.h0.j;

import java.util.List;
import q0.h0.f.a;

/* compiled from: TaskQueue.kt */
public final class h extends a {
    public final /* synthetic */ d e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str, boolean z, String str2, boolean z2, d dVar, int i, List list) {
        super(str2, z2);
        this.e = dVar;
        this.f = i;
        this.g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a() {
        /*
            r3 = this;
            q0.h0.j.d r0 = r3.e
            q0.h0.j.q r0 = r0.g2
            int r1 = r3.f
            java.util.List r2 = r3.g
            boolean r0 = r0.a(r1, r2)
            if (r0 == 0) goto L_0x002e
            q0.h0.j.d r0 = r3.e     // Catch:{ IOException -> 0x002e }
            q0.h0.j.n r0 = r0.u2     // Catch:{ IOException -> 0x002e }
            int r1 = r3.f     // Catch:{ IOException -> 0x002e }
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x002e }
            r0.l(r1, r2)     // Catch:{ IOException -> 0x002e }
            q0.h0.j.d r0 = r3.e     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            q0.h0.j.d r1 = r3.e     // Catch:{ all -> 0x002b }
            java.util.Set<java.lang.Integer> r1 = r1.w2     // Catch:{ all -> 0x002b }
            int r2 = r3.f     // Catch:{ all -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002b }
            r1.remove(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.h.a():long");
    }
}
