package com.clubhouse.android.ui.onboarding.clubs;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.remote.request.OnboardingState;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsViewModel$leaveClub$1", f = "OnboardingClubsViewModel.kt", l = {128}, m = "invokeSuspend")
/* compiled from: OnboardingClubsViewModel.kt */
public final class OnboardingClubsViewModel$leaveClub$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ OnboardingClubsViewModel d;
    public final /* synthetic */ Club q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsViewModel$leaveClub$1(OnboardingClubsViewModel onboardingClubsViewModel, Club club, m0.l.c<? super OnboardingClubsViewModel$leaveClub$1> cVar) {
        super(1, cVar);
        this.d = onboardingClubsViewModel;
        this.q = club;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new OnboardingClubsViewModel$leaveClub$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new OnboardingClubsViewModel$leaveClub$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            OnboardingClubsViewModel onboardingClubsViewModel = this.d;
            final Club club = this.q;
            AnonymousClass1 r1 = new l<i0.e.b.g3.r.z2.h, i0.e.b.g3.r.z2.h>() {
                public Object invoke(Object obj) {
                    i0.e.b.g3.r.z2.h hVar = (i0.e.b.g3.r.z2.h) obj;
                    m0.n.b.i.e(hVar, "$this$setState");
                    return i0.e.b.g3.r.z2.h.copy$default(hVar, false, (List) null, (String) null, g.T(hVar.d, Integer.valueOf(club.getId())), 7, (Object) null);
                }
            };
            int i2 = OnboardingClubsViewModel.m;
            onboardingClubsViewModel.m(r1);
            OnboardingRepo onboardingRepo = this.d.o;
            int id = this.q.getId();
            OnboardingState value = onboardingRepo.e.getValue();
            onboardingRepo.e.setValue(OnboardingState.a(value, (List) null, (List) null, g.Q(value.c, Integer.valueOf(id)), (List) null, 11));
            ClubRepo clubRepo = this.d.r;
            int id2 = this.q.getId();
            Integer b = this.d.n.b();
            int intValue = b == null ? 0 : b.intValue();
            this.c = 1;
            obj = clubRepo.u(id2, intValue, this);
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
