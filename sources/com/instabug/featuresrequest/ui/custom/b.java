package com.instabug.featuresrequest.ui.custom;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.instabug.featuresrequest.R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import h0.i.b.a;

/* compiled from: DialogProgress */
public class b extends DialogFragment {
    public TextView j2;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog = this.e2;
        if (!(dialog == null || dialog.getWindow() == null)) {
            this.e2.getWindow().requestFeature(1);
        }
        return layoutInflater.inflate(R.layout.ib_fr_progress_dialog_layout, viewGroup);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.j2 = (TextView) view.findViewById(R.id.textView);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        if (this.j2 != null && progressBar != null) {
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(Instabug.getPrimaryColor(), PorterDuff.Mode.SRC_IN);
            }
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeDark) {
                View findViewById = view.findViewById(R.id.progressDialogLayout);
                Context context = view.getContext();
                int i = R.color.instabug_dialog_dark_bg_color;
                findViewById.setBackgroundColor(a.getColor(context, i));
                this.j2.setTextColor(a.getColor(view.getContext(), 17170443));
                this.j2.setBackgroundColor(a.getColor(view.getContext(), i));
            }
        }
    }
}
