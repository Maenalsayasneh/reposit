package com.clubhouse.backchannel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.ui.ChatFacePile;
import h0.e0.a;

public final class InboxItemBinding implements a {
    public final ConstraintLayout a;
    public final TextView b;
    public final ChatFacePile c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;

    public InboxItemBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ChatFacePile chatFacePile, TextView textView2, TextView textView3, ImageView imageView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = chatFacePile;
        this.d = textView2;
        this.e = textView3;
        this.f = imageView2;
    }

    public static InboxItemBinding bind(View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.conversation_title;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.facepile;
                ChatFacePile chatFacePile = (ChatFacePile) view.findViewById(i);
                if (chatFacePile != null) {
                    i = R.id.subtitle;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = R.id.timestamp;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null) {
                            i = R.id.unread_badge;
                            ImageView imageView2 = (ImageView) view.findViewById(i);
                            if (imageView2 != null) {
                                return new InboxItemBinding((ConstraintLayout) view, imageView, textView, chatFacePile, textView2, textView3, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static InboxItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.inbox_item, (ViewGroup) null, false));
    }
}
