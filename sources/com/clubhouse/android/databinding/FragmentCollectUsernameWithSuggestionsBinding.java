package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentCollectUsernameWithSuggestionsBinding implements a {
    public final Button a;
    public final TextView b;
    public final FrameLayout c;
    public final ProgressBar d;
    public final Button e;
    public final TextView f;
    public final TextView g;
    public final EditText h;

    public FragmentCollectUsernameWithSuggestionsBinding(ConstraintLayout constraintLayout, Button button, TextView textView, FrameLayout frameLayout, ProgressBar progressBar, Button button2, TextView textView2, TextView textView3, TextView textView4, EditText editText) {
        this.a = button;
        this.b = textView;
        this.c = frameLayout;
        this.d = progressBar;
        this.e = button2;
        this.f = textView2;
        this.g = textView4;
        this.h = editText;
    }

    public static FragmentCollectUsernameWithSuggestionsBinding bind(View view) {
        int i = R.id.change_username_button;
        Button button = (Button) view.findViewById(R.id.change_username_button);
        if (button != null) {
            i = R.id.default_suggestion;
            TextView textView = (TextView) view.findViewById(R.id.default_suggestion);
            if (textView != null) {
                i = R.id.fullscreen_loading;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fullscreen_loading);
                if (frameLayout != null) {
                    i = R.id.loading;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading);
                    if (progressBar != null) {
                        i = R.id.next_button;
                        Button button2 = (Button) view.findViewById(R.id.next_button);
                        if (button2 != null) {
                            i = R.id.suggestions;
                            TextView textView2 = (TextView) view.findViewById(R.id.suggestions);
                            if (textView2 != null) {
                                i = R.id.title;
                                TextView textView3 = (TextView) view.findViewById(R.id.title);
                                if (textView3 != null) {
                                    i = R.id.title_hint;
                                    TextView textView4 = (TextView) view.findViewById(R.id.title_hint);
                                    if (textView4 != null) {
                                        i = R.id.username;
                                        EditText editText = (EditText) view.findViewById(R.id.username);
                                        if (editText != null) {
                                            return new FragmentCollectUsernameWithSuggestionsBinding((ConstraintLayout) view, button, textView, frameLayout, progressBar, button2, textView2, textView3, textView4, editText);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentCollectUsernameWithSuggestionsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_collect_username_with_suggestions, (ViewGroup) null, false));
    }
}
