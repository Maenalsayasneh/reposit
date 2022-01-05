package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class ShippingMethodWidgetBinding implements a {
    private final View rootView;
    public final RecyclerView shippingMethods;

    private ShippingMethodWidgetBinding(View view, RecyclerView recyclerView) {
        this.rootView = view;
        this.shippingMethods = recyclerView;
    }

    public static ShippingMethodWidgetBinding bind(View view) {
        int i = R.id.shipping_methods;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
        if (recyclerView != null) {
            return new ShippingMethodWidgetBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ShippingMethodWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.shipping_method_widget, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
