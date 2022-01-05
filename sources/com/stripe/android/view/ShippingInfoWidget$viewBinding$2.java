package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import com.stripe.android.databinding.AddressWidgetBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/databinding/AddressWidgetBinding;", "invoke", "()Lcom/stripe/android/databinding/AddressWidgetBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ShippingInfoWidget.kt */
public final class ShippingInfoWidget$viewBinding$2 extends Lambda implements a<AddressWidgetBinding> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ ShippingInfoWidget this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget$viewBinding$2(ShippingInfoWidget shippingInfoWidget, Context context) {
        super(0);
        this.this$0 = shippingInfoWidget;
        this.$context = context;
    }

    public final AddressWidgetBinding invoke() {
        AddressWidgetBinding inflate = AddressWidgetBinding.inflate(LayoutInflater.from(this.$context), this.this$0);
        i.d(inflate, "AddressWidgetBinding.inf…           this\n        )");
        return inflate;
    }
}
