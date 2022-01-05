package com.stripe.android;

import android.content.Context;
import com.stripe.android.payments.BrowserCapabilities;
import com.stripe.android.payments.BrowserCapabilitiesSupplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Z", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$hasCompatibleBrowser$2 extends Lambda implements a<Boolean> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$hasCompatibleBrowser$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final boolean invoke() {
        return new BrowserCapabilitiesSupplier(this.$context).get() != BrowserCapabilities.Unknown;
    }
}
