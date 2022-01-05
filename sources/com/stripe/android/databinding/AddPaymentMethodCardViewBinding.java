package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.stripe.android.R;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.ShippingInfoWidget;
import h0.e0.a;

public final class AddPaymentMethodCardViewBinding implements a {
    public final LinearLayout addPaymentMethodCard;
    public final ShippingInfoWidget billingAddressWidget;
    public final CardMultilineWidget cardMultilineWidget;
    private final LinearLayout rootView;

    private AddPaymentMethodCardViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ShippingInfoWidget shippingInfoWidget, CardMultilineWidget cardMultilineWidget2) {
        this.rootView = linearLayout;
        this.addPaymentMethodCard = linearLayout2;
        this.billingAddressWidget = shippingInfoWidget;
        this.cardMultilineWidget = cardMultilineWidget2;
    }

    public static AddPaymentMethodCardViewBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.billing_address_widget;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) view.findViewById(i);
        if (shippingInfoWidget != null) {
            i = R.id.card_multiline_widget;
            CardMultilineWidget cardMultilineWidget2 = (CardMultilineWidget) view.findViewById(i);
            if (cardMultilineWidget2 != null) {
                return new AddPaymentMethodCardViewBinding((LinearLayout) view, linearLayout, shippingInfoWidget, cardMultilineWidget2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddPaymentMethodCardViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AddPaymentMethodCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.add_payment_method_card_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
