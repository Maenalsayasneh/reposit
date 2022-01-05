package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class UserInGridBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final ImageView c;
    public final TextView d;
    public final EmojiTextView e;

    public UserInGridBinding(ConstraintLayout constraintLayout, AvatarView avatarView, ImageView imageView, TextView textView, EmojiTextView emojiTextView) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = imageView;
        this.d = textView;
        this.e = emojiTextView;
    }

    public static UserInGridBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.end_badge;
            ImageView imageView = (ImageView) view.findViewById(R.id.end_badge);
            if (imageView != null) {
                i = R.id.name;
                TextView textView = (TextView) view.findViewById(R.id.name);
                if (textView != null) {
                    i = R.id.start_badge;
                    EmojiTextView emojiTextView = (EmojiTextView) view.findViewById(R.id.start_badge);
                    if (emojiTextView != null) {
                        return new UserInGridBinding((ConstraintLayout) view, avatarView, imageView, textView, emojiTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static UserInGridBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.user_in_grid, (ViewGroup) null, false));
    }
}
