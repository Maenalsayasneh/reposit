package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ClubRepo", f = "ClubRepo.kt", l = {124}, m = "updateIsCommunity")
/* compiled from: ClubRepo.kt */
public final class ClubRepo$updateIsCommunity$1 extends ContinuationImpl {
    public Object c;
    public int d;
    public /* synthetic */ Object q;
    public final /* synthetic */ ClubRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$updateIsCommunity$1(ClubRepo clubRepo, m0.l.c<? super ClubRepo$updateIsCommunity$1> cVar) {
        super(cVar);
        this.x = clubRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.z(0, false, this);
    }
}
