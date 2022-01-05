package com.clubhouse.backchannel.data.repos;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class DefaultBackchannelRepo$chatRemoved$$inlined$map$1 implements d<i> {
    public final /* synthetic */ d c;

    public DefaultBackchannelRepo$chatRemoved$$inlined$map$1(d dVar) {
        this.c = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<Object>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r4, m0.l.c r5) {
                /*
                    r3 = this;
                    boolean r4 = r5 instanceof com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r4 == 0) goto L_0x0013
                    r4 = r5
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$map$1$2$1 r4 = (com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                    int r0 = r4.d
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L_0x0013
                    int r0 = r0 - r1
                    r4.d = r0
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$map$1$2$1 r4 = new com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$map$1$2$1
                    r4.<init>(r3, r5)
                L_0x0018:
                    java.lang.Object r5 = r4.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r4.d
                    r2 = 1
                    if (r1 == 0) goto L_0x002f
                    if (r1 != r2) goto L_0x0027
                    i0.j.f.p.h.d4(r5)
                    goto L_0x003f
                L_0x0027:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L_0x002f:
                    i0.j.f.p.h.d4(r5)
                    n0.a.g2.e r5 = r3
                    m0.i r1 = m0.i.a
                    r4.d = r2
                    java.lang.Object r4 = r5.emit(r1, r4)
                    if (r4 != r0) goto L_0x003f
                    return r0
                L_0x003f:
                    m0.i r4 = m0.i.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
