package com.clubhouse.android.ui.payments;

import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import h0.b0.v;
import i0.e.b.g3.s.p0;
import m0.n.b.i;
import m0.r.k;

/* compiled from: SendDirectPaymentFragment.kt */
public final class SendDirectPaymentFragment$setUpStripe$1 implements PaymentSession.PaymentSessionListener {
    public final /* synthetic */ SendDirectPaymentFragment a;

    public SendDirectPaymentFragment$setUpStripe$1(SendDirectPaymentFragment sendDirectPaymentFragment) {
        this.a = sendDirectPaymentFragment;
    }

    public void onCommunicatingStateChanged(boolean z) {
    }

    public void onError(int i, String str) {
        i.e(str, "errorMessage");
        SendDirectPaymentFragment sendDirectPaymentFragment = this.a;
        k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
        sendDirectPaymentFragment.V0().p(p0.a);
    }

    public void onPaymentSessionDataChanged(PaymentSessionData paymentSessionData) {
        i.e(paymentSessionData, MessageExtension.FIELD_DATA);
        PaymentMethod paymentMethod = paymentSessionData.getPaymentMethod();
        SendDirectPaymentFragment sendDirectPaymentFragment = this.a;
        k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
        v.v2(sendDirectPaymentFragment.V0(), new SendDirectPaymentFragment$setUpStripe$1$onPaymentSessionDataChanged$1(paymentMethod, this.a));
    }
}
