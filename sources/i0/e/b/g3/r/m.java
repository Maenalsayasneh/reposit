package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.onboarding.ConnectSocialAccountsFragment;
import com.clubhouse.android.ui.onboarding.ConnectSocialAccountsFragment$onViewCreated$2$1;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import m0.r.k;
import m0.r.t.a.r.m.a1.a;

/* compiled from: lambda */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ ConnectSocialAccountsFragment c;

    public /* synthetic */ m(ConnectSocialAccountsFragment connectSocialAccountsFragment) {
        this.c = connectSocialAccountsFragment;
    }

    public final void onClick(View view) {
        ConnectSocialAccountsFragment connectSocialAccountsFragment = this.c;
        k<Object>[] kVarArr = ConnectSocialAccountsFragment.Z1;
        i.e(connectSocialAccountsFragment, "this$0");
        ((AmplitudeAnalytics) v.l(connectSocialAccountsFragment)).a("Onboarding-Social-Twitter-Tap");
        p viewLifecycleOwner = connectSocialAccountsFragment.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        a.E2(q.a(viewLifecycleOwner), (e) null, (CoroutineStart) null, new ConnectSocialAccountsFragment$onViewCreated$2$1(connectSocialAccountsFragment, (c<? super ConnectSocialAccountsFragment$onViewCreated$2$1>) null), 3, (Object) null);
    }
}
