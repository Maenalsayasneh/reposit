package com.clubhouse.android.ui.onboarding;

import android.content.Intent;
import androidx.core.app.ActivityOptionsCompat;
import com.clubhouse.android.ui.profile.settings.AccountViewModel;
import h0.a.f.b;
import i0.e.b.g3.u.w4;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.onboarding.ConnectSocialAccountsFragment$onViewCreated$2$1", f = "ConnectSocialAccountsFragment.kt", l = {63, 66}, m = "invokeSuspend")
/* compiled from: ConnectSocialAccountsFragment.kt */
public final class ConnectSocialAccountsFragment$onViewCreated$2$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object c;
    public int d;
    public final /* synthetic */ ConnectSocialAccountsFragment q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectSocialAccountsFragment$onViewCreated$2$1(ConnectSocialAccountsFragment connectSocialAccountsFragment, m0.l.c<? super ConnectSocialAccountsFragment$onViewCreated$2$1> cVar) {
        super(2, cVar);
        this.q = connectSocialAccountsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ConnectSocialAccountsFragment$onViewCreated$2$1(this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ConnectSocialAccountsFragment$onViewCreated$2$1(this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        b<Intent> bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            ConnectSocialAccountsFragment connectSocialAccountsFragment = this.q;
            k<Object>[] kVarArr = ConnectSocialAccountsFragment.Z1;
            AccountViewModel O0 = connectSocialAccountsFragment.O0();
            this.d = 1;
            obj = O0.q(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            bVar = (b) this.c;
            h.d4(obj);
            bVar.a(obj, (ActivityOptionsCompat) null);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Intent) obj) != null) {
            ConnectSocialAccountsFragment connectSocialAccountsFragment2 = this.q;
            k<Object>[] kVarArr2 = ConnectSocialAccountsFragment.Z1;
            connectSocialAccountsFragment2.O0().p(w4.a);
            ConnectSocialAccountsFragment connectSocialAccountsFragment3 = this.q;
            b<Intent> bVar2 = connectSocialAccountsFragment3.d2;
            if (bVar2 != null) {
                AccountViewModel O02 = connectSocialAccountsFragment3.O0();
                this.c = bVar2;
                this.d = 2;
                obj = O02.q(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = bVar2;
                bVar.a(obj, (ActivityOptionsCompat) null);
            } else {
                m0.n.b.i.m("getTwitterOAuthToken");
                throw null;
            }
        }
        return i.a;
    }
}
