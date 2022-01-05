package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentRaiseHandBinding implements a {
    public final Button a;
    public final Button b;

    public FragmentRaiseHandBinding(ConstraintLayout constraintLayout, TextView textView, Button button, Button button2, ImageView imageView, TextView textView2) {
        this.a = button;
        this.b = button2;
    }

    public static FragmentRaiseHandBinding bind(View view) {
        int i = R.id.description;
        TextView textView = (TextView) view.findViewById(R.id.description);
        if (textView != null) {
            i = R.id.never_mind_button;
            Button button = (Button) view.findViewById(R.id.never_mind_button);
            if (button != null) {
                i = R.id.raise_hand_button;
                Button button2 = (Button) view.findViewById(R.id.raise_hand_button);
                if (button2 != null) {
                    i = R.id.raise_hand_icon;
                    ImageView imageView = (ImageView) view.findViewById(R.id.raise_hand_icon);
                    if (imageView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) view.findViewById(R.id.title);
                        if (textView2 != null) {
                            return new FragmentRaiseHandBinding((ConstraintLayout) view, textView, button, button2, imageView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentRaiseHandBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_raise_hand, (ViewGroup) null, false));
    }
}
