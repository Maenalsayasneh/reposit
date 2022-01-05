package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import h0.e0.a;

public final class FragmentAcknowledgePaymentBinding implements a {
    public final TextView a;
    public final AvatarView b;
    public final TextView c;
    public final MaterialButton d;
    public final TextInputEditText e;
    public final TextView f;

    public FragmentAcknowledgePaymentBinding(ConstraintLayout constraintLayout, TextView textView, AvatarView avatarView, TextView textView2, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView3, TextView textView4) {
        this.a = textView;
        this.b = avatarView;
        this.c = textView2;
        this.d = materialButton;
        this.e = textInputEditText;
        this.f = textView3;
    }

    public static FragmentAcknowledgePaymentBinding bind(View view) {
        int i = R.id.amount_label;
        TextView textView = (TextView) view.findViewById(R.id.amount_label);
        if (textView != null) {
            i = R.id.avatar;
            AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
            if (avatarView != null) {
                i = R.id.name;
                TextView textView2 = (TextView) view.findViewById(R.id.name);
                if (textView2 != null) {
                    i = R.id.send_button;
                    MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.send_button);
                    if (materialButton != null) {
                        i = R.id.text;
                        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.text);
                        if (textInputEditText != null) {
                            i = R.id.text_field_outline;
                            TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.text_field_outline);
                            if (textInputLayout != null) {
                                i = R.id.time_created;
                                TextView textView3 = (TextView) view.findViewById(R.id.time_created);
                                if (textView3 != null) {
                                    i = R.id.title;
                                    TextView textView4 = (TextView) view.findViewById(R.id.title);
                                    if (textView4 != null) {
                                        return new FragmentAcknowledgePaymentBinding((ConstraintLayout) view, textView, avatarView, textView2, materialButton, textInputEditText, textInputLayout, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentAcknowledgePaymentBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_acknowledge_payment, (ViewGroup) null, false));
    }
}
