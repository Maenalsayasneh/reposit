package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;
import java.util.Objects;

public final class ReportReasonBinding implements a {
    public final TextView a;
    public final TextView b;

    public ReportReasonBinding(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    public static ReportReasonBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new ReportReasonBinding(textView, textView);
    }

    public static ReportReasonBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.report_reason, (ViewGroup) null, false));
    }
}
