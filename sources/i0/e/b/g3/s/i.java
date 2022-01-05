package i0.e.b.g3.s;

import android.content.DialogInterface;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.ui.payments.PaymentsRegistrationFragment;

/* compiled from: lambda */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {
    public final /* synthetic */ PaymentsRegistrationFragment c;
    public final /* synthetic */ DialogEditTextBinding d;

    public /* synthetic */ i(PaymentsRegistrationFragment paymentsRegistrationFragment, DialogEditTextBinding dialogEditTextBinding) {
        this.c = paymentsRegistrationFragment;
        this.d = dialogEditTextBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PaymentsRegistrationFragment paymentsRegistrationFragment = this.c;
        DialogEditTextBinding dialogEditTextBinding = this.d;
        m0.n.b.i.e(paymentsRegistrationFragment, "this$0");
        m0.n.b.i.e(dialogEditTextBinding, "$binding");
        paymentsRegistrationFragment.O0().p(new h1(dialogEditTextBinding.b.getText().toString()));
        dialogInterface.dismiss();
    }
}
