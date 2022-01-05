package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentWaitlistBinding implements a {
    public final TextView a;
    public final FrameLayout b;
    public final Button c;
    public final TextView d;

    public FragmentWaitlistBinding(ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout, Button button, TextView textView2) {
        this.a = textView;
        this.b = frameLayout;
        this.c = button;
        this.d = textView2;
    }

    public static FragmentWaitlistBinding bind(View view) {
        int i = R.id.blog_link;
        TextView textView = (TextView) view.findViewById(R.id.blog_link);
        if (textView != null) {
            i = R.id.loading;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
            if (frameLayout != null) {
                i = R.id.next_button;
                Button button = (Button) view.findViewById(R.id.next_button);
                if (button != null) {
                    i = R.id.username_reserved;
                    TextView textView2 = (TextView) view.findViewById(R.id.username_reserved);
                    if (textView2 != null) {
                        return new FragmentWaitlistBinding((ConstraintLayout) view, textView, frameLayout, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentWaitlistBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_waitlist, (ViewGroup) null, false));
    }
}
