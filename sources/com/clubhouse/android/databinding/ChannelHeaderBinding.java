package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ChannelHeaderBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;

    public ChannelHeaderBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = frameLayout;
        this.f = imageView2;
    }

    public static ChannelHeaderBinding bind(View view) {
        int i = R.id.audience_icon;
        ImageView imageView = (ImageView) view.findViewById(R.id.audience_icon);
        if (imageView != null) {
            i = R.id.channel_name;
            TextView textView = (TextView) view.findViewById(R.id.channel_name);
            if (textView != null) {
                i = R.id.club_name;
                TextView textView2 = (TextView) view.findViewById(R.id.club_name);
                if (textView2 != null) {
                    i = R.id.club_name_root;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.club_name_root);
                    if (frameLayout != null) {
                        i = R.id.overflow;
                        ImageView imageView2 = (ImageView) view.findViewById(R.id.overflow);
                        if (imageView2 != null) {
                            return new ChannelHeaderBinding((ConstraintLayout) view, imageView, textView, textView2, frameLayout, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChannelHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.channel_header, (ViewGroup) null, false));
    }
}
