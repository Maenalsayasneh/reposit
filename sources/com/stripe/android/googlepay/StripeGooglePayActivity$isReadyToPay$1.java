package com.stripe.android.googlepay;

import com.google.android.gms.common.api.Status;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import i0.h.a.b.m.c;
import i0.h.a.b.m.g;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li0/h/a/b/m/g;", "", "kotlin.jvm.PlatformType", "task", "Lm0/i;", "onComplete", "(Li0/h/a/b/m/g;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeGooglePayActivity.kt */
public final class StripeGooglePayActivity$isReadyToPay$1<TResult> implements c<Boolean> {
    public final /* synthetic */ JSONObject $paymentDataRequest;
    public final /* synthetic */ StripeGooglePayActivity this$0;

    public StripeGooglePayActivity$isReadyToPay$1(StripeGooglePayActivity stripeGooglePayActivity, JSONObject jSONObject) {
        this.this$0 = stripeGooglePayActivity;
        this.$paymentDataRequest = jSONObject;
    }

    public final void onComplete(g<Boolean> gVar) {
        Object obj;
        i.e(gVar, "task");
        StripeGooglePayActivity stripeGooglePayActivity = this.this$0;
        try {
            if (gVar.n()) {
                stripeGooglePayActivity.payWithGoogle(this.$paymentDataRequest);
            } else {
                stripeGooglePayActivity.getViewModel().updateGooglePayResult(StripeGooglePayContract.Result.Unavailable.INSTANCE);
            }
            obj = m0.i.a;
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            this.this$0.getViewModel().updateGooglePayResult(new StripeGooglePayContract.Result.Error(a, (Status) null, (PaymentMethod) null, (ShippingInformation) null, 14, (f) null));
        }
    }
}
