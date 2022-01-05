package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentAddPhotoBinding implements a {
    public final AvatarView a;
    public final ProgressBar b;
    public final Button c;
    public final Button d;

    public FragmentAddPhotoBinding(ConstraintLayout constraintLayout, AvatarView avatarView, ProgressBar progressBar, Button button, Button button2, TextView textView) {
        this.a = avatarView;
        this.b = progressBar;
        this.c = button;
        this.d = button2;
    }

    public static FragmentAddPhotoBinding bind(View view) {
        int i = R.id.add_photo_button;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.add_photo_button);
        if (avatarView != null) {
            i = R.id.loading;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
            if (progressBar != null) {
                i = R.id.next_button;
                Button button = (Button) view.findViewById(R.id.next_button);
                if (button != null) {
                    i = R.id.skip_button;
                    Button button2 = (Button) view.findViewById(R.id.skip_button);
                    if (button2 != null) {
                        i = R.id.title;
                        TextView textView = (TextView) view.findViewById(R.id.title);
                        if (textView != null) {
                            return new FragmentAddPhotoBinding((ConstraintLayout) view, avatarView, progressBar, button, button2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentAddPhotoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_add_photo, (ViewGroup) null, false));
    }
}
