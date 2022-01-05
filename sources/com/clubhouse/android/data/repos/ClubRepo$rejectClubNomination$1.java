package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ClubRepo", f = "ClubRepo.kt", l = {382}, m = "rejectClubNomination")
/* compiled from: ClubRepo.kt */
public final class ClubRepo$rejectClubNomination$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ ClubRepo d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$rejectClubNomination$1(ClubRepo clubRepo, m0.l.c<? super ClubRepo$rejectClubNomination$1> cVar) {
        super(cVar);
        this.d = clubRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.q(0, 0, (Integer) null, this);
    }
}
