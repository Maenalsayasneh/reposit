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
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentReportProfileLegacyBinding implements a {
    public final CardView a;
    public final ImageView b;
    public final AvatarView c;
    public final ImageView d;
    public final TextView e;
    public final Button f;
    public final ScrollView g;
    public final EditText h;
    public final EditText i;
    public final FrameLayout j;
    public final TextView k;
    public final AppCompatSpinner l;
    public final Button m;
    public final ConstraintLayout n;
    public final TextView o;
    public final TextView p;

    public FragmentReportProfileLegacyBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, AvatarView avatarView, ImageView imageView2, TextView textView, Button button, ScrollView scrollView, EditText editText, EditText editText2, FrameLayout frameLayout, TextView textView2, AppCompatSpinner appCompatSpinner, Button button2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, TextView textView5) {
        this.a = cardView;
        this.b = imageView;
        this.c = avatarView;
        this.d = imageView2;
        this.e = textView;
        this.f = button;
        this.g = scrollView;
        this.h = editText;
        this.i = editText2;
        this.j = frameLayout;
        this.k = textView2;
        this.l = appCompatSpinner;
        this.m = button2;
        this.n = constraintLayout;
        this.o = textView4;
        this.p = textView5;
    }

    public static FragmentReportProfileLegacyBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.attach_image;
        CardView cardView = (CardView) view2.findViewById(R.id.attach_image);
        if (cardView != null) {
            i2 = R.id.attached_image;
            ImageView imageView = (ImageView) view2.findViewById(R.id.attached_image);
            if (imageView != null) {
                i2 = R.id.avatar;
                AvatarView avatarView = (AvatarView) view2.findViewById(R.id.avatar);
                if (avatarView != null) {
                    i2 = R.id.back;
                    ImageView imageView2 = (ImageView) view2.findViewById(R.id.back);
                    if (imageView2 != null) {
                        i2 = R.id.channel_role;
                        TextView textView = (TextView) view2.findViewById(R.id.channel_role);
                        if (textView != null) {
                            i2 = R.id.close;
                            Button button = (Button) view2.findViewById(R.id.close);
                            if (button != null) {
                                i2 = R.id.content_container;
                                ScrollView scrollView = (ScrollView) view2.findViewById(R.id.content_container);
                                if (scrollView != null) {
                                    i2 = R.id.email_address;
                                    EditText editText = (EditText) view2.findViewById(R.id.email_address);
                                    if (editText != null) {
                                        i2 = R.id.incident_details;
                                        EditText editText2 = (EditText) view2.findViewById(R.id.incident_details);
                                        if (editText2 != null) {
                                            i2 = R.id.loading;
                                            FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.loading);
                                            if (frameLayout != null) {
                                                i2 = R.id.name;
                                                TextView textView2 = (TextView) view2.findViewById(R.id.name);
                                                if (textView2 != null) {
                                                    i2 = R.id.report_reason_spinner;
                                                    AppCompatSpinner appCompatSpinner = (AppCompatSpinner) view2.findViewById(R.id.report_reason_spinner);
                                                    if (appCompatSpinner != null) {
                                                        i2 = R.id.submit;
                                                        Button button2 = (Button) view2.findViewById(R.id.submit);
                                                        if (button2 != null) {
                                                            i2 = R.id.success_container;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.success_container);
                                                            if (constraintLayout != null) {
                                                                i2 = R.id.thank_you;
                                                                TextView textView3 = (TextView) view2.findViewById(R.id.thank_you);
                                                                if (textView3 != null) {
                                                                    i2 = R.id.username;
                                                                    TextView textView4 = (TextView) view2.findViewById(R.id.username);
                                                                    if (textView4 != null) {
                                                                        i2 = R.id.why_report;
                                                                        TextView textView5 = (TextView) view2.findViewById(R.id.why_report);
                                                                        if (textView5 != null) {
                                                                            return new FragmentReportProfileLegacyBinding((LinearLayout) view2, cardView, imageView, avatarView, imageView2, textView, button, scrollView, editText, editText2, frameLayout, textView2, appCompatSpinner, button2, constraintLayout, textView3, textView4, textView5);
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

    public static FragmentReportProfileLegacyBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_report_profile_legacy, (ViewGroup) null, false));
    }
}
