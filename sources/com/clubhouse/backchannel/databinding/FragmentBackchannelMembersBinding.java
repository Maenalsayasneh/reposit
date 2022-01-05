package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.backchannel.R;
import h0.e0.a;

public final class FragmentBackchannelMembersBinding implements a {
    public final ImageView a;
    public final EpoxyRecyclerView b;

    public FragmentBackchannelMembersBinding(LinearLayout linearLayout, ImageView imageView, EpoxyRecyclerView epoxyRecyclerView, TextView textView, Toolbar toolbar) {
        this.a = imageView;
        this.b = epoxyRecyclerView;
    }

    public static FragmentBackchannelMembersBinding bind(View view) {
        int i = R.id.close;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.members_list;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(i);
            if (epoxyRecyclerView != null) {
                i = R.id.title;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) view.findViewById(i);
                    if (toolbar != null) {
                        return new FragmentBackchannelMembersBinding((LinearLayout) view, imageView, epoxyRecyclerView, textView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentBackchannelMembersBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_backchannel_members, (ViewGroup) null, false));
    }
}
