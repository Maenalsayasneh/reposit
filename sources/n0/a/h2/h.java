package n0.a.h2;

import m0.i;
import m0.l.c;
import m0.n.a.l;

/* compiled from: DispatchedContinuation.kt */
public final class h {
    public static final t a = new t("UNDEFINED");
    public static final t b = new t("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r8.w0() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void a(m0.l.c<? super T> r6, java.lang.Object r7, m0.n.a.l<? super java.lang.Throwable, m0.i> r8) {
        /*
            boolean r0 = r6 instanceof n0.a.h2.g
            if (r0 == 0) goto L_0x00b6
            n0.a.h2.g r6 = (n0.a.h2.g) r6
            java.lang.Object r8 = m0.r.t.a.r.m.a1.a.e4(r7, r8)
            n0.a.d0 r0 = r6.y
            m0.l.e r1 = r6.getContext()
            boolean r0 = r0.Q(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.Z1 = r8
            r6.q = r1
            n0.a.d0 r7 = r6.y
            m0.l.e r8 = r6.getContext()
            r7.I(r8, r6)
            goto L_0x00b9
        L_0x0026:
            n0.a.y1 r0 = n0.a.y1.a
            n0.a.s0 r0 = n0.a.y1.a()
            boolean r2 = r0.b0()
            if (r2 == 0) goto L_0x003b
            r6.Z1 = r8
            r6.q = r1
            r0.Y(r6)
            goto L_0x00b9
        L_0x003b:
            r0.Z(r1)
            r2 = 0
            m0.l.e r3 = r6.getContext()     // Catch:{ all -> 0x00a9 }
            n0.a.f1$a r4 = n0.a.f1.a.c     // Catch:{ all -> 0x00a9 }
            m0.l.e$a r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            n0.a.f1 r3 = (n0.a.f1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x006b
            boolean r4 = r3.a()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x006b
            java.util.concurrent.CancellationException r3 = r3.v()     // Catch:{ all -> 0x00a9 }
            boolean r4 = r8 instanceof n0.a.a0     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x0062
            n0.a.a0 r8 = (n0.a.a0) r8     // Catch:{ all -> 0x00a9 }
            m0.n.a.l<java.lang.Throwable, m0.i> r8 = r8.b     // Catch:{ all -> 0x00a9 }
            r8.invoke(r3)     // Catch:{ all -> 0x00a9 }
        L_0x0062:
            java.lang.Object r8 = i0.j.f.p.h.l0(r3)     // Catch:{ all -> 0x00a9 }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            if (r8 != 0) goto L_0x00a2
            m0.l.c<T> r8 = r6.Y1     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.a2     // Catch:{ all -> 0x00a9 }
            m0.l.e r4 = r8.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.c(r4, r3)     // Catch:{ all -> 0x00a9 }
            n0.a.h2.t r5 = kotlinx.coroutines.internal.ThreadContextKt.a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0083
            n0.a.b2 r8 = n0.a.c0.b(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0084
        L_0x0083:
            r8 = r2
        L_0x0084:
            m0.l.c<T> r5 = r6.Y1     // Catch:{ all -> 0x0095 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.w0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            kotlinx.coroutines.internal.ThreadContextKt.a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.w0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            kotlinx.coroutines.internal.ThreadContextKt.a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.d0()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.f(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.T(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.T(r1)
            throw r6
        L_0x00b6:
            r6.resumeWith(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.h2.h.a(m0.l.c, java.lang.Object, m0.n.a.l):void");
    }

    public static /* synthetic */ void b(c cVar, Object obj, l lVar, int i) {
        int i2 = i & 2;
        a(cVar, obj, (l<? super Throwable, i>) null);
    }
}
