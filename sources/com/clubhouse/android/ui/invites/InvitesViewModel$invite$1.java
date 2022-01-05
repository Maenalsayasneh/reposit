package com.clubhouse.android.ui.invites;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.InviteRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.invites.InvitesViewModel$invite$1", f = "InvitesViewModel.kt", l = {152}, m = "invokeSuspend")
/* compiled from: InvitesViewModel.kt */
public final class InvitesViewModel$invite$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ InvitesViewModel d;
    public final /* synthetic */ String q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesViewModel$invite$1(InvitesViewModel invitesViewModel, String str, String str2, m0.l.c<? super InvitesViewModel$invite$1> cVar) {
        super(1, cVar);
        this.d = invitesViewModel;
        this.q = str;
        this.x = str2;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new InvitesViewModel$invite$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new InvitesViewModel$invite$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            InviteRepo inviteRepo = this.d.q;
            String str = this.q;
            String str2 = this.x;
            if (str2 == null) {
                str2 = "";
            }
            this.c = 1;
            obj = inviteRepo.b(str, str2, this);
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
