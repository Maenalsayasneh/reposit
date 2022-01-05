package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.c;
import m0.n.a.q;
import m0.n.a.r;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 implements d<R> {
    public final /* synthetic */ d[] c;
    public final /* synthetic */ r d;

    @m0.l.f.a.c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2  reason: invalid class name */
    /* compiled from: Zip.kt */
    public static final class AnonymousClass2 extends SuspendLambda implements q<e<? super R>, Object[], c<? super i>, Object> {
        public int c;
        public /* synthetic */ Object d;
        public /* synthetic */ Object q;

        public Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 r02 = new AnonymousClass2((c) obj3, rVar);
            r02.d = (e) obj;
            r02.q = (Object[]) obj2;
            return r02.invokeSuspend(i.a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: n0.a.g2.e} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 == r3) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                i0.j.f.p.h.d4(r8)
                goto L_0x004c
            L_0x0010:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0018:
                java.lang.Object r1 = r7.d
                n0.a.g2.e r1 = (n0.a.g2.e) r1
                i0.j.f.p.h.d4(r8)
                goto L_0x0040
            L_0x0020:
                i0.j.f.p.h.d4(r8)
                java.lang.Object r8 = r7.d
                r1 = r8
                n0.a.g2.e r1 = (n0.a.g2.e) r1
                java.lang.Object r8 = r7.q
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                m0.n.a.r r4 = r3
                r5 = 0
                r5 = r8[r5]
                r6 = r8[r3]
                r8 = r8[r2]
                r7.d = r1
                r7.c = r3
                java.lang.Object r8 = r4.h(r5, r6, r8, r7)
                if (r8 != r0) goto L_0x0040
                return r0
            L_0x0040:
                r3 = 0
                r7.d = r3
                r7.c = r2
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L_0x004c
                return r0
            L_0x004c:
                m0.i r8 = m0.i.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(d[] dVarArr, r rVar) {
        this.c = dVarArr;
        this.d = rVar;
    }

    public Object collect(e eVar, c cVar) {
        d[] dVarArr = this.c;
        FlowKt__ZipKt$nullArrayFactory$1 flowKt__ZipKt$nullArrayFactory$1 = FlowKt__ZipKt$nullArrayFactory$1.c;
        final r rVar = this.d;
        Object F0 = a.F0(eVar, dVarArr, flowKt__ZipKt$nullArrayFactory$1, new AnonymousClass2((c) null), cVar);
        if (F0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return F0;
        }
        return i.a;
    }
}
