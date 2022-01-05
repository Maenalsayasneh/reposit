package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class InvitePhoneItemBinding implements a {
    public final Button a;
    public final TextView b;

    public InvitePhoneItemBinding(ConstraintLayout constraintLayout, AvatarView avatarView, ImageView imageView, Button button, TextView textView) {
        this.a = button;
        this.b = textView;
    }

    public static InvitePhoneItemBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.avatar_icon;
            ImageView imageView = (ImageView) view.findViewById(R.id.avatar_icon);
            if (imageView != null) {
                i = R.id.invite_button;
                Button button = (Button) view.findViewById(R.id.invite_button);
                if (button != null) {
                    i = R.id.phone;
                    TextView textView = (TextView) view.findViewById(R.id.phone);
                    if (textView != null) {
                        return new InvitePhoneItemBinding((ConstraintLayout) view, avatarView, imageView, button, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static InvitePhoneItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.invite_phone_item, (ViewGroup) null, false));
    }
}
