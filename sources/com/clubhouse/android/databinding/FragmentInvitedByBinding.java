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

public final class FragmentInvitedByBinding implements a {
    public final AvatarView a;
    public final TextView b;
    public final Button c;
    public final TextView d;

    public FragmentInvitedByBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, Button button, TextView textView2) {
        this.a = avatarView;
        this.b = textView;
        this.c = button;
        this.d = textView2;
    }

    public static FragmentInvitedByBinding bind(View view) {
        int i = R.id.inviter_image;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.inviter_image);
        if (avatarView != null) {
            i = R.id.inviter_name;
            TextView textView = (TextView) view.findViewById(R.id.inviter_name);
            if (textView != null) {
                i = R.id.next_button;
                Button button = (Button) view.findViewById(R.id.next_button);
                if (button != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) view.findViewById(R.id.title);
                    if (textView2 != null) {
                        return new FragmentInvitedByBinding((ConstraintLayout) view, avatarView, textView, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentInvitedByBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_invited_by, (ViewGroup) null, false));
    }
}
