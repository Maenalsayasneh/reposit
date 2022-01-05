package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.repos.ClubMembership;
import i0.e.b.b3.b.e.e;
import i0.e.b.b3.b.e.j;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$flow$7$updatedPagedData$1", f = "EntityAwarePagingDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: EntityAwarePagingDataSource.kt */
public final class EntityAwarePagingDataSource$flow$7$updatedPagedData$1 extends SuspendLambda implements p<Item, m0.l.c<? super Item>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EntityAwarePagingDataSource<Item> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntityAwarePagingDataSource$flow$7$updatedPagedData$1(EntityAwarePagingDataSource<Item> entityAwarePagingDataSource, m0.l.c<? super EntityAwarePagingDataSource$flow$7$updatedPagedData$1> cVar) {
        super(2, cVar);
        this.d = entityAwarePagingDataSource;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EntityAwarePagingDataSource$flow$7$updatedPagedData$1 entityAwarePagingDataSource$flow$7$updatedPagedData$1 = new EntityAwarePagingDataSource$flow$7$updatedPagedData$1(this.d, cVar);
        entityAwarePagingDataSource$flow$7$updatedPagedData$1.c = obj;
        return entityAwarePagingDataSource$flow$7$updatedPagedData$1;
    }

    public Object invoke(Object obj, Object obj2) {
        EntityAwarePagingDataSource$flow$7$updatedPagedData$1 entityAwarePagingDataSource$flow$7$updatedPagedData$1 = new EntityAwarePagingDataSource$flow$7$updatedPagedData$1(this.d, (m0.l.c) obj2);
        entityAwarePagingDataSource$flow$7$updatedPagedData$1.c = (j) obj;
        return entityAwarePagingDataSource$flow$7$updatedPagedData$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        j jVar = (j) this.c;
        EntityAwarePagingDataSource<Item> entityAwarePagingDataSource = this.d;
        Objects.requireNonNull(entityAwarePagingDataSource);
        if (!(jVar instanceof e)) {
            return jVar;
        }
        e eVar = (e) jVar;
        ClubWithAdmin clubWithAdmin = eVar.b;
        ClubWithAdmin d2 = ClubWithAdmin.d(clubWithAdmin, false, false, entityAwarePagingDataSource.c.a.getValue().get(Integer.valueOf(clubWithAdmin.x)) == ClubMembership.Joined, 0, (String) null, (String) null, (String) null, (List) null, 0, 0, (String) null, false, false, false, false, false, (Map) null, (String) null, 262139);
        ClubMembership clubMembership = (ClubMembership) entityAwarePagingDataSource.c.a.getValue().get(Integer.valueOf(eVar.b.x));
        if (clubMembership == null) {
            clubMembership = ClubMembership.None;
        }
        Map<String, Object> map = eVar.d;
        m0.n.b.i.e(d2, "club");
        m0.n.b.i.e(clubMembership, "clubMembership");
        return new e(d2, clubMembership, map);
    }
}
