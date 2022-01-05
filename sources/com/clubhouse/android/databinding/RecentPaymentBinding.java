package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import com.google.android.material.button.MaterialButton;
import h0.e0.a;

public final class RecentPaymentBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;
    public final AvatarView c;
    public final TextView d;
    public final MaterialButton e;
    public final TextView f;

    public RecentPaymentBinding(ConstraintLayout constraintLayout, TextView textView, AvatarView avatarView, TextView textView2, MaterialButton materialButton, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = avatarView;
        this.d = textView2;
        this.e = materialButton;
        this.f = textView3;
    }

    public static RecentPaymentBinding bind(View view) {
        int i = R.id.amount_label;
        TextView textView = (TextView) view.findViewById(R.id.amount_label);
        if (textView != null) {
            i = R.id.avatar;
            AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
            if (avatarView != null) {
                i = R.id.name;
                TextView textView2 = (TextView) view.findViewById(R.id.name);
                if (textView2 != null) {
                    i = R.id.thanks_button;
                    MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.thanks_button);
                    if (materialButton != null) {
                        i = R.id.time_created;
                        TextView textView3 = (TextView) view.findViewById(R.id.time_created);
                        if (textView3 != null) {
                            return new RecentPaymentBinding((ConstraintLayout) view, textView, avatarView, textView2, materialButton, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RecentPaymentBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.recent_payment, (ViewGroup) null, false));
    }
}
