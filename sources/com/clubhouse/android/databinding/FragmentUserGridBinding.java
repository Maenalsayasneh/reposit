package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentUserGridBinding implements a {
    public final Button a;
    public final EpoxyRecyclerView b;
    public final View c;
    public final TextView d;
    public final BottomSheetGrabHandleBinding e;
    public final ProgressBar f;
    public final LinearLayout g;
    public final EditText h;
    public final TextView i;
    public final EpoxyRecyclerView j;

    public FragmentUserGridBinding(FrameLayout frameLayout, Button button, EpoxyRecyclerView epoxyRecyclerView, View view, TextView textView, BottomSheetGrabHandleBinding bottomSheetGrabHandleBinding, ProgressBar progressBar, LinearLayout linearLayout, FrameLayout frameLayout2, EditText editText, TextView textView2, EpoxyRecyclerView epoxyRecyclerView2) {
        this.a = button;
        this.b = epoxyRecyclerView;
        this.c = view;
        this.d = textView;
        this.e = bottomSheetGrabHandleBinding;
        this.f = progressBar;
        this.g = linearLayout;
        this.h = editText;
        this.i = textView2;
        this.j = epoxyRecyclerView2;
    }

    public static FragmentUserGridBinding bind(View view) {
        int i2 = R.id.action_button;
        Button button = (Button) view.findViewById(R.id.action_button);
        if (button != null) {
            i2 = R.id.actions_list;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.actions_list);
            if (epoxyRecyclerView != null) {
                i2 = R.id.actions_list_top_delimiter;
                View findViewById = view.findViewById(R.id.actions_list_top_delimiter);
                if (findViewById != null) {
                    i2 = R.id.empty_view;
                    TextView textView = (TextView) view.findViewById(R.id.empty_view);
                    if (textView != null) {
                        i2 = R.id.grab_handle;
                        View findViewById2 = view.findViewById(R.id.grab_handle);
                        if (findViewById2 != null) {
                            BottomSheetGrabHandleBinding bind = BottomSheetGrabHandleBinding.bind(findViewById2);
                            i2 = R.id.loading;
                            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                            if (progressBar != null) {
                                i2 = R.id.root;
                                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.root);
                                if (linearLayout != null) {
                                    FrameLayout frameLayout = (FrameLayout) view;
                                    i2 = R.id.search;
                                    EditText editText = (EditText) view.findViewById(R.id.search);
                                    if (editText != null) {
                                        i2 = R.id.title;
                                        TextView textView2 = (TextView) view.findViewById(R.id.title);
                                        if (textView2 != null) {
                                            i2 = R.id.user_grid;
                                            EpoxyRecyclerView epoxyRecyclerView2 = (EpoxyRecyclerView) view.findViewById(R.id.user_grid);
                                            if (epoxyRecyclerView2 != null) {
                                                return new FragmentUserGridBinding(frameLayout, button, epoxyRecyclerView, findViewById, textView, bind, progressBar, linearLayout, frameLayout, editText, textView2, epoxyRecyclerView2);
                                            }
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

    public static FragmentUserGridBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_user_grid, (ViewGroup) null, false));
    }
}
