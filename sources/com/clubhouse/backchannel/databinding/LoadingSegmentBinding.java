package com.clubhouse.backchannel.databinding;

import android.view.View;
import android.widget.ProgressBar;
import com.clubhouse.backchannel.R;
import h0.e0.a;

public final class LoadingSegmentBinding implements a {
    public final View a;

    public LoadingSegmentBinding(View view, ProgressBar progressBar) {
        this.a = view;
    }

    public static LoadingSegmentBinding bind(View view) {
        int i = R.id.loading;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            return new LoadingSegmentBinding(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
