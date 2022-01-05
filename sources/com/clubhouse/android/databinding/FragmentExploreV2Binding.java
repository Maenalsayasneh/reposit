package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.app.R;
import com.google.android.material.tabs.TabLayout;
import h0.e0.a;

public final class FragmentExploreV2Binding implements a {
    public final Button a;
    public final TextView b;
    public final ImageView c;
    public final ProgressBar d;
    public final TabLayout e;
    public final ImpressionTrackingEpoxyRecyclerView f;
    public final EditText g;

    public FragmentExploreV2Binding(ConstraintLayout constraintLayout, Button button, TextView textView, ImageView imageView, ProgressBar progressBar, TabLayout tabLayout, ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView, EditText editText) {
        this.a = button;
        this.b = textView;
        this.c = imageView;
        this.d = progressBar;
        this.e = tabLayout;
        this.f = impressionTrackingEpoxyRecyclerView;
        this.g = editText;
    }

    public static FragmentExploreV2Binding bind(View view) {
        int i = R.id.cancel;
        Button button = (Button) view.findViewById(R.id.cancel);
        if (button != null) {
            i = R.id.empty;
            TextView textView = (TextView) view.findViewById(R.id.empty);
            if (textView != null) {
                i = R.id.empty_icon;
                ImageView imageView = (ImageView) view.findViewById(R.id.empty_icon);
                if (imageView != null) {
                    i = R.id.loading;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                    if (progressBar != null) {
                        i = R.id.result_tabs;
                        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.result_tabs);
                        if (tabLayout != null) {
                            i = R.id.results_list;
                            ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = (ImpressionTrackingEpoxyRecyclerView) view.findViewById(R.id.results_list);
                            if (impressionTrackingEpoxyRecyclerView != null) {
                                i = R.id.search;
                                EditText editText = (EditText) view.findViewById(R.id.search);
                                if (editText != null) {
                                    return new FragmentExploreV2Binding((ConstraintLayout) view, button, textView, imageView, progressBar, tabLayout, impressionTrackingEpoxyRecyclerView, editText);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentExploreV2Binding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_explore_v2, (ViewGroup) null, false));
    }
}
