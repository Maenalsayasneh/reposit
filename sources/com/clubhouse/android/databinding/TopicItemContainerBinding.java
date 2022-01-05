package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class TopicItemContainerBinding implements a {
    public TopicItemContainerBinding(EpoxyRecyclerView epoxyRecyclerView, EpoxyRecyclerView epoxyRecyclerView2) {
    }

    public static TopicItemContainerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view;
        return new TopicItemContainerBinding(epoxyRecyclerView, epoxyRecyclerView);
    }

    public static TopicItemContainerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.topic_item_container, (ViewGroup) null, false));
    }
}
