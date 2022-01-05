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

public final class RaisedHandsUserItemBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final EmojiTextView f;

    public RaisedHandsUserItemBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, ImageView imageView, TextView textView2, EmojiTextView emojiTextView) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
        this.d = imageView;
        this.e = textView2;
        this.f = emojiTextView;
    }

    public static RaisedHandsUserItemBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.bio;
            TextView textView = (TextView) view.findViewById(R.id.bio);
            if (textView != null) {
                i = R.id.invite_button;
                ImageView imageView = (ImageView) view.findViewById(R.id.invite_button);
                if (imageView != null) {
                    i = R.id.name;
                    TextView textView2 = (TextView) view.findViewById(R.id.name);
                    if (textView2 != null) {
                        i = R.id.start_badge;
                        EmojiTextView emojiTextView = (EmojiTextView) view.findViewById(R.id.start_badge);
                        if (emojiTextView != null) {
                            return new RaisedHandsUserItemBinding((ConstraintLayout) view, avatarView, textView, imageView, textView2, emojiTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RaisedHandsUserItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.raised_hands_user_item, (ViewGroup) null, false));
    }
}
