package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.R;
import com.stripe.android.view.PaymentMethodsRecyclerView;
import h0.e0.a;

public final class PaymentMethodsActivityBinding implements a {
    public final CoordinatorLayout coordinator;
    public final FrameLayout footerContainer;
    public final LinearProgressIndicator progressBar;
    public final PaymentMethodsRecyclerView recycler;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;

    private PaymentMethodsActivityBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, PaymentMethodsRecyclerView paymentMethodsRecyclerView, Toolbar toolbar2) {
        this.rootView = coordinatorLayout;
        this.coordinator = coordinatorLayout2;
        this.footerContainer = frameLayout;
        this.progressBar = linearProgressIndicator;
        this.recycler = paymentMethodsRecyclerView;
        this.toolbar = toolbar2;
    }

    public static PaymentMethodsActivityBinding bind(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.footer_container;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null) {
            i = R.id.progress_bar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) view.findViewById(i);
            if (linearProgressIndicator != null) {
                i = R.id.recycler;
                PaymentMethodsRecyclerView paymentMethodsRecyclerView = (PaymentMethodsRecyclerView) view.findViewById(i);
                if (paymentMethodsRecyclerView != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar2 = (Toolbar) view.findViewById(i);
                    if (toolbar2 != null) {
                        return new PaymentMethodsActivityBinding((CoordinatorLayout) view, coordinatorLayout, frameLayout, linearProgressIndicator, paymentMethodsRecyclerView, toolbar2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PaymentMethodsActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static PaymentMethodsActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.payment_methods_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
