package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.paging.GetClubMembersPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.f;
import i0.e.b.l;
import i0.e.b.x2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: ClubRepo.kt */
public final class ClubRepo$getClubMembers$1 extends Lambda implements a<x<Integer, f>> {
    public final /* synthetic */ ClubRepo c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$getClubMembers$1(ClubRepo clubRepo, int i) {
        super(0);
        this.c = clubRepo;
        this.d = i;
    }

    public Object invoke() {
        GetClubMembersPagingSource.a aVar = this.c.i;
        int i = this.d;
        l.i iVar = ((x2) aVar).a.f;
        return new GetClubMembersPagingSource(i, iVar.e.J(), iVar.e.u());
    }
}
