package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubMigrationUpsellBinding implements a {
    public final TextView a;
    public final Button b;
    public final Button c;
    public final TextView d;
    public final Button e;

    public ClubMigrationUpsellBinding(LinearLayout linearLayout, TextView textView, Button button, Button button2, TextView textView2, Button button3) {
        this.a = textView;
        this.b = button;
        this.c = button2;
        this.d = textView2;
        this.e = button3;
    }

    public static ClubMigrationUpsellBinding bind(View view) {
        int i = R.id.body;
        TextView textView = (TextView) view.findViewById(R.id.body);
        if (textView != null) {
            i = R.id.faq_button;
            Button button = (Button) view.findViewById(R.id.faq_button);
            if (button != null) {
                i = R.id.no_button;
                Button button2 = (Button) view.findViewById(R.id.no_button);
                if (button2 != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) view.findViewById(R.id.title);
                    if (textView2 != null) {
                        i = R.id.yes_button;
                        Button button3 = (Button) view.findViewById(R.id.yes_button);
                        if (button3 != null) {
                            return new ClubMigrationUpsellBinding((LinearLayout) view, textView, button, button2, textView2, button3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ClubMigrationUpsellBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_migration_upsell, (ViewGroup) null, false));
    }
}
