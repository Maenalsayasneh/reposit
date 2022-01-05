package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class DialogEditTextBinding implements a {
    public final FrameLayout a;
    public final EditText b;

    public DialogEditTextBinding(FrameLayout frameLayout, EditText editText) {
        this.a = frameLayout;
        this.b = editText;
    }

    public static DialogEditTextBinding bind(View view) {
        EditText editText = (EditText) view.findViewById(R.id.text);
        if (editText != null) {
            return new DialogEditTextBinding((FrameLayout) view, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.text)));
    }

    public static DialogEditTextBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialog_edit_text, (ViewGroup) null, false));
    }
}
