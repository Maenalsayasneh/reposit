package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ClubMemberSearchBarBinding implements a {
    public final EditText a;

    public ClubMemberSearchBarBinding(ConstraintLayout constraintLayout, EditText editText) {
        this.a = editText;
    }

    public static ClubMemberSearchBarBinding bind(View view) {
        EditText editText = (EditText) view.findViewById(R.id.search);
        if (editText != null) {
            return new ClubMemberSearchBarBinding((ConstraintLayout) view, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.search)));
    }

    public static ClubMemberSearchBarBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.club_member_search_bar, (ViewGroup) null, false));
    }
}
