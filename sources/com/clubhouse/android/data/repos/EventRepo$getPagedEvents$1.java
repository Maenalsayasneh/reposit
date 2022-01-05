package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.network.paging.GetEventsPagingSource;
import h0.u.x;
import i0.e.b.l;
import i0.e.b.l2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: EventRepo.kt */
public final class EventRepo$getPagedEvents$1 extends Lambda implements a<x<Integer, EventInClub>> {
    public final /* synthetic */ EventRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventRepo$getPagedEvents$1(EventRepo eventRepo) {
        super(0);
        this.c = eventRepo;
    }

    public Object invoke() {
        l.i iVar = ((l2) this.c.d).a.f;
        return new GetEventsPagingSource(iVar.e.J(), iVar.e.u(), iVar.t());
    }
}
