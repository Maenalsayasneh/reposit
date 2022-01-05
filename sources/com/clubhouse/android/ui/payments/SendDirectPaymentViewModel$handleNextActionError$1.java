package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.stripe.android.model.PaymentMethod;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.j0;
import i0.e.b.g3.s.k0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class SendDirectPaymentViewModel$handleNextActionError$1 extends Lambda implements l<b1, i> {
    public final /* synthetic */ SendDirectPaymentViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentViewModel$handleNextActionError$1(SendDirectPaymentViewModel sendDirectPaymentViewModel) {
        super(1);
        this.c = sendDirectPaymentViewModel;
    }

    public Object invoke(Object obj) {
        final b1 b1Var = (b1) obj;
        m0.n.b.i.e(b1Var, "state");
        if (b1Var.d != null) {
            this.c.m(new l<b1, b1>() {
                public Object invoke(Object obj) {
                    String str;
                    b1 b1Var = (b1) obj;
                    m0.n.b.i.e(b1Var, "$this$setState");
                    b1 b1Var2 = b1.this;
                    j0 j0Var = b1Var2.d;
                    PaymentMethod paymentMethod = b1Var2.e;
                    if (paymentMethod == null || (str = paymentMethod.id) == null) {
                        str = "";
                    }
                    return b1.copy$default(b1Var, (UserProfile) null, (String) null, new k0.a(j0Var, str, b1Var2.a()), (j0) null, (PaymentMethod) null, 27, (Object) null);
                }
            });
        }
        return i.a;
    }
}
