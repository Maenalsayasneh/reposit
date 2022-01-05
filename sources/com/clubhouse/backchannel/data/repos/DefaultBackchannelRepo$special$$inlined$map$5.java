package com.clubhouse.backchannel.data.repos;

import i0.e.c.f.b.a.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class DefaultBackchannelRepo$special$$inlined$map$5 implements d<Integer> {
    public final /* synthetic */ d c;

    public DefaultBackchannelRepo$special$$inlined$map$5(d dVar) {
        this.c = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<List<? extends a>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, m0.l.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$5$2$1 r0 = (com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$5$2$1 r0 = new com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$5$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r7)
                    goto L_0x0063
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    i0.j.f.p.h.d4(r7)
                    n0.a.g2.e r7 = r3
                    java.util.List r6 = (java.util.List) r6
                    r2 = 0
                    java.lang.Integer r4 = new java.lang.Integer
                    r4.<init>(r2)
                    java.util.Iterator r6 = r6.iterator()
                L_0x0040:
                    boolean r2 = r6.hasNext()
                    if (r2 == 0) goto L_0x005a
                    java.lang.Object r2 = r6.next()
                    i0.e.c.f.b.a.a r2 = (i0.e.c.f.b.a.a) r2
                    int r4 = r4.intValue()
                    int r2 = r2.e
                    int r4 = r4 + r2
                    java.lang.Integer r2 = new java.lang.Integer
                    r2.<init>(r4)
                    r4 = r2
                    goto L_0x0040
                L_0x005a:
                    r0.d = r3
                    java.lang.Object r6 = r7.emit(r4, r0)
                    if (r6 != r1) goto L_0x0063
                    return r1
                L_0x0063:
                    m0.i r6 = m0.i.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
