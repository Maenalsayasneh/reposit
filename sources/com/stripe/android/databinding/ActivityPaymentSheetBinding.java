package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.stripe.android.R;
import com.stripe.android.paymentsheet.ui.GooglePayButton;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h0.e0.a;

public final class ActivityPaymentSheetBinding implements a {
    public final AppBarLayout appbar;
    public final LinearLayout bottomSheet;
    public final FrameLayout buttonContainer;
    public final PrimaryButton buyButton;
    public final CoordinatorLayout coordinator;
    public final FragmentContainerView fragmentContainer;
    public final LinearLayout fragmentContainerParent;
    public final GooglePayButton googlePayButton;
    public final TextView message;
    private final CoordinatorLayout rootView;
    public final ScrollView scrollView;
    public final MaterialToolbar toolbar;

    private ActivityPaymentSheetBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, LinearLayout linearLayout, FrameLayout frameLayout, PrimaryButton primaryButton, CoordinatorLayout coordinatorLayout2, FragmentContainerView fragmentContainerView, LinearLayout linearLayout2, GooglePayButton googlePayButton2, TextView textView, ScrollView scrollView2, MaterialToolbar materialToolbar) {
        this.rootView = coordinatorLayout;
        this.appbar = appBarLayout;
        this.bottomSheet = linearLayout;
        this.buttonContainer = frameLayout;
        this.buyButton = primaryButton;
        this.coordinator = coordinatorLayout2;
        this.fragmentContainer = fragmentContainerView;
        this.fragmentContainerParent = linearLayout2;
        this.googlePayButton = googlePayButton2;
        this.message = textView;
        this.scrollView = scrollView2;
        this.toolbar = materialToolbar;
    }

    public static ActivityPaymentSheetBinding bind(View view) {
        int i = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(i);
        if (appBarLayout != null) {
            i = R.id.bottom_sheet;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = R.id.button_container;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    i = R.id.buy_button;
                    PrimaryButton primaryButton = (PrimaryButton) view.findViewById(i);
                    if (primaryButton != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        i = R.id.fragment_container;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(i);
                        if (fragmentContainerView != null) {
                            i = R.id.fragment_container_parent;
                            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                            if (linearLayout2 != null) {
                                i = R.id.google_pay_button;
                                GooglePayButton googlePayButton2 = (GooglePayButton) view.findViewById(i);
                                if (googlePayButton2 != null) {
                                    i = R.id.message;
                                    TextView textView = (TextView) view.findViewById(i);
                                    if (textView != null) {
                                        i = R.id.scroll_view;
                                        ScrollView scrollView2 = (ScrollView) view.findViewById(i);
                                        if (scrollView2 != null) {
                                            i = R.id.toolbar;
                                            MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(i);
                                            if (materialToolbar != null) {
                                                return new ActivityPaymentSheetBinding(coordinatorLayout, appBarLayout, linearLayout, frameLayout, primaryButton, coordinatorLayout, fragmentContainerView, linearLayout2, googlePayButton2, textView, scrollView2, materialToolbar);
                                            }
                                        }
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

    public static ActivityPaymentSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityPaymentSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_payment_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
