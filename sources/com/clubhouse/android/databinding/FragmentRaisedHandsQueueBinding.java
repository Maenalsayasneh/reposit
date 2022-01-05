package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentRaisedHandsQueueBinding implements a {
    public final TextView a;
    public final Button b;
    public final TextView c;
    public final EpoxyRecyclerView d;

    public FragmentRaisedHandsQueueBinding(ConstraintLayout constraintLayout, TextView textView, Button button, TextView textView2, BottomSheetGrabHandleBinding bottomSheetGrabHandleBinding, ImageView imageView, TextView textView3, EpoxyRecyclerView epoxyRecyclerView) {
        this.a = textView;
        this.b = button;
        this.c = textView2;
        this.d = epoxyRecyclerView;
    }

    public static FragmentRaisedHandsQueueBinding bind(View view) {
        int i = R.id.description;
        TextView textView = (TextView) view.findViewById(R.id.description);
        if (textView != null) {
            i = R.id.edit_handraise_settings;
            Button button = (Button) view.findViewById(R.id.edit_handraise_settings);
            if (button != null) {
                i = R.id.empty_view;
                TextView textView2 = (TextView) view.findViewById(R.id.empty_view);
                if (textView2 != null) {
                    i = R.id.grab_handle;
                    View findViewById = view.findViewById(R.id.grab_handle);
                    if (findViewById != null) {
                        BottomSheetGrabHandleBinding bind = BottomSheetGrabHandleBinding.bind(findViewById);
                        i = R.id.icon;
                        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
                        if (imageView != null) {
                            i = R.id.title;
                            TextView textView3 = (TextView) view.findViewById(R.id.title);
                            if (textView3 != null) {
                                i = R.id.user_list;
                                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.user_list);
                                if (epoxyRecyclerView != null) {
                                    return new FragmentRaisedHandsQueueBinding((ConstraintLayout) view, textView, button, textView2, bind, imageView, textView3, epoxyRecyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentRaisedHandsQueueBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_raised_hands_queue, (ViewGroup) null, false));
    }
}
