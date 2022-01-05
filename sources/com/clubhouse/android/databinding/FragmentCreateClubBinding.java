package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentCreateClubBinding implements a {
    public final AvatarView a;
    public final View b;
    public final SwitchCompat c;
    public final CardView d;
    public final TextView e;
    public final EditText f;
    public final EditText g;
    public final TextView h;
    public final ProgressBar i;
    public final SwitchCompat j;
    public final ConstraintLayout k;
    public final View l;
    public final TextView m;
    public final ScrollView n;
    public final ConstraintLayout o;
    public final TextView p;
    public final ConstraintLayout q;
    public final View r;
    public final TextView s;

    public FragmentCreateClubBinding(LinearLayout linearLayout, AvatarView avatarView, TextView textView, View view, SwitchCompat switchCompat, CardView cardView, TextView textView2, EditText editText, EditText editText2, CardView cardView2, CardView cardView3, TextView textView3, CardView cardView4, TextView textView4, ProgressBar progressBar, TextView textView5, SwitchCompat switchCompat2, ConstraintLayout constraintLayout, View view2, TextView textView6, TextView textView7, ScrollView scrollView, LinearLayout linearLayout2, Toolbar toolbar, TextView textView8, ConstraintLayout constraintLayout2, TextView textView9, TextView textView10, ConstraintLayout constraintLayout3, View view3, TextView textView11, TextView textView12) {
        this.a = avatarView;
        this.b = view;
        this.c = switchCompat;
        this.d = cardView;
        this.e = textView2;
        this.f = editText;
        this.g = editText2;
        this.h = textView3;
        this.i = progressBar;
        this.j = switchCompat2;
        this.k = constraintLayout;
        this.l = view2;
        this.m = textView7;
        this.n = scrollView;
        this.o = constraintLayout2;
        this.p = textView10;
        this.q = constraintLayout3;
        this.r = view3;
        this.s = textView12;
    }

    public static FragmentCreateClubBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.add_photo_button;
        AvatarView avatarView = (AvatarView) view2.findViewById(R.id.add_photo_button);
        if (avatarView != null) {
            i2 = R.id.anyone_can_apply_to_join_label;
            TextView textView = (TextView) view2.findViewById(R.id.anyone_can_apply_to_join_label);
            if (textView != null) {
                i2 = R.id.anyone_can_apply_to_join_label_divider;
                View findViewById = view2.findViewById(R.id.anyone_can_apply_to_join_label_divider);
                if (findViewById != null) {
                    i2 = R.id.anyone_can_apply_to_join_switch;
                    SwitchCompat switchCompat = (SwitchCompat) view2.findViewById(R.id.anyone_can_apply_to_join_switch);
                    if (switchCompat != null) {
                        i2 = R.id.by_approval_settings;
                        CardView cardView = (CardView) view2.findViewById(R.id.by_approval_settings);
                        if (cardView != null) {
                            i2 = R.id.cancel;
                            TextView textView2 = (TextView) view2.findViewById(R.id.cancel);
                            if (textView2 != null) {
                                i2 = R.id.club_description;
                                EditText editText = (EditText) view2.findViewById(R.id.club_description);
                                if (editText != null) {
                                    i2 = R.id.club_name;
                                    EditText editText2 = (EditText) view2.findViewById(R.id.club_name);
                                    if (editText2 != null) {
                                        i2 = R.id.club_name_container;
                                        CardView cardView2 = (CardView) view2.findViewById(R.id.club_name_container);
                                        if (cardView2 != null) {
                                            i2 = R.id.club_settings;
                                            CardView cardView3 = (CardView) view2.findViewById(R.id.club_settings);
                                            if (cardView3 != null) {
                                                i2 = R.id.create;
                                                TextView textView3 = (TextView) view2.findViewById(R.id.create);
                                                if (textView3 != null) {
                                                    i2 = R.id.description_club_info;
                                                    CardView cardView4 = (CardView) view2.findViewById(R.id.description_club_info);
                                                    if (cardView4 != null) {
                                                        i2 = R.id.event_description_remaining;
                                                        TextView textView4 = (TextView) view2.findViewById(R.id.event_description_remaining);
                                                        if (textView4 != null) {
                                                            i2 = R.id.loading;
                                                            ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.loading);
                                                            if (progressBar != null) {
                                                                i2 = R.id.member_list_is_public_label;
                                                                TextView textView5 = (TextView) view2.findViewById(R.id.member_list_is_public_label);
                                                                if (textView5 != null) {
                                                                    i2 = R.id.member_list_is_public_switch;
                                                                    SwitchCompat switchCompat2 = (SwitchCompat) view2.findViewById(R.id.member_list_is_public_switch);
                                                                    if (switchCompat2 != null) {
                                                                        i2 = R.id.membership;
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.membership);
                                                                        if (constraintLayout != null) {
                                                                            i2 = R.id.membership_divider;
                                                                            View findViewById2 = view2.findViewById(R.id.membership_divider);
                                                                            if (findViewById2 != null) {
                                                                                i2 = R.id.membership_label;
                                                                                TextView textView6 = (TextView) view2.findViewById(R.id.membership_label);
                                                                                if (textView6 != null) {
                                                                                    i2 = R.id.membership_value;
                                                                                    TextView textView7 = (TextView) view2.findViewById(R.id.membership_value);
                                                                                    if (textView7 != null) {
                                                                                        i2 = R.id.scroll;
                                                                                        ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scroll);
                                                                                        if (scrollView != null) {
                                                                                            i2 = R.id.settings_root;
                                                                                            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.settings_root);
                                                                                            if (linearLayout != null) {
                                                                                                i2 = R.id.toolbar;
                                                                                                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                                                                if (toolbar != null) {
                                                                                                    i2 = R.id.toolbar_title;
                                                                                                    TextView textView8 = (TextView) view2.findViewById(R.id.toolbar_title);
                                                                                                    if (textView8 != null) {
                                                                                                        i2 = R.id.topics;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.topics);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i2 = R.id.topics_label;
                                                                                                            TextView textView9 = (TextView) view2.findViewById(R.id.topics_label);
                                                                                                            if (textView9 != null) {
                                                                                                                i2 = R.id.topics_select;
                                                                                                                TextView textView10 = (TextView) view2.findViewById(R.id.topics_select);
                                                                                                                if (textView10 != null) {
                                                                                                                    i2 = R.id.who_can_start;
                                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view2.findViewById(R.id.who_can_start);
                                                                                                                    if (constraintLayout3 != null) {
                                                                                                                        i2 = R.id.who_can_start_divider;
                                                                                                                        View findViewById3 = view2.findViewById(R.id.who_can_start_divider);
                                                                                                                        if (findViewById3 != null) {
                                                                                                                            i2 = R.id.who_can_start_label;
                                                                                                                            TextView textView11 = (TextView) view2.findViewById(R.id.who_can_start_label);
                                                                                                                            if (textView11 != null) {
                                                                                                                                i2 = R.id.who_can_start_value;
                                                                                                                                TextView textView12 = (TextView) view2.findViewById(R.id.who_can_start_value);
                                                                                                                                if (textView12 != null) {
                                                                                                                                    return new FragmentCreateClubBinding((LinearLayout) view2, avatarView, textView, findViewById, switchCompat, cardView, textView2, editText, editText2, cardView2, cardView3, textView3, cardView4, textView4, progressBar, textView5, switchCompat2, constraintLayout, findViewById2, textView6, textView7, scrollView, linearLayout, toolbar, textView8, constraintLayout2, textView9, textView10, constraintLayout3, findViewById3, textView11, textView12);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static FragmentCreateClubBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_create_club, (ViewGroup) null, false));
    }
}
