package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubNominationItemBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final AvatarView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final ImageView i;

    public ClubNominationItemBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, AvatarView avatarView, Barrier barrier, TextView textView2, TextView textView3, TextView textView4, ImageView imageView2, ImageView imageView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = avatarView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = imageView2;
        this.i = imageView3;
    }

    public static ClubNominationItemBinding bind(View view) {
        int i2 = R.id.approve_button;
        ImageView imageView = (ImageView) view.findViewById(R.id.approve_button);
        if (imageView != null) {
            i2 = R.id.approved;
            TextView textView = (TextView) view.findViewById(R.id.approved);
            if (textView != null) {
                i2 = R.id.avatar;
                AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
                if (avatarView != null) {
                    i2 = R.id.end_barrier;
                    Barrier barrier = (Barrier) view.findViewById(R.id.end_barrier);
                    if (barrier != null) {
                        i2 = R.id.name;
                        TextView textView2 = (TextView) view.findViewById(R.id.name);
                        if (textView2 != null) {
                            i2 = R.id.nominated_by;
                            TextView textView3 = (TextView) view.findViewById(R.id.nominated_by);
                            if (textView3 != null) {
                                i2 = R.id.reason;
                                TextView textView4 = (TextView) view.findViewById(R.id.reason);
                                if (textView4 != null) {
                                    i2 = R.id.reject_button;
                                    ImageView imageView2 = (ImageView) view.findViewById(R.id.reject_button);
                                    if (imageView2 != null) {
                                        i2 = R.id.rejected;
                                        ImageView imageView3 = (ImageView) view.findViewById(R.id.rejected);
                                        if (imageView3 != null) {
                                            return new ClubNominationItemBinding((ConstraintLayout) view, imageView, textView, avatarView, barrier, textView2, textView3, textView4, imageView2, imageView3);
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

    public static ClubNominationItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_nomination_item, (ViewGroup) null, false));
    }
}
