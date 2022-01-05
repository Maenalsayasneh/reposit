package com.clubhouse.android.ui.invites;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.InviteRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.invites.InvitesViewModel$invitePhone$1", f = "InvitesViewModel.kt", l = {175}, m = "invokeSuspend")
/* compiled from: InvitesViewModel.kt */
public final class InvitesViewModel$invitePhone$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ InvitesViewModel d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesViewModel$invitePhone$1(InvitesViewModel invitesViewModel, String str, m0.l.c<? super InvitesViewModel$invitePhone$1> cVar) {
        super(1, cVar);
        this.d = invitesViewModel;
        this.q = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new InvitesViewModel$invitePhone$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new InvitesViewModel$invitePhone$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            InviteRepo inviteRepo = this.d.q;
            String str = this.q;
            this.c = 1;
            obj = inviteRepo.b(str, "", this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
