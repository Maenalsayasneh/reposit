package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import h0.t.q;
import i0.e.b.g3.u.z5.n0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ConnectSocialAccountsFragment.kt */
public final class ConnectSocialAccountsFragment$advance$1 extends Lambda implements l<n0, i> {
    public final /* synthetic */ ConnectSocialAccountsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectSocialAccountsFragment$advance$1(ConnectSocialAccountsFragment connectSocialAccountsFragment) {
        super(1);
        this.c = connectSocialAccountsFragment;
    }

    public Object invoke(Object obj) {
        n0 n0Var = (n0) obj;
        m0.n.b.i.e(n0Var, "state");
        if (n0Var.c) {
            ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-Social-Instagram-Success");
        }
        if (n0Var.a) {
            ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-Social-Twitter-Success");
        }
        if (!n0Var.a && !n0Var.c) {
            ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-Social-Skip");
        }
        v.a1(this.c, new a(R.id.action_connectSocialAccountsFragment_to_addPhotoFragment), (q) null, 2);
        return i.a;
    }
}
