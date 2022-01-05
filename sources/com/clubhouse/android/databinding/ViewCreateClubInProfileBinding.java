package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class ViewCreateClubInProfileBinding implements a {
    public final AvatarView a;
    public final AvatarView b;

    public ViewCreateClubInProfileBinding(AvatarView avatarView, AvatarView avatarView2) {
        this.a = avatarView;
        this.b = avatarView2;
    }

    public static ViewCreateClubInProfileBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        AvatarView avatarView = (AvatarView) view;
        return new ViewCreateClubInProfileBinding(avatarView, avatarView);
    }

    public static ViewCreateClubInProfileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.view_create_club_in_profile, (ViewGroup) null, false));
    }
}
