package com.clubhouse.backchannel.data.repos;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class DefaultBackchannelRepo$chatRemoved$$inlined$filter$1 implements d<String> {
    public final /* synthetic */ d c;
    public final /* synthetic */ String d;

    public DefaultBackchannelRepo$chatRemoved$$inlined$filter$1(d dVar, String str) {
        this.c = dVar;
        this.d = str;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final String str = this.d;
        Object collect = dVar.collect(new e<String>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, m0.l.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$filter$1$2$1 r0 = (com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$filter$1$2$1 r0 = new com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$filter$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r7)
                    goto L_0x0050
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    i0.j.f.p.h.d4(r7)
                    n0.a.g2.e r7 = r4
                    r2 = r6
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.String r4 = r2
                    boolean r2 = m0.n.b.i.a(r2, r4)
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x0050
                    r0.d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    m0.i r6 = m0.i.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatRemoved$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
