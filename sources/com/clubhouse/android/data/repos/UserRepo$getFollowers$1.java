package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.paging.GetFollowersPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.j;
import i0.e.b.l;
import i0.e.b.q2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: UserRepo.kt */
public final class UserRepo$getFollowers$1 extends Lambda implements a<x<Integer, j>> {
    public final /* synthetic */ UserRepo c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getFollowers$1(UserRepo userRepo, int i) {
        super(0);
        this.c = userRepo;
        this.d = i;
    }

    public Object invoke() {
        GetFollowersPagingSource.a aVar = this.c.p;
        int i = this.d;
        l.i iVar = ((q2) aVar).a.f;
        return new GetFollowersPagingSource(i, iVar.e.J(), iVar.e.u());
    }
}
