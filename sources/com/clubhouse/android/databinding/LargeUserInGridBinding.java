package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.ui.channels.views.IndicatorView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class LargeUserInGridBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final ImageView c;
    public final ImageView d;
    public final IndicatorView e;
    public final TextView f;
    public final EmojiTextView g;

    public LargeUserInGridBinding(ConstraintLayout constraintLayout, AvatarView avatarView, ImageView imageView, ImageView imageView2, IndicatorView indicatorView, TextView textView, EmojiTextView emojiTextView) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = imageView;
        this.d = imageView2;
        this.e = indicatorView;
        this.f = textView;
        this.g = emojiTextView;
    }

    public static LargeUserInGridBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.check;
            ImageView imageView = (ImageView) view.findViewById(R.id.check);
            if (imageView != null) {
                i = R.id.end_badge;
                ImageView imageView2 = (ImageView) view.findViewById(R.id.end_badge);
                if (imageView2 != null) {
                    i = R.id.indicator_view;
                    IndicatorView indicatorView = (IndicatorView) view.findViewById(R.id.indicator_view);
                    if (indicatorView != null) {
                        i = R.id.name;
                        TextView textView = (TextView) view.findViewById(R.id.name);
                        if (textView != null) {
                            i = R.id.start_badge;
                            EmojiTextView emojiTextView = (EmojiTextView) view.findViewById(R.id.start_badge);
                            if (emojiTextView != null) {
                                return new LargeUserInGridBinding((ConstraintLayout) view, avatarView, imageView, imageView2, indicatorView, textView, emojiTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LargeUserInGridBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.large_user_in_grid, (ViewGroup) null, false));
    }
}
