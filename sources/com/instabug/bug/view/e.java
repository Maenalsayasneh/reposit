package com.instabug.bug.view;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.instabug.bug.R;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.InstabugAppData;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PlaceHolderUtils;
import h0.c0.a.a.d;

/* compiled from: InstabugThanksFragment */
public class e extends DialogFragment {

    /* compiled from: InstabugThanksFragment */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (e.this.getActivity() != null) {
                e.this.getActivity().finish();
            }
        }
    }

    /* compiled from: InstabugThanksFragment */
    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            if (e.this.getActivity() != null) {
                e.this.getActivity().finish();
            }
        }
    }

    public Dialog L0(Bundle bundle) {
        Dialog L0 = super.L0(bundle);
        if (L0.getWindow() != null) {
            L0.getWindow().requestFeature(1);
        }
        return L0;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.e2.getWindow() != null) {
            this.e2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        new Handler().postDelayed(new a(), 4000);
        return layoutInflater.inflate(R.layout.ibg_bug_lyt_thanks, viewGroup);
    }

    public void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.e2;
        if (dialog != null && dialog.getWindow() != null) {
            this.e2.getWindow().setWindowAnimations(R.style.InstabugDialogAnimation);
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Drawable drawable;
        super.onViewCreated(view, bundle);
        if (getContext() != null) {
            DrawableUtils.setColor(view.findViewById(R.id.ib_success_layout), AttrResolver.getColor(getContext(), R.attr.instabug_background_color));
        }
        InstabugCustomTextPlaceHolder.Key key = InstabugCustomTextPlaceHolder.Key.REPORT_SUCCESSFULLY_SENT;
        if (getActivity() != null) {
            str = new InstabugAppData(getActivity().getApplicationContext()).getAppName();
            if (str == null) {
                InstabugSDKLogger.d("InstabugThanksFragment", "It seems app:name isn't defined in your manifest. Using a generic name instead");
            }
        } else {
            str = null;
        }
        int i = R.string.instabug_str_success_note;
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "App";
        }
        objArr[0] = str;
        ((TextView) view.findViewById(R.id.instabug_txt_success_note)).setText(PlaceHolderUtils.getPlaceHolder(key, getString(i, objArr)));
        if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
            view.findViewById(R.id.instabug_pbi_container).setVisibility(8);
        } else {
            view.findViewById(R.id.instabug_pbi_container).setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(R.id.image_instabug_logo);
            if (getContext() != null) {
                imageView.setBackgroundDrawable(Colorizer.getTintedDrawable(h0.i.b.a.getColor(getContext(), 17170443), d.a(getContext().getResources(), R.drawable.ibg_core_ic_instabug_logo, getContext().getTheme())));
            }
        }
        TextView textView = (TextView) view.findViewById(com.instabug.library.R.id.instabug_fragment_title);
        textView.setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.SUCCESS_DIALOG_HEADER, getString(R.string.instabug_str_thank_you)));
        ImageView imageView2 = (ImageView) view.findViewById(R.id.instabug_img_thanks);
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            textView.setTextColor(Instabug.getPrimaryColor());
        } else if (getContext() != null) {
            textView.setTextColor(h0.i.b.a.getColor(getContext(), 17170443));
        }
        imageView2.setColorFilter(Instabug.getPrimaryColor());
        if (!(getContext() == null || (drawable = h0.i.b.a.getDrawable(getContext(), R.drawable.ibg_bug_shape_thanks_background)) == null)) {
            imageView2.setBackgroundDrawable(Colorizer.getPrimaryColorTintedDrawable(drawable));
        }
        view.setOnClickListener(new b());
    }
}
