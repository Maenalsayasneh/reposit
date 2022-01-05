package com.airbnb.mvrx;

import i0.b.b.o;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import m0.r.m;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class MavericksViewModelExtensionsKt$_internal2$$inlined$map$1 implements d<o<A, B>> {
    public final /* synthetic */ d c;
    public final /* synthetic */ m d;
    public final /* synthetic */ m q;

    public MavericksViewModelExtensionsKt$_internal2$$inlined$map$1(d dVar, m mVar, m mVar2) {
        this.c = dVar;
        this.d = mVar;
        this.q = mVar2;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<S>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, m0.l.c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1$2$1 r0 = (com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1$2$1 r0 = new com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r8)
                    goto L_0x0054
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    i0.j.f.p.h.d4(r8)
                    n0.a.g2.e r8 = r3
                    i0.b.b.j r7 = (i0.b.b.j) r7
                    i0.b.b.o r2 = new i0.b.b.o
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1 r4 = r2
                    m0.r.m r4 = r4.d
                    java.lang.Object r4 = r4.get(r7)
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1 r5 = r2
                    m0.r.m r5 = r5.q
                    java.lang.Object r7 = r5.get(r7)
                    r2.<init>(r4, r7)
                    r0.d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0054
                    return r1
                L_0x0054:
                    m0.i r7 = m0.i.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
