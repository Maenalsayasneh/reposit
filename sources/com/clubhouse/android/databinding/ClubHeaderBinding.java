package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubHeaderBinding implements a {
    public final AvatarView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public ClubHeaderBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, TextView textView2, TextView textView3) {
        this.a = avatarView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    public static ClubHeaderBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.club_member_count;
            TextView textView = (TextView) view.findViewById(R.id.club_member_count);
            if (textView != null) {
                i = R.id.name;
                TextView textView2 = (TextView) view.findViewById(R.id.name);
                if (textView2 != null) {
                    i = R.id.rules;
                    TextView textView3 = (TextView) view.findViewById(R.id.rules);
                    if (textView3 != null) {
                        return new ClubHeaderBinding((ConstraintLayout) view, avatarView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_header, (ViewGroup) null, false));
    }
}
