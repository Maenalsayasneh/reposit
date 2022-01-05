package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FeedLanguagePickerBinding implements a {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    public FeedLanguagePickerBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.a = textView;
        this.b = textView2;
        this.c = textView3;
    }

    public static FeedLanguagePickerBinding bind(View view) {
        int i = R.id.accept_button;
        TextView textView = (TextView) view.findViewById(R.id.accept_button);
        if (textView != null) {
            i = R.id.dismiss_button;
            TextView textView2 = (TextView) view.findViewById(R.id.dismiss_button);
            if (textView2 != null) {
                i = R.id.language_picker_icon;
                ImageView imageView = (ImageView) view.findViewById(R.id.language_picker_icon);
                if (imageView != null) {
                    i = R.id.language_picker_title;
                    TextView textView3 = (TextView) view.findViewById(R.id.language_picker_title);
                    if (textView3 != null) {
                        return new FeedLanguagePickerBinding((ConstraintLayout) view, textView, textView2, imageView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FeedLanguagePickerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.feed_language_picker, (ViewGroup) null, false));
    }
}
