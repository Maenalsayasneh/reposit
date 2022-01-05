package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class BuddyListUserBinding implements a {
    public final ConstraintLayout a;
    public final Button b;
    public final AvatarView c;
    public final Button d;
    public final ImageView e;
    public final TextView f;
    public final Button g;
    public final Button h;
    public final TextView i;

    public BuddyListUserBinding(ConstraintLayout constraintLayout, Button button, AvatarView avatarView, Barrier barrier, Button button2, ImageView imageView, TextView textView, Button button3, Button button4, TextView textView2) {
        this.a = constraintLayout;
        this.b = button;
        this.c = avatarView;
        this.d = button2;
        this.e = imageView;
        this.f = textView;
        this.g = button3;
        this.h = button4;
        this.i = textView2;
    }

    public static BuddyListUserBinding bind(View view) {
        int i2 = R.id.accept_wave;
        Button button = (Button) view.findViewById(R.id.accept_wave);
        if (button != null) {
            i2 = R.id.avatar;
            AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
            if (avatarView != null) {
                i2 = R.id.button_barrier;
                Barrier barrier = (Barrier) view.findViewById(R.id.button_barrier);
                if (barrier != null) {
                    i2 = R.id.cancel_wave;
                    Button button2 = (Button) view.findViewById(R.id.cancel_wave);
                    if (button2 != null) {
                        i2 = R.id.end_badge;
                        ImageView imageView = (ImageView) view.findViewById(R.id.end_badge);
                        if (imageView != null) {
                            i2 = R.id.name;
                            TextView textView = (TextView) view.findViewById(R.id.name);
                            if (textView != null) {
                                i2 = R.id.send_wave;
                                Button button3 = (Button) view.findViewById(R.id.send_wave);
                                if (button3 != null) {
                                    i2 = R.id.start_room;
                                    Button button4 = (Button) view.findViewById(R.id.start_room);
                                    if (button4 != null) {
                                        i2 = R.id.status;
                                        TextView textView2 = (TextView) view.findViewById(R.id.status);
                                        if (textView2 != null) {
                                            return new BuddyListUserBinding((ConstraintLayout) view, button, avatarView, barrier, button2, imageView, textView, button3, button4, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static BuddyListUserBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.buddy_list_user, (ViewGroup) null, false));
    }
}
