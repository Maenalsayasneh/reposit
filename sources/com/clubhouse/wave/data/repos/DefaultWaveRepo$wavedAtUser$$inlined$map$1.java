package com.clubhouse.wave.data.repos;

import com.clubhouse.wave.data.models.local.SentWave;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class DefaultWaveRepo$wavedAtUser$$inlined$map$1 implements d<Boolean> {
    public final /* synthetic */ d c;
    public final /* synthetic */ Integer d;

    public DefaultWaveRepo$wavedAtUser$$inlined$map$1(d dVar, Integer num) {
        this.c = dVar;
        this.d = num;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final Integer num = this.d;
        Object collect = dVar.collect(new e<List<? extends SentWave>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, m0.l.c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.clubhouse.wave.data.repos.DefaultWaveRepo$wavedAtUser$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.clubhouse.wave.data.repos.DefaultWaveRepo$wavedAtUser$$inlined$map$1$2$1 r0 = (com.clubhouse.wave.data.repos.DefaultWaveRepo$wavedAtUser$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.wave.data.repos.DefaultWaveRepo$wavedAtUser$$inlined$map$1$2$1 r0 = new com.clubhouse.wave.data.repos.DefaultWaveRepo$wavedAtUser$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r8)
                    goto L_0x0082
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    i0.j.f.p.h.d4(r8)
                    n0.a.g2.e r8 = r4
                    java.util.List r7 = (java.util.List) r7
                    boolean r2 = r7 instanceof java.util.Collection
                    r4 = 0
                    if (r2 == 0) goto L_0x0042
                    boolean r2 = r7.isEmpty()
                    if (r2 == 0) goto L_0x0042
                    goto L_0x0075
                L_0x0042:
                    java.util.Iterator r7 = r7.iterator()
                L_0x0046:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L_0x0075
                    java.lang.Object r2 = r7.next()
                    com.clubhouse.wave.data.models.local.SentWave r2 = (com.clubhouse.wave.data.models.local.SentWave) r2
                    com.clubhouse.android.data.models.local.user.BasicUser r2 = r2.c
                    java.lang.Integer r2 = r2.getId()
                    int r2 = r2.intValue()
                    java.lang.Integer r5 = r2
                    if (r5 != 0) goto L_0x0061
                    goto L_0x0069
                L_0x0061:
                    int r5 = r5.intValue()
                    if (r2 != r5) goto L_0x0069
                    r2 = r3
                    goto L_0x006a
                L_0x0069:
                    r2 = r4
                L_0x006a:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x0046
                    r4 = r3
                L_0x0075:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                    r0.d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0082
                    return r1
                L_0x0082:
                    m0.i r7 = m0.i.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.wave.data.repos.DefaultWaveRepo$wavedAtUser$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
