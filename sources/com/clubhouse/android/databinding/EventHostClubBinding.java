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

public final class EventHostClubBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;
    public final ImageView d;

    public EventHostClubBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AvatarView avatarView, TextView textView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
        this.d = imageView;
    }

    public static EventHostClubBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.event_host_club_avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.event_host_club_avatar);
        if (avatarView != null) {
            i = R.id.event_host_club_title;
            TextView textView = (TextView) view.findViewById(R.id.event_host_club_title);
            if (textView != null) {
                i = R.id.selected_icon;
                ImageView imageView = (ImageView) view.findViewById(R.id.selected_icon);
                if (imageView != null) {
                    return new EventHostClubBinding((ConstraintLayout) view, constraintLayout, avatarView, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EventHostClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_host_club, (ViewGroup) null, false));
    }
}
