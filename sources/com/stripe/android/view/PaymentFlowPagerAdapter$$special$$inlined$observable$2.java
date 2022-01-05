package com.stripe.android.view;

import com.stripe.android.model.ShippingMethod;
import kotlin.Metadata;
import m0.n.b.i;
import m0.o.b;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lm0/o/b;", "Lm0/r/k;", "property", "oldValue", "newValue", "Lm0/i;", "afterChange", "(Lm0/r/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 4, 2})
/* compiled from: Delegates.kt */
public final class PaymentFlowPagerAdapter$$special$$inlined$observable$2 extends b<ShippingMethod> {
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ PaymentFlowPagerAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowPagerAdapter$$special$$inlined$observable$2(Object obj, Object obj2, PaymentFlowPagerAdapter paymentFlowPagerAdapter) {
        super(obj2);
        this.$initialValue = obj;
        this.this$0 = paymentFlowPagerAdapter;
    }

    public void afterChange(k<?> kVar, ShippingMethod shippingMethod, ShippingMethod shippingMethod2) {
        i.e(kVar, "property");
        this.this$0.shouldRecreateShippingMethodsScreen = !i.a(shippingMethod2, shippingMethod);
    }
}
