package com.clubhouse.android.ui.onboarding.clubs;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import com.clubhouse.android.ui.clubs.HalfClubRulesFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.e;
import i0.e.b.g3.r.a3.d;
import i0.e.b.g3.r.z2.f;
import i0.e.b.g3.r.z2.j;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsFragment$onViewCreated$4", f = "OnboardingClubsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: OnboardingClubsFragment.kt */
public final class OnboardingClubsFragment$onViewCreated$4 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ OnboardingClubsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsFragment$onViewCreated$4(OnboardingClubsFragment onboardingClubsFragment, m0.l.c<? super OnboardingClubsFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = onboardingClubsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        OnboardingClubsFragment$onViewCreated$4 onboardingClubsFragment$onViewCreated$4 = new OnboardingClubsFragment$onViewCreated$4(this.d, cVar);
        onboardingClubsFragment$onViewCreated$4.c = obj;
        return onboardingClubsFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        OnboardingClubsFragment$onViewCreated$4 onboardingClubsFragment$onViewCreated$4 = new OnboardingClubsFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        onboardingClubsFragment$onViewCreated$4.c = (b) obj;
        i iVar = i.a;
        onboardingClubsFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            v.b1(this.d, ((d) bVar).a);
        } else if (bVar instanceof j) {
            OnboardingClubsFragment onboardingClubsFragment = this.d;
            Club club = ((j) bVar).a;
            k<Object>[] kVarArr = OnboardingClubsFragment.Z1;
            Objects.requireNonNull(onboardingClubsFragment);
            Objects.requireNonNull(HalfClubRulesFragment.p2);
            v.p0(onboardingClubsFragment, HalfClubRulesFragment.r2, new OnboardingClubsFragment$showClubRules$1(onboardingClubsFragment, club));
            HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(club, Boolean.TRUE, (String) null, SourceLocation.ONBOARDING_CLUBS, (Map) null, 20);
            m0.n.b.i.e(halfClubRulesArgs, "mavericksArg");
            v.a1(onboardingClubsFragment, new f(halfClubRulesArgs), (q) null, 2);
        } else if (bVar instanceof e) {
            v.c2(this.d, new l<i0.e.b.a3.f.j, i>() {
                public Object invoke(Object obj) {
                    i0.e.b.a3.f.j jVar = (i0.e.b.a3.f.j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    jVar.e(((e) bVar).a);
                    return i.a;
                }
            });
        } else if (bVar instanceof i0.e.b.a3.b.d) {
            final OnboardingClubsFragment onboardingClubsFragment2 = this.d;
            v.f2(onboardingClubsFragment2, new l<i0.e.b.a3.f.j, i>() {
                public Object invoke(Object obj) {
                    i0.e.b.a3.f.j jVar = (i0.e.b.a3.f.j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((i0.e.b.a3.b.d) bVar).a;
                    if (str == null) {
                        str = onboardingClubsFragment2.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
