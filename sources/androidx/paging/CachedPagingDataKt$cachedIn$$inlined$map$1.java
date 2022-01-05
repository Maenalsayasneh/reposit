package androidx.paging;

import h0.u.l;
import h0.u.w;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class CachedPagingDataKt$cachedIn$$inlined$map$1 implements d<l<T>> {
    public final /* synthetic */ d c;
    public final /* synthetic */ f0 d;

    public CachedPagingDataKt$cachedIn$$inlined$map$1(d dVar, f0 f0Var) {
        this.c = dVar;
        this.d = f0Var;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<w<T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r8, m0.l.c r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r9)
                    goto L_0x004a
                L_0x0027:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x002f:
                    i0.j.f.p.h.d4(r9)
                    n0.a.g2.e r9 = r3
                    h0.u.w r8 = (h0.u.w) r8
                    h0.u.l r2 = new h0.u.l
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1 r4 = r2
                    n0.a.f0 r4 = r4.d
                    r5 = 0
                    r6 = 4
                    r2.<init>(r4, r8, r5, r6)
                    r0.d = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L_0x004a
                    return r1
                L_0x004a:
                    m0.i r8 = m0.i.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
