package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.AppInfo;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.Logger;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequestExecutor;
import com.stripe.android.networking.FraudDetectionDataParamsUtils;
import com.stripe.android.networking.StripeApiRepository;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository;", "invoke", "()Lcom/stripe/android/networking/StripeApiRepository;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$stripeApiRepository$2 extends Lambda implements a<StripeApiRepository> {
    public final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$stripeApiRepository$2(DefaultFlowController defaultFlowController) {
        super(0);
        this.this$0 = defaultFlowController;
    }

    public final StripeApiRepository invoke() {
        return new StripeApiRepository(this.this$0.appContext, this.this$0.getPaymentConfiguration().getPublishableKey(), (AppInfo) null, (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8188, (f) null);
    }
}
