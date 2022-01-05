package com.stripe.android.view;

import com.stripe.android.Stripe;
import com.stripe.android.networking.StripeClientUserAgentHeaderFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivityViewModel.kt */
public final class PaymentAuthWebViewActivityViewModel$extraHeaders$2 extends Lambda implements a<Map<String, ? extends String>> {
    public static final PaymentAuthWebViewActivityViewModel$extraHeaders$2 INSTANCE = new PaymentAuthWebViewActivityViewModel$extraHeaders$2();

    public PaymentAuthWebViewActivityViewModel$extraHeaders$2() {
        super(0);
    }

    public final Map<String, String> invoke() {
        return new StripeClientUserAgentHeaderFactory((l) null, 1, (f) null).create(Stripe.Companion.getAppInfo());
    }
}
