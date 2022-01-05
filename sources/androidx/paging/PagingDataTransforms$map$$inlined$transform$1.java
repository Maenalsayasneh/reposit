package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import m0.n.a.p;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class PagingDataTransforms$map$$inlined$transform$1 implements d<PageEvent<R>> {
    public final /* synthetic */ d c;
    public final /* synthetic */ p d;

    public PagingDataTransforms$map$$inlined$transform$1(d dVar, p pVar) {
        this.c = dVar;
        this.d = pVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<PageEvent<T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, m0.l.c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.PagingDataTransforms$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2$1 r0 = (androidx.paging.PagingDataTransforms$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2$1 r0 = new androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003a
                    if (r2 == r4) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    i0.j.f.p.h.d4(r8)
                    goto L_0x005f
                L_0x002a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0032:
                    java.lang.Object r7 = r0.q
                    n0.a.g2.e r7 = (n0.a.g2.e) r7
                    i0.j.f.p.h.d4(r8)
                    goto L_0x0053
                L_0x003a:
                    i0.j.f.p.h.d4(r8)
                    n0.a.g2.e r8 = r3
                    androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
                    androidx.paging.PagingDataTransforms$map$$inlined$transform$1 r2 = r2
                    m0.n.a.p r2 = r2.d
                    r0.q = r8
                    r0.d = r4
                    java.lang.Object r7 = r7.b(r2, r0)
                    if (r7 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0053:
                    r2 = 0
                    r0.q = r2
                    r0.d = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    m0.i r7 = m0.i.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataTransforms$map$$inlined$transform$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
