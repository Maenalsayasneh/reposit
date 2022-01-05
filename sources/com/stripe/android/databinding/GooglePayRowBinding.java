package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.R;
import h0.e0.a;

public final class GooglePayRowBinding implements a {
    public final AppCompatImageView checkIcon;
    public final AppCompatTextView label;
    private final LinearLayout rootView;

    private GooglePayRowBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.checkIcon = appCompatImageView;
        this.label = appCompatTextView;
    }

    public static GooglePayRowBinding bind(View view) {
        int i = R.id.check_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
        if (appCompatImageView != null) {
            i = R.id.label;
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
            if (appCompatTextView != null) {
                return new GooglePayRowBinding((LinearLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GooglePayRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static GooglePayRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.google_pay_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
