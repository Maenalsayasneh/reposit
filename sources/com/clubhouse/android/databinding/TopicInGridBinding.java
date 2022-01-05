package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji.widget.EmojiButton;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class TopicInGridBinding implements a {
    public final EmojiButton a;

    public TopicInGridBinding(EmojiButton emojiButton, EmojiButton emojiButton2) {
        this.a = emojiButton2;
    }

    public static TopicInGridBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        EmojiButton emojiButton = (EmojiButton) view;
        return new TopicInGridBinding(emojiButton, emojiButton);
    }

    public static TopicInGridBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.topic_in_grid, (ViewGroup) null, false));
    }
}
