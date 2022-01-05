package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.repos.EventRepo;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.shared.auth.UserManager;
import h0.u.u;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.e.b.b3.c.b;
import java.util.Objects;
import m0.l.c;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.d;

/* compiled from: EntityAwarePagingDataSource.kt */
public final class EntityAwarePagingDataSource<Item extends j> {
    public final EventRepo a;
    public final UserRepo b;
    public final b c;
    public final UserManager d;
    public final d<w<Item>> e;

    public EntityAwarePagingDataSource(EventRepo eventRepo, UserRepo userRepo, b bVar, UserManager userManager, f0 f0Var, u<Integer, Item> uVar) {
        i.e(eventRepo, "eventRepo");
        i.e(userRepo, "userRepo");
        i.e(bVar, "clubCache");
        i.e(userManager, "userManager");
        i.e(f0Var, "coroutineScope");
        i.e(uVar, "pagingSource");
        this.a = eventRepo;
        this.b = userRepo;
        this.c = bVar;
        this.d = userManager;
        this.e = a.y1(a.y1(a.y1(a.y1(new EntityAwarePagingDataSource$special$$inlined$map$3(new EntityAwarePagingDataSource$special$$inlined$map$2(new EntityAwarePagingDataSource$special$$inlined$map$1(g0.a.b.b.a.h(uVar.a, f0Var), this), this), this), userRepo.d.g, new EntityAwarePagingDataSource$flow$4(this, (c<? super EntityAwarePagingDataSource$flow$4>) null)), userRepo.d.h, new EntityAwarePagingDataSource$flow$5(this, (c<? super EntityAwarePagingDataSource$flow$5>) null)), eventRepo.c.a, new EntityAwarePagingDataSource$flow$6(this, (c<? super EntityAwarePagingDataSource$flow$6>) null)), bVar.b, new EntityAwarePagingDataSource$flow$7(this, (c<? super EntityAwarePagingDataSource$flow$7>) null));
    }

    public static final j a(EntityAwarePagingDataSource entityAwarePagingDataSource, j jVar) {
        Objects.requireNonNull(entityAwarePagingDataSource);
        if (!(jVar instanceof i0.e.b.b3.b.e.b)) {
            return jVar;
        }
        i0.e.b.b3.b.e.b bVar = (i0.e.b.b3.b.e.b) jVar;
        return i0.e.b.b3.b.e.b.f(bVar, false, false, entityAwarePagingDataSource.b.s(bVar.c().getId().intValue()), 3, (Object) null);
    }

    public static final j b(EntityAwarePagingDataSource entityAwarePagingDataSource, j jVar) {
        Objects.requireNonNull(entityAwarePagingDataSource);
        if (!(jVar instanceof i0.e.b.b3.b.e.b)) {
            return jVar;
        }
        i0.e.b.b3.b.e.b bVar = (i0.e.b.b3.b.e.b) jVar;
        return i0.e.b.b3.b.e.b.f(bVar, false, entityAwarePagingDataSource.b.t(bVar.c().getId().intValue()), false, 5, (Object) null);
    }
}
