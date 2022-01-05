package com.clubhouse.android.data.network.paging;

import g0.a.b.b.a;
import h0.u.w;
import i0.j.f.p.h;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.r;
import n0.a.g2.e;

@c(c = "com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource$flow$4", f = "EntityAwarePagingDataSource.kt", l = {44}, m = "invokeSuspend")
/* compiled from: EntityAwarePagingDataSource.kt */
public final class EntityAwarePagingDataSource$flow$4 extends SuspendLambda implements r<e<? super w<Item>>, w<Item>, Set<? extends Integer>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ EntityAwarePagingDataSource<Item> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntityAwarePagingDataSource$flow$4(EntityAwarePagingDataSource<Item> entityAwarePagingDataSource, m0.l.c<? super EntityAwarePagingDataSource$flow$4> cVar) {
        super(4, cVar);
        this.x = entityAwarePagingDataSource;
    }

    public Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        Set set = (Set) obj3;
        EntityAwarePagingDataSource$flow$4 entityAwarePagingDataSource$flow$4 = new EntityAwarePagingDataSource$flow$4(this.x, (m0.l.c) obj4);
        entityAwarePagingDataSource$flow$4.d = (e) obj;
        entityAwarePagingDataSource$flow$4.q = (w) obj2;
        return entityAwarePagingDataSource$flow$4.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            w d0 = a.d0((w) this.q, new EntityAwarePagingDataSource$flow$4$updatedPagedData$1(this.x, (m0.l.c<? super EntityAwarePagingDataSource$flow$4$updatedPagedData$1>) null));
            this.d = null;
            this.c = 1;
            if (((e) this.d).emit(d0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
