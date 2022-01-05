package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.EventRepo;
import i0.e.b.b3.a.a.a;
import i0.e.b.g3.u.d5;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.ProfileViewModel$rsvpEvent$1$1", f = "ProfileViewModel.kt", l = {309}, m = "invokeSuspend")
/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$rsvpEvent$1$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ProfileViewModel d;
    public final /* synthetic */ a q;
    public final /* synthetic */ d5 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$rsvpEvent$1$1(ProfileViewModel profileViewModel, a aVar, d5 d5Var, m0.l.c<? super ProfileViewModel$rsvpEvent$1$1> cVar) {
        super(1, cVar);
        this.d = profileViewModel;
        this.q = aVar;
        this.x = d5Var;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ProfileViewModel$rsvpEvent$1$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ProfileViewModel$rsvpEvent$1$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            EventRepo eventRepo = this.d.u;
            int id = this.q.getId();
            boolean z = this.x.b;
            this.c = 1;
            obj = EventRepo.g(eventRepo, id, z, (Map) null, this, 4);
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
