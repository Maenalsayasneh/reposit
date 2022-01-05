package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentOnboardingSuggestionsBinding implements a {
    public final View a;
    public final Button b;
    public final FrameLayout c;
    public final Button d;
    public final Button e;
    public final EpoxyRecyclerView f;
    public final TextView g;
    public final View h;

    public FragmentOnboardingSuggestionsBinding(ConstraintLayout constraintLayout, View view, Button button, FrameLayout frameLayout, Button button2, Button button3, EpoxyRecyclerView epoxyRecyclerView, TextView textView, View view2) {
        this.a = view;
        this.b = button;
        this.c = frameLayout;
        this.d = button2;
        this.e = button3;
        this.f = epoxyRecyclerView;
        this.g = textView;
        this.h = view2;
    }

    public static FragmentOnboardingSuggestionsBinding bind(View view) {
        int i = R.id.bottom_shadow;
        View findViewById = view.findViewById(R.id.bottom_shadow);
        if (findViewById != null) {
            i = R.id.choose_button;
            Button button = (Button) view.findViewById(R.id.choose_button);
            if (button != null) {
                i = R.id.loading;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
                if (frameLayout != null) {
                    i = R.id.next_button;
                    Button button2 = (Button) view.findViewById(R.id.next_button);
                    if (button2 != null) {
                        i = R.id.skip_button;
                        Button button3 = (Button) view.findViewById(R.id.skip_button);
                        if (button3 != null) {
                            i = R.id.suggestion_list;
                            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.suggestion_list);
                            if (epoxyRecyclerView != null) {
                                i = R.id.title;
                                TextView textView = (TextView) view.findViewById(R.id.title);
                                if (textView != null) {
                                    i = R.id.top_shadow;
                                    View findViewById2 = view.findViewById(R.id.top_shadow);
                                    if (findViewById2 != null) {
                                        return new FragmentOnboardingSuggestionsBinding((ConstraintLayout) view, findViewById, button, frameLayout, button2, button3, epoxyRecyclerView, textView, findViewById2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentOnboardingSuggestionsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_onboarding_suggestions, (ViewGroup) null, false));
    }
}
