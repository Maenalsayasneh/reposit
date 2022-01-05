package com.clubhouse.backchannel.databinding;

import android.view.View;
import android.widget.TextView;
import com.clubhouse.backchannel.R;
import h0.e0.a;

public final class SystemMessageBinding implements a {
    public final View a;
    public final TextView b;

    public SystemMessageBinding(View view, TextView textView) {
        this.a = view;
        this.b = textView;
    }

    public static SystemMessageBinding bind(View view) {
        int i = R.id.message;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            return new SystemMessageBinding(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
