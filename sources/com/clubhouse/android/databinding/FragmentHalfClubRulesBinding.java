package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentHalfClubRulesBinding implements a {
    public final LinearLayout a;
    public final EpoxyRecyclerView b;
    public final TextView c;
    public final Button d;
    public final Button e;

    public FragmentHalfClubRulesBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, EpoxyRecyclerView epoxyRecyclerView, TextView textView, TextView textView2, BottomSheetGrabHandleBinding bottomSheetGrabHandleBinding, Button button, Button button2) {
        this.a = linearLayout;
        this.b = epoxyRecyclerView;
        this.c = textView2;
        this.d = button;
        this.e = button2;
    }

    public static FragmentHalfClubRulesBinding bind(View view) {
        int i = R.id.club_action_button_container;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.club_action_button_container);
        if (linearLayout != null) {
            i = R.id.club_rules;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.club_rules);
            if (epoxyRecyclerView != null) {
                i = R.id.club_rules_header;
                TextView textView = (TextView) view.findViewById(R.id.club_rules_header);
                if (textView != null) {
                    i = R.id.club_title;
                    TextView textView2 = (TextView) view.findViewById(R.id.club_title);
                    if (textView2 != null) {
                        i = R.id.grab_handle;
                        View findViewById = view.findViewById(R.id.grab_handle);
                        if (findViewById != null) {
                            BottomSheetGrabHandleBinding bind = BottomSheetGrabHandleBinding.bind(findViewById);
                            i = R.id.primary_button;
                            Button button = (Button) view.findViewById(R.id.primary_button);
                            if (button != null) {
                                i = R.id.secondary_button;
                                Button button2 = (Button) view.findViewById(R.id.secondary_button);
                                if (button2 != null) {
                                    return new FragmentHalfClubRulesBinding((ConstraintLayout) view, linearLayout, epoxyRecyclerView, textView, textView2, bind, button, button2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHalfClubRulesBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_half_club_rules, (ViewGroup) null, false));
    }
}
