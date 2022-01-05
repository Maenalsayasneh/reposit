package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer", f = "DefaultFlowControllerInitializer.kt", l = {163}, m = "retrieveAllPaymentMethods")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00000\u0005H@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lcom/stripe/android/model/PaymentMethod$Type;", "types", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customerConfig", "Lm0/l/c;", "Lcom/stripe/android/model/PaymentMethod;", "continuation", "", "retrieveAllPaymentMethods", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowControllerInitializer.kt */
public final class DefaultFlowControllerInitializer$retrieveAllPaymentMethods$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$retrieveAllPaymentMethods$1(DefaultFlowControllerInitializer defaultFlowControllerInitializer, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultFlowControllerInitializer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveAllPaymentMethods((List<? extends PaymentMethod.Type>) null, (PaymentSheet.CustomerConfiguration) null, this);
    }
}
