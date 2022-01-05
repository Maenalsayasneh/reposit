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

public final class ActionableActivityItemBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;
    public final Button d;
    public final Button e;
    public final TextView f;

    public ActionableActivityItemBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, Button button, Button button2, TextView textView2) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
        this.d = button;
        this.e = button2;
        this.f = textView2;
    }

    public static ActionableActivityItemBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.message;
            TextView textView = (TextView) view.findViewById(R.id.message);
            if (textView != null) {
                i = R.id.primary_button;
                Button button = (Button) view.findViewById(R.id.primary_button);
                if (button != null) {
                    i = R.id.secondary_button;
                    Button button2 = (Button) view.findViewById(R.id.secondary_button);
                    if (button2 != null) {
                        i = R.id.time_created;
                        TextView textView2 = (TextView) view.findViewById(R.id.time_created);
                        if (textView2 != null) {
                            return new ActionableActivityItemBinding((ConstraintLayout) view, avatarView, textView, button, button2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActionableActivityItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.actionable_activity_item, (ViewGroup) null, false));
    }
}
