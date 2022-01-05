package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.app.R;
import com.google.android.material.tabs.TabLayout;
import h0.e0.a;

public final class FragmentExploreBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final Button c;
    public final TextView d;
    public final ProgressBar e;
    public final ImageView f;
    public final TabLayout g;
    public final ImpressionTrackingEpoxyRecyclerView h;
    public final EditText i;

    public FragmentExploreBinding(ConstraintLayout constraintLayout, ImageView imageView, Button button, TextView textView, ProgressBar progressBar, ImageView imageView2, TabLayout tabLayout, ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView, EditText editText, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = button;
        this.d = textView;
        this.e = progressBar;
        this.f = imageView2;
        this.g = tabLayout;
        this.h = impressionTrackingEpoxyRecyclerView;
        this.i = editText;
    }

    public static FragmentExploreBinding bind(View view) {
        int i2 = R.id.back;
        ImageView imageView = (ImageView) view.findViewById(R.id.back);
        if (imageView != null) {
            i2 = R.id.cancel;
            Button button = (Button) view.findViewById(R.id.cancel);
            if (button != null) {
                i2 = R.id.empty;
                TextView textView = (TextView) view.findViewById(R.id.empty);
                if (textView != null) {
                    i2 = R.id.loading;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                    if (progressBar != null) {
                        i2 = R.id.recent_speakers;
                        ImageView imageView2 = (ImageView) view.findViewById(R.id.recent_speakers);
                        if (imageView2 != null) {
                            i2 = R.id.result_tabs;
                            TabLayout tabLayout = (TabLayout) view.findViewById(R.id.result_tabs);
                            if (tabLayout != null) {
                                i2 = R.id.results_list;
                                ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = (ImpressionTrackingEpoxyRecyclerView) view.findViewById(R.id.results_list);
                                if (impressionTrackingEpoxyRecyclerView != null) {
                                    i2 = R.id.search;
                                    EditText editText = (EditText) view.findViewById(R.id.search);
                                    if (editText != null) {
                                        i2 = R.id.toolbar;
                                        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                        if (toolbar != null) {
                                            return new FragmentExploreBinding((ConstraintLayout) view, imageView, button, textView, progressBar, imageView2, tabLayout, impressionTrackingEpoxyRecyclerView, editText, toolbar);
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

    public static FragmentExploreBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_explore, (ViewGroup) null, false));
    }
}
