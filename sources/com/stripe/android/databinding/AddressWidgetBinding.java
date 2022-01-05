package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.StripeEditText;
import h0.e0.a;
import java.util.Objects;

public final class AddressWidgetBinding implements a {
    public final CountryTextInputLayout countryAutocompleteAaw;
    public final StripeEditText etAddressLineOneAaw;
    public final StripeEditText etAddressLineTwoAaw;
    public final StripeEditText etCityAaw;
    public final StripeEditText etNameAaw;
    public final StripeEditText etPhoneNumberAaw;
    public final StripeEditText etPostalCodeAaw;
    public final StripeEditText etStateAaw;
    private final View rootView;
    public final TextInputLayout tlAddressLine1Aaw;
    public final TextInputLayout tlAddressLine2Aaw;
    public final TextInputLayout tlCityAaw;
    public final TextInputLayout tlNameAaw;
    public final TextInputLayout tlPhoneNumberAaw;
    public final TextInputLayout tlPostalCodeAaw;
    public final TextInputLayout tlStateAaw;

    private AddressWidgetBinding(View view, CountryTextInputLayout countryTextInputLayout, StripeEditText stripeEditText, StripeEditText stripeEditText2, StripeEditText stripeEditText3, StripeEditText stripeEditText4, StripeEditText stripeEditText5, StripeEditText stripeEditText6, StripeEditText stripeEditText7, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7) {
        this.rootView = view;
        this.countryAutocompleteAaw = countryTextInputLayout;
        this.etAddressLineOneAaw = stripeEditText;
        this.etAddressLineTwoAaw = stripeEditText2;
        this.etCityAaw = stripeEditText3;
        this.etNameAaw = stripeEditText4;
        this.etPhoneNumberAaw = stripeEditText5;
        this.etPostalCodeAaw = stripeEditText6;
        this.etStateAaw = stripeEditText7;
        this.tlAddressLine1Aaw = textInputLayout;
        this.tlAddressLine2Aaw = textInputLayout2;
        this.tlCityAaw = textInputLayout3;
        this.tlNameAaw = textInputLayout4;
        this.tlPhoneNumberAaw = textInputLayout5;
        this.tlPostalCodeAaw = textInputLayout6;
        this.tlStateAaw = textInputLayout7;
    }

    public static AddressWidgetBinding bind(View view) {
        View view2 = view;
        int i = R.id.country_autocomplete_aaw;
        CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) view2.findViewById(i);
        if (countryTextInputLayout != null) {
            i = R.id.et_address_line_one_aaw;
            StripeEditText stripeEditText = (StripeEditText) view2.findViewById(i);
            if (stripeEditText != null) {
                i = R.id.et_address_line_two_aaw;
                StripeEditText stripeEditText2 = (StripeEditText) view2.findViewById(i);
                if (stripeEditText2 != null) {
                    i = R.id.et_city_aaw;
                    StripeEditText stripeEditText3 = (StripeEditText) view2.findViewById(i);
                    if (stripeEditText3 != null) {
                        i = R.id.et_name_aaw;
                        StripeEditText stripeEditText4 = (StripeEditText) view2.findViewById(i);
                        if (stripeEditText4 != null) {
                            i = R.id.et_phone_number_aaw;
                            StripeEditText stripeEditText5 = (StripeEditText) view2.findViewById(i);
                            if (stripeEditText5 != null) {
                                i = R.id.et_postal_code_aaw;
                                StripeEditText stripeEditText6 = (StripeEditText) view2.findViewById(i);
                                if (stripeEditText6 != null) {
                                    i = R.id.et_state_aaw;
                                    StripeEditText stripeEditText7 = (StripeEditText) view2.findViewById(i);
                                    if (stripeEditText7 != null) {
                                        i = R.id.tl_address_line1_aaw;
                                        TextInputLayout textInputLayout = (TextInputLayout) view2.findViewById(i);
                                        if (textInputLayout != null) {
                                            i = R.id.tl_address_line2_aaw;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) view2.findViewById(i);
                                            if (textInputLayout2 != null) {
                                                i = R.id.tl_city_aaw;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) view2.findViewById(i);
                                                if (textInputLayout3 != null) {
                                                    i = R.id.tl_name_aaw;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) view2.findViewById(i);
                                                    if (textInputLayout4 != null) {
                                                        i = R.id.tl_phone_number_aaw;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) view2.findViewById(i);
                                                        if (textInputLayout5 != null) {
                                                            i = R.id.tl_postal_code_aaw;
                                                            TextInputLayout textInputLayout6 = (TextInputLayout) view2.findViewById(i);
                                                            if (textInputLayout6 != null) {
                                                                i = R.id.tl_state_aaw;
                                                                TextInputLayout textInputLayout7 = (TextInputLayout) view2.findViewById(i);
                                                                if (textInputLayout7 != null) {
                                                                    return new AddressWidgetBinding(view, countryTextInputLayout, stripeEditText, stripeEditText2, stripeEditText3, stripeEditText4, stripeEditText5, stripeEditText6, stripeEditText7, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddressWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.address_widget, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
