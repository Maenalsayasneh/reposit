package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.stripe.android.R;
import h0.e0.a;

public final class AddPaymentMethodActivityBinding implements a {
    public final LinearLayout root;
    private final ScrollView rootView;

    private AddPaymentMethodActivityBinding(ScrollView scrollView, LinearLayout linearLayout) {
        this.rootView = scrollView;
        this.root = linearLayout;
    }

    public static AddPaymentMethodActivityBinding bind(View view) {
        int i = R.id.root;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            return new AddPaymentMethodActivityBinding((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddPaymentMethodActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AddPaymentMethodActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.add_payment_method_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
