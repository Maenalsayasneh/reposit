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

public final class InviteItemBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;
    public final Button d;
    public final TextView e;
    public final TextView f;

    public InviteItemBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, Button button, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
        this.d = button;
        this.e = textView2;
        this.f = textView3;
    }

    public static InviteItemBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.friends_count;
            TextView textView = (TextView) view.findViewById(R.id.friends_count);
            if (textView != null) {
                i = R.id.invite_button;
                Button button = (Button) view.findViewById(R.id.invite_button);
                if (button != null) {
                    i = R.id.joined;
                    TextView textView2 = (TextView) view.findViewById(R.id.joined);
                    if (textView2 != null) {
                        i = R.id.name;
                        TextView textView3 = (TextView) view.findViewById(R.id.name);
                        if (textView3 != null) {
                            return new InviteItemBinding((ConstraintLayout) view, avatarView, textView, button, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static InviteItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.invite_item, (ViewGroup) null, false));
    }
}
