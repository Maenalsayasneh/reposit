package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentReportIncidentSelectCategoryBinding implements a {
    public final AvatarView a;
    public final ImageView b;
    public final TextView c;
    public final EpoxyRecyclerView d;
    public final TextView e;

    public FragmentReportIncidentSelectCategoryBinding(LinearLayout linearLayout, AvatarView avatarView, ImageView imageView, NestedScrollView nestedScrollView, TextView textView, EpoxyRecyclerView epoxyRecyclerView, TextView textView2) {
        this.a = avatarView;
        this.b = imageView;
        this.c = textView;
        this.d = epoxyRecyclerView;
        this.e = textView2;
    }

    public static FragmentReportIncidentSelectCategoryBinding bind(View view) {
        int i = R.id.avatar;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar);
        if (avatarView != null) {
            i = R.id.back;
            ImageView imageView = (ImageView) view.findViewById(R.id.back);
            if (imageView != null) {
                i = R.id.content_container;
                NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.content_container);
                if (nestedScrollView != null) {
                    i = R.id.name;
                    TextView textView = (TextView) view.findViewById(R.id.name);
                    if (textView != null) {
                        i = R.id.report_reasons_list;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.report_reasons_list);
                        if (epoxyRecyclerView != null) {
                            i = R.id.what_is_wrong;
                            TextView textView2 = (TextView) view.findViewById(R.id.what_is_wrong);
                            if (textView2 != null) {
                                return new FragmentReportIncidentSelectCategoryBinding((LinearLayout) view, avatarView, imageView, nestedScrollView, textView, epoxyRecyclerView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentReportIncidentSelectCategoryBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_report_incident_select_category, (ViewGroup) null, false));
    }
}
