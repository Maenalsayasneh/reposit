package com.stripe.android.view;

import android.view.View;
import com.stripe.android.view.ShippingMethodAdapter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lm0/i;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ShippingMethodAdapter.kt */
public final class ShippingMethodAdapter$onBindViewHolder$1 implements View.OnClickListener {
    public final /* synthetic */ ShippingMethodAdapter.ShippingMethodViewHolder $holder;
    public final /* synthetic */ ShippingMethodAdapter this$0;

    public ShippingMethodAdapter$onBindViewHolder$1(ShippingMethodAdapter shippingMethodAdapter, ShippingMethodAdapter.ShippingMethodViewHolder shippingMethodViewHolder) {
        this.this$0 = shippingMethodAdapter;
        this.$holder = shippingMethodViewHolder;
    }

    public final void onClick(View view) {
        this.this$0.setSelectedIndex$payments_core_release(this.$holder.getBindingAdapterPosition());
    }
}
