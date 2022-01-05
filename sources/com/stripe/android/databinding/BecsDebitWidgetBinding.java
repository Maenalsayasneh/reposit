package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.BecsDebitAccountNumberEditText;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.stripe.android.view.BecsDebitMandateAcceptanceTextView;
import com.stripe.android.view.EmailEditText;
import com.stripe.android.view.StripeEditText;
import h0.e0.a;
import java.util.Objects;

public final class BecsDebitWidgetBinding implements a {
    public final BecsDebitAccountNumberEditText accountNumberEditText;
    public final TextInputLayout accountNumberTextInputLayout;
    public final BecsDebitBsbEditText bsbEditText;
    public final TextInputLayout bsbTextInputLayout;
    public final EmailEditText emailEditText;
    public final TextInputLayout emailTextInputLayout;
    public final BecsDebitMandateAcceptanceTextView mandateAcceptanceTextView;
    public final StripeEditText nameEditText;
    public final TextInputLayout nameTextInputLayout;
    private final View rootView;

    private BecsDebitWidgetBinding(View view, BecsDebitAccountNumberEditText becsDebitAccountNumberEditText, TextInputLayout textInputLayout, BecsDebitBsbEditText becsDebitBsbEditText, TextInputLayout textInputLayout2, EmailEditText emailEditText2, TextInputLayout textInputLayout3, BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView, StripeEditText stripeEditText, TextInputLayout textInputLayout4) {
        this.rootView = view;
        this.accountNumberEditText = becsDebitAccountNumberEditText;
        this.accountNumberTextInputLayout = textInputLayout;
        this.bsbEditText = becsDebitBsbEditText;
        this.bsbTextInputLayout = textInputLayout2;
        this.emailEditText = emailEditText2;
        this.emailTextInputLayout = textInputLayout3;
        this.mandateAcceptanceTextView = becsDebitMandateAcceptanceTextView;
        this.nameEditText = stripeEditText;
        this.nameTextInputLayout = textInputLayout4;
    }

    public static BecsDebitWidgetBinding bind(View view) {
        int i = R.id.account_number_edit_text;
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = (BecsDebitAccountNumberEditText) view.findViewById(i);
        if (becsDebitAccountNumberEditText != null) {
            i = R.id.account_number_text_input_layout;
            TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(i);
            if (textInputLayout != null) {
                i = R.id.bsb_edit_text;
                BecsDebitBsbEditText becsDebitBsbEditText = (BecsDebitBsbEditText) view.findViewById(i);
                if (becsDebitBsbEditText != null) {
                    i = R.id.bsb_text_input_layout;
                    TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(i);
                    if (textInputLayout2 != null) {
                        i = R.id.email_edit_text;
                        EmailEditText emailEditText2 = (EmailEditText) view.findViewById(i);
                        if (emailEditText2 != null) {
                            i = R.id.email_text_input_layout;
                            TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(i);
                            if (textInputLayout3 != null) {
                                i = R.id.mandate_acceptance_text_view;
                                BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = (BecsDebitMandateAcceptanceTextView) view.findViewById(i);
                                if (becsDebitMandateAcceptanceTextView != null) {
                                    i = R.id.name_edit_text;
                                    StripeEditText stripeEditText = (StripeEditText) view.findViewById(i);
                                    if (stripeEditText != null) {
                                        i = R.id.name_text_input_layout;
                                        TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(i);
                                        if (textInputLayout4 != null) {
                                            return new BecsDebitWidgetBinding(view, becsDebitAccountNumberEditText, textInputLayout, becsDebitBsbEditText, textInputLayout2, emailEditText2, textInputLayout3, becsDebitMandateAcceptanceTextView, stripeEditText, textInputLayout4);
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

    public static BecsDebitWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.becs_debit_widget, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
