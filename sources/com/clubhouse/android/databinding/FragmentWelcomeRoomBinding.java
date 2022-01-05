package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyViewStub;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentWelcomeRoomBinding implements a {
    public final View a;
    public final LinearLayout b;
    public final ProgressBar c;
    public final Button d;
    public final TextView e;

    public FragmentWelcomeRoomBinding(FrameLayout frameLayout, View view, LinearLayout linearLayout, ProgressBar progressBar, Button button, EpoxyViewStub epoxyViewStub, TextView textView) {
        this.a = view;
        this.b = linearLayout;
        this.c = progressBar;
        this.d = button;
        this.e = textView;
    }

    public static FragmentWelcomeRoomBinding bind(View view) {
        int i = R.id.bottom_shadow;
        View findViewById = view.findViewById(R.id.bottom_shadow);
        if (findViewById != null) {
            i = R.id.channel_views;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.channel_views);
            if (linearLayout != null) {
                i = R.id.loading;
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                if (progressBar != null) {
                    i = R.id.no_thanks;
                    Button button = (Button) view.findViewById(R.id.no_thanks);
                    if (button != null) {
                        i = R.id.welcome_channel;
                        EpoxyViewStub epoxyViewStub = (EpoxyViewStub) view.findViewById(R.id.welcome_channel);
                        if (epoxyViewStub != null) {
                            i = R.id.welcome_room_title;
                            TextView textView = (TextView) view.findViewById(R.id.welcome_room_title);
                            if (textView != null) {
                                return new FragmentWelcomeRoomBinding((FrameLayout) view, findViewById, linearLayout, progressBar, button, epoxyViewStub, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentWelcomeRoomBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_welcome_room, (ViewGroup) null, false));
    }
}
