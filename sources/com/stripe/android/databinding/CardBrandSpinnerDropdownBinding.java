package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class CardBrandSpinnerDropdownBinding implements a {
    private final AppCompatTextView rootView;
    public final AppCompatTextView textView;

    private CardBrandSpinnerDropdownBinding(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = appCompatTextView;
        this.textView = appCompatTextView2;
    }

    public static CardBrandSpinnerDropdownBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new CardBrandSpinnerDropdownBinding(appCompatTextView, appCompatTextView);
    }

    public static CardBrandSpinnerDropdownBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static CardBrandSpinnerDropdownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.card_brand_spinner_dropdown, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public AppCompatTextView getRoot() {
        return this.rootView;
    }
}
