package i0.e.b.g3.r;

import android.widget.Button;
import com.clubhouse.android.ui.onboarding.CollectPhoneNumberFragment;
import com.hbb20.CountryCodePicker;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements CountryCodePicker.g {
    public final /* synthetic */ CollectPhoneNumberFragment a;

    public /* synthetic */ e(CollectPhoneNumberFragment collectPhoneNumberFragment) {
        this.a = collectPhoneNumberFragment;
    }

    public final void a(boolean z) {
        CollectPhoneNumberFragment collectPhoneNumberFragment = this.a;
        k<Object>[] kVarArr = CollectPhoneNumberFragment.Z1;
        i.e(collectPhoneNumberFragment, "this$0");
        Button button = collectPhoneNumberFragment.N0().c;
        i.d(button, "binding.nextButton");
        i0.e.b.d3.k.k(button, Boolean.valueOf(z));
    }
}
