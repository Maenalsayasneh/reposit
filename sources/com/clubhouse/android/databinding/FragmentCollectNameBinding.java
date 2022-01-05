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

public final class FragmentCollectNameBinding implements a {
    public final ImageView a;
    public final EditText b;
    public final EditText c;
    public final ProgressBar d;
    public final Button e;
    public final TextView f;
    public final Toolbar g;

    public FragmentCollectNameBinding(ConstraintLayout constraintLayout, ImageView imageView, EditText editText, TextView textView, EditText editText2, ProgressBar progressBar, Button button, TextView textView2, Toolbar toolbar) {
        this.a = imageView;
        this.b = editText;
        this.c = editText2;
        this.d = progressBar;
        this.e = button;
        this.f = textView2;
        this.g = toolbar;
    }

    public static FragmentCollectNameBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.first_name;
            EditText editText = (EditText) view.findViewById(R.id.first_name);
            if (editText != null) {
                i = R.id.label;
                TextView textView = (TextView) view.findViewById(R.id.label);
                if (textView != null) {
                    i = R.id.last_name;
                    EditText editText2 = (EditText) view.findViewById(R.id.last_name);
                    if (editText2 != null) {
                        i = R.id.loading;
                        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                        if (progressBar != null) {
                            i = R.id.next_button;
                            Button button = (Button) view.findViewById(R.id.next_button);
                            if (button != null) {
                                i = R.id.title;
                                TextView textView2 = (TextView) view.findViewById(R.id.title);
                                if (textView2 != null) {
                                    i = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                    if (toolbar != null) {
                                        return new FragmentCollectNameBinding((ConstraintLayout) view, imageView, editText, textView, editText2, progressBar, button, textView2, toolbar);
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

    public static FragmentCollectNameBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_collect_name, (ViewGroup) null, false));
    }
}
