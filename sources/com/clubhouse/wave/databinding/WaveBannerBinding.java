package com.clubhouse.wave.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.wave.R;
import h0.e0.a;

public final class WaveBannerBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final Button d;
    public final Button e;

    public WaveBannerBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Button button, Button button2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = button;
        this.e = button2;
    }

    public static WaveBannerBinding bind(View view) {
        int i = R.id.backchannel;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.message;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.negative_button;
                Button button = (Button) view.findViewById(i);
                if (button != null) {
                    i = R.id.positive_button;
                    Button button2 = (Button) view.findViewById(i);
                    if (button2 != null) {
                        return new WaveBannerBinding((ConstraintLayout) view, imageView, textView, button, button2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static WaveBannerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.wave_banner, (ViewGroup) null, false));
    }
}
