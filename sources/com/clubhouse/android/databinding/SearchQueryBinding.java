package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class SearchQueryBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;

    public SearchQueryBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView2;
    }

    public static SearchQueryBinding bind(View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) view.findViewById(R.id.arrow);
        if (imageView != null) {
            i = R.id.description;
            TextView textView = (TextView) view.findViewById(R.id.description);
            if (textView != null) {
                i = R.id.icon;
                ImageView imageView2 = (ImageView) view.findViewById(R.id.icon);
                if (imageView2 != null) {
                    i = R.id.query;
                    TextView textView2 = (TextView) view.findViewById(R.id.query);
                    if (textView2 != null) {
                        return new SearchQueryBinding((ConstraintLayout) view, imageView, textView, imageView2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SearchQueryBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.search_query, (ViewGroup) null, false));
    }
}
