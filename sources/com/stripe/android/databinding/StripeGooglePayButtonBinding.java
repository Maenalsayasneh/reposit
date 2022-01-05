package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.stripe.android.R;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h0.e0.a;
import java.util.Objects;

public final class StripeGooglePayButtonBinding implements a {
    public final RelativeLayout googlePayButtonIcon;
    public final PrimaryButton primaryButton;
    private final View rootView;

    private StripeGooglePayButtonBinding(View view, RelativeLayout relativeLayout, PrimaryButton primaryButton2) {
        this.rootView = view;
        this.googlePayButtonIcon = relativeLayout;
        this.primaryButton = primaryButton2;
    }

    public static StripeGooglePayButtonBinding bind(View view) {
        int i = R.id.google_pay_button_icon;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
        if (relativeLayout != null) {
            i = R.id.primary_button;
            PrimaryButton primaryButton2 = (PrimaryButton) view.findViewById(i);
            if (primaryButton2 != null) {
                return new StripeGooglePayButtonBinding(view, relativeLayout, primaryButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeGooglePayButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.stripe_google_pay_button, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
