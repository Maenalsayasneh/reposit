package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class ClubTopicsBinding implements a {
    public final EmojiTextView a;

    public ClubTopicsBinding(EmojiTextView emojiTextView, EmojiTextView emojiTextView2) {
        this.a = emojiTextView2;
    }

    public static ClubTopicsBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        EmojiTextView emojiTextView = (EmojiTextView) view;
        return new ClubTopicsBinding(emojiTextView, emojiTextView);
    }

    public static ClubTopicsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_topics, (ViewGroup) null, false));
    }
}
