package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class StripeGooglePayDividerBinding implements a {
    private final View rootView;

    private StripeGooglePayDividerBinding(View view) {
        this.rootView = view;
    }

    public static StripeGooglePayDividerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new StripeGooglePayDividerBinding(view);
    }

    public static StripeGooglePayDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.stripe_google_pay_divider, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
