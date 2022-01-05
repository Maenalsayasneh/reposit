package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class StripeCountryDropdownItemBinding implements a {
    private final TextView rootView;
    public final TextView text1;

    private StripeCountryDropdownItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.text1 = textView2;
    }

    public static StripeCountryDropdownItemBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new StripeCountryDropdownItemBinding(textView, textView);
    }

    public static StripeCountryDropdownItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static StripeCountryDropdownItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_country_dropdown_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}
