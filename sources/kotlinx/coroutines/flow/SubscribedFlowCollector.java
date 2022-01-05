package kotlinx.coroutines.flow;

import m0.i;
import m0.l.c;
import n0.a.g2.e;

/* compiled from: Share.kt */
public final class SubscribedFlowCollector<T> implements e<T> {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(m0.l.c<? super m0.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.y
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r2) goto L_0x0034
            r0 = 2
            if (r1 != r0) goto L_0x002c
            i0.j.f.p.h.d4(r5)
        L_0x0029:
            m0.i r5 = m0.i.a
            return r5
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0034:
            java.lang.Object r1 = r0.d
            kotlinx.coroutines.flow.internal.SafeCollector r1 = (kotlinx.coroutines.flow.internal.SafeCollector) r1
            java.lang.Object r0 = r0.c
            kotlinx.coroutines.flow.SubscribedFlowCollector r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r0
            i0.j.f.p.h.d4(r5)     // Catch:{ all -> 0x005a }
            r1.releaseIntercepted()
            java.util.Objects.requireNonNull(r0)
            goto L_0x0029
        L_0x0046:
            i0.j.f.p.h.d4(r5)
            m0.l.e r5 = r0.getContext()
            kotlinx.coroutines.flow.internal.SafeCollector r1 = new kotlinx.coroutines.flow.internal.SafeCollector
            r3 = 0
            r1.<init>(r3, r5)
            r0.c = r4     // Catch:{ all -> 0x005a }
            r0.d = r1     // Catch:{ all -> 0x005a }
            r0.y = r2     // Catch:{ all -> 0x005a }
            throw r3     // Catch:{ all -> 0x005a }
        L_0x005a:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.c(m0.l.c):java.lang.Object");
    }

    public Object emit(T t, c<? super i> cVar) {
        throw null;
    }
}
