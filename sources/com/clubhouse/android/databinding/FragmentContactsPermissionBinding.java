package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentContactsPermissionBinding implements a {
    public FragmentContactsPermissionBinding(ConstraintLayout constraintLayout, Button button, TextView textView) {
    }

    public static FragmentContactsPermissionBinding bind(View view) {
        int i = R.id.skip_button;
        Button button = (Button) view.findViewById(R.id.skip_button);
        if (button != null) {
            i = R.id.title;
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (textView != null) {
                return new FragmentContactsPermissionBinding((ConstraintLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentContactsPermissionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_contacts_permission, (ViewGroup) null, false));
    }
}
