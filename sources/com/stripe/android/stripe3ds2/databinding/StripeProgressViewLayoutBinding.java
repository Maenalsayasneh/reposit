package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.R;
import h0.e0.a;

public final class StripeProgressViewLayoutBinding implements a {
    public final ImageView brandLogo;
    public final CircularProgressIndicator progressBar;
    private final LinearLayout rootView;

    private StripeProgressViewLayoutBinding(LinearLayout linearLayout, ImageView imageView, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = linearLayout;
        this.brandLogo = imageView;
        this.progressBar = circularProgressIndicator;
    }

    public static StripeProgressViewLayoutBinding bind(View view) {
        int i = R.id.brand_logo;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.progress_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(i);
            if (circularProgressIndicator != null) {
                return new StripeProgressViewLayoutBinding((LinearLayout) view, imageView, circularProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeProgressViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static StripeProgressViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_progress_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
