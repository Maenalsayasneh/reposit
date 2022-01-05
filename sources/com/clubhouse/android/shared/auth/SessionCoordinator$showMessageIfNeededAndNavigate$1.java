package com.clubhouse.android.shared.auth;

import android.os.Bundle;
import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.app.R;
import g0.a.b.b.a;
import h0.t.q;
import h0.t.s;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.shared.auth.SessionCoordinator$showMessageIfNeededAndNavigate$1", f = "SessionCoordinator.kt", l = {}, m = "invokeSuspend")
/* compiled from: SessionCoordinator.kt */
public final class SessionCoordinator$showMessageIfNeededAndNavigate$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ Banner c;
    public final /* synthetic */ SessionCoordinator d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionCoordinator$showMessageIfNeededAndNavigate$1(Banner banner, SessionCoordinator sessionCoordinator, m0.l.c<? super SessionCoordinator$showMessageIfNeededAndNavigate$1> cVar) {
        super(2, cVar);
        this.c = banner;
        this.d = sessionCoordinator;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new SessionCoordinator$showMessageIfNeededAndNavigate$1(this.c, this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        SessionCoordinator$showMessageIfNeededAndNavigate$1 sessionCoordinator$showMessageIfNeededAndNavigate$1 = new SessionCoordinator$showMessageIfNeededAndNavigate$1(this.c, this.d, (m0.l.c) obj2);
        i iVar = i.a;
        sessionCoordinator$showMessageIfNeededAndNavigate$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Banner banner = this.c;
        if (banner != null) {
            banner.a();
        }
        a.E(this.d.a, R.id.main_nav_host).h(R.id.onboarding_graph, (Bundle) null, new q(false, R.id.main_graph, true, -1, -1, -1, -1), (s.a) null);
        return i.a;
    }
}
