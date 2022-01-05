package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.j;
import i0.e.b.l;
import i0.e.b.r2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: UserRepo.kt */
public final class UserRepo$getFollowersFromNotification$1 extends Lambda implements a<x<Integer, j>> {
    public final /* synthetic */ UserRepo c;
    public final /* synthetic */ long d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getFollowersFromNotification$1(UserRepo userRepo, long j) {
        super(0);
        this.c = userRepo;
        this.d = j;
    }

    public Object invoke() {
        GetFollowersFromNotificationPagingSource.a aVar = this.c.q;
        long j = this.d;
        l.i iVar = ((r2) aVar).a.f;
        return new GetFollowersFromNotificationPagingSource(j, iVar.e.J(), iVar.e.u());
    }
}
