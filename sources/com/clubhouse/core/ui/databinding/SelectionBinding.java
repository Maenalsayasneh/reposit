package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class SelectionBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public SelectionBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
    }

    public static SelectionBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.selected_icon;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.selection_sub_title;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.selection_title;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    return new SelectionBinding((ConstraintLayout) view, constraintLayout, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SelectionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.selection, (ViewGroup) null, false));
    }
}
