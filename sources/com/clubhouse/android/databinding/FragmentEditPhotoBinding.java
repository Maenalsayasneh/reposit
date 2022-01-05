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

public final class FragmentEditPhotoBinding implements a {
    public final AvatarView a;
    public final Button b;
    public final ProgressBar c;

    public FragmentEditPhotoBinding(ConstraintLayout constraintLayout, AvatarView avatarView, Button button, ProgressBar progressBar, TextView textView) {
        this.a = avatarView;
        this.b = button;
        this.c = progressBar;
    }

    public static FragmentEditPhotoBinding bind(View view) {
        int i = R.id.add_photo_button;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.add_photo_button);
        if (avatarView != null) {
            i = R.id.done;
            Button button = (Button) view.findViewById(R.id.done);
            if (button != null) {
                i = R.id.loading;
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                if (progressBar != null) {
                    i = R.id.title;
                    TextView textView = (TextView) view.findViewById(R.id.title);
                    if (textView != null) {
                        return new FragmentEditPhotoBinding((ConstraintLayout) view, avatarView, button, progressBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentEditPhotoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_edit_photo, (ViewGroup) null, false));
    }
}
