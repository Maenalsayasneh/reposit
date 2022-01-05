package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class FeedInvitePromptBinding implements a {
    public final CardView a;

    public FeedInvitePromptBinding(CardView cardView) {
        this.a = cardView;
    }

    public static FeedInvitePromptBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new FeedInvitePromptBinding((CardView) view);
    }

    public static FeedInvitePromptBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.feed_invite_prompt, (ViewGroup) null, false));
    }
}
