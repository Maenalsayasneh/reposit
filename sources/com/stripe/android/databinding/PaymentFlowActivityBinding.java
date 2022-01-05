package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stripe.android.R;
import com.stripe.android.view.PaymentFlowViewPager;
import h0.e0.a;

public final class PaymentFlowActivityBinding implements a {
    private final FrameLayout rootView;
    public final PaymentFlowViewPager shippingFlowViewpager;

    private PaymentFlowActivityBinding(FrameLayout frameLayout, PaymentFlowViewPager paymentFlowViewPager) {
        this.rootView = frameLayout;
        this.shippingFlowViewpager = paymentFlowViewPager;
    }

    public static PaymentFlowActivityBinding bind(View view) {
        int i = R.id.shipping_flow_viewpager;
        PaymentFlowViewPager paymentFlowViewPager = (PaymentFlowViewPager) view.findViewById(i);
        if (paymentFlowViewPager != null) {
            return new PaymentFlowActivityBinding((FrameLayout) view, paymentFlowViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PaymentFlowActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static PaymentFlowActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.payment_flow_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
