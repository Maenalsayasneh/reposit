package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubNominationsPreviewBinding implements a {
    public final ConstraintLayout a;
    public final Button b;
    public final AvatarView c;
    public final AvatarView d;
    public final AvatarView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public ClubNominationsPreviewBinding(ConstraintLayout constraintLayout, Button button, AvatarView avatarView, AvatarView avatarView2, AvatarView avatarView3, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = button;
        this.c = avatarView;
        this.d = avatarView2;
        this.e = avatarView3;
        this.f = textView;
        this.g = textView2;
        this.h = textView3;
    }

    public static ClubNominationsPreviewBinding bind(View view) {
        int i = R.id.approve_button;
        Button button = (Button) view.findViewById(R.id.approve_button);
        if (button != null) {
            i = R.id.avatar1;
            AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar1);
            if (avatarView != null) {
                i = R.id.avatar2;
                AvatarView avatarView2 = (AvatarView) view.findViewById(R.id.avatar2);
                if (avatarView2 != null) {
                    i = R.id.avatar3;
                    AvatarView avatarView3 = (AvatarView) view.findViewById(R.id.avatar3);
                    if (avatarView3 != null) {
                        i = R.id.name1;
                        TextView textView = (TextView) view.findViewById(R.id.name1);
                        if (textView != null) {
                            i = R.id.name2;
                            TextView textView2 = (TextView) view.findViewById(R.id.name2);
                            if (textView2 != null) {
                                i = R.id.name3;
                                TextView textView3 = (TextView) view.findViewById(R.id.name3);
                                if (textView3 != null) {
                                    return new ClubNominationsPreviewBinding((ConstraintLayout) view, button, avatarView, avatarView2, avatarView3, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubNominationsPreviewBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_nominations_preview, (ViewGroup) null, false));
    }
}
