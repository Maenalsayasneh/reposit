package com.clubhouse.backchannel.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.backchannel.R;
import h0.e0.a;

public final class CreateChatUserItemBinding implements a {
    public final View a;
    public final AvatarView b;
    public final TextView c;
    public final ImageView d;

    public CreateChatUserItemBinding(View view, AvatarView avatarView, TextView textView, ImageView imageView) {
        this.a = view;
        this.b = avatarView;
        this.c = textView;
        this.d = imageView;
    }

    public static CreateChatUserItemBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(i);
        if (avatarView != null) {
            i = R.id.name;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.remove;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    return new CreateChatUserItemBinding(view, avatarView, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
