package com.clubhouse.wave.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.wave.R;
import h0.e0.a;

public final class WaveNuxUpsellBinding implements a {
    public final AvatarView a;
    public final TextView b;
    public final Button c;
    public final Button d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public WaveNuxUpsellBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, Button button, Button button2, TextView textView2, TextView textView3, TextView textView4) {
        this.a = avatarView;
        this.b = textView;
        this.c = button;
        this.d = button2;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
    }

    public static WaveNuxUpsellBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(i);
        if (avatarView != null) {
            i = R.id.body;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.go_button;
                Button button = (Button) view.findViewById(i);
                if (button != null) {
                    i = R.id.later_button;
                    Button button2 = (Button) view.findViewById(i);
                    if (button2 != null) {
                        i = R.id.single_wave;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = R.id.some_wave;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null) {
                                i = R.id.title;
                                TextView textView4 = (TextView) view.findViewById(i);
                                if (textView4 != null) {
                                    return new WaveNuxUpsellBinding((ConstraintLayout) view, avatarView, textView, button, button2, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static WaveNuxUpsellBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.wave_nux_upsell, (ViewGroup) null, false));
    }
}
