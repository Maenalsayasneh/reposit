package com.clubhouse.android.data.repos;

import android.net.Uri;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ClubRepo", f = "ClubRepo.kt", l = {308}, m = "updatePhoto")
/* compiled from: ClubRepo.kt */
public final class ClubRepo$updatePhoto$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ClubRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$updatePhoto$1(ClubRepo clubRepo, m0.l.c<? super ClubRepo$updatePhoto$1> cVar) {
        super(cVar);
        this.q = clubRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.C(0, (Uri) null, this);
    }
}
