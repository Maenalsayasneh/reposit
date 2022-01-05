package com.clubhouse.android.data.repos;

import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class UserRepo$1$invokeSuspend$$inlined$filter$1 implements d<Set<? extends Integer>> {
    public final /* synthetic */ d c;

    public UserRepo$1$invokeSuspend$$inlined$filter$1(d dVar) {
        this.c = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<Set<? extends Integer>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, m0.l.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.clubhouse.android.data.repos.UserRepo$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.clubhouse.android.data.repos.UserRepo$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.clubhouse.android.data.repos.UserRepo$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.android.data.repos.UserRepo$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.clubhouse.android.data.repos.UserRepo$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r6)
                    goto L_0x004f
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    i0.j.f.p.h.d4(r6)
                    n0.a.g2.e r6 = r3
                    r2 = r5
                    java.util.Set r2 = (java.util.Set) r2
                    boolean r2 = r2.isEmpty()
                    r2 = r2 ^ r3
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x004f
                    r0.d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    m0.i r5 = m0.i.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.UserRepo$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
