package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.WaitlistFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ WaitlistFragment c;

    public /* synthetic */ b0(WaitlistFragment waitlistFragment) {
        this.c = waitlistFragment;
    }

    public final void onClick(View view) {
        WaitlistFragment waitlistFragment = this.c;
        k<Object>[] kVarArr = WaitlistFragment.Z1;
        i.e(waitlistFragment, "this$0");
        v.a1(waitlistFragment, new a(R.id.action_waitlistFragment_to_collectPhoneNumberFragment), (q) null, 2);
    }
}
