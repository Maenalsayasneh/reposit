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

public final class LayoutPaymentsheetAddCardItemBinding implements a {
    public final MaterialCardView card;
    public final TextView label;
    public final ImageView plusIcon;
    private final ConstraintLayout rootView;

    private LayoutPaymentsheetAddCardItemBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, TextView textView, ImageView imageView) {
        this.rootView = constraintLayout;
        this.card = materialCardView;
        this.label = textView;
        this.plusIcon = imageView;
    }

    public static LayoutPaymentsheetAddCardItemBinding bind(View view) {
        int i = R.id.card;
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(i);
        if (materialCardView != null) {
            i = R.id.label;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.plus_icon;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    return new LayoutPaymentsheetAddCardItemBinding((ConstraintLayout) view, materialCardView, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutPaymentsheetAddCardItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutPaymentsheetAddCardItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_paymentsheet_add_card_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
