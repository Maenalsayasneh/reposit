package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentActivityOverflowBinding implements a {
    public final EpoxyRecyclerView a;
    public final ImageView b;

    public FragmentActivityOverflowBinding(ConstraintLayout constraintLayout, EpoxyRecyclerView epoxyRecyclerView, ImageView imageView, Toolbar toolbar) {
        this.a = epoxyRecyclerView;
        this.b = imageView;
    }

    public static FragmentActivityOverflowBinding bind(View view) {
        int i = R.id.activity_overflow_list;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.activity_overflow_list);
        if (epoxyRecyclerView != null) {
            i = R.id.back;
            ImageView imageView = (ImageView) view.findViewById(R.id.back);
            if (imageView != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                if (toolbar != null) {
                    return new FragmentActivityOverflowBinding((ConstraintLayout) view, epoxyRecyclerView, imageView, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentActivityOverflowBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_activity_overflow, (ViewGroup) null, false));
    }
}
