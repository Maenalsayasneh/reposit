package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubInviteCardBinding implements a {
    public final Button a;
    public final TextView b;

    public ClubInviteCardBinding(CardView cardView, Button button, TextView textView) {
        this.a = button;
        this.b = textView;
    }

    public static ClubInviteCardBinding bind(View view) {
        int i = R.id.share_button;
        Button button = (Button) view.findViewById(R.id.share_button);
        if (button != null) {
            i = R.id.title;
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (textView != null) {
                return new ClubInviteCardBinding((CardView) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubInviteCardBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_invite_card, (ViewGroup) null, false));
    }
}
