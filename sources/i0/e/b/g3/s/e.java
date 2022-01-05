package i0.e.b.g3.s;

import android.widget.CompoundButton;
import com.clubhouse.android.ui.payments.PaymentsRegistrationFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ PaymentsRegistrationFragment a;

    public /* synthetic */ e(PaymentsRegistrationFragment paymentsRegistrationFragment) {
        this.a = paymentsRegistrationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        PaymentsRegistrationFragment paymentsRegistrationFragment = this.a;
        k<Object>[] kVarArr = PaymentsRegistrationFragment.Z1;
        i.e(paymentsRegistrationFragment, "this$0");
        if (compoundButton.isPressed()) {
            paymentsRegistrationFragment.O0().p(new f1(z));
        }
    }
}
