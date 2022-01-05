package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.backchannel.R;
import h0.e0.a;

public final class FragmentBackchannelAddMemberBinding implements a {
    public final ImageView a;
    public final FrameLayout b;
    public final EpoxyRecyclerView c;
    public final EditText d;

    public FragmentBackchannelAddMemberBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, EpoxyRecyclerView epoxyRecyclerView, EditText editText, TextView textView, Toolbar toolbar) {
        this.a = imageView;
        this.b = frameLayout;
        this.c = epoxyRecyclerView;
        this.d = editText;
    }

    public static FragmentBackchannelAddMemberBinding bind(View view) {
        int i = R.id.close;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.loading;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
            if (frameLayout != null) {
                i = R.id.results;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(i);
                if (epoxyRecyclerView != null) {
                    i = R.id.search;
                    EditText editText = (EditText) view.findViewById(i);
                    if (editText != null) {
                        i = R.id.title;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            i = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) view.findViewById(i);
                            if (toolbar != null) {
                                return new FragmentBackchannelAddMemberBinding((ConstraintLayout) view, imageView, frameLayout, epoxyRecyclerView, editText, textView, toolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentBackchannelAddMemberBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_backchannel_add_member, (ViewGroup) null, false));
    }
}
