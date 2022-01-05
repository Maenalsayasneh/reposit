package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji.widget.EmojiButton;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class TopicItemBinding implements a {
    public TopicItemBinding(EmojiButton emojiButton, EmojiButton emojiButton2) {
    }

    public static TopicItemBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        EmojiButton emojiButton = (EmojiButton) view;
        return new TopicItemBinding(emojiButton, emojiButton);
    }

    public static TopicItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.topic_item, (ViewGroup) null, false));
    }
}
