package com.stripe.android;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", l = {482}, m = "getAuthenticateSourceResult")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/Intent;", "data", "Lm0/l/c;", "Lcom/stripe/android/model/Source;", "continuation", "", "getAuthenticateSourceResult", "(Landroid/content/Intent;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$getAuthenticateSourceResult$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$getAuthenticateSourceResult$1(StripePaymentController stripePaymentController, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripePaymentController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAuthenticateSourceResult((Intent) null, this);
    }
}
