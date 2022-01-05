package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PrefsRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer", f = "DefaultFlowControllerInitializer.kt", l = {141}, m = "setLastSavedPaymentMethod")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PrefsRepository;", "prefsRepository", "", "isGooglePayReady", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "Lm0/l/c;", "Lm0/i;", "continuation", "", "setLastSavedPaymentMethod", "(Lcom/stripe/android/paymentsheet/PrefsRepository;ZLjava/util/List;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowControllerInitializer.kt */
public final class DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1(DefaultFlowControllerInitializer defaultFlowControllerInitializer, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultFlowControllerInitializer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setLastSavedPaymentMethod((PrefsRepository) null, false, (List<PaymentMethod>) null, this);
    }
}
