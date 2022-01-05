package com.clubhouse.android.data.network.paging;

import i0.e.b.b3.b.e.b;
import i0.e.b.b3.b.e.j;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$checkForSelf$1", f = "EntityAwarePagingDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: EntityAwarePagingDataSource.kt */
public final class EntityAwarePagingDataSource$checkForSelf$1 extends SuspendLambda implements p<Item, m0.l.c<? super Item>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EntityAwarePagingDataSource<Item> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntityAwarePagingDataSource$checkForSelf$1(EntityAwarePagingDataSource<Item> entityAwarePagingDataSource, m0.l.c<? super EntityAwarePagingDataSource$checkForSelf$1> cVar) {
        super(2, cVar);
        this.d = entityAwarePagingDataSource;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EntityAwarePagingDataSource$checkForSelf$1 entityAwarePagingDataSource$checkForSelf$1 = new EntityAwarePagingDataSource$checkForSelf$1(this.d, cVar);
        entityAwarePagingDataSource$checkForSelf$1.c = obj;
        return entityAwarePagingDataSource$checkForSelf$1;
    }

    public Object invoke(Object obj, Object obj2) {
        EntityAwarePagingDataSource$checkForSelf$1 entityAwarePagingDataSource$checkForSelf$1 = new EntityAwarePagingDataSource$checkForSelf$1(this.d, (m0.l.c) obj2);
        entityAwarePagingDataSource$checkForSelf$1.c = (j) obj;
        return entityAwarePagingDataSource$checkForSelf$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        j jVar = (j) this.c;
        EntityAwarePagingDataSource<Item> entityAwarePagingDataSource = this.d;
        Objects.requireNonNull(entityAwarePagingDataSource);
        if (!(jVar instanceof b)) {
            return jVar;
        }
        b bVar = (b) jVar;
        int intValue = bVar.c().getId().intValue();
        Integer b = entityAwarePagingDataSource.d.b();
        return (b != null && intValue == b.intValue()) ? b.f(bVar, true, false, false, 6, (Object) null) : jVar;
    }
}
