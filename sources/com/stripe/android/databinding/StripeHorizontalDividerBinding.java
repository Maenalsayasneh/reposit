package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class StripeHorizontalDividerBinding implements a {
    private final View rootView;

    private StripeHorizontalDividerBinding(View view) {
        this.rootView = view;
    }

    public static StripeHorizontalDividerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new StripeHorizontalDividerBinding(view);
    }

    public static StripeHorizontalDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public View getRoot() {
        return this.rootView;
    }

    public static StripeHorizontalDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_horizontal_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
