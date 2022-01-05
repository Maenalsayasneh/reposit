package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.R;
import com.stripe.android.view.PaymentAuthWebView;
import h0.e0.a;

public final class PaymentAuthWebViewActivityBinding implements a {
    public final CircularProgressIndicator progressBar;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final PaymentAuthWebView webView;
    public final FrameLayout webViewContainer;

    private PaymentAuthWebViewActivityBinding(CoordinatorLayout coordinatorLayout, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar2, PaymentAuthWebView paymentAuthWebView, FrameLayout frameLayout) {
        this.rootView = coordinatorLayout;
        this.progressBar = circularProgressIndicator;
        this.toolbar = toolbar2;
        this.webView = paymentAuthWebView;
        this.webViewContainer = frameLayout;
    }

    public static PaymentAuthWebViewActivityBinding bind(View view) {
        int i = R.id.progress_bar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(i);
        if (circularProgressIndicator != null) {
            i = R.id.toolbar;
            Toolbar toolbar2 = (Toolbar) view.findViewById(i);
            if (toolbar2 != null) {
                i = R.id.web_view;
                PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) view.findViewById(i);
                if (paymentAuthWebView != null) {
                    i = R.id.web_view_container;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                    if (frameLayout != null) {
                        return new PaymentAuthWebViewActivityBinding((CoordinatorLayout) view, circularProgressIndicator, toolbar2, paymentAuthWebView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PaymentAuthWebViewActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static PaymentAuthWebViewActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.payment_auth_web_view_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
