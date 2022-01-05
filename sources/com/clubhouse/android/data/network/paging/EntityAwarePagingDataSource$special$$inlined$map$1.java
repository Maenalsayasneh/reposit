package com.clubhouse.android.data.network.paging;

import h0.u.w;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class EntityAwarePagingDataSource$special$$inlined$map$1 implements d<w<Item>> {
    public final /* synthetic */ d c;
    public final /* synthetic */ EntityAwarePagingDataSource d;

    public EntityAwarePagingDataSource$special$$inlined$map$1(d dVar, EntityAwarePagingDataSource entityAwarePagingDataSource) {
        this.c = dVar;
        this.d = entityAwarePagingDataSource;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final EntityAwarePagingDataSource entityAwarePagingDataSource = this.d;
        Object collect = dVar.collect(new e<w<Item>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, m0.l.c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$special$$inlined$map$1$2$1 r0 = (com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$special$$inlined$map$1$2$1 r0 = new com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$special$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r8)
                    goto L_0x004e
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    i0.j.f.p.h.d4(r8)
                    n0.a.g2.e r8 = r4
                    h0.u.w r7 = (h0.u.w) r7
                    com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource r2 = r2
                    java.util.Objects.requireNonNull(r2)
                    com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$checkForSelf$1 r4 = new com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$checkForSelf$1
                    r5 = 0
                    r4.<init>(r2, r5)
                    h0.u.w r7 = g0.a.b.b.a.d0(r7, r4)
                    r0.d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    m0.i r7 = m0.i.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
