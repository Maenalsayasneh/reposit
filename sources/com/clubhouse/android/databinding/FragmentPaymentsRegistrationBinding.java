package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.clubhouse.app.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import h0.e0.a;

public final class FragmentPaymentsRegistrationBinding implements a {
    public final SwitchMaterial a;
    public final ImageView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final FrameLayout h;
    public final FrameLayout i;
    public final Button j;
    public final LinearLayout k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final LinearLayout n;
    public final LinearLayout o;
    public final Button p;

    public FragmentPaymentsRegistrationBinding(LinearLayout linearLayout, SwitchMaterial switchMaterial, ImageView imageView, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, FrameLayout frameLayout6, FrameLayout frameLayout7, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, Toolbar toolbar, TextView textView, Button button2, ImageView imageView2, TextView textView2) {
        this.a = switchMaterial;
        this.b = imageView;
        this.c = frameLayout;
        this.d = frameLayout2;
        this.e = frameLayout3;
        this.f = frameLayout4;
        this.g = frameLayout5;
        this.h = frameLayout6;
        this.i = frameLayout7;
        this.j = button;
        this.k = linearLayout2;
        this.l = linearLayout3;
        this.m = linearLayout4;
        this.n = linearLayout5;
        this.o = linearLayout6;
        this.p = button2;
    }

    public static FragmentPaymentsRegistrationBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.accept_payments_switch;
        SwitchMaterial switchMaterial = (SwitchMaterial) view2.findViewById(R.id.accept_payments_switch);
        if (switchMaterial != null) {
            i2 = R.id.back;
            ImageView imageView = (ImageView) view2.findViewById(R.id.back);
            if (imageView != null) {
                i2 = R.id.loading;
                FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.loading);
                if (frameLayout != null) {
                    i2 = R.id.payments_account_action_needed;
                    FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.payments_account_action_needed);
                    if (frameLayout2 != null) {
                        i2 = R.id.payments_account_active;
                        FrameLayout frameLayout3 = (FrameLayout) view2.findViewById(R.id.payments_account_active);
                        if (frameLayout3 != null) {
                            i2 = R.id.payments_account_in_review;
                            FrameLayout frameLayout4 = (FrameLayout) view2.findViewById(R.id.payments_account_in_review);
                            if (frameLayout4 != null) {
                                i2 = R.id.payments_account_not_started;
                                FrameLayout frameLayout5 = (FrameLayout) view2.findViewById(R.id.payments_account_not_started);
                                if (frameLayout5 != null) {
                                    i2 = R.id.recent_payments_row;
                                    FrameLayout frameLayout6 = (FrameLayout) view2.findViewById(R.id.recent_payments_row);
                                    if (frameLayout6 != null) {
                                        i2 = R.id.retry;
                                        FrameLayout frameLayout7 = (FrameLayout) view2.findViewById(R.id.retry);
                                        if (frameLayout7 != null) {
                                            i2 = R.id.retry_button;
                                            Button button = (Button) view2.findViewById(R.id.retry_button);
                                            if (button != null) {
                                                i2 = R.id.state_payments_active;
                                                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.state_payments_active);
                                                if (linearLayout != null) {
                                                    i2 = R.id.state_registration_action_needed;
                                                    LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.state_registration_action_needed);
                                                    if (linearLayout2 != null) {
                                                        i2 = R.id.state_registration_in_review;
                                                        LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(R.id.state_registration_in_review);
                                                        if (linearLayout3 != null) {
                                                            i2 = R.id.state_registration_not_started;
                                                            LinearLayout linearLayout4 = (LinearLayout) view2.findViewById(R.id.state_registration_not_started);
                                                            if (linearLayout4 != null) {
                                                                i2 = R.id.state_verify_email;
                                                                LinearLayout linearLayout5 = (LinearLayout) view2.findViewById(R.id.state_verify_email);
                                                                if (linearLayout5 != null) {
                                                                    i2 = R.id.toolbar;
                                                                    Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                                    if (toolbar != null) {
                                                                        i2 = R.id.toolbar_title;
                                                                        TextView textView = (TextView) view2.findViewById(R.id.toolbar_title);
                                                                        if (textView != null) {
                                                                            i2 = R.id.verify_email_button;
                                                                            Button button2 = (Button) view2.findViewById(R.id.verify_email_button);
                                                                            if (button2 != null) {
                                                                                i2 = R.id.verify_email_icon;
                                                                                ImageView imageView2 = (ImageView) view2.findViewById(R.id.verify_email_icon);
                                                                                if (imageView2 != null) {
                                                                                    i2 = R.id.verify_email_text;
                                                                                    TextView textView2 = (TextView) view2.findViewById(R.id.verify_email_text);
                                                                                    if (textView2 != null) {
                                                                                        return new FragmentPaymentsRegistrationBinding((LinearLayout) view2, switchMaterial, imageView, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, frameLayout7, button, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, toolbar, textView, button2, imageView2, textView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static FragmentPaymentsRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_payments_registration, (ViewGroup) null, false));
    }
}
