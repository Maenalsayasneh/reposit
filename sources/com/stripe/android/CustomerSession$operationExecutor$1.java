package com.stripe.android;

import com.stripe.android.model.Customer;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/Customer;", "customer", "Lm0/i;", "invoke", "(Lcom/stripe/android/model/Customer;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CustomerSession.kt */
public final class CustomerSession$operationExecutor$1 extends Lambda implements l<Customer, i> {
    public final /* synthetic */ CustomerSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomerSession$operationExecutor$1(CustomerSession customerSession) {
        super(1);
        this.this$0 = customerSession;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Customer) obj);
        return i.a;
    }

    public final void invoke(Customer customer) {
        m0.n.b.i.e(customer, "customer");
        this.this$0.setCustomer$payments_core_release(customer);
        CustomerSession customerSession = this.this$0;
        customerSession.setCustomerCacheTime$payments_core_release(((Number) customerSession.timeSupplier.invoke()).longValue());
    }
}
