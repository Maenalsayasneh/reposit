package com.stripe.android;

import com.stripe.android.model.ConfirmSetupIntentParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {594}, m = "confirmSetupIntent")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/stripe/android/Stripe;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentParams", "", "idempotencyKey", "Lm0/l/c;", "Lcom/stripe/android/model/SetupIntent;", "continuation", "", "confirmSetupIntent", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeKtx.kt */
public final class StripeKtxKt$confirmSetupIntent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public StripeKtxKt$confirmSetupIntent$1(m0.l.c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.confirmSetupIntent((Stripe) null, (ConfirmSetupIntentParams) null, (String) null, this);
    }
}
