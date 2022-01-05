package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.remote.request.ClubMemberSearchRequest;
import com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.f;
import i0.e.b.j2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: ClubRepo.kt */
public final class ClubRepo$searchClubMembers$1 extends Lambda implements a<x<Integer, f>> {
    public final /* synthetic */ ClubRepo c;
    public final /* synthetic */ ClubMemberSearchRequest d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$searchClubMembers$1(ClubRepo clubRepo, ClubMemberSearchRequest clubMemberSearchRequest) {
        super(0);
        this.c = clubRepo;
        this.d = clubMemberSearchRequest;
    }

    public Object invoke() {
        return new SearchClubMembersPagingSource(this.d, ((j2) this.c.j).a.f.e.J());
    }
}
