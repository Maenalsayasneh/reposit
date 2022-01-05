package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.club.ClubRule;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ClubRepo", f = "ClubRepo.kt", l = {341}, m = "updateClubRules")
/* compiled from: ClubRepo.kt */
public final class ClubRepo$updateClubRules$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ClubRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$updateClubRules$1(ClubRepo clubRepo, m0.l.c<? super ClubRepo$updateClubRules$1> cVar) {
        super(cVar);
        this.q = clubRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.w(0, (List<ClubRule>) null, this);
    }
}
