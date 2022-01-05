package androidx.paging;

import h0.u.h0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 implements d<h0> {
    public final /* synthetic */ d c;
    public final /* synthetic */ PageFetcherSnapshot$startConsumingHints$1 d;

    public PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1(d dVar, PageFetcherSnapshot$startConsumingHints$1 pageFetcherSnapshot$startConsumingHints$1) {
        this.c = dVar;
        this.d = pageFetcherSnapshot$startConsumingHints$1;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<h0>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, m0.l.c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r8)
                    goto L_0x0064
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    i0.j.f.p.h.d4(r8)
                    n0.a.g2.e r8 = r3
                    r2 = r7
                    h0.u.h0 r2 = (h0.u.h0) r2
                    int r4 = r2.a
                    int r4 = r4 * -1
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 r5 = r2
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1 r5 = r5.d
                    androidx.paging.PageFetcherSnapshot r5 = r5.d
                    h0.u.v r5 = r5.j
                    int r5 = r5.f
                    if (r4 > r5) goto L_0x0050
                    int r2 = r2.b
                    int r2 = r2 * -1
                    if (r2 <= r5) goto L_0x004e
                    goto L_0x0050
                L_0x004e:
                    r2 = 0
                    goto L_0x0051
                L_0x0050:
                    r2 = r3
                L_0x0051:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x0067
                    r0.d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0064
                    return r1
                L_0x0064:
                    m0.i r7 = m0.i.a
                    goto L_0x0069
                L_0x0067:
                    m0.i r7 = m0.i.a
                L_0x0069:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
