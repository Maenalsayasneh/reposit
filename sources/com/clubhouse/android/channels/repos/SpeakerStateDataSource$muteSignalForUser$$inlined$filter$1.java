package com.clubhouse.android.channels.repos;

import i0.e.b.z2.i.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1 implements d<a> {
    public final /* synthetic */ d c;
    public final /* synthetic */ Integer d;

    public SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1(d dVar, Integer num) {
        this.c = dVar;
        this.d = num;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final Integer num = this.d;
        Object collect = dVar.collect(new e<a>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, m0.l.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.clubhouse.android.channels.repos.SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.clubhouse.android.channels.repos.SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1$2$1 r0 = (com.clubhouse.android.channels.repos.SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.android.channels.repos.SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1$2$1 r0 = new com.clubhouse.android.channels.repos.SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r7)
                    goto L_0x005a
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    i0.j.f.p.h.d4(r7)
                    n0.a.g2.e r7 = r4
                    r2 = r6
                    i0.e.b.z2.i.a r2 = (i0.e.b.z2.i.a) r2
                    int r2 = r2.a
                    java.lang.Integer r4 = r2
                    if (r4 != 0) goto L_0x003e
                    goto L_0x0046
                L_0x003e:
                    int r4 = r4.intValue()
                    if (r2 != r4) goto L_0x0046
                    r2 = r3
                    goto L_0x0047
                L_0x0046:
                    r2 = 0
                L_0x0047:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x005a
                    r0.d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    m0.i r6 = m0.i.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.repos.SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
