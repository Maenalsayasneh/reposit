package com.clubhouse.android.ui.common.paging;

import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import h0.u.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1 implements d<i0.e.b.g3.m.f.d> {
    public final /* synthetic */ d c;
    public final /* synthetic */ PagingDataEpoxyController d;

    public PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1(d dVar, PagingDataEpoxyController pagingDataEpoxyController) {
        this.c = dVar;
        this.d = pagingDataEpoxyController;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final PagingDataEpoxyController pagingDataEpoxyController = this.d;
        Object collect = dVar.collect(new e<b>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, m0.l.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1$2$1 r0 = (com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1$2$1 r0 = new com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r7)
                    goto L_0x007a
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    i0.j.f.p.h.d4(r7)
                    n0.a.g2.e r7 = r4
                    h0.u.b r6 = (h0.u.b) r6
                    h0.u.k r6 = r6.d
                    h0.u.j r2 = r6.c
                    boolean r4 = r2 instanceof h0.u.j.b
                    if (r4 == 0) goto L_0x0041
                    i0.e.b.g3.m.f.d$d r6 = i0.e.b.g3.m.f.d.C0203d.a
                    goto L_0x0071
                L_0x0041:
                    h0.u.j r6 = r6.e
                    boolean r4 = r6 instanceof h0.u.j.c
                    if (r4 == 0) goto L_0x0061
                    boolean r6 = r6.a
                    if (r6 == 0) goto L_0x0061
                    com.airbnb.epoxy.paging3.PagingDataEpoxyController r6 = r2
                    i0.b.a.p r6 = r6.getAdapter()
                    i0.b.a.c r6 = r6.h
                    java.util.List<? extends i0.b.a.t<?>> r6 = r6.f
                    boolean r6 = r6.isEmpty()
                    if (r6 == 0) goto L_0x005e
                    i0.e.b.g3.m.f.d$a r6 = i0.e.b.g3.m.f.d.a.a
                    goto L_0x0071
                L_0x005e:
                    i0.e.b.g3.m.f.d$c r6 = i0.e.b.g3.m.f.d.c.a
                    goto L_0x0071
                L_0x0061:
                    boolean r6 = r2 instanceof h0.u.j.a
                    if (r6 == 0) goto L_0x006f
                    i0.e.b.g3.m.f.d$b r6 = new i0.e.b.g3.m.f.d$b
                    h0.u.j$a r2 = (h0.u.j.a) r2
                    java.lang.Throwable r2 = r2.b
                    r6.<init>(r2)
                    goto L_0x0071
                L_0x006f:
                    i0.e.b.g3.m.f.d$e r6 = i0.e.b.g3.m.f.d.e.a
                L_0x0071:
                    r0.d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x007a
                    return r1
                L_0x007a:
                    m0.i r6 = m0.i.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
