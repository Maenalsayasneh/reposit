package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentProfilePhotoBinding implements a {
    public final AvatarView a;
    public final ImageView b;

    public FragmentProfilePhotoBinding(ConstraintLayout constraintLayout, AvatarView avatarView, ImageView imageView) {
        this.a = avatarView;
        this.b = imageView;
    }

    public static FragmentProfilePhotoBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.close;
            ImageView imageView = (ImageView) view.findViewById(R.id.close);
            if (imageView != null) {
                return new FragmentProfilePhotoBinding((ConstraintLayout) view, avatarView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentProfilePhotoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_profile_photo, (ViewGroup) null, false));
    }
}
