package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ActivityItemStackedBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;

    public ActivityItemStackedBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2) {
        this.a = constraintLayout;
        this.b = textView;
    }

    public static ActivityItemStackedBinding bind(View view) {
        int i = R.id.avatar;
        ImageView imageView = (ImageView) view.findViewById(R.id.avatar);
        if (imageView != null) {
            i = R.id.message;
            TextView textView = (TextView) view.findViewById(R.id.message);
            if (textView != null) {
                i = R.id.next;
                ImageView imageView2 = (ImageView) view.findViewById(R.id.next);
                if (imageView2 != null) {
                    return new ActivityItemStackedBinding((ConstraintLayout) view, imageView, textView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityItemStackedBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_item_stacked, (ViewGroup) null, false));
    }
}
