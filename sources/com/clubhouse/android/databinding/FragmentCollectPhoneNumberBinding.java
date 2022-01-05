package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import com.hbb20.CountryCodePicker;
import h0.e0.a;

public final class FragmentCollectPhoneNumberBinding implements a {
    public final CountryCodePicker a;
    public final ProgressBar b;
    public final Button c;
    public final EditText d;
    public final TextView e;

    public FragmentCollectPhoneNumberBinding(ConstraintLayout constraintLayout, CountryCodePicker countryCodePicker, ProgressBar progressBar, Button button, EditText editText, TextView textView, TextView textView2) {
        this.a = countryCodePicker;
        this.b = progressBar;
        this.c = button;
        this.d = editText;
        this.e = textView;
    }

    public static FragmentCollectPhoneNumberBinding bind(View view) {
        int i = R.id.country_code_picker;
        CountryCodePicker countryCodePicker = (CountryCodePicker) view.findViewById(R.id.country_code_picker);
        if (countryCodePicker != null) {
            i = R.id.loading;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
            if (progressBar != null) {
                i = R.id.next_button;
                Button button = (Button) view.findViewById(R.id.next_button);
                if (button != null) {
                    i = R.id.phone_number;
                    EditText editText = (EditText) view.findViewById(R.id.phone_number);
                    if (editText != null) {
                        i = R.id.terms_privacy_message;
                        TextView textView = (TextView) view.findViewById(R.id.terms_privacy_message);
                        if (textView != null) {
                            i = R.id.title;
                            TextView textView2 = (TextView) view.findViewById(R.id.title);
                            if (textView2 != null) {
                                return new FragmentCollectPhoneNumberBinding((ConstraintLayout) view, countryCodePicker, progressBar, button, editText, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentCollectPhoneNumberBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_collect_phone_number, (ViewGroup) null, false));
    }
}
