package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class EventCoHostBinding implements a {
    public final View a;
    public final TextView b;
    public final ImageView c;
    public final ConstraintLayout d;
    public final TextView e;
    public final AvatarView f;

    public EventCoHostBinding(ConstraintLayout constraintLayout, View view, TextView textView, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView2, AvatarView avatarView) {
        this.a = view;
        this.b = textView;
        this.c = imageView;
        this.d = constraintLayout2;
        this.e = textView2;
        this.f = avatarView;
    }

    public static EventCoHostBinding bind(View view) {
        int i = R.id.event_co_host_divider;
        View findViewById = view.findViewById(R.id.event_co_host_divider);
        if (findViewById != null) {
            i = R.id.event_co_host_name;
            TextView textView = (TextView) view.findViewById(R.id.event_co_host_name);
            if (textView != null) {
                i = R.id.event_co_host_remove;
                ImageView imageView = (ImageView) view.findViewById(R.id.event_co_host_remove);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.event_co_host_with;
                    TextView textView2 = (TextView) view.findViewById(R.id.event_co_host_with);
                    if (textView2 != null) {
                        i = R.id.event_co_host_with_avatar;
                        AvatarView avatarView = (AvatarView) view.findViewById(R.id.event_co_host_with_avatar);
                        if (avatarView != null) {
                            return new EventCoHostBinding(constraintLayout, findViewById, textView, imageView, constraintLayout, textView2, avatarView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EventCoHostBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_co_host, (ViewGroup) null, false));
    }
}
