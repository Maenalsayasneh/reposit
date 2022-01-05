package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class ListClubAnatomyBinding implements a {
    public final AvatarView a;
    public final TextView b;
    public final TextView c;

    public ListClubAnatomyBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, TextView textView2) {
        this.a = avatarView;
        this.b = textView;
        this.c = textView2;
    }

    public static ListClubAnatomyBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(i);
        if (avatarView != null) {
            i = R.id.name;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.social_proof;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    return new ListClubAnatomyBinding((ConstraintLayout) view, avatarView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ListClubAnatomyBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.list_club_anatomy, (ViewGroup) null, false));
    }
}
