package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/Country;", "p1", "Lm0/i;", "invoke", "(Lcom/stripe/android/view/Country;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ShippingInfoWidget.kt */
public final /* synthetic */ class ShippingInfoWidget$initView$1 extends FunctionReferenceImpl implements l<Country, i> {
    public ShippingInfoWidget$initView$1(ShippingInfoWidget shippingInfoWidget) {
        super(1, shippingInfoWidget, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/view/Country;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Country) obj);
        return i.a;
    }

    public final void invoke(Country country) {
        m0.n.b.i.e(country, "p1");
        ((ShippingInfoWidget) this.receiver).updateConfigForCountry(country);
    }
}
