package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
/* compiled from: Merge.kt */
public final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements q<e<? super R>, T, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ p<T, m0.l.c<? super R>, Object> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$mapLatest$1(p<? super T, ? super m0.l.c<? super R>, ? extends Object> pVar, m0.l.c<? super FlowKt__MergeKt$mapLatest$1> cVar) {
        super(3, cVar);
        this.x = pVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.x, (m0.l.c) obj3);
        flowKt__MergeKt$mapLatest$1.d = (e) obj;
        flowKt__MergeKt$mapLatest$1.q = obj2;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: n0.a.g2.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            i0.j.f.p.h.d4(r6)
            goto L_0x0043
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            java.lang.Object r1 = r5.d
            n0.a.g2.e r1 = (n0.a.g2.e) r1
            i0.j.f.p.h.d4(r6)
            goto L_0x0037
        L_0x0020:
            i0.j.f.p.h.d4(r6)
            java.lang.Object r6 = r5.d
            r1 = r6
            n0.a.g2.e r1 = (n0.a.g2.e) r1
            java.lang.Object r6 = r5.q
            m0.n.a.p<T, m0.l.c<? super R>, java.lang.Object> r4 = r5.x
            r5.d = r1
            r5.c = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L_0x0037
            return r0
        L_0x0037:
            r3 = 0
            r5.d = r3
            r5.c = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L_0x0043
            return r0
        L_0x0043:
            m0.i r6 = m0.i.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
