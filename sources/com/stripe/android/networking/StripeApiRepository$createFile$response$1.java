package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/networking/RequestId;", "it", "Lm0/i;", "invoke", "(Lcom/stripe/android/networking/RequestId;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository$createFile$response$1 extends Lambda implements l<RequestId, i> {
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$createFile$response$1(StripeApiRepository stripeApiRepository) {
        super(1);
        this.this$0 = stripeApiRepository;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RequestId) obj);
        return i.a;
    }

    public final void invoke(RequestId requestId) {
        this.this$0.fireAnalyticsRequest(AnalyticsEvent.FileCreate);
    }
}
