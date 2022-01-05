package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import h0.e0.a;

public final class FragmentPaymentsheetPaymentMethodsListBinding implements a {
    public final TextView header;
    public final RecyclerView recycler;
    private final LinearLayout rootView;
    public final TextView total;

    private FragmentPaymentsheetPaymentMethodsListBinding(LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, TextView textView2) {
        this.rootView = linearLayout;
        this.header = textView;
        this.recycler = recyclerView;
        this.total = textView2;
    }

    public static FragmentPaymentsheetPaymentMethodsListBinding bind(View view) {
        int i = R.id.header;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.recycler;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
            if (recyclerView != null) {
                i = R.id.total;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    return new FragmentPaymentsheetPaymentMethodsListBinding((LinearLayout) view, textView, recyclerView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentPaymentsheetPaymentMethodsListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentPaymentsheetPaymentMethodsListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_paymentsheet_payment_methods_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
