package com.clubhouse.android.ui.onboarding.clubs;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.request.OnboardingState;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsViewModel$joinClub$1", f = "OnboardingClubsViewModel.kt", l = {113}, m = "invokeSuspend")
/* compiled from: OnboardingClubsViewModel.kt */
public final class OnboardingClubsViewModel$joinClub$1 extends SuspendLambda implements l<m0.l.c<? super JoinClubResponse>, Object> {
    public int c;
    public final /* synthetic */ OnboardingClubsViewModel d;
    public final /* synthetic */ Club q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsViewModel$joinClub$1(OnboardingClubsViewModel onboardingClubsViewModel, Club club, m0.l.c<? super OnboardingClubsViewModel$joinClub$1> cVar) {
        super(1, cVar);
        this.d = onboardingClubsViewModel;
        this.q = club;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new OnboardingClubsViewModel$joinClub$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new OnboardingClubsViewModel$joinClub$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
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
                    return i0.e.b.g3.r.z2.h.copy$default(hVar, false, (List) null, (String) null, g.e0(hVar.d, Integer.valueOf(club.getId())), 7, (Object) null);
                }
            };
            int i2 = OnboardingClubsViewModel.m;
            onboardingClubsViewModel.m(r1);
            OnboardingRepo onboardingRepo = this.d.o;
            int id = this.q.getId();
            OnboardingState value = onboardingRepo.e.getValue();
            onboardingRepo.e.setValue(OnboardingState.a(value, (List) null, (List) null, g.a0(value.c, Integer.valueOf(id)), (List) null, 11));
            ClubRepo clubRepo = this.d.r;
            int id2 = this.q.getId();
            SourceLocation sourceLocation = SourceLocation.ONBOARDING_CLUBS;
            this.c = 1;
            obj = ClubRepo.o(clubRepo, id2, (String) null, sourceLocation, (Map) null, this, 10);
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
