package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class InterestsHeaderBinding implements a {
    public InterestsHeaderBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, EmojiTextView emojiTextView, TextView textView2) {
    }

    public static InterestsHeaderBinding bind(View view) {
        int i = R.id.description;
        TextView textView = (TextView) view.findViewById(R.id.description);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.topic_added;
            EmojiTextView emojiTextView = (EmojiTextView) view.findViewById(R.id.topic_added);
            if (emojiTextView != null) {
                i = R.id.topic_great_choice;
                TextView textView2 = (TextView) view.findViewById(R.id.topic_great_choice);
                if (textView2 != null) {
                    return new InterestsHeaderBinding(constraintLayout, textView, constraintLayout, emojiTextView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static InterestsHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.interests_header, (ViewGroup) null, false));
    }
}
