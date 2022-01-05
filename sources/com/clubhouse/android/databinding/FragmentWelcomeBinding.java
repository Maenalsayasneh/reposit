package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentWelcomeBinding implements a {
    public final Button a;

    public FragmentWelcomeBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, Button button) {
        this.a = button;
    }

    public static FragmentWelcomeBinding bind(View view) {
        int i = R.id.wave;
        ImageView imageView = (ImageView) view.findViewById(R.id.wave);
        if (imageView != null) {
            i = R.id.welcome_banner;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.welcome_banner);
            if (imageView2 != null) {
                i = R.id.welcome_button;
                Button button = (Button) view.findViewById(R.id.welcome_button);
                if (button != null) {
                    return new FragmentWelcomeBinding((ConstraintLayout) view, imageView, imageView2, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentWelcomeBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_welcome, (ViewGroup) null, false));
    }
}
