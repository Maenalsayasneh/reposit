package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ViewChannelBinding implements a {
    public final CardView a;
    public final ImageView b;
    public final TextView c;
    public final AvatarView d;
    public final AvatarView e;
    public final TextView f;
    public final LinearLayout g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;

    public ViewChannelBinding(CardView cardView, ImageView imageView, TextView textView, CardView cardView2, AvatarView avatarView, AvatarView avatarView2, FrameLayout frameLayout, TextView textView2, LinearLayout linearLayout, ImageView imageView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = cardView;
        this.b = imageView;
        this.c = textView;
        this.d = avatarView;
        this.e = avatarView2;
        this.f = textView2;
        this.g = linearLayout;
        this.h = imageView2;
        this.i = textView3;
        this.j = textView5;
    }

    public static ViewChannelBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.closed_channel_icon;
        ImageView imageView = (ImageView) view2.findViewById(R.id.closed_channel_icon);
        if (imageView != null) {
            i2 = R.id.club_name;
            TextView textView = (TextView) view2.findViewById(R.id.club_name);
            if (textView != null) {
                CardView cardView = (CardView) view2;
                i2 = R.id.moderator_1;
                AvatarView avatarView = (AvatarView) view2.findViewById(R.id.moderator_1);
                if (avatarView != null) {
                    i2 = R.id.moderator_2;
                    AvatarView avatarView2 = (AvatarView) view2.findViewById(R.id.moderator_2);
                    if (avatarView2 != null) {
                        i2 = R.id.moderators;
                        FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.moderators);
                        if (frameLayout != null) {
                            i2 = R.id.name;
                            TextView textView2 = (TextView) view2.findViewById(R.id.name);
                            if (textView2 != null) {
                                i2 = R.id.names;
                                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.names);
                                if (linearLayout != null) {
                                    i2 = R.id.overflow_icon;
                                    ImageView imageView2 = (ImageView) view2.findViewById(R.id.overflow_icon);
                                    if (imageView2 != null) {
                                        i2 = R.id.stat_all;
                                        TextView textView3 = (TextView) view2.findViewById(R.id.stat_all);
                                        if (textView3 != null) {
                                            i2 = R.id.stat_delimiter;
                                            TextView textView4 = (TextView) view2.findViewById(R.id.stat_delimiter);
                                            if (textView4 != null) {
                                                i2 = R.id.stat_speakers;
                                                TextView textView5 = (TextView) view2.findViewById(R.id.stat_speakers);
                                                if (textView5 != null) {
                                                    return new ViewChannelBinding(cardView, imageView, textView, cardView, avatarView, avatarView2, frameLayout, textView2, linearLayout, imageView2, textView3, textView4, textView5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static ViewChannelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.view_channel, (ViewGroup) null, false));
    }
}
