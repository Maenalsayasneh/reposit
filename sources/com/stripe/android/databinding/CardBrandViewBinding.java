package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.stripe.android.R;
import com.stripe.android.view.CardWidgetProgressView;
import h0.e0.a;
import java.util.Objects;

public final class CardBrandViewBinding implements a {
    public final ImageView icon;
    public final CardWidgetProgressView progress;
    private final View rootView;

    private CardBrandViewBinding(View view, ImageView imageView, CardWidgetProgressView cardWidgetProgressView) {
        this.rootView = view;
        this.icon = imageView;
        this.progress = cardWidgetProgressView;
    }

    public static CardBrandViewBinding bind(View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.progress;
            CardWidgetProgressView cardWidgetProgressView = (CardWidgetProgressView) view.findViewById(i);
            if (cardWidgetProgressView != null) {
                return new CardBrandViewBinding(view, imageView, cardWidgetProgressView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CardBrandViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.card_brand_view, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
