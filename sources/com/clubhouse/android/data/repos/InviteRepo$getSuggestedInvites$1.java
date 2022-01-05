package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.Contact;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.InviteRepo", f = "InviteRepo.kt", l = {36}, m = "getSuggestedInvites")
/* compiled from: InviteRepo.kt */
public final class InviteRepo$getSuggestedInvites$1 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ InviteRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteRepo$getSuggestedInvites$1(InviteRepo inviteRepo, m0.l.c<? super InviteRepo$getSuggestedInvites$1> cVar) {
        super(cVar);
        this.x = inviteRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a((List<Contact>) null, this);
    }
}
