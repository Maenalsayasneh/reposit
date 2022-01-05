package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentReportIncidentAddDetailsBinding implements a {
    public final EditText a;
    public final Button b;
    public final AvatarView c;
    public final ImageView d;
    public final ScrollView e;
    public final FrameLayout f;
    public final TextView g;
    public final View h;
    public final TextView i;
    public final ImageView j;
    public final FrameLayout k;
    public final TextView l;
    public final TextView m;

    public FragmentReportIncidentAddDetailsBinding(LinearLayout linearLayout, EditText editText, CardView cardView, Button button, AvatarView avatarView, ImageView imageView, ScrollView scrollView, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, View view, TextView textView4, ImageView imageView2, ImageView imageView3, FrameLayout frameLayout2, TextView textView5, TextView textView6, TextView textView7) {
        this.a = editText;
        this.b = button;
        this.c = avatarView;
        this.d = imageView;
        this.e = scrollView;
        this.f = frameLayout;
        this.g = textView2;
        this.h = view;
        this.i = textView4;
        this.j = imageView2;
        this.k = frameLayout2;
        this.l = textView5;
        this.m = textView7;
    }

    public static FragmentReportIncidentAddDetailsBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.add_details;
        EditText editText = (EditText) view2.findViewById(R.id.add_details);
        if (editText != null) {
            i2 = R.id.add_details_root;
            CardView cardView = (CardView) view2.findViewById(R.id.add_details_root);
            if (cardView != null) {
                i2 = R.id.attach_image;
                Button button = (Button) view2.findViewById(R.id.attach_image);
                if (button != null) {
                    i2 = R.id.avatar;
                    AvatarView avatarView = (AvatarView) view2.findViewById(R.id.avatar);
                    if (avatarView != null) {
                        i2 = R.id.back;
                        ImageView imageView = (ImageView) view2.findViewById(R.id.back);
                        if (imageView != null) {
                            i2 = R.id.content_container;
                            ScrollView scrollView = (ScrollView) view2.findViewById(R.id.content_container);
                            if (scrollView != null) {
                                i2 = R.id.details_of_the_incident;
                                TextView textView = (TextView) view2.findViewById(R.id.details_of_the_incident);
                                if (textView != null) {
                                    i2 = R.id.loading;
                                    FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.loading);
                                    if (frameLayout != null) {
                                        i2 = R.id.name;
                                        TextView textView2 = (TextView) view2.findViewById(R.id.name);
                                        if (textView2 != null) {
                                            i2 = R.id.please_give_us_as_much_context;
                                            TextView textView3 = (TextView) view2.findViewById(R.id.please_give_us_as_much_context);
                                            if (textView3 != null) {
                                                i2 = R.id.reporting_divider;
                                                View findViewById = view2.findViewById(R.id.reporting_divider);
                                                if (findViewById != null) {
                                                    i2 = R.id.reporting_reason;
                                                    TextView textView4 = (TextView) view2.findViewById(R.id.reporting_reason);
                                                    if (textView4 != null) {
                                                        i2 = R.id.screenshot;
                                                        ImageView imageView2 = (ImageView) view2.findViewById(R.id.screenshot);
                                                        if (imageView2 != null) {
                                                            i2 = R.id.screenshot_border;
                                                            ImageView imageView3 = (ImageView) view2.findViewById(R.id.screenshot_border);
                                                            if (imageView3 != null) {
                                                                i2 = R.id.screenshot_container;
                                                                FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.screenshot_container);
                                                                if (frameLayout2 != null) {
                                                                    i2 = R.id.submit;
                                                                    TextView textView5 = (TextView) view2.findViewById(R.id.submit);
                                                                    if (textView5 != null) {
                                                                        i2 = R.id.visual_evidence;
                                                                        TextView textView6 = (TextView) view2.findViewById(R.id.visual_evidence);
                                                                        if (textView6 != null) {
                                                                            i2 = R.id.we_have_attached_a_screenshot;
                                                                            TextView textView7 = (TextView) view2.findViewById(R.id.we_have_attached_a_screenshot);
                                                                            if (textView7 != null) {
                                                                                return new FragmentReportIncidentAddDetailsBinding((LinearLayout) view2, editText, cardView, button, avatarView, imageView, scrollView, textView, frameLayout, textView2, textView3, findViewById, textView4, imageView2, imageView3, frameLayout2, textView5, textView6, textView7);
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

    public static FragmentReportIncidentAddDetailsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_report_incident_add_details, (ViewGroup) null, false));
    }
}
