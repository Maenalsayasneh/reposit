package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class ViewChannelMemberBinding implements a {
    public ViewChannelMemberBinding(TextView textView) {
    }

    public static ViewChannelMemberBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new ViewChannelMemberBinding((TextView) view);
    }

    public static ViewChannelMemberBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.view_channel_member, (ViewGroup) null, false));
    }
}
