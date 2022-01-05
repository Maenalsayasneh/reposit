package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FeedEventSuggestionBinding implements a {
    public final CardView a;
    public final RSVPButton b;
    public final TextView c;
    public final EpoxyRecyclerView d;
    public final FeedReasonBinding e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;

    public FeedEventSuggestionBinding(CardView cardView, RSVPButton rSVPButton, TextView textView, EpoxyRecyclerView epoxyRecyclerView, FeedReasonBinding feedReasonBinding, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = cardView;
        this.b = rSVPButton;
        this.c = textView;
        this.d = epoxyRecyclerView;
        this.e = feedReasonBinding;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
        this.i = textView5;
    }

    public static FeedEventSuggestionBinding bind(View view) {
        int i2 = R.id.bell_icon;
        RSVPButton rSVPButton = (RSVPButton) view.findViewById(R.id.bell_icon);
        if (rSVPButton != null) {
            i2 = R.id.edit;
            TextView textView = (TextView) view.findViewById(R.id.edit);
            if (textView != null) {
                i2 = R.id.hosts;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.hosts);
                if (epoxyRecyclerView != null) {
                    i2 = R.id.reason_container;
                    View findViewById = view.findViewById(R.id.reason_container);
                    if (findViewById != null) {
                        FeedReasonBinding bind = FeedReasonBinding.bind(findViewById);
                        i2 = R.id.subtitle_club;
                        TextView textView2 = (TextView) view.findViewById(R.id.subtitle_club);
                        if (textView2 != null) {
                            i2 = R.id.subtitle_from;
                            TextView textView3 = (TextView) view.findViewById(R.id.subtitle_from);
                            if (textView3 != null) {
                                i2 = R.id.time;
                                TextView textView4 = (TextView) view.findViewById(R.id.time);
                                if (textView4 != null) {
                                    i2 = R.id.title;
                                    TextView textView5 = (TextView) view.findViewById(R.id.title);
                                    if (textView5 != null) {
                                        return new FeedEventSuggestionBinding((CardView) view, rSVPButton, textView, epoxyRecyclerView, bind, textView2, textView3, textView4, textView5);
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

    public static FeedEventSuggestionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.feed_event_suggestion, (ViewGroup) null, false));
    }
}
