package com.clubhouse.android.ui.payments;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import i0.e.a.a;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.g0;
import i0.e.b.g3.s.j0;
import i0.e.b.g3.s.k0;
import i0.e.b.g3.s.s0;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class SendDirectPaymentViewModel$chooseAmount$2 extends Lambda implements l<b1, i> {
    public final /* synthetic */ SendDirectPaymentViewModel c;
    public final /* synthetic */ j0 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentViewModel$chooseAmount$2(SendDirectPaymentViewModel sendDirectPaymentViewModel, j0 j0Var) {
        super(1);
        this.c = sendDirectPaymentViewModel;
        this.d = j0Var;
    }

    public Object invoke(Object obj) {
        final b1 b1Var = (b1) obj;
        m0.n.b.i.e(b1Var, "state");
        a aVar = this.c.o;
        AmplitudeAnalytics amplitudeAnalytics = (AmplitudeAnalytics) aVar;
        amplitudeAnalytics.b("DirectPayments-SendPayment-SelectAmount", g.N(new Pair("recipient", b1Var.a), new Pair("amount", Integer.valueOf(this.d.b()))));
        if (b1Var.e != null) {
            a aVar2 = this.c.o;
            AmplitudeAnalytics amplitudeAnalytics2 = (AmplitudeAnalytics) aVar2;
            amplitudeAnalytics2.b("DirectPayments-SendPayment-SelectedPaymentOption", g.N(new Pair("recipient", b1Var.a), new Pair("amount", Integer.valueOf(this.d.b()))));
            SendDirectPaymentViewModel sendDirectPaymentViewModel = this.c;
            final j0 j0Var = this.d;
            sendDirectPaymentViewModel.m(new l<b1, b1>() {
                public Object invoke(Object obj) {
                    String str;
                    b1 b1Var = (b1) obj;
                    m0.n.b.i.e(b1Var, "$this$setState");
                    j0 j0Var = j0.this;
                    PaymentMethod paymentMethod = b1Var.e;
                    String str2 = paymentMethod.id;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    PaymentMethod.Card card = paymentMethod.card;
                    CardBrand cardBrand = card == null ? null : card.brand;
                    if (cardBrand == null) {
                        cardBrand = CardBrand.Unknown;
                    }
                    if (!(card == null || (str = card.last4) == null)) {
                        str3 = str;
                    }
                    return b1.copy$default(b1Var, (UserProfile) null, (String) null, new k0.a(j0Var, str2, new g0(cardBrand, str3)), (j0) null, (PaymentMethod) null, 27, (Object) null);
                }
            });
        } else {
            this.c.o(s0.a);
        }
        return i.a;
    }
}
