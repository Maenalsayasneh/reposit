package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentReportIncidentThanksBinding implements a {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public FragmentReportIncidentThanksBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, EmojiTextView emojiTextView) {
        this.a = imageView;
        this.b = textView2;
        this.c = textView3;
        this.d = textView5;
    }

    public static FragmentReportIncidentThanksBinding bind(View view) {
        int i = R.id.close;
        ImageView imageView = (ImageView) view.findViewById(R.id.close);
        if (imageView != null) {
            i = R.id.helpful_links;
            TextView textView = (TextView) view.findViewById(R.id.helpful_links);
            if (textView != null) {
                i = R.id.report_community_guidelines;
                TextView textView2 = (TextView) view.findViewById(R.id.report_community_guidelines);
                if (textView2 != null) {
                    i = R.id.report_get_help;
                    TextView textView3 = (TextView) view.findViewById(R.id.report_get_help);
                    if (textView3 != null) {
                        i = R.id.reported_body;
                        TextView textView4 = (TextView) view.findViewById(R.id.reported_body);
                        if (textView4 != null) {
                            i = R.id.reported_title;
                            TextView textView5 = (TextView) view.findViewById(R.id.reported_title);
                            if (textView5 != null) {
                                i = R.id.thank_you_icon;
                                EmojiTextView emojiTextView = (EmojiTextView) view.findViewById(R.id.thank_you_icon);
                                if (emojiTextView != null) {
                                    return new FragmentReportIncidentThanksBinding((LinearLayout) view, imageView, textView, textView2, textView3, textView4, textView5, emojiTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentReportIncidentThanksBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_report_incident_thanks, (ViewGroup) null, false));
    }
}
