package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.R;
import h0.e0.a;

public final class BankItemBinding implements a {
    public final AppCompatImageView checkIcon;
    public final AppCompatImageView icon;
    public final AppCompatTextView name;
    private final LinearLayout rootView;

    private BankItemBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.checkIcon = appCompatImageView;
        this.icon = appCompatImageView2;
        this.name = appCompatTextView;
    }

    public static BankItemBinding bind(View view) {
        int i = R.id.check_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
        if (appCompatImageView != null) {
            i = R.id.icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(i);
            if (appCompatImageView2 != null) {
                i = R.id.name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
                if (appCompatTextView != null) {
                    return new BankItemBinding((LinearLayout) view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BankItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static BankItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bank_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
