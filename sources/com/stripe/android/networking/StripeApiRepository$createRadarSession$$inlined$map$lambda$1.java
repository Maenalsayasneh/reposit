package com.stripe.android.networking;

import com.stripe.android.model.Token;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequest;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lm0/i;", "invoke", "()V", "com/stripe/android/networking/StripeApiRepository$createRadarSession$3$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository$createRadarSession$$inlined$map$lambda$1 extends Lambda implements a<i> {
    public final /* synthetic */ c $continuation$inlined;
    public final /* synthetic */ ApiRequest.Options $requestOptions$inlined;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$createRadarSession$$inlined$map$lambda$1(StripeApiRepository stripeApiRepository, c cVar, ApiRequest.Options options) {
        super(0);
        this.this$0 = stripeApiRepository;
        this.$continuation$inlined = cVar;
        this.$requestOptions$inlined = options;
    }

    public final void invoke() {
        StripeApiRepository stripeApiRepository = this.this$0;
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(AnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.analyticsRequestFactory, AnalyticsEvent.RadarSessionCreate, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }
}
