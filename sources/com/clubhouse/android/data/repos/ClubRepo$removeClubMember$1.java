package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ClubRepo", f = "ClubRepo.kt", l = {154}, m = "removeClubMember")
/* compiled from: ClubRepo.kt */
public final class ClubRepo$removeClubMember$1 extends ContinuationImpl {
    public int Y1;
    public Object c;
    public int d;
    public int q;
    public /* synthetic */ Object x;
    public final /* synthetic */ ClubRepo y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$removeClubMember$1(ClubRepo clubRepo, m0.l.c<? super ClubRepo$removeClubMember$1> cVar) {
        super(cVar);
        this.y = clubRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.Y1 |= Integer.MIN_VALUE;
        return this.y.u(0, 0, this);
    }
}
