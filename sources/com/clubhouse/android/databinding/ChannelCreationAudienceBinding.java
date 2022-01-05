package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ChannelCreationAudienceBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;

    public ChannelCreationAudienceBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
    }

    public static ChannelCreationAudienceBinding bind(View view) {
        int i = R.id.icon;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.icon);
        if (avatarView != null) {
            i = R.id.title;
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (textView != null) {
                return new ChannelCreationAudienceBinding((ConstraintLayout) view, avatarView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChannelCreationAudienceBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.channel_creation_audience, (ViewGroup) null, false));
    }
}
