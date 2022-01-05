package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.remote.request.SearchV2Request;
import com.clubhouse.android.data.network.paging.SearchV2PagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.j;
import i0.e.b.l;
import i0.e.b.u2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: UserRepo.kt */
public final class UserRepo$search$1 extends Lambda implements a<x<Integer, j>> {
    public final /* synthetic */ UserRepo c;
    public final /* synthetic */ SearchV2Request d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$search$1(UserRepo userRepo, SearchV2Request searchV2Request) {
        super(0);
        this.c = userRepo;
        this.d = searchV2Request;
    }

    public Object invoke() {
        SearchV2PagingSource.a aVar = this.c.t;
        SearchV2Request searchV2Request = this.d;
        l.i iVar = ((u2) aVar).a.f;
        return new SearchV2PagingSource(searchV2Request, iVar.e.J(), iVar.r());
    }
}
