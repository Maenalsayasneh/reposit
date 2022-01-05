package i0.e.b.g3.s;

import android.view.View;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment;
import com.stripe.android.PaymentSession;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ SendDirectPaymentFragment c;

    public /* synthetic */ s(SendDirectPaymentFragment sendDirectPaymentFragment) {
        this.c = sendDirectPaymentFragment;
    }

    public final void onClick(View view) {
        SendDirectPaymentFragment sendDirectPaymentFragment = this.c;
        k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
        i.e(sendDirectPaymentFragment, "this$0");
        PaymentSession paymentSession = sendDirectPaymentFragment.s2;
        if (paymentSession != null) {
            PaymentSession.presentPaymentMethodSelection$default(paymentSession, (String) null, 1, (Object) null);
        } else {
            i.m("paymentSession");
            throw null;
        }
    }
}
