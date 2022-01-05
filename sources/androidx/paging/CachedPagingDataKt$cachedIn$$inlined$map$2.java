package androidx.paging;

import h0.u.l;
import h0.u.w;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class CachedPagingDataKt$cachedIn$$inlined$map$2 implements d<w<T>> {
    public final /* synthetic */ d c;

    public CachedPagingDataKt$cachedIn$$inlined$map$2(d dVar) {
        this.c = dVar;
    }

    public Object collect(e eVar, c cVar) {
        Object collect = this.c.collect(new e<l<T>>(eVar, this) {
            public final /* synthetic */ e c;

            {
                this.c = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, m0.l.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2$2$1 r0 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2$2$1 r0 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r7)
                    goto L_0x004f
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    i0.j.f.p.h.d4(r7)
                    n0.a.g2.e r7 = r5.c
                    h0.u.l r6 = (h0.u.l) r6
                    java.util.Objects.requireNonNull(r6)
                    h0.u.w r2 = new h0.u.w
                    androidx.paging.CachedPageEventFlow<T> r4 = r6.a
                    n0.a.g2.d<androidx.paging.PageEvent<T>> r4 = r4.d
                    h0.u.w<T> r6 = r6.c
                    h0.u.g0 r6 = r6.e
                    r2.<init>(r4, r6)
                    r0.d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    m0.i r6 = m0.i.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
