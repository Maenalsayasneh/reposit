package com.clubhouse.android.databinding;

import android.view.View;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FacepileBinding implements a {
    public final View a;
    public final AvatarView b;
    public final AvatarView c;
    public final AvatarView d;

    public FacepileBinding(View view, AvatarView avatarView, AvatarView avatarView2, AvatarView avatarView3) {
        this.a = view;
        this.b = avatarView;
        this.c = avatarView2;
        this.d = avatarView3;
    }

    public static FacepileBinding bind(View view) {
        int i = R.id.face_1;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.face_1);
        if (avatarView != null) {
            i = R.id.face_2;
            AvatarView avatarView2 = (AvatarView) view.findViewById(R.id.face_2);
            if (avatarView2 != null) {
                i = R.id.face_3;
                AvatarView avatarView3 = (AvatarView) view.findViewById(R.id.face_3);
                if (avatarView3 != null) {
                    return new FacepileBinding(view, avatarView, avatarView2, avatarView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
