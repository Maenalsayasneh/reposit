package com.clubhouse.backchannel.databinding;

import android.view.View;
import android.widget.ImageView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.backchannel.R;
import h0.e0.a;

public final class ChatFacepileBinding implements a {
    public final View a;
    public final AvatarView b;
    public final ImageView c;
    public final AvatarView d;
    public final AvatarView e;
    public final AvatarView f;

    public ChatFacepileBinding(View view, AvatarView avatarView, ImageView imageView, AvatarView avatarView2, AvatarView avatarView3, AvatarView avatarView4) {
        this.a = view;
        this.b = avatarView;
        this.c = imageView;
        this.d = avatarView2;
        this.e = avatarView3;
        this.f = avatarView4;
    }

    public static ChatFacepileBinding bind(View view) {
        int i = R.id.face_1;
        AvatarView avatarView = (AvatarView) view.findViewById(i);
        if (avatarView != null) {
            i = R.id.face_1_end_badge;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.face_2;
                AvatarView avatarView2 = (AvatarView) view.findViewById(i);
                if (avatarView2 != null) {
                    i = R.id.face_3;
                    AvatarView avatarView3 = (AvatarView) view.findViewById(i);
                    if (avatarView3 != null) {
                        i = R.id.face_4;
                        AvatarView avatarView4 = (AvatarView) view.findViewById(i);
                        if (avatarView4 != null) {
                            return new ChatFacepileBinding(view, avatarView, imageView, avatarView2, avatarView3, avatarView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
