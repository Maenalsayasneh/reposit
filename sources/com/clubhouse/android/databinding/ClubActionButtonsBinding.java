package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubActionButtonsBinding implements a {
    public final ConstraintLayout a;
    public final Button b;
    public final Button c;
    public final Button d;
    public final LinearLayout e;
    public final AvatarView f;
    public final TextView g;
    public final Button h;
    public final Button i;
    public final Button j;
    public final Button k;
    public final Button l;

    public ClubActionButtonsBinding(ConstraintLayout constraintLayout, Button button, Button button2, LinearLayout linearLayout, Button button3, LinearLayout linearLayout2, AvatarView avatarView, TextView textView, Button button4, Button button5, Button button6, Button button7, Button button8) {
        this.a = constraintLayout;
        this.b = button;
        this.c = button2;
        this.d = button3;
        this.e = linearLayout2;
        this.f = avatarView;
        this.g = textView;
        this.h = button4;
        this.i = button5;
        this.j = button6;
        this.k = button7;
        this.l = button8;
    }

    public static ClubActionButtonsBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.add_members;
        Button button = (Button) view2.findViewById(R.id.add_members);
        if (button != null) {
            i2 = R.id.apply_to_join;
            Button button2 = (Button) view2.findViewById(R.id.apply_to_join);
            if (button2 != null) {
                i2 = R.id.club_action_button_container;
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.club_action_button_container);
                if (linearLayout != null) {
                    i2 = R.id.invite_members;
                    Button button3 = (Button) view2.findViewById(R.id.invite_members);
                    if (button3 != null) {
                        i2 = R.id.inviter_attribution;
                        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.inviter_attribution);
                        if (linearLayout2 != null) {
                            i2 = R.id.inviter_avatar;
                            AvatarView avatarView = (AvatarView) view2.findViewById(R.id.inviter_avatar);
                            if (avatarView != null) {
                                i2 = R.id.inviter_name_with_message;
                                TextView textView = (TextView) view2.findViewById(R.id.inviter_name_with_message);
                                if (textView != null) {
                                    i2 = R.id.join_button;
                                    Button button4 = (Button) view2.findViewById(R.id.join_button);
                                    if (button4 != null) {
                                        i2 = R.id.join_the_club;
                                        Button button5 = (Button) view2.findViewById(R.id.join_the_club);
                                        if (button5 != null) {
                                            i2 = R.id.member;
                                            Button button6 = (Button) view2.findViewById(R.id.member);
                                            if (button6 != null) {
                                                i2 = R.id.nominate_members;
                                                Button button7 = (Button) view2.findViewById(R.id.nominate_members);
                                                if (button7 != null) {
                                                    i2 = R.id.schedule_room_button;
                                                    Button button8 = (Button) view2.findViewById(R.id.schedule_room_button);
                                                    if (button8 != null) {
                                                        return new ClubActionButtonsBinding((ConstraintLayout) view2, button, button2, linearLayout, button3, linearLayout2, avatarView, textView, button4, button5, button6, button7, button8);
                                                    }
                                                }
                                            }
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

    public static ClubActionButtonsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_action_buttons, (ViewGroup) null, false));
    }
}
