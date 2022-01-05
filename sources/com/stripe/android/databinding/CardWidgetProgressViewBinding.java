package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class CardWidgetProgressViewBinding implements a {
    public final ProgressBar cardLoading;
    private final View rootView;

    private CardWidgetProgressViewBinding(View view, ProgressBar progressBar) {
        this.rootView = view;
        this.cardLoading = progressBar;
    }

    public static CardWidgetProgressViewBinding bind(View view) {
        int i = R.id.card_loading;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            return new CardWidgetProgressViewBinding(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CardWidgetProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.card_widget_progress_view, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
