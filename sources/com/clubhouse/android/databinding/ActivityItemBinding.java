package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ActivityItemBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;
    public final TextView d;

    public ActivityItemBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
        this.d = textView2;
    }

    public static ActivityItemBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.message;
            TextView textView = (TextView) view.findViewById(R.id.message);
            if (textView != null) {
                i = R.id.time_created;
                TextView textView2 = (TextView) view.findViewById(R.id.time_created);
                if (textView2 != null) {
                    return new ActivityItemBinding((ConstraintLayout) view, avatarView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_item, (ViewGroup) null, false));
    }
}
