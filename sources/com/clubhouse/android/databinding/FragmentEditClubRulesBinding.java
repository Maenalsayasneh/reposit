package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentEditClubRulesBinding implements a {
    public final TextView a;
    public final ClubRuleTitleDescriptionBinding b;
    public final ClubRuleTitleDescriptionBinding c;
    public final ClubRuleTitleDescriptionBinding d;
    public final TextView e;
    public final TextView f;

    public FragmentEditClubRulesBinding(ConstraintLayout constraintLayout, TextView textView, ClubRuleTitleDescriptionBinding clubRuleTitleDescriptionBinding, ClubRuleTitleDescriptionBinding clubRuleTitleDescriptionBinding2, ClubRuleTitleDescriptionBinding clubRuleTitleDescriptionBinding3, TextView textView2, TextView textView3, Toolbar toolbar, TextView textView4) {
        this.a = textView;
        this.b = clubRuleTitleDescriptionBinding;
        this.c = clubRuleTitleDescriptionBinding2;
        this.d = clubRuleTitleDescriptionBinding3;
        this.e = textView2;
        this.f = textView3;
    }

    public static FragmentEditClubRulesBinding bind(View view) {
        int i = R.id.cancel;
        TextView textView = (TextView) view.findViewById(R.id.cancel);
        if (textView != null) {
            i = R.id.club_rule_one;
            View findViewById = view.findViewById(R.id.club_rule_one);
            if (findViewById != null) {
                ClubRuleTitleDescriptionBinding bind = ClubRuleTitleDescriptionBinding.bind(findViewById);
                i = R.id.club_rule_three;
                View findViewById2 = view.findViewById(R.id.club_rule_three);
                if (findViewById2 != null) {
                    ClubRuleTitleDescriptionBinding bind2 = ClubRuleTitleDescriptionBinding.bind(findViewById2);
                    i = R.id.club_rule_two;
                    View findViewById3 = view.findViewById(R.id.club_rule_two);
                    if (findViewById3 != null) {
                        ClubRuleTitleDescriptionBinding bind3 = ClubRuleTitleDescriptionBinding.bind(findViewById3);
                        i = R.id.club_rules_header;
                        TextView textView2 = (TextView) view.findViewById(R.id.club_rules_header);
                        if (textView2 != null) {
                            i = R.id.save;
                            TextView textView3 = (TextView) view.findViewById(R.id.save);
                            if (textView3 != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                if (toolbar != null) {
                                    i = R.id.toolbar_title;
                                    TextView textView4 = (TextView) view.findViewById(R.id.toolbar_title);
                                    if (textView4 != null) {
                                        return new FragmentEditClubRulesBinding((ConstraintLayout) view, textView, bind, bind2, bind3, textView2, textView3, toolbar, textView4);
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

    public static FragmentEditClubRulesBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_edit_club_rules, (ViewGroup) null, false));
    }
}
