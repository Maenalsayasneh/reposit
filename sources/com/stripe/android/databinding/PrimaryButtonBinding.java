package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class PrimaryButtonBinding implements a {
    public final ImageView confirmedIcon;
    public final CircularProgressIndicator confirmingIcon;
    public final TextView label;
    public final ImageView lockIcon;
    private final View rootView;

    private PrimaryButtonBinding(View view, ImageView imageView, CircularProgressIndicator circularProgressIndicator, TextView textView, ImageView imageView2) {
        this.rootView = view;
        this.confirmedIcon = imageView;
        this.confirmingIcon = circularProgressIndicator;
        this.label = textView;
        this.lockIcon = imageView2;
    }

    public static PrimaryButtonBinding bind(View view) {
        int i = R.id.confirmed_icon;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.confirming_icon;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(i);
            if (circularProgressIndicator != null) {
                i = R.id.label;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.lock_icon;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        return new PrimaryButtonBinding(view, imageView, circularProgressIndicator, textView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PrimaryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.primary_button, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
