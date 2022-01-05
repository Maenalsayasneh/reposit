package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class EventUserMediumBinding implements a {
    public final AvatarView a;

    public EventUserMediumBinding(AvatarView avatarView, AvatarView avatarView2) {
        this.a = avatarView2;
    }

    public static EventUserMediumBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        AvatarView avatarView = (AvatarView) view;
        return new EventUserMediumBinding(avatarView, avatarView);
    }

    public static EventUserMediumBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.event_user_medium, (ViewGroup) null, false));
    }
}
