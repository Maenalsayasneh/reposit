package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ViewClubInProfileBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final ImageView c;

    public ViewClubInProfileBinding(ConstraintLayout constraintLayout, AvatarView avatarView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = imageView;
    }

    public static ViewClubInProfileBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.end_badge;
            ImageView imageView = (ImageView) view.findViewById(R.id.end_badge);
            if (imageView != null) {
                return new ViewClubInProfileBinding((ConstraintLayout) view, avatarView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewClubInProfileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.view_club_in_profile, (ViewGroup) null, false));
    }
}
