package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentEditDescriptionBinding implements a {
    public final EditText a;
    public final Button b;
    public final TextView c;

    public FragmentEditDescriptionBinding(ConstraintLayout constraintLayout, EditText editText, CardView cardView, Button button, TextView textView) {
        this.a = editText;
        this.b = button;
        this.c = textView;
    }

    public static FragmentEditDescriptionBinding bind(View view) {
        int i = R.id.description;
        EditText editText = (EditText) view.findViewById(R.id.description);
        if (editText != null) {
            i = R.id.description_card;
            CardView cardView = (CardView) view.findViewById(R.id.description_card);
            if (cardView != null) {
                i = R.id.done;
                Button button = (Button) view.findViewById(R.id.done);
                if (button != null) {
                    i = R.id.title;
                    TextView textView = (TextView) view.findViewById(R.id.title);
                    if (textView != null) {
                        return new FragmentEditDescriptionBinding((ConstraintLayout) view, editText, cardView, button, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentEditDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_edit_description, (ViewGroup) null, false));
    }
}
