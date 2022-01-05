package n0.a;

import kotlinx.coroutines.CoroutinesInternalError;
import m0.l.c;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.i2.h;

/* compiled from: DispatchedTask.kt */
public abstract class l0<T> extends h {
    public int q;

    public l0(int i) {
        this.q = i;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract c<T> b();

    public Throwable d(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar == null) {
            return null;
        }
        return zVar.b;
    }

    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                i0.j.f.p.h.m(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            i.c(th);
            a.b2(b().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object g();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r4.w0() != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r4.w0() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            n0.a.i2.i r0 = r10.d
            m0.l.c r1 = r10.b()     // Catch:{ all -> 0x0095 }
            n0.a.h2.g r1 = (n0.a.h2.g) r1     // Catch:{ all -> 0x0095 }
            m0.l.c<T> r2 = r1.Y1     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = r1.a2     // Catch:{ all -> 0x0095 }
            m0.l.e r3 = r2.getContext()     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.c(r3, r1)     // Catch:{ all -> 0x0095 }
            n0.a.h2.t r4 = kotlinx.coroutines.internal.ThreadContextKt.a     // Catch:{ all -> 0x0095 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            n0.a.b2 r4 = n0.a.c0.b(r2, r3, r1)     // Catch:{ all -> 0x0095 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            m0.l.e r6 = r2.getContext()     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r10.g()     // Catch:{ all -> 0x0040 }
            java.lang.Throwable r8 = r10.d(r7)     // Catch:{ all -> 0x0040 }
            if (r8 != 0) goto L_0x0042
            int r9 = r10.q     // Catch:{ all -> 0x0040 }
            boolean r9 = m0.r.t.a.r.m.a1.a.t2(r9)     // Catch:{ all -> 0x0040 }
            if (r9 == 0) goto L_0x0042
            int r9 = n0.a.f1.k     // Catch:{ all -> 0x0040 }
            n0.a.f1$a r9 = n0.a.f1.a.c     // Catch:{ all -> 0x0040 }
            m0.l.e$a r6 = r6.get(r9)     // Catch:{ all -> 0x0040 }
            n0.a.f1 r6 = (n0.a.f1) r6     // Catch:{ all -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r2 = move-exception
            goto L_0x0089
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x005a
            boolean r9 = r6.a()     // Catch:{ all -> 0x0040 }
            if (r9 != 0) goto L_0x005a
            java.util.concurrent.CancellationException r6 = r6.v()     // Catch:{ all -> 0x0040 }
            r10.a(r7, r6)     // Catch:{ all -> 0x0040 }
            java.lang.Object r6 = i0.j.f.p.h.l0(r6)     // Catch:{ all -> 0x0040 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x006b
        L_0x005a:
            if (r8 == 0) goto L_0x0064
            java.lang.Object r6 = i0.j.f.p.h.l0(r8)     // Catch:{ all -> 0x0040 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x006b
        L_0x0064:
            java.lang.Object r6 = r10.e(r7)     // Catch:{ all -> 0x0040 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0040 }
        L_0x006b:
            m0.i r2 = m0.i.a     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0075
            boolean r4 = r4.w0()     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x0078
        L_0x0075:
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r1)     // Catch:{ all -> 0x0095 }
        L_0x0078:
            r0.n()     // Catch:{ all -> 0x007c }
            goto L_0x0081
        L_0x007c:
            r0 = move-exception
            java.lang.Object r2 = i0.j.f.p.h.l0(r0)
        L_0x0081:
            java.lang.Throwable r0 = kotlin.Result.a(r2)
            r10.f(r5, r0)
            goto L_0x00a8
        L_0x0089:
            if (r4 == 0) goto L_0x0091
            boolean r4 = r4.w0()     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x0094
        L_0x0091:
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r1)     // Catch:{ all -> 0x0095 }
        L_0x0094:
            throw r2     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            r0.n()     // Catch:{ all -> 0x009c }
            m0.i r0 = m0.i.a     // Catch:{ all -> 0x009c }
            goto L_0x00a1
        L_0x009c:
            r0 = move-exception
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x00a1:
            java.lang.Throwable r0 = kotlin.Result.a(r0)
            r10.f(r1, r0)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.l0.run():void");
    }
}
