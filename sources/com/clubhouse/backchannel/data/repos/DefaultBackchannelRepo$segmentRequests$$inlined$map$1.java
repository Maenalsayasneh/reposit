package com.clubhouse.backchannel.data.repos;

import i0.e.c.f.b.a.b;
import i0.e.c.f.b.a.j;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class DefaultBackchannelRepo$segmentRequests$$inlined$map$1 implements d<Map<j, ? extends b>> {
    public final /* synthetic */ d c;
    public final /* synthetic */ String d;

    public DefaultBackchannelRepo$segmentRequests$$inlined$map$1(d dVar, String str) {
        this.c = dVar;
        this.d = str;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final String str = this.d;
        Object collect = dVar.collect(new e<Map<String, ? extends Map<j, ? extends b>>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, m0.l.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$segmentRequests$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$segmentRequests$$inlined$map$1$2$1 r0 = (com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$segmentRequests$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$segmentRequests$$inlined$map$1$2$1 r0 = new com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$segmentRequests$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r6)
                    goto L_0x004d
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    i0.j.f.p.h.d4(r6)
                    n0.a.g2.e r6 = r4
                    java.util.Map r5 = (java.util.Map) r5
                    java.lang.String r2 = r2
                    java.lang.Object r5 = r5.get(r2)
                    java.util.Map r5 = (java.util.Map) r5
                    if (r5 != 0) goto L_0x0044
                    java.util.Map r5 = m0.j.g.o()
                L_0x0044:
                    r0.d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    m0.i r5 = m0.i.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$segmentRequests$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
