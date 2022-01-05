package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.WelcomeFragment;
import h0.b0.v;
import h0.t.l;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ WelcomeFragment c;
    public final /* synthetic */ l d;

    public /* synthetic */ c0(WelcomeFragment welcomeFragment, l lVar) {
        this.c = welcomeFragment;
        this.d = lVar;
    }

    public final void onClick(View view) {
        WelcomeFragment welcomeFragment = this.c;
        l lVar = this.d;
        k<Object>[] kVarArr = WelcomeFragment.Z1;
        i.e(welcomeFragment, "this$0");
        i.e(lVar, "$navDirections");
        v.a1(welcomeFragment, lVar, (q) null, 2);
    }
}
