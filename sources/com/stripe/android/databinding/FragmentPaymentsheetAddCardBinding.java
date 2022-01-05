package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.stripe.android.R;
import com.stripe.android.paymentsheet.ui.BillingAddressView;
import com.stripe.android.paymentsheet.ui.GooglePayButton;
import com.stripe.android.paymentsheet.ui.GooglePayDivider;
import com.stripe.android.view.CardMultilineWidget;
import h0.e0.a;

public final class FragmentPaymentsheetAddCardBinding implements a {
    public final TextView addCardHeader;
    public final BillingAddressView billingAddress;
    public final TextView billingAddressLabel;
    public final TextView billingErrors;
    public final Space bottomSpace;
    public final TextView cardErrors;
    public final TextView cardInfoLabel;
    public final CardMultilineWidget cardMultilineWidget;
    public final MaterialCardView cardMultilineWidgetContainer;
    public final GooglePayButton googlePayButton;
    public final GooglePayDivider googlePayDivider;
    public final TextView message;
    private final ConstraintLayout rootView;
    public final MaterialCheckBox saveCardCheckbox;
    public final LinearLayout topContainer;

    private FragmentPaymentsheetAddCardBinding(ConstraintLayout constraintLayout, TextView textView, BillingAddressView billingAddressView, TextView textView2, TextView textView3, Space space, TextView textView4, TextView textView5, CardMultilineWidget cardMultilineWidget2, MaterialCardView materialCardView, GooglePayButton googlePayButton2, GooglePayDivider googlePayDivider2, TextView textView6, MaterialCheckBox materialCheckBox, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.addCardHeader = textView;
        this.billingAddress = billingAddressView;
        this.billingAddressLabel = textView2;
        this.billingErrors = textView3;
        this.bottomSpace = space;
        this.cardErrors = textView4;
        this.cardInfoLabel = textView5;
        this.cardMultilineWidget = cardMultilineWidget2;
        this.cardMultilineWidgetContainer = materialCardView;
        this.googlePayButton = googlePayButton2;
        this.googlePayDivider = googlePayDivider2;
        this.message = textView6;
        this.saveCardCheckbox = materialCheckBox;
        this.topContainer = linearLayout;
    }

    public static FragmentPaymentsheetAddCardBinding bind(View view) {
        View view2 = view;
        int i = R.id.add_card_header;
        TextView textView = (TextView) view2.findViewById(i);
        if (textView != null) {
            i = R.id.billing_address;
            BillingAddressView billingAddressView = (BillingAddressView) view2.findViewById(i);
            if (billingAddressView != null) {
                i = R.id.billing_address_label;
                TextView textView2 = (TextView) view2.findViewById(i);
                if (textView2 != null) {
                    i = R.id.billing_errors;
                    TextView textView3 = (TextView) view2.findViewById(i);
                    if (textView3 != null) {
                        i = R.id.bottom_space;
                        Space space = (Space) view2.findViewById(i);
                        if (space != null) {
                            i = R.id.card_errors;
                            TextView textView4 = (TextView) view2.findViewById(i);
                            if (textView4 != null) {
                                i = R.id.card_info_label;
                                TextView textView5 = (TextView) view2.findViewById(i);
                                if (textView5 != null) {
                                    i = R.id.card_multiline_widget;
                                    CardMultilineWidget cardMultilineWidget2 = (CardMultilineWidget) view2.findViewById(i);
                                    if (cardMultilineWidget2 != null) {
                                        i = R.id.card_multiline_widget_container;
                                        MaterialCardView materialCardView = (MaterialCardView) view2.findViewById(i);
                                        if (materialCardView != null) {
                                            i = R.id.google_pay_button;
                                            GooglePayButton googlePayButton2 = (GooglePayButton) view2.findViewById(i);
                                            if (googlePayButton2 != null) {
                                                i = R.id.google_pay_divider;
                                                GooglePayDivider googlePayDivider2 = (GooglePayDivider) view2.findViewById(i);
                                                if (googlePayDivider2 != null) {
                                                    i = R.id.message;
                                                    TextView textView6 = (TextView) view2.findViewById(i);
                                                    if (textView6 != null) {
                                                        i = R.id.save_card_checkbox;
                                                        MaterialCheckBox materialCheckBox = (MaterialCheckBox) view2.findViewById(i);
                                                        if (materialCheckBox != null) {
                                                            i = R.id.top_container;
                                                            LinearLayout linearLayout = (LinearLayout) view2.findViewById(i);
                                                            if (linearLayout != null) {
                                                                return new FragmentPaymentsheetAddCardBinding((ConstraintLayout) view2, textView, billingAddressView, textView2, textView3, space, textView4, textView5, cardMultilineWidget2, materialCardView, googlePayButton2, googlePayDivider2, textView6, materialCheckBox, linearLayout);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentPaymentsheetAddCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentPaymentsheetAddCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_paymentsheet_add_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
