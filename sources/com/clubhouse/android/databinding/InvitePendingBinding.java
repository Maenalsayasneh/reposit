package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class InvitePendingBinding implements a {
    public final Button a;

    public InvitePendingBinding(FrameLayout frameLayout, Button button) {
        this.a = button;
    }

    public static InvitePendingBinding bind(View view) {
        Button button = (Button) view.findViewById(R.id.pending_invites_button);
        if (button != null) {
            return new InvitePendingBinding((FrameLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.pending_invites_button)));
    }

    public static InvitePendingBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.invite_pending, (ViewGroup) null, false));
    }
}
