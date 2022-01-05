package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentHalfWelcomeNewClubBinding implements a {
    public final AvatarView a;
    public final Button b;

    public FragmentHalfWelcomeNewClubBinding(ConstraintLayout constraintLayout, AvatarView avatarView, TextView textView, TextView textView2, BottomSheetGrabHandleBinding bottomSheetGrabHandleBinding, Button button, EmojiTextView emojiTextView) {
        this.a = avatarView;
        this.b = button;
    }

    public static FragmentHalfWelcomeNewClubBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.club_description;
            TextView textView = (TextView) view.findViewById(R.id.club_description);
            if (textView != null) {
                i = R.id.club_welcome;
                TextView textView2 = (TextView) view.findViewById(R.id.club_welcome);
                if (textView2 != null) {
                    i = R.id.grab_handle;
                    View findViewById = view.findViewById(R.id.grab_handle);
                    if (findViewById != null) {
                        BottomSheetGrabHandleBinding bind = BottomSheetGrabHandleBinding.bind(findViewById);
                        i = R.id.schedule_button;
                        Button button = (Button) view.findViewById(R.id.schedule_button);
                        if (button != null) {
                            i = R.id.start_badge;
                            EmojiTextView emojiTextView = (EmojiTextView) view.findViewById(R.id.start_badge);
                            if (emojiTextView != null) {
                                return new FragmentHalfWelcomeNewClubBinding((ConstraintLayout) view, avatarView, textView, textView2, bind, button, emojiTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHalfWelcomeNewClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_half_welcome_new_club, (ViewGroup) null, false));
    }
}
