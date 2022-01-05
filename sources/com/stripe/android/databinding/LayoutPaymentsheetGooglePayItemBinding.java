package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.R;
import h0.e0.a;

public final class LayoutPaymentsheetGooglePayItemBinding implements a {
    public final MaterialCardView card;
    public final ImageView checkIcon;
    public final ImageView googlePayMark;
    public final TextView label;
    private final ConstraintLayout rootView;

    private LayoutPaymentsheetGooglePayItemBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = constraintLayout;
        this.card = materialCardView;
        this.checkIcon = imageView;
        this.googlePayMark = imageView2;
        this.label = textView;
    }

    public static LayoutPaymentsheetGooglePayItemBinding bind(View view) {
        int i = R.id.card;
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(i);
        if (materialCardView != null) {
            i = R.id.check_icon;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.google_pay_mark;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = R.id.label;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        return new LayoutPaymentsheetGooglePayItemBinding((ConstraintLayout) view, materialCardView, imageView, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutPaymentsheetGooglePayItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutPaymentsheetGooglePayItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_paymentsheet_google_pay_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
