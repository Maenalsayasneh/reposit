package com.clubhouse.android.data.network.paging;

import i0.e.b.b3.b.e.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$flow$5$updatedPagedData$1", f = "EntityAwarePagingDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: EntityAwarePagingDataSource.kt */
public final class EntityAwarePagingDataSource$flow$5$updatedPagedData$1 extends SuspendLambda implements p<Item, m0.l.c<? super Item>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EntityAwarePagingDataSource<Item> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntityAwarePagingDataSource$flow$5$updatedPagedData$1(EntityAwarePagingDataSource<Item> entityAwarePagingDataSource, m0.l.c<? super EntityAwarePagingDataSource$flow$5$updatedPagedData$1> cVar) {
        super(2, cVar);
        this.d = entityAwarePagingDataSource;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EntityAwarePagingDataSource$flow$5$updatedPagedData$1 entityAwarePagingDataSource$flow$5$updatedPagedData$1 = new EntityAwarePagingDataSource$flow$5$updatedPagedData$1(this.d, cVar);
        entityAwarePagingDataSource$flow$5$updatedPagedData$1.c = obj;
        return entityAwarePagingDataSource$flow$5$updatedPagedData$1;
    }

    public Object invoke(Object obj, Object obj2) {
        EntityAwarePagingDataSource<Item> entityAwarePagingDataSource = this.d;
        EntityAwarePagingDataSource$flow$5$updatedPagedData$1 entityAwarePagingDataSource$flow$5$updatedPagedData$1 = new EntityAwarePagingDataSource$flow$5$updatedPagedData$1(entityAwarePagingDataSource, (m0.l.c) obj2);
        entityAwarePagingDataSource$flow$5$updatedPagedData$1.c = (j) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        return EntityAwarePagingDataSource.a(entityAwarePagingDataSource, (j) entityAwarePagingDataSource$flow$5$updatedPagedData$1.c);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        return EntityAwarePagingDataSource.a(this.d, (j) this.c);
    }
}
