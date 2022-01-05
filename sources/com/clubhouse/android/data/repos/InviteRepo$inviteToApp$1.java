package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.InviteRepo", f = "InviteRepo.kt", l = {54}, m = "inviteToApp")
/* compiled from: InviteRepo.kt */
public final class InviteRepo$inviteToApp$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ InviteRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteRepo$inviteToApp$1(InviteRepo inviteRepo, m0.l.c<? super InviteRepo$inviteToApp$1> cVar) {
        super(cVar);
        this.q = inviteRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.b((String) null, (String) null, this);
    }
}
