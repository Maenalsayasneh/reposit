package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.ui.FadingEdgeCarousel;
import h0.e0.a;

public final class FragmentBackchannelChatBinding implements a {
    public final FadingEdgeCarousel a;
    public final ImageView b;
    public final Button c;
    public final LinearLayout d;
    public final ImpressionTrackingEpoxyRecyclerView e;
    public final EditText f;
    public final FrameLayout g;
    public final Button h;
    public final Button i;
    public final TextView j;
    public final Toolbar k;

    public FragmentBackchannelChatBinding(ConstraintLayout constraintLayout, FadingEdgeCarousel fadingEdgeCarousel, ImageView imageView, Button button, LinearLayout linearLayout, Barrier barrier, ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView, EditText editText, FrameLayout frameLayout, Button button2, Button button3, TextView textView, Toolbar toolbar) {
        this.a = fadingEdgeCarousel;
        this.b = imageView;
        this.c = button;
        this.d = linearLayout;
        this.e = impressionTrackingEpoxyRecyclerView;
        this.f = editText;
        this.g = frameLayout;
        this.h = button2;
        this.i = button3;
        this.j = textView;
        this.k = toolbar;
    }

    public static FragmentBackchannelChatBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.avatars;
        FadingEdgeCarousel fadingEdgeCarousel = (FadingEdgeCarousel) view2.findViewById(i2);
        if (fadingEdgeCarousel != null) {
            i2 = R.id.back;
            ImageView imageView = (ImageView) view2.findViewById(i2);
            if (imageView != null) {
                i2 = R.id.block_button;
                Button button = (Button) view2.findViewById(i2);
                if (button != null) {
                    i2 = R.id.block_request;
                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(i2);
                    if (linearLayout != null) {
                        i2 = R.id.button_barrier;
                        Barrier barrier = (Barrier) view2.findViewById(i2);
                        if (barrier != null) {
                            i2 = R.id.chat_list;
                            ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = (ImpressionTrackingEpoxyRecyclerView) view2.findViewById(i2);
                            if (impressionTrackingEpoxyRecyclerView != null) {
                                i2 = R.id.composer;
                                EditText editText = (EditText) view2.findViewById(i2);
                                if (editText != null) {
                                    i2 = R.id.room_loading;
                                    FrameLayout frameLayout = (FrameLayout) view2.findViewById(i2);
                                    if (frameLayout != null) {
                                        i2 = R.id.send;
                                        Button button2 = (Button) view2.findViewById(i2);
                                        if (button2 != null) {
                                            i2 = R.id.start_room;
                                            Button button3 = (Button) view2.findViewById(i2);
                                            if (button3 != null) {
                                                i2 = R.id.title;
                                                TextView textView = (TextView) view2.findViewById(i2);
                                                if (textView != null) {
                                                    i2 = R.id.toolbar;
                                                    Toolbar toolbar = (Toolbar) view2.findViewById(i2);
                                                    if (toolbar != null) {
                                                        return new FragmentBackchannelChatBinding((ConstraintLayout) view2, fadingEdgeCarousel, imageView, button, linearLayout, barrier, impressionTrackingEpoxyRecyclerView, editText, frameLayout, button2, button3, textView, toolbar);
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

    public static FragmentBackchannelChatBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_backchannel_chat, (ViewGroup) null, false));
    }
}
