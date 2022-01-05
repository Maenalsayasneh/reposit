package com.clubhouse.android.ui.payments;

import com.stripe.android.view.PaymentMethodsActivityStarter;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.j0;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class SendDirectPaymentViewModel$handleActivityResultIntent$2 extends Lambda implements l<b1, i> {
    public final /* synthetic */ PaymentMethodsActivityStarter.Result c;
    public final /* synthetic */ SendDirectPaymentViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentViewModel$handleActivityResultIntent$2(PaymentMethodsActivityStarter.Result result, SendDirectPaymentViewModel sendDirectPaymentViewModel) {
        super(1);
        this.c = result;
        this.d = sendDirectPaymentViewModel;
    }

    public Object invoke(Object obj) {
        j0 j0Var;
        b1 b1Var = (b1) obj;
        m0.n.b.i.e(b1Var, "state");
        PaymentMethodsActivityStarter.Result result = this.c;
        if ((result == null ? null : result.paymentMethod) != null) {
            SendDirectPaymentViewModel.q(this.d, result.paymentMethod, b1Var.d);
        } else if (b1Var.e == null || (j0Var = b1Var.d) == null) {
            this.d.m(AnonymousClass1.c);
        } else {
            SendDirectPaymentViewModel sendDirectPaymentViewModel = this.d;
            Objects.requireNonNull(sendDirectPaymentViewModel);
            sendDirectPaymentViewModel.m(new SendDirectPaymentViewModel$chooseAmount$1(j0Var));
            sendDirectPaymentViewModel.n(new SendDirectPaymentViewModel$chooseAmount$2(sendDirectPaymentViewModel, j0Var));
        }
        return i.a;
    }
}
