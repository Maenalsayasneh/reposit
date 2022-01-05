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

public final class FragmentConnectSocialAccountsBinding implements a {
    public final Button a;
    public final FrameLayout b;
    public final Button c;
    public final Button d;

    public FragmentConnectSocialAccountsBinding(ConstraintLayout constraintLayout, Button button, TextView textView, FrameLayout frameLayout, Button button2, TextView textView2, Button button3) {
        this.a = button;
        this.b = frameLayout;
        this.c = button2;
        this.d = button3;
    }

    public static FragmentConnectSocialAccountsBinding bind(View view) {
        int i = R.id.instagram;
        Button button = (Button) view.findViewById(R.id.instagram);
        if (button != null) {
            i = R.id.label;
            TextView textView = (TextView) view.findViewById(R.id.label);
            if (textView != null) {
                i = R.id.loading;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
                if (frameLayout != null) {
                    i = R.id.next_button;
                    Button button2 = (Button) view.findViewById(R.id.next_button);
                    if (button2 != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) view.findViewById(R.id.title);
                        if (textView2 != null) {
                            i = R.id.twitter;
                            Button button3 = (Button) view.findViewById(R.id.twitter);
                            if (button3 != null) {
                                return new FragmentConnectSocialAccountsBinding((ConstraintLayout) view, button, textView, frameLayout, button2, textView2, button3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentConnectSocialAccountsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_connect_social_accounts, (ViewGroup) null, false));
    }
}
