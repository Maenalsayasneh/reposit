package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
/* compiled from: Zip.kt */
public final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements q<e<? super R>, Object[], m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ q<T1, T2, m0.l.c<? super R>, Object> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(q<? super T1, ? super T2, ? super m0.l.c<? super R>, ? extends Object> qVar, m0.l.c<? super FlowKt__ZipKt$combine$1$1> cVar) {
        super(3, cVar);
        this.x = qVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.x, (m0.l.c) obj3);
        flowKt__ZipKt$combine$1$1.d = (e) obj;
        flowKt__ZipKt$combine$1$1.q = (Object[]) obj2;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: n0.a.g2.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            i0.j.f.p.h.d4(r7)
            goto L_0x004a
        L_0x0010:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0018:
            java.lang.Object r1 = r6.d
            n0.a.g2.e r1 = (n0.a.g2.e) r1
            i0.j.f.p.h.d4(r7)
            goto L_0x003e
        L_0x0020:
            i0.j.f.p.h.d4(r7)
            java.lang.Object r7 = r6.d
            r1 = r7
            n0.a.g2.e r1 = (n0.a.g2.e) r1
            java.lang.Object r7 = r6.q
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            m0.n.a.q<T1, T2, m0.l.c<? super R>, java.lang.Object> r4 = r6.x
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r3]
            r6.d = r1
            r6.c = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L_0x003e
            return r0
        L_0x003e:
            r3 = 0
            r6.d = r3
            r6.c = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L_0x004a
            return r0
        L_0x004a:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
