package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import h0.e0.a;
import java.util.Objects;

public final class CountryAutocompleteViewBinding implements a {
    public final AutoCompleteTextView countryAutocomplete;
    public final TextInputLayout countryTextInputLayout;
    private final View rootView;

    private CountryAutocompleteViewBinding(View view, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout) {
        this.rootView = view;
        this.countryAutocomplete = autoCompleteTextView;
        this.countryTextInputLayout = textInputLayout;
    }

    public static CountryAutocompleteViewBinding bind(View view) {
        int i = R.id.country_autocomplete;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view.findViewById(i);
        if (autoCompleteTextView != null) {
            i = R.id.country_text_input_layout;
            TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(i);
            if (textInputLayout != null) {
                return new CountryAutocompleteViewBinding(view, autoCompleteTextView, textInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CountryAutocompleteViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.country_autocomplete_view, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
