package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentReportProfileBinding implements a {
    public final AvatarView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;

    public FragmentReportProfileBinding(LinearLayout linearLayout, AvatarView avatarView, TextView textView, TextView textView2, ScrollView scrollView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.a = avatarView;
        this.b = textView;
        this.c = textView2;
        this.d = textView4;
        this.e = textView5;
        this.f = textView6;
        this.g = textView7;
        this.h = textView8;
        this.i = textView9;
        this.j = textView10;
    }

    public static FragmentReportProfileBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.avatar;
        AvatarView avatarView = (AvatarView) view2.findViewById(R.id.avatar);
        if (avatarView != null) {
            i2 = R.id.cancel;
            TextView textView = (TextView) view2.findViewById(R.id.cancel);
            if (textView != null) {
                i2 = R.id.channel_role;
                TextView textView2 = (TextView) view2.findViewById(R.id.channel_role);
                if (textView2 != null) {
                    i2 = R.id.content_container;
                    ScrollView scrollView = (ScrollView) view2.findViewById(R.id.content_container);
                    if (scrollView != null) {
                        i2 = R.id.helpful_links;
                        TextView textView3 = (TextView) view2.findViewById(R.id.helpful_links);
                        if (textView3 != null) {
                            i2 = R.id.name;
                            TextView textView4 = (TextView) view2.findViewById(R.id.name);
                            if (textView4 != null) {
                                i2 = R.id.report_channel;
                                TextView textView5 = (TextView) view2.findViewById(R.id.report_channel);
                                if (textView5 != null) {
                                    i2 = R.id.report_community_guidelines;
                                    TextView textView6 = (TextView) view2.findViewById(R.id.report_community_guidelines);
                                    if (textView6 != null) {
                                        i2 = R.id.report_get_help;
                                        TextView textView7 = (TextView) view2.findViewById(R.id.report_get_help);
                                        if (textView7 != null) {
                                            i2 = R.id.report_profile;
                                            TextView textView8 = (TextView) view2.findViewById(R.id.report_profile);
                                            if (textView8 != null) {
                                                i2 = R.id.username;
                                                TextView textView9 = (TextView) view2.findViewById(R.id.username);
                                                if (textView9 != null) {
                                                    i2 = R.id.why_report;
                                                    TextView textView10 = (TextView) view2.findViewById(R.id.why_report);
                                                    if (textView10 != null) {
                                                        return new FragmentReportProfileBinding((LinearLayout) view2, avatarView, textView, textView2, scrollView, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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

    public static FragmentReportProfileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_report_profile, (ViewGroup) null, false));
    }
}
