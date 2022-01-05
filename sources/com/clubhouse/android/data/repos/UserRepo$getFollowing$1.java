package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.paging.GetFollowingPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.j;
import i0.e.b.l;
import i0.e.b.p2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: UserRepo.kt */
public final class UserRepo$getFollowing$1 extends Lambda implements a<x<Integer, j>> {
    public final /* synthetic */ UserRepo c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getFollowing$1(UserRepo userRepo, int i) {
        super(0);
        this.c = userRepo;
        this.d = i;
    }

    public Object invoke() {
        GetFollowingPagingSource.a aVar = this.c.o;
        int i = this.d;
        l.i iVar = ((p2) aVar).a.f;
        return new GetFollowingPagingSource(i, iVar.e.J(), iVar.e.u());
    }
}
