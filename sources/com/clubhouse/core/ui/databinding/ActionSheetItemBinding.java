package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class ActionSheetItemBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;

    public ActionSheetItemBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = imageView2;
    }

    public static ActionSheetItemBinding bind(View view) {
        int i = R.id.action_explanation;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.action_icon;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.action_title;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    i = R.id.selected_icon;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        return new ActionSheetItemBinding((ConstraintLayout) view, textView, imageView, textView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActionSheetItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.action_sheet_item, (ViewGroup) null, false));
    }
}
