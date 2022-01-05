package com.airbnb.mvrx;

import i0.b.b.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import m0.r.m;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class MavericksViewModelExtensionsKt$_internal4$$inlined$map$1 implements d<p<A, B, C, D>> {
    public final /* synthetic */ d c;
    public final /* synthetic */ m d;
    public final /* synthetic */ m q;
    public final /* synthetic */ m x;
    public final /* synthetic */ m y;

    public MavericksViewModelExtensionsKt$_internal4$$inlined$map$1(d dVar, m mVar, m mVar2, m mVar3, m mVar4) {
        this.c = dVar;
        this.d = mVar;
        this.q = mVar2;
        this.x = mVar3;
        this.y = mVar4;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<S>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r9, m0.l.c r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1$2$1 r0 = (com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1$2$1 r0 = new com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1$2$1
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r10)
                    goto L_0x0064
                L_0x0027:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x002f:
                    i0.j.f.p.h.d4(r10)
                    n0.a.g2.e r10 = r3
                    i0.b.b.j r9 = (i0.b.b.j) r9
                    i0.b.b.p r2 = new i0.b.b.p
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1 r4 = r2
                    m0.r.m r4 = r4.d
                    java.lang.Object r4 = r4.get(r9)
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1 r5 = r2
                    m0.r.m r5 = r5.q
                    java.lang.Object r5 = r5.get(r9)
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1 r6 = r2
                    m0.r.m r6 = r6.x
                    java.lang.Object r6 = r6.get(r9)
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1 r7 = r2
                    m0.r.m r7 = r7.y
                    java.lang.Object r9 = r7.get(r9)
                    r2.<init>(r4, r5, r6, r9)
                    r0.d = r3
                    java.lang.Object r9 = r10.emit(r2, r0)
                    if (r9 != r1) goto L_0x0064
                    return r1
                L_0x0064:
                    m0.i r9 = m0.i.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
