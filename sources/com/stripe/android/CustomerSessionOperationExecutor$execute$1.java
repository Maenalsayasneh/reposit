package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.CustomerSessionOperationExecutor", f = "CustomerSessionOperationExecutor.kt", l = {27, 32, 45, 51, 71, 77, 97, 103, 122, 128, 152, 155, 176, 182, 194, 200}, m = "execute$payments_core_release")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/stripe/android/EphemeralKey;", "ephemeralKey", "Lcom/stripe/android/EphemeralOperation;", "operation", "Lm0/l/c;", "Lm0/i;", "continuation", "", "execute", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: CustomerSessionOperationExecutor.kt */
public final class CustomerSessionOperationExecutor$execute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CustomerSessionOperationExecutor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomerSessionOperationExecutor$execute$1(CustomerSessionOperationExecutor customerSessionOperationExecutor, m0.l.c cVar) {
        super(cVar);
        this.this$0 = customerSessionOperationExecutor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute$payments_core_release((EphemeralKey) null, (EphemeralOperation) null, this);
    }
}
