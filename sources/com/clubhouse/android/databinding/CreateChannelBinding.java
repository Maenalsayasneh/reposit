package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class CreateChannelBinding implements a {
    public final ConstraintLayout a;
    public final Button b;
    public final EpoxyRecyclerView c;
    public final Button d;
    public final Button e;
    public final TextView f;
    public final View g;

    public CreateChannelBinding(ConstraintLayout constraintLayout, Button button, Barrier barrier, EpoxyRecyclerView epoxyRecyclerView, Button button2, Button button3, TextView textView, ConstraintLayout constraintLayout2, View view) {
        this.a = constraintLayout;
        this.b = button;
        this.c = epoxyRecyclerView;
        this.d = button2;
        this.e = button3;
        this.f = textView;
        this.g = view;
    }

    public static CreateChannelBinding bind(View view) {
        int i = R.id.add_topic_button;
        Button button = (Button) view.findViewById(R.id.add_topic_button);
        if (button != null) {
            i = R.id.button_barrier;
            Barrier barrier = (Barrier) view.findViewById(R.id.button_barrier);
            if (barrier != null) {
                i = R.id.channel_audience_list;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(R.id.channel_audience_list);
                if (epoxyRecyclerView != null) {
                    i = R.id.choose_people_button;
                    Button button2 = (Button) view.findViewById(R.id.choose_people_button);
                    if (button2 != null) {
                        i = R.id.create_button;
                        Button button3 = (Button) view.findViewById(R.id.create_button);
                        if (button3 != null) {
                            i = R.id.create_channel_explanation;
                            TextView textView = (TextView) view.findViewById(R.id.create_channel_explanation);
                            if (textView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = R.id.divider;
                                View findViewById = view.findViewById(R.id.divider);
                                if (findViewById != null) {
                                    return new CreateChannelBinding(constraintLayout, button, barrier, epoxyRecyclerView, button2, button3, textView, constraintLayout, findViewById);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CreateChannelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.create_channel, (ViewGroup) null, false));
    }
}
