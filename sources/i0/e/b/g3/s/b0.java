package i0.e.b.g3.s;

import android.content.DialogInterface;
import android.text.Editable;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment;
import com.clubhouse.android.ui.payments.SendDirectPaymentViewModel;
import i0.e.b.g3.s.j0;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SendDirectPaymentFragment c;
    public final /* synthetic */ DialogEditTextBinding d;

    public /* synthetic */ b0(SendDirectPaymentFragment sendDirectPaymentFragment, DialogEditTextBinding dialogEditTextBinding) {
        this.c = sendDirectPaymentFragment;
        this.d = dialogEditTextBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SendDirectPaymentFragment sendDirectPaymentFragment = this.c;
        DialogEditTextBinding dialogEditTextBinding = this.d;
        i.e(sendDirectPaymentFragment, "this$0");
        i.e(dialogEditTextBinding, "$binding");
        k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
        SendDirectPaymentViewModel V0 = sendDirectPaymentFragment.V0();
        Editable text = dialogEditTextBinding.b.getText();
        i.d(text, "binding.text.text");
        V0.p(new h0(new j0.b(Integer.parseInt(text.subSequence(1, text.length()).toString()) * 100)));
        dialogInterface.dismiss();
    }
}
