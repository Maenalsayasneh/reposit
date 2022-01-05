package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class ShippingMethodViewBinding implements a {
    public final TextView description;
    public final TextView name;
    public final TextView price;
    private final View rootView;
    public final AppCompatImageView selectedIcon;

    private ShippingMethodViewBinding(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.rootView = view;
        this.description = textView;
        this.name = textView2;
        this.price = textView3;
        this.selectedIcon = appCompatImageView;
    }

    public static ShippingMethodViewBinding bind(View view) {
        int i = R.id.description;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.name;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = R.id.price;
                TextView textView3 = (TextView) view.findViewById(i);
                if (textView3 != null) {
                    i = R.id.selected_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
                    if (appCompatImageView != null) {
                        return new ShippingMethodViewBinding(view, textView, textView2, textView3, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ShippingMethodViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.shipping_method_view, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
