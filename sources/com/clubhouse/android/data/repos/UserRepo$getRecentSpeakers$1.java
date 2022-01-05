package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.paging.GetRecentSpeakersPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.m;
import i0.e.b.l;
import i0.e.b.t2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: UserRepo.kt */
public final class UserRepo$getRecentSpeakers$1 extends Lambda implements a<x<Integer, m>> {
    public final /* synthetic */ UserRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getRecentSpeakers$1(UserRepo userRepo) {
        super(0);
        this.c = userRepo;
    }

    public Object invoke() {
        l.i iVar = ((t2) this.c.s).a.f;
        return new GetRecentSpeakersPagingSource(iVar.e.J(), iVar.e.u());
    }
}
