package i0.e.b.g3.s;

import android.view.View;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.ui.payments.PaymentsRegistrationFragment;
import com.clubhouse.android.ui.payments.PaymentsRegistrationFragment$showVerifyEmailPromptDialog$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ PaymentsRegistrationFragment c;

    public /* synthetic */ b(PaymentsRegistrationFragment paymentsRegistrationFragment) {
        this.c = paymentsRegistrationFragment;
    }

    public final void onClick(View view) {
        PaymentsRegistrationFragment paymentsRegistrationFragment = this.c;
        k<Object>[] kVarArr = PaymentsRegistrationFragment.Z1;
        i.e(paymentsRegistrationFragment, "this$0");
        DialogEditTextBinding inflate = DialogEditTextBinding.inflate(paymentsRegistrationFragment.getLayoutInflater());
        i.d(inflate, "inflate(layoutInflater)");
        PaymentsRegistrationFragment$showVerifyEmailPromptDialog$1 paymentsRegistrationFragment$showVerifyEmailPromptDialog$1 = new PaymentsRegistrationFragment$showVerifyEmailPromptDialog$1(inflate, paymentsRegistrationFragment);
        i.e(paymentsRegistrationFragment, "<this>");
        i.e(paymentsRegistrationFragment$showVerifyEmailPromptDialog$1, "f");
        d.a aVar = new d.a(paymentsRegistrationFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        paymentsRegistrationFragment$showVerifyEmailPromptDialog$1.invoke(aVar);
        aVar.g();
    }
}
