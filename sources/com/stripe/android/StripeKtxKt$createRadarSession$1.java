package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {447}, m = "createRadarSession")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/Stripe;", "Lm0/l/c;", "Lcom/stripe/android/model/RadarSession;", "continuation", "", "createRadarSession", "(Lcom/stripe/android/Stripe;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeKtx.kt */
public final class StripeKtxKt$createRadarSession$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public StripeKtxKt$createRadarSession$1(m0.l.c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.createRadarSession((Stripe) null, this);
    }
}
