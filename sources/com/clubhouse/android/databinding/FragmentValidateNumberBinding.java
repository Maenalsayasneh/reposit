package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentValidateNumberBinding implements a {
    public final ImageView a;
    public final EditText b;
    public final ProgressBar c;
    public final Button d;
    public final Button e;

    public FragmentValidateNumberBinding(ConstraintLayout constraintLayout, ImageView imageView, EditText editText, ProgressBar progressBar, Button button, Button button2, TextView textView, Toolbar toolbar) {
        this.a = imageView;
        this.b = editText;
        this.c = progressBar;
        this.d = button;
        this.e = button2;
    }

    public static FragmentValidateNumberBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.code;
            EditText editText = (EditText) view.findViewById(R.id.code);
            if (editText != null) {
                i = R.id.loading;
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                if (progressBar != null) {
                    i = R.id.next_button;
                    Button button = (Button) view.findViewById(R.id.next_button);
                    if (button != null) {
                        i = R.id.resend_button;
                        Button button2 = (Button) view.findViewById(R.id.resend_button);
                        if (button2 != null) {
                            i = R.id.title;
                            TextView textView = (TextView) view.findViewById(R.id.title);
                            if (textView != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                if (toolbar != null) {
                                    return new FragmentValidateNumberBinding((ConstraintLayout) view, imageView, editText, progressBar, button, button2, textView, toolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentValidateNumberBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_validate_number, (ViewGroup) null, false));
    }
}
