package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.TriStateButton;
import com.clubhouse.app.R;
import com.clubhouse.core.ui.databinding.ListUserAnatomyBinding;
import h0.e0.a;

public final class ClubMemberBinding implements a {
    public final ConstraintLayout a;
    public final TriStateButton b;
    public final Button c;
    public final ListUserAnatomyBinding d;

    public ClubMemberBinding(ConstraintLayout constraintLayout, Barrier barrier, TriStateButton triStateButton, Button button, ListUserAnatomyBinding listUserAnatomyBinding) {
        this.a = constraintLayout;
        this.b = triStateButton;
        this.c = button;
        this.d = listUserAnatomyBinding;
    }

    public static ClubMemberBinding bind(View view) {
        int i = R.id.button_barrier;
        Barrier barrier = (Barrier) view.findViewById(R.id.button_barrier);
        if (barrier != null) {
            i = R.id.follow_button;
            TriStateButton triStateButton = (TriStateButton) view.findViewById(R.id.follow_button);
            if (triStateButton != null) {
                i = R.id.role_button;
                Button button = (Button) view.findViewById(R.id.role_button);
                if (button != null) {
                    i = R.id.user;
                    View findViewById = view.findViewById(R.id.user);
                    if (findViewById != null) {
                        return new ClubMemberBinding((ConstraintLayout) view, barrier, triStateButton, button, ListUserAnatomyBinding.bind(findViewById));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubMemberBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_member, (ViewGroup) null, false));
    }
}
