package com.clubhouse.backchannel.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.ui.common.TightTextView;
import com.clubhouse.backchannel.R;
import com.google.android.material.card.MaterialCardView;
import h0.e0.a;

public final class ChatMessageBinding implements a {
    public final View a;
    public final AvatarView b;
    public final MaterialCardView c;
    public final TightTextView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;

    public ChatMessageBinding(View view, AvatarView avatarView, MaterialCardView materialCardView, Barrier barrier, TightTextView tightTextView, TextView textView, TextView textView2, ImageView imageView) {
        this.a = view;
        this.b = avatarView;
        this.c = materialCardView;
        this.d = tightTextView;
        this.e = textView;
        this.f = textView2;
        this.g = imageView;
    }

    public static ChatMessageBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(i);
        if (avatarView != null) {
            i = R.id.chat_background;
            MaterialCardView materialCardView = (MaterialCardView) view.findViewById(i);
            if (materialCardView != null) {
                i = R.id.message_barrier;
                Barrier barrier = (Barrier) view.findViewById(i);
                if (barrier != null) {
                    i = R.id.message_body;
                    TightTextView tightTextView = (TightTextView) view.findViewById(i);
                    if (tightTextView != null) {
                        i = R.id.name;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            i = R.id.not_delivered;
                            TextView textView2 = (TextView) view.findViewById(i);
                            if (textView2 != null) {
                                i = R.id.retry;
                                ImageView imageView = (ImageView) view.findViewById(i);
                                if (imageView != null) {
                                    return new ChatMessageBinding(view, avatarView, materialCardView, barrier, tightTextView, textView, textView2, imageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
