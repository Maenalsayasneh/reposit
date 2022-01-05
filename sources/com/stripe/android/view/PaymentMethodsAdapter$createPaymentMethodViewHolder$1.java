package com.stripe.android.view;

import android.view.View;
import com.stripe.android.view.PaymentMethodsAdapter;
import h0.i.i.g0.d;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Lh0/i/i/g0/d$a;", "<anonymous parameter 1>", "", "perform", "(Landroid/view/View;Lh0/i/i/g0/d$a;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsAdapter.kt */
public final class PaymentMethodsAdapter$createPaymentMethodViewHolder$1 implements d {
    public final /* synthetic */ PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder $viewHolder;
    public final /* synthetic */ PaymentMethodsAdapter this$0;

    public PaymentMethodsAdapter$createPaymentMethodViewHolder$1(PaymentMethodsAdapter paymentMethodsAdapter, PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder) {
        this.this$0 = paymentMethodsAdapter;
        this.$viewHolder = paymentMethodViewHolder;
    }

    public final boolean perform(View view, d.a aVar) {
        i.e(view, "<anonymous parameter 0>");
        PaymentMethodsAdapter.Listener listener$payments_core_release = this.this$0.getListener$payments_core_release();
        if (listener$payments_core_release == null) {
            return true;
        }
        listener$payments_core_release.onDeletePaymentMethodAction(this.this$0.getPaymentMethodAtPosition$payments_core_release(this.$viewHolder.getBindingAdapterPosition()));
        return true;
    }
}
