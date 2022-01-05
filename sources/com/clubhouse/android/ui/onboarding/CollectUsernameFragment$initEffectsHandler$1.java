package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import h0.t.q;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.r.q1;
import i0.e.b.g3.r.r1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.CollectUsernameFragment$initEffectsHandler$1", f = "CollectUsernameFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CollectUsernameFragment.kt */
public final class CollectUsernameFragment$initEffectsHandler$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CollectUsernameFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectUsernameFragment$initEffectsHandler$1(CollectUsernameFragment collectUsernameFragment, m0.l.c<? super CollectUsernameFragment$initEffectsHandler$1> cVar) {
        super(2, cVar);
        this.d = collectUsernameFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CollectUsernameFragment$initEffectsHandler$1 collectUsernameFragment$initEffectsHandler$1 = new CollectUsernameFragment$initEffectsHandler$1(this.d, cVar);
        collectUsernameFragment$initEffectsHandler$1.c = obj;
        return collectUsernameFragment$initEffectsHandler$1;
    }

    public Object invoke(Object obj, Object obj2) {
        CollectUsernameFragment$initEffectsHandler$1 collectUsernameFragment$initEffectsHandler$1 = new CollectUsernameFragment$initEffectsHandler$1(this.d, (m0.l.c) obj2);
        collectUsernameFragment$initEffectsHandler$1.c = (b) obj;
        i iVar = i.a;
        collectUsernameFragment$initEffectsHandler$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final CollectUsernameFragment collectUsernameFragment = this.d;
            v.f2(collectUsernameFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = collectUsernameFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        } else if (bVar instanceof q1) {
            ((AmplitudeAnalytics) v.l(this.d)).a("Onboarding-Username-Done");
            v.a1(this.d, new a(R.id.action_collectUsernameFragment_to_addPhotoFragment), (q) null, 2);
        } else if (bVar instanceof r1) {
            ((AmplitudeAnalytics) v.l(this.d)).a("Onboarding-Username-Done");
            ((AmplitudeAnalytics) v.l(this.d)).a("Onboarding-Social-Start");
            v.a1(this.d, new a(R.id.action_collectUsernameFragment_to_connectSocialAccountsFragment), (q) null, 2);
        }
        return i.a;
    }
}
