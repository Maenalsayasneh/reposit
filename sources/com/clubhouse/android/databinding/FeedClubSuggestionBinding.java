package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FeedClubSuggestionBinding implements a {
    public final CardView a;
    public final AvatarView b;
    public final TextView c;
    public final ImageView d;
    public final Button e;
    public final TextView f;
    public final FeedReasonBinding g;

    public FeedClubSuggestionBinding(CardView cardView, AvatarView avatarView, TextView textView, ImageView imageView, Button button, TextView textView2, FeedReasonBinding feedReasonBinding) {
        this.a = cardView;
        this.b = avatarView;
        this.c = textView;
        this.d = imageView;
        this.e = button;
        this.f = textView2;
        this.g = feedReasonBinding;
    }

    public static FeedClubSuggestionBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.description;
            TextView textView = (TextView) view.findViewById(R.id.description);
            if (textView != null) {
                i = R.id.dismiss_button;
                ImageView imageView = (ImageView) view.findViewById(R.id.dismiss_button);
                if (imageView != null) {
                    i = R.id.join_button;
                    Button button = (Button) view.findViewById(R.id.join_button);
                    if (button != null) {
                        i = R.id.name;
                        TextView textView2 = (TextView) view.findViewById(R.id.name);
                        if (textView2 != null) {
                            i = R.id.reason_container;
                            View findViewById = view.findViewById(R.id.reason_container);
                            if (findViewById != null) {
                                return new FeedClubSuggestionBinding((CardView) view, avatarView, textView, imageView, button, textView2, FeedReasonBinding.bind(findViewById));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FeedClubSuggestionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.feed_club_suggestion, (ViewGroup) null, false));
    }
}
