package kotlinx.coroutines.flow;

import n0.a.g2.d;

/* compiled from: Flow.kt */
public abstract class AbstractFlow<T> implements d<T> {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(n0.a.g2.e<? super T> r6, m0.l.c<? super m0.i> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractFlow$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow$collect$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.flow.internal.SafeCollector r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            i0.j.f.p.h.d4(r7)     // Catch:{ all -> 0x002b }
            goto L_0x0057
        L_0x002b:
            r7 = move-exception
            goto L_0x0061
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            i0.j.f.p.h.d4(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            m0.l.e r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.c = r7     // Catch:{ all -> 0x005d }
            r0.x = r3     // Catch:{ all -> 0x005d }
            r6 = r5
            n0.a.g2.s r6 = (n0.a.g2.s) r6     // Catch:{ all -> 0x005d }
            m0.n.a.p<n0.a.g2.e<? super T>, m0.l.c<? super m0.i>, java.lang.Object> r6 = r6.c     // Catch:{ all -> 0x005d }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ all -> 0x005d }
            if (r6 != r1) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            m0.i r6 = m0.i.a     // Catch:{ all -> 0x005d }
        L_0x0053:
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r6 = r7
        L_0x0057:
            r6.releaseIntercepted()
            m0.i r6 = m0.i.a
            return r6
        L_0x005d:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0061:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow.collect(n0.a.g2.e, m0.l.c):java.lang.Object");
    }
}
