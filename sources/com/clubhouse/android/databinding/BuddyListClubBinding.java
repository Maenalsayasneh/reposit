package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class BuddyListClubBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final TextView c;
    public final EpoxyRecyclerView d;
    public final Button e;
    public final TextView f;

    public BuddyListClubBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, EpoxyRecyclerView epoxyRecyclerView, Button button, TextView textView2) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = textView;
        this.d = epoxyRecyclerView;
        this.e = button;
        this.f = textView2;
    }

    public static BuddyListClubBinding bind(View view) {
        int i = R.id.club_avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.club_avatar);
        if (avatarView != null) {
            i = R.id.club_name;
            TextView textView = (TextView) view.findViewById(R.id.club_name);
            if (textView != null) {
                i = R.id.member_list;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.member_list);
                if (epoxyRecyclerView != null) {
                    i = R.id.start_room;
                    Button button = (Button) view.findViewById(R.id.start_room);
                    if (button != null) {
                        i = R.id.status;
                        TextView textView2 = (TextView) view.findViewById(R.id.status);
                        if (textView2 != null) {
                            return new BuddyListClubBinding((ConstraintLayout) view, avatarView, textView, epoxyRecyclerView, button, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BuddyListClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.buddy_list_club, (ViewGroup) null, false));
    }
}
