package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentAddEditEventBinding implements a {
    public final LinearLayout a;
    public final TextView b;
    public final EpoxyRecyclerView c;
    public final TextView d;
    public final TextView e;
    public final CalendarView f;
    public final View g;
    public final Button h;
    public final EditText i;
    public final TextView j;
    public final EditText k;
    public final TextView l;
    public final View m;
    public final TextView n;
    public final TimePicker o;
    public final View p;
    public final CardView q;
    public final TextView r;
    public final LinearLayout s;
    public final View t;
    public final LinearLayout u;
    public final SwitchCompat v;
    public final TextView w;
    public final TextView x;

    public FragmentAddEditEventBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, CardView cardView, TextView textView2, EpoxyRecyclerView epoxyRecyclerView, CardView cardView2, CardView cardView3, TextView textView3, TextView textView4, CalendarView calendarView, View view, Button button, EditText editText, TextView textView5, EditText editText2, TextView textView6, View view2, TextView textView7, TimePicker timePicker, View view3, CardView cardView4, TextView textView8, LinearLayout linearLayout3, TextView textView9, View view4, LinearLayout linearLayout4, SwitchCompat switchCompat, TextView textView10, TextView textView11, ScrollView scrollView, Toolbar toolbar, TextView textView12) {
        this.a = linearLayout2;
        this.b = textView2;
        this.c = epoxyRecyclerView;
        this.d = textView3;
        this.e = textView4;
        this.f = calendarView;
        this.g = view;
        this.h = button;
        this.i = editText;
        this.j = textView5;
        this.k = editText2;
        this.l = textView6;
        this.m = view2;
        this.n = textView7;
        this.o = timePicker;
        this.p = view3;
        this.q = cardView4;
        this.r = textView8;
        this.s = linearLayout3;
        this.t = view4;
        this.u = linearLayout4;
        this.v = switchCompat;
        this.w = textView11;
        this.x = textView12;
    }

    public static FragmentAddEditEventBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.add_a_co_host;
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.add_a_co_host);
        if (linearLayout != null) {
            i2 = R.id.add_a_co_host_title;
            TextView textView = (TextView) view2.findViewById(R.id.add_a_co_host_title);
            if (textView != null) {
                i2 = R.id.base_event_info;
                CardView cardView = (CardView) view2.findViewById(R.id.base_event_info);
                if (cardView != null) {
                    i2 = R.id.cancel;
                    TextView textView2 = (TextView) view2.findViewById(R.id.cancel);
                    if (textView2 != null) {
                        i2 = R.id.co_hosts_list;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view2.findViewById(R.id.co_hosts_list);
                        if (epoxyRecyclerView != null) {
                            i2 = R.id.date_time_info;
                            CardView cardView2 = (CardView) view2.findViewById(R.id.date_time_info);
                            if (cardView2 != null) {
                                i2 = R.id.description_event_info;
                                CardView cardView3 = (CardView) view2.findViewById(R.id.description_event_info);
                                if (cardView3 != null) {
                                    i2 = R.id.event_date;
                                    TextView textView3 = (TextView) view2.findViewById(R.id.event_date);
                                    if (textView3 != null) {
                                        i2 = R.id.event_date_label;
                                        TextView textView4 = (TextView) view2.findViewById(R.id.event_date_label);
                                        if (textView4 != null) {
                                            i2 = R.id.event_date_picker;
                                            CalendarView calendarView = (CalendarView) view2.findViewById(R.id.event_date_picker);
                                            if (calendarView != null) {
                                                i2 = R.id.event_date_picker_divider;
                                                View findViewById = view2.findViewById(R.id.event_date_picker_divider);
                                                if (findViewById != null) {
                                                    i2 = R.id.event_delete;
                                                    Button button = (Button) view2.findViewById(R.id.event_delete);
                                                    if (button != null) {
                                                        i2 = R.id.event_description;
                                                        EditText editText = (EditText) view2.findViewById(R.id.event_description);
                                                        if (editText != null) {
                                                            i2 = R.id.event_description_remaining;
                                                            TextView textView5 = (TextView) view2.findViewById(R.id.event_description_remaining);
                                                            if (textView5 != null) {
                                                                i2 = R.id.event_name;
                                                                EditText editText2 = (EditText) view2.findViewById(R.id.event_name);
                                                                if (editText2 != null) {
                                                                    i2 = R.id.event_time;
                                                                    TextView textView6 = (TextView) view2.findViewById(R.id.event_time);
                                                                    if (textView6 != null) {
                                                                        i2 = R.id.event_time_divider;
                                                                        View findViewById2 = view2.findViewById(R.id.event_time_divider);
                                                                        if (findViewById2 != null) {
                                                                            i2 = R.id.event_time_label;
                                                                            TextView textView7 = (TextView) view2.findViewById(R.id.event_time_label);
                                                                            if (textView7 != null) {
                                                                                i2 = R.id.event_time_picker;
                                                                                TimePicker timePicker = (TimePicker) view2.findViewById(R.id.event_time_picker);
                                                                                if (timePicker != null) {
                                                                                    i2 = R.id.event_time_picker_divider;
                                                                                    View findViewById3 = view2.findViewById(R.id.event_time_picker_divider);
                                                                                    if (findViewById3 != null) {
                                                                                        i2 = R.id.host_club_event_info;
                                                                                        CardView cardView4 = (CardView) view2.findViewById(R.id.host_club_event_info);
                                                                                        if (cardView4 != null) {
                                                                                            i2 = R.id.host_club_name;
                                                                                            TextView textView8 = (TextView) view2.findViewById(R.id.host_club_name);
                                                                                            if (textView8 != null) {
                                                                                                i2 = R.id.host_club_root;
                                                                                                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.host_club_root);
                                                                                                if (linearLayout2 != null) {
                                                                                                    i2 = R.id.host_club_title;
                                                                                                    TextView textView9 = (TextView) view2.findViewById(R.id.host_club_title);
                                                                                                    if (textView9 != null) {
                                                                                                        i2 = R.id.open_to_members_divider;
                                                                                                        View findViewById4 = view2.findViewById(R.id.open_to_members_divider);
                                                                                                        if (findViewById4 != null) {
                                                                                                            i2 = R.id.open_to_members_root;
                                                                                                            LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(R.id.open_to_members_root);
                                                                                                            if (linearLayout3 != null) {
                                                                                                                i2 = R.id.open_to_members_switch;
                                                                                                                SwitchCompat switchCompat = (SwitchCompat) view2.findViewById(R.id.open_to_members_switch);
                                                                                                                if (switchCompat != null) {
                                                                                                                    i2 = R.id.open_to_members_title;
                                                                                                                    TextView textView10 = (TextView) view2.findViewById(R.id.open_to_members_title);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i2 = R.id.publish;
                                                                                                                        TextView textView11 = (TextView) view2.findViewById(R.id.publish);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i2 = R.id.scroll;
                                                                                                                            ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scroll);
                                                                                                                            if (scrollView != null) {
                                                                                                                                i2 = R.id.toolbar;
                                                                                                                                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                                                                                                if (toolbar != null) {
                                                                                                                                    i2 = R.id.toolbar_title;
                                                                                                                                    TextView textView12 = (TextView) view2.findViewById(R.id.toolbar_title);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        return new FragmentAddEditEventBinding((LinearLayout) view2, linearLayout, textView, cardView, textView2, epoxyRecyclerView, cardView2, cardView3, textView3, textView4, calendarView, findViewById, button, editText, textView5, editText2, textView6, findViewById2, textView7, timePicker, findViewById3, cardView4, textView8, linearLayout2, textView9, findViewById4, linearLayout3, switchCompat, textView10, textView11, scrollView, toolbar, textView12);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static FragmentAddEditEventBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_add_edit_event, (ViewGroup) null, false));
    }
}
