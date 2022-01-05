package com.clubhouse.android.channels.repos;

import i0.e.b.z2.i.b;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1 implements d<Boolean> {
    public final /* synthetic */ d c;
    public final /* synthetic */ int d;

    public SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1(d dVar, int i) {
        this.c = dVar;
        this.d = i;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final int i = this.d;
        Object collect = dVar.collect(new e<List<? extends b>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r8, m0.l.c r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.clubhouse.android.channels.repos.SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    com.clubhouse.android.channels.repos.SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1$2$1 r0 = (com.clubhouse.android.channels.repos.SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.android.channels.repos.SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1$2$1 r0 = new com.clubhouse.android.channels.repos.SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r9)
                    goto L_0x006d
                L_0x0027:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x002f:
                    i0.j.f.p.h.d4(r9)
                    n0.a.g2.e r9 = r4
                    java.util.List r8 = (java.util.List) r8
                    java.util.Iterator r8 = r8.iterator()
                L_0x003a:
                    boolean r2 = r8.hasNext()
                    r4 = 0
                    if (r2 == 0) goto L_0x005c
                    java.lang.Object r2 = r8.next()
                    r5 = r2
                    i0.e.b.z2.i.b r5 = (i0.e.b.z2.i.b) r5
                    int r5 = r5.a
                    int r6 = r2
                    if (r5 != r6) goto L_0x0050
                    r5 = r3
                    goto L_0x0051
                L_0x0050:
                    r5 = r4
                L_0x0051:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x003a
                    goto L_0x005d
                L_0x005c:
                    r2 = 0
                L_0x005d:
                    if (r2 == 0) goto L_0x0060
                    r4 = r3
                L_0x0060:
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
                    r0.d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x006d
                    return r1
                L_0x006d:
                    m0.i r8 = m0.i.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.repos.SpeakerStateDataSource$speakingSignalForUser$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
