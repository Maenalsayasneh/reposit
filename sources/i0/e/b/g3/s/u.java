package i0.e.b.g3.s;

import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.EditText;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment$onViewCreated$6$1;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.d3.n;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ SendDirectPaymentFragment c;

    public /* synthetic */ u(SendDirectPaymentFragment sendDirectPaymentFragment) {
        this.c = sendDirectPaymentFragment;
    }

    public final void onClick(View view) {
        SendDirectPaymentFragment sendDirectPaymentFragment = this.c;
        k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
        i.e(sendDirectPaymentFragment, "this$0");
        DialogEditTextBinding inflate = DialogEditTextBinding.inflate(sendDirectPaymentFragment.getLayoutInflater());
        i.d(inflate, "inflate(layoutInflater)");
        inflate.b.setHint(sendDirectPaymentFragment.requireContext().getString(R.string.enter_amount_hint_dollars));
        inflate.b.setInputType(2);
        inflate.b.setKeyListener(DigitsKeyListener.getInstance(sendDirectPaymentFragment.requireContext().getString(R.string.allowed_payment_amount_symbols)));
        inflate.b.setText("$");
        inflate.b.setSelection(1);
        EditText editText = inflate.b;
        i.d(editText, "binding.text");
        i.e(editText, "<this>");
        i.e("$", "prefix");
        editText.addTextChangedListener(new n(editText, "$"));
        SendDirectPaymentFragment$onViewCreated$6$1 sendDirectPaymentFragment$onViewCreated$6$1 = new SendDirectPaymentFragment$onViewCreated$6$1(inflate, sendDirectPaymentFragment);
        i.e(sendDirectPaymentFragment, "<this>");
        i.e(sendDirectPaymentFragment$onViewCreated$6$1, "f");
        d.a aVar = new d.a(sendDirectPaymentFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        sendDirectPaymentFragment$onViewCreated$6$1.invoke(aVar);
        aVar.g();
    }
}
