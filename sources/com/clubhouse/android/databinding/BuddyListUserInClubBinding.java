package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class BuddyListUserInClubBinding implements a {
    public final AvatarView a;
    public final AvatarView b;

    public BuddyListUserInClubBinding(AvatarView avatarView, AvatarView avatarView2) {
        this.a = avatarView;
        this.b = avatarView2;
    }

    public static BuddyListUserInClubBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        AvatarView avatarView = (AvatarView) view;
        return new BuddyListUserInClubBinding(avatarView, avatarView);
    }

    public static BuddyListUserInClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.buddy_list_user_in_club, (ViewGroup) null, false));
    }
}
