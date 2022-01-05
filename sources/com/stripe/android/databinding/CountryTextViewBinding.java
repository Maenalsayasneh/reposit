package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class CountryTextViewBinding implements a {
    private final TextView rootView;

    private CountryTextViewBinding(TextView textView) {
        this.rootView = textView;
    }

    public static CountryTextViewBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new CountryTextViewBinding((TextView) view);
    }

    public static CountryTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static CountryTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.country_text_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}
