package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clubhouse.backchannel.R;
import h0.e0.a;
import java.util.Objects;

public final class ChatAddMemberBinding implements a {
    public ChatAddMemberBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
    }

    public static ChatAddMemberBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        LinearLayout linearLayout = (LinearLayout) view;
        return new ChatAddMemberBinding(linearLayout, linearLayout);
    }

    public static ChatAddMemberBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.chat_add_member, (ViewGroup) null, false));
    }
}
