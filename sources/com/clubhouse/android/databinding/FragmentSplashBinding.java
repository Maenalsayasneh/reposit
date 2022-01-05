package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class FragmentSplashBinding implements a {
    public FragmentSplashBinding(ConstraintLayout constraintLayout) {
    }

    public static FragmentSplashBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new FragmentSplashBinding((ConstraintLayout) view);
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_splash, (ViewGroup) null, false));
    }
}
