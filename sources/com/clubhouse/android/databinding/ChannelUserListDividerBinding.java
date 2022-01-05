package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ChannelUserListDividerBinding implements a {
    public final TextView a;

    public ChannelUserListDividerBinding(FrameLayout frameLayout, TextView textView) {
        this.a = textView;
    }

    public static ChannelUserListDividerBinding bind(View view) {
        TextView textView = (TextView) view.findViewById(R.id.header_text);
        if (textView != null) {
            return new ChannelUserListDividerBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.header_text)));
    }

    public static ChannelUserListDividerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.channel_user_list_divider, (ViewGroup) null, false));
    }
}
