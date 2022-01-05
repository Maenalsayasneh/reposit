package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.stripe.android.R;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h0.e0.a;

public final class StripeActivityPaymentOptionsBinding implements a {
    public final PrimaryButton addButton;
    public final AppBarLayout appbar;
    public final LinearLayout bottomSheet;
    public final CoordinatorLayout coordinator;
    public final FragmentContainerView fragmentContainer;
    public final LinearLayout fragmentContainerParent;
    public final TextView message;
    private final CoordinatorLayout rootView;
    public final ScrollView scrollView;
    public final MaterialToolbar toolbar;

    private StripeActivityPaymentOptionsBinding(CoordinatorLayout coordinatorLayout, PrimaryButton primaryButton, AppBarLayout appBarLayout, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout2, FragmentContainerView fragmentContainerView, LinearLayout linearLayout2, TextView textView, ScrollView scrollView2, MaterialToolbar materialToolbar) {
        this.rootView = coordinatorLayout;
        this.addButton = primaryButton;
        this.appbar = appBarLayout;
        this.bottomSheet = linearLayout;
        this.coordinator = coordinatorLayout2;
        this.fragmentContainer = fragmentContainerView;
        this.fragmentContainerParent = linearLayout2;
        this.message = textView;
        this.scrollView = scrollView2;
        this.toolbar = materialToolbar;
    }

    public static StripeActivityPaymentOptionsBinding bind(View view) {
        int i = R.id.add_button;
        PrimaryButton primaryButton = (PrimaryButton) view.findViewById(i);
        if (primaryButton != null) {
            i = R.id.appbar;
            AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(i);
            if (appBarLayout != null) {
                i = R.id.bottom_sheet;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                if (linearLayout != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                    i = R.id.fragment_container;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(i);
                    if (fragmentContainerView != null) {
                        i = R.id.fragment_container_parent;
                        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                        if (linearLayout2 != null) {
                            i = R.id.message;
                            TextView textView = (TextView) view.findViewById(i);
                            if (textView != null) {
                                i = R.id.scroll_view;
                                ScrollView scrollView2 = (ScrollView) view.findViewById(i);
                                if (scrollView2 != null) {
                                    i = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(i);
                                    if (materialToolbar != null) {
                                        return new StripeActivityPaymentOptionsBinding(coordinatorLayout, primaryButton, appBarLayout, linearLayout, coordinatorLayout, fragmentContainerView, linearLayout2, textView, scrollView2, materialToolbar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeActivityPaymentOptionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static StripeActivityPaymentOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.stripe_activity_payment_options, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
