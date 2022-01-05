package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ViewFollowSuggestionProfileBinding implements a {
    public final AvatarView a;
    public final TextView b;
    public final Button c;
    public final TextView d;
    public final Button e;

    public ViewFollowSuggestionProfileBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, Button button, TextView textView2, Button button2) {
        this.a = avatarView;
        this.b = textView;
        this.c = button;
        this.d = textView2;
        this.e = button2;
    }

    public static ViewFollowSuggestionProfileBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.bio;
            TextView textView = (TextView) view.findViewById(R.id.bio);
            if (textView != null) {
                i = R.id.follow;
                Button button = (Button) view.findViewById(R.id.follow);
                if (button != null) {
                    i = R.id.name;
                    TextView textView2 = (TextView) view.findViewById(R.id.name);
                    if (textView2 != null) {
                        i = R.id.remove;
                        Button button2 = (Button) view.findViewById(R.id.remove);
                        if (button2 != null) {
                            return new ViewFollowSuggestionProfileBinding((ConstraintLayout) view, avatarView, textView, button, textView2, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewFollowSuggestionProfileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.view_follow_suggestion_profile, (ViewGroup) null, false));
    }
}
