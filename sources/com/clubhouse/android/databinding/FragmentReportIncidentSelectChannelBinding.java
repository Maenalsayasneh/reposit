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

public final class FragmentReportIncidentSelectChannelBinding implements a {
    public final AvatarView a;
    public final ImageView b;
    public final EpoxyRecyclerView c;
    public final TextView d;
    public final TextView e;

    public FragmentReportIncidentSelectChannelBinding(LinearLayout linearLayout, AvatarView avatarView, ImageView imageView, EpoxyRecyclerView epoxyRecyclerView, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3) {
        this.a = avatarView;
        this.b = imageView;
        this.c = epoxyRecyclerView;
        this.d = textView;
        this.e = textView2;
    }

    public static FragmentReportIncidentSelectChannelBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.back;
            ImageView imageView = (ImageView) view.findViewById(R.id.back);
            if (imageView != null) {
                i = R.id.channels_list;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.channels_list);
                if (epoxyRecyclerView != null) {
                    i = R.id.content_container;
                    ScrollView scrollView = (ScrollView) view.findViewById(R.id.content_container);
                    if (scrollView != null) {
                        i = R.id.name;
                        TextView textView = (TextView) view.findViewById(R.id.name);
                        if (textView != null) {
                            i = R.id.we_couldnt_find_any_rooms;
                            TextView textView2 = (TextView) view.findViewById(R.id.we_couldnt_find_any_rooms);
                            if (textView2 != null) {
                                i = R.id.what_is_wrong;
                                TextView textView3 = (TextView) view.findViewById(R.id.what_is_wrong);
                                if (textView3 != null) {
                                    return new FragmentReportIncidentSelectChannelBinding((LinearLayout) view, avatarView, imageView, epoxyRecyclerView, scrollView, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentReportIncidentSelectChannelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_report_incident_select_channel, (ViewGroup) null, false));
    }
}
