package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.R;
import h0.e0.a;

public final class AddPaymentMethodRowBinding implements a {
    public final AppCompatTextView label;
    private final LinearLayout rootView;

    private AddPaymentMethodRowBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.label = appCompatTextView;
    }

    public static AddPaymentMethodRowBinding bind(View view) {
        int i = R.id.label;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
        if (appCompatTextView != null) {
            return new AddPaymentMethodRowBinding((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddPaymentMethodRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AddPaymentMethodRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.add_payment_method_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
