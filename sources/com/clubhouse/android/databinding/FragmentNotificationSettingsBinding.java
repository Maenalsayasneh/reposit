package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import h0.e0.a;

public final class FragmentNotificationSettingsBinding implements a {
    public final ImageView a;
    public final TextView b;
    public final SwitchMaterial c;
    public final SwitchMaterial d;
    public final SwitchMaterial e;
    public final SwitchMaterial f;

    public FragmentNotificationSettingsBinding(LinearLayout linearLayout, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, SwitchMaterial switchMaterial, TextView textView2, CardView cardView, ConstraintLayout constraintLayout2, TextView textView3, SwitchMaterial switchMaterial2, TextView textView4, ConstraintLayout constraintLayout3, TextView textView5, SwitchMaterial switchMaterial3, TextView textView6, Toolbar toolbar, TextView textView7, ConstraintLayout constraintLayout4, TextView textView8, SwitchMaterial switchMaterial4, TextView textView9) {
        this.a = imageView;
        this.b = textView;
        this.c = switchMaterial;
        this.d = switchMaterial2;
        this.e = switchMaterial3;
        this.f = switchMaterial4;
    }

    public static FragmentNotificationSettingsBinding bind(View view) {
        View view2 = view;
        int i = R.id.back;
        ImageView imageView = (ImageView) view2.findViewById(R.id.back);
        if (imageView != null) {
            i = R.id.backchannel_notifications_root;
            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.backchannel_notifications_root);
            if (constraintLayout != null) {
                i = R.id.backchannel_notifications_subtitle;
                TextView textView = (TextView) view2.findViewById(R.id.backchannel_notifications_subtitle);
                if (textView != null) {
                    i = R.id.backchannel_notifications_switch;
                    SwitchMaterial switchMaterial = (SwitchMaterial) view2.findViewById(R.id.backchannel_notifications_switch);
                    if (switchMaterial != null) {
                        i = R.id.backchannel_notifications_title;
                        TextView textView2 = (TextView) view2.findViewById(R.id.backchannel_notifications_title);
                        if (textView2 != null) {
                            i = R.id.notifications_section;
                            CardView cardView = (CardView) view2.findViewById(R.id.notifications_section);
                            if (cardView != null) {
                                i = R.id.other_notifications_root;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.other_notifications_root);
                                if (constraintLayout2 != null) {
                                    i = R.id.other_notifications_subtitle;
                                    TextView textView3 = (TextView) view2.findViewById(R.id.other_notifications_subtitle);
                                    if (textView3 != null) {
                                        i = R.id.other_notifications_switch;
                                        SwitchMaterial switchMaterial2 = (SwitchMaterial) view2.findViewById(R.id.other_notifications_switch);
                                        if (switchMaterial2 != null) {
                                            i = R.id.other_notifications_title;
                                            TextView textView4 = (TextView) view2.findViewById(R.id.other_notifications_title);
                                            if (textView4 != null) {
                                                i = R.id.room_notifications_root;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view2.findViewById(R.id.room_notifications_root);
                                                if (constraintLayout3 != null) {
                                                    i = R.id.room_notifications_subtitle;
                                                    TextView textView5 = (TextView) view2.findViewById(R.id.room_notifications_subtitle);
                                                    if (textView5 != null) {
                                                        i = R.id.room_notifications_switch;
                                                        SwitchMaterial switchMaterial3 = (SwitchMaterial) view2.findViewById(R.id.room_notifications_switch);
                                                        if (switchMaterial3 != null) {
                                                            i = R.id.room_notifications_title;
                                                            TextView textView6 = (TextView) view2.findViewById(R.id.room_notifications_title);
                                                            if (textView6 != null) {
                                                                i = R.id.toolbar;
                                                                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                                if (toolbar != null) {
                                                                    i = R.id.toolbar_title;
                                                                    TextView textView7 = (TextView) view2.findViewById(R.id.toolbar_title);
                                                                    if (textView7 != null) {
                                                                        i = R.id.trend_notifications_root;
                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) view2.findViewById(R.id.trend_notifications_root);
                                                                        if (constraintLayout4 != null) {
                                                                            i = R.id.trend_notifications_subtitle;
                                                                            TextView textView8 = (TextView) view2.findViewById(R.id.trend_notifications_subtitle);
                                                                            if (textView8 != null) {
                                                                                i = R.id.trend_notifications_switch;
                                                                                SwitchMaterial switchMaterial4 = (SwitchMaterial) view2.findViewById(R.id.trend_notifications_switch);
                                                                                if (switchMaterial4 != null) {
                                                                                    i = R.id.trend_notifications_title;
                                                                                    TextView textView9 = (TextView) view2.findViewById(R.id.trend_notifications_title);
                                                                                    if (textView9 != null) {
                                                                                        return new FragmentNotificationSettingsBinding((LinearLayout) view2, imageView, constraintLayout, textView, switchMaterial, textView2, cardView, constraintLayout2, textView3, switchMaterial2, textView4, constraintLayout3, textView5, switchMaterial3, textView6, toolbar, textView7, constraintLayout4, textView8, switchMaterial4, textView9);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentNotificationSettingsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_notification_settings, (ViewGroup) null, false));
    }
}
