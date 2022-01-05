package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.onboarding.ValidateNumberFragment;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ ValidateNumberFragment c;

    public /* synthetic */ z(ValidateNumberFragment validateNumberFragment) {
        this.c = validateNumberFragment;
    }

    public final void onClick(View view) {
        ValidateNumberFragment validateNumberFragment = this.c;
        k<Object>[] kVarArr = ValidateNumberFragment.Z1;
        i.e(validateNumberFragment, "this$0");
        ((AmplitudeAnalytics) v.l(validateNumberFragment)).a("Onboarding-PhoneVerify-GoBack");
        v.c1(validateNumberFragment);
    }
}
