package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import h0.e0.a;
import java.util.Objects;

public final class CardInputWidgetBinding implements a {
    public final CardBrandView cardBrandView;
    public final CardNumberEditText cardNumberEditText;
    public final TextInputLayout cardNumberTextInputLayout;
    public final FrameLayout container;
    public final CvcEditText cvcEditText;
    public final TextInputLayout cvcTextInputLayout;
    public final ExpiryDateEditText expiryDateEditText;
    public final TextInputLayout expiryDateTextInputLayout;
    public final PostalCodeEditText postalCodeEditText;
    public final TextInputLayout postalCodeTextInputLayout;
    private final View rootView;

    private CardInputWidgetBinding(View view, CardBrandView cardBrandView2, CardNumberEditText cardNumberEditText2, TextInputLayout textInputLayout, FrameLayout frameLayout, CvcEditText cvcEditText2, TextInputLayout textInputLayout2, ExpiryDateEditText expiryDateEditText2, TextInputLayout textInputLayout3, PostalCodeEditText postalCodeEditText2, TextInputLayout textInputLayout4) {
        this.rootView = view;
        this.cardBrandView = cardBrandView2;
        this.cardNumberEditText = cardNumberEditText2;
        this.cardNumberTextInputLayout = textInputLayout;
        this.container = frameLayout;
        this.cvcEditText = cvcEditText2;
        this.cvcTextInputLayout = textInputLayout2;
        this.expiryDateEditText = expiryDateEditText2;
        this.expiryDateTextInputLayout = textInputLayout3;
        this.postalCodeEditText = postalCodeEditText2;
        this.postalCodeTextInputLayout = textInputLayout4;
    }

    public static CardInputWidgetBinding bind(View view) {
        int i = R.id.card_brand_view;
        CardBrandView cardBrandView2 = (CardBrandView) view.findViewById(i);
        if (cardBrandView2 != null) {
            i = R.id.card_number_edit_text;
            CardNumberEditText cardNumberEditText2 = (CardNumberEditText) view.findViewById(i);
            if (cardNumberEditText2 != null) {
                i = R.id.card_number_text_input_layout;
                TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(i);
                if (textInputLayout != null) {
                    i = R.id.container;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                    if (frameLayout != null) {
                        i = R.id.cvc_edit_text;
                        CvcEditText cvcEditText2 = (CvcEditText) view.findViewById(i);
                        if (cvcEditText2 != null) {
                            i = R.id.cvc_text_input_layout;
                            TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(i);
                            if (textInputLayout2 != null) {
                                i = R.id.expiry_date_edit_text;
                                ExpiryDateEditText expiryDateEditText2 = (ExpiryDateEditText) view.findViewById(i);
                                if (expiryDateEditText2 != null) {
                                    i = R.id.expiry_date_text_input_layout;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(i);
                                    if (textInputLayout3 != null) {
                                        i = R.id.postal_code_edit_text;
                                        PostalCodeEditText postalCodeEditText2 = (PostalCodeEditText) view.findViewById(i);
                                        if (postalCodeEditText2 != null) {
                                            i = R.id.postal_code_text_input_layout;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(i);
                                            if (textInputLayout4 != null) {
                                                return new CardInputWidgetBinding(view, cardBrandView2, cardNumberEditText2, textInputLayout, frameLayout, cvcEditText2, textInputLayout2, expiryDateEditText2, textInputLayout3, postalCodeEditText2, textInputLayout4);
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

    public static CardInputWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.card_input_widget, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
