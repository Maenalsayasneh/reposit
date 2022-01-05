package com.clubhouse.backchannel.data.repos;

import i0.e.c.f.b.a.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class DefaultBackchannelRepo$special$$inlined$map$2 implements d<List<? extends a>> {
    public final /* synthetic */ d c;

    public DefaultBackchannelRepo$special$$inlined$map$2(d dVar) {
        this.c = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<List<? extends a>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r9, m0.l.c r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$2$2$1 r0 = (com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$2$2$1 r0 = new com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$2$2$1
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r10)
                    goto L_0x0070
                L_0x0027:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x002f:
                    i0.j.f.p.h.d4(r10)
                    n0.a.g2.e r10 = r3
                    java.util.List r9 = (java.util.List) r9
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r9 = r9.iterator()
                L_0x003f:
                    boolean r4 = r9.hasNext()
                    if (r4 == 0) goto L_0x0067
                    java.lang.Object r4 = r9.next()
                    r5 = r4
                    i0.e.c.f.b.a.a r5 = (i0.e.c.f.b.a.a) r5
                    com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r6 = r5.t
                    com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r7 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination.REQUESTS
                    if (r6 != r7) goto L_0x0058
                    boolean r5 = r5.i
                    if (r5 != 0) goto L_0x0058
                    r5 = r3
                    goto L_0x0059
                L_0x0058:
                    r5 = 0
                L_0x0059:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x003f
                    r2.add(r4)
                    goto L_0x003f
                L_0x0067:
                    r0.d = r3
                    java.lang.Object r9 = r10.emit(r2, r0)
                    if (r9 != r1) goto L_0x0070
                    return r1
                L_0x0070:
                    m0.i r9 = m0.i.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
