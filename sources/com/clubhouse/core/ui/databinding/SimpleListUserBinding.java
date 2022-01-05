package com.clubhouse.core.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.core.ui.R;
import h0.e0.a;

public final class SimpleListUserBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;
    public final ImageView d;

    public SimpleListUserBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
        this.d = imageView;
    }

    public static SimpleListUserBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(i);
        if (avatarView != null) {
            i = R.id.name;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.select_button;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    return new SimpleListUserBinding((ConstraintLayout) view, avatarView, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SimpleListUserBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.simple_list_user, (ViewGroup) null, false));
    }
}
