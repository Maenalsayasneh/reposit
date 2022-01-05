package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentReportIncidentSelectSubCategoryBinding implements a {
    public final AvatarView a;
    public final ImageView b;
    public final TextView c;
    public final EpoxyRecyclerView d;
    public final View e;
    public final TextView f;
    public final TextView g;

    public FragmentReportIncidentSelectSubCategoryBinding(LinearLayout linearLayout, AvatarView avatarView, ImageView imageView, ScrollView scrollView, TextView textView, TextView textView2, EpoxyRecyclerView epoxyRecyclerView, View view, TextView textView3, TextView textView4) {
        this.a = avatarView;
        this.b = imageView;
        this.c = textView;
        this.d = epoxyRecyclerView;
        this.e = view;
        this.f = textView3;
        this.g = textView4;
    }

    public static FragmentReportIncidentSelectSubCategoryBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.back;
            ImageView imageView = (ImageView) view.findViewById(R.id.back);
            if (imageView != null) {
                i = R.id.content_container;
                ScrollView scrollView = (ScrollView) view.findViewById(R.id.content_container);
                if (scrollView != null) {
                    i = R.id.name;
                    TextView textView = (TextView) view.findViewById(R.id.name);
                    if (textView != null) {
                        i = R.id.please_select_a_specific;
                        TextView textView2 = (TextView) view.findViewById(R.id.please_select_a_specific);
                        if (textView2 != null) {
                            i = R.id.report_reasons_list;
                            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.report_reasons_list);
                            if (epoxyRecyclerView != null) {
                                i = R.id.reporting_divider;
                                View findViewById = view.findViewById(R.id.reporting_divider);
                                if (findViewById != null) {
                                    i = R.id.reporting_reason;
                                    TextView textView3 = (TextView) view.findViewById(R.id.reporting_reason);
                                    if (textView3 != null) {
                                        i = R.id.what_kind_of;
                                        TextView textView4 = (TextView) view.findViewById(R.id.what_kind_of);
                                        if (textView4 != null) {
                                            return new FragmentReportIncidentSelectSubCategoryBinding((LinearLayout) view, avatarView, imageView, scrollView, textView, textView2, epoxyRecyclerView, findViewById, textView3, textView4);
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

    public static FragmentReportIncidentSelectSubCategoryBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_report_incident_select_sub_category, (ViewGroup) null, false));
    }
}
