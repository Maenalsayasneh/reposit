package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.stripe.android.model.PaymentMethod;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.j0;
import i0.e.b.g3.s.k0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class SendDirectPaymentViewModel$updatePaymentMethod$2 extends Lambda implements l<b1, b1> {
    public final /* synthetic */ PaymentMethod c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentViewModel$updatePaymentMethod$2(PaymentMethod paymentMethod) {
        super(1);
        this.c = paymentMethod;
    }

    public Object invoke(Object obj) {
        b1 b1Var = (b1) obj;
        i.e(b1Var, "$this$setState");
        return b1.copy$default(b1Var, (UserProfile) null, (String) null, (k0) null, (j0) null, this.c, 15, (Object) null);
    }
}
