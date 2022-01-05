package com.clubhouse.wave.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.clubhouse.wave.R;
import h0.e0.a;

public final class WaveInFeedBinding implements a {
    public final CardView a;
    public final TextView b;

    public WaveInFeedBinding(CardView cardView, ImageView imageView, TextView textView) {
        this.a = cardView;
        this.b = textView;
    }

    public static WaveInFeedBinding bind(View view) {
        int i = R.id.chevron;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.waves;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new WaveInFeedBinding((CardView) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static WaveInFeedBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.wave_in_feed, (ViewGroup) null, false));
    }
}
