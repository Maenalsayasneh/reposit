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

public final class FragmentCollectUsernameBinding implements a {
    public final ImageView a;
    public final ProgressBar b;
    public final Button c;
    public final TextView d;
    public final Toolbar e;
    public final EditText f;

    public FragmentCollectUsernameBinding(ConstraintLayout constraintLayout, ImageView imageView, ProgressBar progressBar, Button button, TextView textView, Toolbar toolbar, EditText editText) {
        this.a = imageView;
        this.b = progressBar;
        this.c = button;
        this.d = textView;
        this.e = toolbar;
        this.f = editText;
    }

    public static FragmentCollectUsernameBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.loading;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
            if (progressBar != null) {
                i = R.id.next_button;
                Button button = (Button) view.findViewById(R.id.next_button);
                if (button != null) {
                    i = R.id.title;
                    TextView textView = (TextView) view.findViewById(R.id.title);
                    if (textView != null) {
                        i = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                        if (toolbar != null) {
                            i = R.id.username;
                            EditText editText = (EditText) view.findViewById(R.id.username);
                            if (editText != null) {
                                return new FragmentCollectUsernameBinding((ConstraintLayout) view, imageView, progressBar, button, textView, toolbar, editText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentCollectUsernameBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_collect_username, (ViewGroup) null, false));
    }
}
