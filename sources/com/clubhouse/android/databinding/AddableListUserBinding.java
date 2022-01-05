package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import com.clubhouse.core.ui.databinding.ListUserAnatomyBinding;
import h0.e0.a;

public final class AddableListUserBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;
    public final Button c;
    public final ProgressBar d;
    public final ListUserAnatomyBinding e;

    public AddableListUserBinding(ConstraintLayout constraintLayout, TextView textView, Button button, ProgressBar progressBar, ListUserAnatomyBinding listUserAnatomyBinding) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = button;
        this.d = progressBar;
        this.e = listUserAnatomyBinding;
    }

    public static AddableListUserBinding bind(View view) {
        int i = R.id.added;
        TextView textView = (TextView) view.findViewById(R.id.added);
        if (textView != null) {
            i = R.id.button;
            Button button = (Button) view.findViewById(R.id.button);
            if (button != null) {
                i = R.id.loading;
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                if (progressBar != null) {
                    i = R.id.user;
                    View findViewById = view.findViewById(R.id.user);
                    if (findViewById != null) {
                        return new AddableListUserBinding((ConstraintLayout) view, textView, button, progressBar, ListUserAnatomyBinding.bind(findViewById));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddableListUserBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.addable_list_user, (ViewGroup) null, false));
    }
}
