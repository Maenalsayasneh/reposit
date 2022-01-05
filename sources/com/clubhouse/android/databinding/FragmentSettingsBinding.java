package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import h0.e0.a;

public final class FragmentSettingsBinding implements a {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ConstraintLayout a;
    public final TextView b;
    public final AvatarView c;
    public final ImageView d;
    public final TextView e;
    public final CardView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final View j;
    public final TextView k;
    public final View l;
    public final TextView m;
    public final TextView n;
    public final ConstraintLayout o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final SwitchMaterial t;
    public final TextView u;
    public final View v;
    public final TextView w;
    public final SwitchMaterial x;
    public final ConstraintLayout y;
    public final SwitchMaterial z;

    public FragmentSettingsBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, AvatarView avatarView, ImageView imageView, TextView textView2, CardView cardView, TextView textView3, TextView textView4, TextView textView5, View view, TextView textView6, View view2, CardView cardView2, TextView textView7, TextView textView8, ConstraintLayout constraintLayout2, TextView textView9, CardView cardView3, FrameLayout frameLayout, TextView textView10, ImageView imageView2, TextView textView11, TextView textView12, TextView textView13, ConstraintLayout constraintLayout3, SwitchMaterial switchMaterial, TextView textView14, TextView textView15, View view3, TextView textView16, ConstraintLayout constraintLayout4, SwitchMaterial switchMaterial2, TextView textView17, ConstraintLayout constraintLayout5, SwitchMaterial switchMaterial3, TextView textView18, TextView textView19, Toolbar toolbar, TextView textView20, TextView textView21, TextView textView22) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = avatarView;
        this.d = imageView;
        this.e = textView2;
        this.f = cardView;
        this.g = textView3;
        this.h = textView4;
        this.i = textView5;
        this.j = view;
        this.k = textView6;
        this.l = view2;
        this.m = textView7;
        this.n = textView8;
        this.o = constraintLayout2;
        this.p = textView9;
        this.q = textView11;
        this.r = textView12;
        this.s = textView13;
        this.t = switchMaterial;
        this.u = textView15;
        this.v = view3;
        this.w = textView16;
        this.x = switchMaterial2;
        this.y = constraintLayout5;
        this.z = switchMaterial3;
        this.A = textView19;
        this.B = textView21;
        this.C = textView22;
    }

    public static FragmentSettingsBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.account_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.account_root);
        if (constraintLayout != null) {
            i2 = R.id.api_override;
            TextView textView = (TextView) view2.findViewById(R.id.api_override);
            if (textView != null) {
                i2 = R.id.avatar;
                AvatarView avatarView = (AvatarView) view2.findViewById(R.id.avatar);
                if (avatarView != null) {
                    i2 = R.id.back;
                    ImageView imageView = (ImageView) view2.findViewById(R.id.back);
                    if (imageView != null) {
                        i2 = R.id.build_number;
                        TextView textView2 = (TextView) view2.findViewById(R.id.build_number);
                        if (textView2 != null) {
                            i2 = R.id.debug_settings;
                            CardView cardView = (CardView) view2.findViewById(R.id.debug_settings);
                            if (cardView != null) {
                                i2 = R.id.faq;
                                TextView textView3 = (TextView) view2.findViewById(R.id.faq);
                                if (textView3 != null) {
                                    i2 = R.id.guidelines;
                                    TextView textView4 = (TextView) view2.findViewById(R.id.guidelines);
                                    if (textView4 != null) {
                                        i2 = R.id.interests;
                                        TextView textView5 = (TextView) view2.findViewById(R.id.interests);
                                        if (textView5 != null) {
                                            i2 = R.id.interests_divider;
                                            View findViewById = view2.findViewById(R.id.interests_divider);
                                            if (findViewById != null) {
                                                i2 = R.id.languages;
                                                TextView textView6 = (TextView) view2.findViewById(R.id.languages);
                                                if (textView6 != null) {
                                                    i2 = R.id.languages_divider;
                                                    View findViewById2 = view2.findViewById(R.id.languages_divider);
                                                    if (findViewById2 != null) {
                                                        i2 = R.id.links;
                                                        CardView cardView2 = (CardView) view2.findViewById(R.id.links);
                                                        if (cardView2 != null) {
                                                            i2 = R.id.log_out;
                                                            TextView textView7 = (TextView) view2.findViewById(R.id.log_out);
                                                            if (textView7 != null) {
                                                                i2 = R.id.name;
                                                                TextView textView8 = (TextView) view2.findViewById(R.id.name);
                                                                if (textView8 != null) {
                                                                    i2 = R.id.notification_reactivate_root;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.notification_reactivate_root);
                                                                    if (constraintLayout2 != null) {
                                                                        i2 = R.id.notification_settings_row;
                                                                        TextView textView9 = (TextView) view2.findViewById(R.id.notification_settings_row);
                                                                        if (textView9 != null) {
                                                                            i2 = R.id.notifications_section;
                                                                            CardView cardView3 = (CardView) view2.findViewById(R.id.notifications_section);
                                                                            if (cardView3 != null) {
                                                                                i2 = R.id.nr_background;
                                                                                FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.nr_background);
                                                                                if (frameLayout != null) {
                                                                                    i2 = R.id.nr_title;
                                                                                    TextView textView10 = (TextView) view2.findViewById(R.id.nr_title);
                                                                                    if (textView10 != null) {
                                                                                        i2 = R.id.nr_top_image;
                                                                                        ImageView imageView2 = (ImageView) view2.findViewById(R.id.nr_top_image);
                                                                                        if (imageView2 != null) {
                                                                                            i2 = R.id.nr_turn_notification_on;
                                                                                            TextView textView11 = (TextView) view2.findViewById(R.id.nr_turn_notification_on);
                                                                                            if (textView11 != null) {
                                                                                                i2 = R.id.onboarding;
                                                                                                TextView textView12 = (TextView) view2.findViewById(R.id.onboarding);
                                                                                                if (textView12 != null) {
                                                                                                    i2 = R.id.onboarding_topics;
                                                                                                    TextView textView13 = (TextView) view2.findViewById(R.id.onboarding_topics);
                                                                                                    if (textView13 != null) {
                                                                                                        i2 = R.id.pause_notifications_root;
                                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) view2.findViewById(R.id.pause_notifications_root);
                                                                                                        if (constraintLayout3 != null) {
                                                                                                            i2 = R.id.pause_notifications_switch;
                                                                                                            SwitchMaterial switchMaterial = (SwitchMaterial) view2.findViewById(R.id.pause_notifications_switch);
                                                                                                            if (switchMaterial != null) {
                                                                                                                i2 = R.id.pause_notifications_title;
                                                                                                                TextView textView14 = (TextView) view2.findViewById(R.id.pause_notifications_title);
                                                                                                                if (textView14 != null) {
                                                                                                                    i2 = R.id.payments;
                                                                                                                    TextView textView15 = (TextView) view2.findViewById(R.id.payments);
                                                                                                                    if (textView15 != null) {
                                                                                                                        i2 = R.id.payments_divider;
                                                                                                                        View findViewById3 = view2.findViewById(R.id.payments_divider);
                                                                                                                        if (findViewById3 != null) {
                                                                                                                            i2 = R.id.privacy;
                                                                                                                            TextView textView16 = (TextView) view2.findViewById(R.id.privacy);
                                                                                                                            if (textView16 != null) {
                                                                                                                                i2 = R.id.send_fewer_notifications_root;
                                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) view2.findViewById(R.id.send_fewer_notifications_root);
                                                                                                                                if (constraintLayout4 != null) {
                                                                                                                                    i2 = R.id.send_fewer_notifications_switch;
                                                                                                                                    SwitchMaterial switchMaterial2 = (SwitchMaterial) view2.findViewById(R.id.send_fewer_notifications_switch);
                                                                                                                                    if (switchMaterial2 != null) {
                                                                                                                                        i2 = R.id.send_fewer_notifications_title;
                                                                                                                                        TextView textView17 = (TextView) view2.findViewById(R.id.send_fewer_notifications_title);
                                                                                                                                        if (textView17 != null) {
                                                                                                                                            i2 = R.id.spatial_audio_root;
                                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) view2.findViewById(R.id.spatial_audio_root);
                                                                                                                                            if (constraintLayout5 != null) {
                                                                                                                                                i2 = R.id.spatial_audio_switch;
                                                                                                                                                SwitchMaterial switchMaterial3 = (SwitchMaterial) view2.findViewById(R.id.spatial_audio_switch);
                                                                                                                                                if (switchMaterial3 != null) {
                                                                                                                                                    i2 = R.id.spatial_audio_title;
                                                                                                                                                    TextView textView18 = (TextView) view2.findViewById(R.id.spatial_audio_title);
                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                        i2 = R.id.terms;
                                                                                                                                                        TextView textView19 = (TextView) view2.findViewById(R.id.terms);
                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                            i2 = R.id.toolbar;
                                                                                                                                                            Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                                                                                                                            if (toolbar != null) {
                                                                                                                                                                i2 = R.id.toolbar_title;
                                                                                                                                                                TextView textView20 = (TextView) view2.findViewById(R.id.toolbar_title);
                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                    i2 = R.id.username;
                                                                                                                                                                    TextView textView21 = (TextView) view2.findViewById(R.id.username);
                                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                                        i2 = R.id.whats_new;
                                                                                                                                                                        TextView textView22 = (TextView) view2.findViewById(R.id.whats_new);
                                                                                                                                                                        if (textView22 != null) {
                                                                                                                                                                            return new FragmentSettingsBinding((LinearLayout) view2, constraintLayout, textView, avatarView, imageView, textView2, cardView, textView3, textView4, textView5, findViewById, textView6, findViewById2, cardView2, textView7, textView8, constraintLayout2, textView9, cardView3, frameLayout, textView10, imageView2, textView11, textView12, textView13, constraintLayout3, switchMaterial, textView14, textView15, findViewById3, textView16, constraintLayout4, switchMaterial2, textView17, constraintLayout5, switchMaterial3, textView18, textView19, toolbar, textView20, textView21, textView22);
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

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_settings, (ViewGroup) null, false));
    }
}
