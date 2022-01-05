package com.clubhouse.backchannel.databinding;

import android.view.View;
import android.widget.ImageView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.backchannel.R;
import h0.e0.a;

public final class ChatHeaderAvatarBinding implements a {
    public final View a;
    public final AvatarView b;
    public final ImageView c;

    public ChatHeaderAvatarBinding(View view, AvatarView avatarView, ImageView imageView) {
        this.a = view;
        this.b = avatarView;
        this.c = imageView;
    }

    public static ChatHeaderAvatarBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(i);
        if (avatarView != null) {
            i = R.id.end_badge;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                return new ChatHeaderAvatarBinding(view, avatarView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
