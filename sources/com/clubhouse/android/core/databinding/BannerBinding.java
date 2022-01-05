package com.clubhouse.android.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.R;
import h0.e0.a;

public final class BannerBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;
    public final Button c;
    public final Button d;

    public BannerBinding(ConstraintLayout constraintLayout, TextView textView, Button button, Button button2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = button;
        this.d = button2;
    }

    public static BannerBinding bind(View view) {
        int i = R.id.message;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.negative_button;
            Button button = (Button) view.findViewById(i);
            if (button != null) {
                i = R.id.positive_button;
                Button button2 = (Button) view.findViewById(i);
                if (button2 != null) {
                    return new BannerBinding((ConstraintLayout) view, textView, button, button2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BannerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.banner, (ViewGroup) null, false));
    }
}
