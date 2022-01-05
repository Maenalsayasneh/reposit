package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class DialogCreateClipComingSoonBinding implements a {
    public final LinearLayout a;
    public final TextView b;
    public final Button c;

    public DialogCreateClipComingSoonBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, Button button, TextView textView3) {
        this.a = linearLayout;
        this.b = textView2;
        this.c = button;
    }

    public static DialogCreateClipComingSoonBinding bind(View view) {
        int i = R.id.body;
        TextView textView = (TextView) view.findViewById(R.id.body);
        if (textView != null) {
            i = R.id.header_image;
            ImageView imageView = (ImageView) view.findViewById(R.id.header_image);
            if (imageView != null) {
                i = R.id.learn_more_link;
                TextView textView2 = (TextView) view.findViewById(R.id.learn_more_link);
                if (textView2 != null) {
                    i = R.id.primary_button;
                    Button button = (Button) view.findViewById(R.id.primary_button);
                    if (button != null) {
                        i = R.id.title;
                        TextView textView3 = (TextView) view.findViewById(R.id.title);
                        if (textView3 != null) {
                            return new DialogCreateClipComingSoonBinding((LinearLayout) view, textView, imageView, textView2, button, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DialogCreateClipComingSoonBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialog_create_clip_coming_soon, (ViewGroup) null, false));
    }
}
