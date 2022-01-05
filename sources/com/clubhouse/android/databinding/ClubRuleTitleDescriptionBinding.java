package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubRuleTitleDescriptionBinding implements a {
    public final EditText a;
    public final TextView b;
    public final EditText c;

    public ClubRuleTitleDescriptionBinding(CardView cardView, EditText editText, TextView textView, EditText editText2) {
        this.a = editText;
        this.b = textView;
        this.c = editText2;
    }

    public static ClubRuleTitleDescriptionBinding bind(View view) {
        int i = R.id.description;
        EditText editText = (EditText) view.findViewById(R.id.description);
        if (editText != null) {
            i = R.id.remaining;
            TextView textView = (TextView) view.findViewById(R.id.remaining);
            if (textView != null) {
                i = R.id.title;
                EditText editText2 = (EditText) view.findViewById(R.id.title);
                if (editText2 != null) {
                    return new ClubRuleTitleDescriptionBinding((CardView) view, editText, textView, editText2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubRuleTitleDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_rule_title_description, (ViewGroup) null, false));
    }
}
