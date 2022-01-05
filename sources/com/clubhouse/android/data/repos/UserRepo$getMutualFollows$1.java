package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.j;
import i0.e.b.l;
import i0.e.b.s2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: UserRepo.kt */
public final class UserRepo$getMutualFollows$1 extends Lambda implements a<x<Integer, j>> {
    public final /* synthetic */ UserRepo c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getMutualFollows$1(UserRepo userRepo, int i) {
        super(0);
        this.c = userRepo;
        this.d = i;
    }

    public Object invoke() {
        GetMutualFollowsPagingSource.a aVar = this.c.r;
        int i = this.d;
        l.i iVar = ((s2) aVar).a.f;
        return new GetMutualFollowsPagingSource(i, iVar.e.J(), iVar.e.u());
    }
}
