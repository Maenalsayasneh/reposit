package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest;
import com.clubhouse.android.data.network.paging.SearchUsersPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.j;
import i0.e.b.l;
import i0.e.b.v2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: UserRepo.kt */
public final class UserRepo$searchUsers$1 extends Lambda implements a<x<Integer, j>> {
    public final /* synthetic */ UserRepo c;
    public final /* synthetic */ FollowScopedSearchRequest d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$searchUsers$1(UserRepo userRepo, FollowScopedSearchRequest followScopedSearchRequest) {
        super(0);
        this.c = userRepo;
        this.d = followScopedSearchRequest;
    }

    public Object invoke() {
        SearchUsersPagingSource.a aVar = this.c.u;
        FollowScopedSearchRequest followScopedSearchRequest = this.d;
        l.i iVar = ((v2) aVar).a.f;
        return new SearchUsersPagingSource(followScopedSearchRequest, iVar.e.J(), iVar.e.u());
    }
}
