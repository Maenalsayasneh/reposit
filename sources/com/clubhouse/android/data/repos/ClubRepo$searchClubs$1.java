package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest;
import com.clubhouse.android.data.network.paging.SearchClubsPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.j;
import i0.e.b.k2;
import i0.e.b.l;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: ClubRepo.kt */
public final class ClubRepo$searchClubs$1 extends Lambda implements a<x<Integer, j>> {
    public final /* synthetic */ ClubRepo c;
    public final /* synthetic */ FollowScopedSearchRequest d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$searchClubs$1(ClubRepo clubRepo, FollowScopedSearchRequest followScopedSearchRequest) {
        super(0);
        this.c = clubRepo;
        this.d = followScopedSearchRequest;
    }

    public Object invoke() {
        SearchClubsPagingSource.a aVar = this.c.k;
        FollowScopedSearchRequest followScopedSearchRequest = this.d;
        l.i iVar = ((k2) aVar).a.f;
        return new SearchClubsPagingSource(followScopedSearchRequest, iVar.e.J(), iVar.e.u());
    }
}
