package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stripe.android.R;
import com.stripe.android.view.SelectShippingMethodWidget;
import h0.e0.a;

public final class ShippingMethodPageBinding implements a {
    private final FrameLayout rootView;
    public final SelectShippingMethodWidget selectShippingMethodWidget;

    private ShippingMethodPageBinding(FrameLayout frameLayout, SelectShippingMethodWidget selectShippingMethodWidget2) {
        this.rootView = frameLayout;
        this.selectShippingMethodWidget = selectShippingMethodWidget2;
    }

    public static ShippingMethodPageBinding bind(View view) {
        int i = R.id.select_shipping_method_widget;
        SelectShippingMethodWidget selectShippingMethodWidget2 = (SelectShippingMethodWidget) view.findViewById(i);
        if (selectShippingMethodWidget2 != null) {
            return new ShippingMethodPageBinding((FrameLayout) view, selectShippingMethodWidget2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ShippingMethodPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ShippingMethodPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shipping_method_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
