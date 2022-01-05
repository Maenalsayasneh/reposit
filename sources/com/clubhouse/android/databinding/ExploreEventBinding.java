package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ExploreEventBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final RSVPButton c;
    public final TextView d;
    public final Button e;
    public final Button f;
    public final TextView g;
    public final TextView h;

    public ExploreEventBinding(ConstraintLayout constraintLayout, AvatarView avatarView, Barrier barrier, RSVPButton rSVPButton, TextView textView, ImageView imageView, Button button, Button button2, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = rSVPButton;
        this.d = textView;
        this.e = button;
        this.f = button2;
        this.g = textView2;
        this.h = textView3;
    }

    public static ExploreEventBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.barrier;
            Barrier barrier = (Barrier) view.findViewById(R.id.barrier);
            if (barrier != null) {
                i = R.id.bell_icon;
                RSVPButton rSVPButton = (RSVPButton) view.findViewById(R.id.bell_icon);
                if (rSVPButton != null) {
                    i = R.id.details;
                    TextView textView = (TextView) view.findViewById(R.id.details);
                    if (textView != null) {
                        i = R.id.end_badge;
                        ImageView imageView = (ImageView) view.findViewById(R.id.end_badge);
                        if (imageView != null) {
                            i = R.id.rsvp;
                            Button button = (Button) view.findViewById(R.id.rsvp);
                            if (button != null) {
                                i = R.id.rsvped;
                                Button button2 = (Button) view.findViewById(R.id.rsvped);
                                if (button2 != null) {
                                    i = R.id.time;
                                    TextView textView2 = (TextView) view.findViewById(R.id.time);
                                    if (textView2 != null) {
                                        i = R.id.title;
                                        TextView textView3 = (TextView) view.findViewById(R.id.title);
                                        if (textView3 != null) {
                                            return new ExploreEventBinding((ConstraintLayout) view, avatarView, barrier, rSVPButton, textView, imageView, button, button2, textView2, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ExploreEventBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.explore_event, (ViewGroup) null, false));
    }
}
