package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class ListUserAnatomyBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;
    public final TextView d;

    public ListUserAnatomyBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
        this.d = textView2;
    }

    public static ListUserAnatomyBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(i);
        if (avatarView != null) {
            i = R.id.bio;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.name;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    return new ListUserAnatomyBinding((ConstraintLayout) view, avatarView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ListUserAnatomyBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.list_user_anatomy, (ViewGroup) null, false));
    }
}
