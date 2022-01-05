package com.instabug.library.ui.onboarding;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.view.ViewUtils;
import i0.d.a.a.a;

/* compiled from: OnboardingPagerFragment */
public class d extends InstabugBaseFragment {
    public String c;
    public String d;
    public int q;
    public boolean x = false;

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static d I0(int i, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("img", i);
        bundle.putString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, str);
        bundle.putString("subtitle", str2);
        d dVar = new d();
        dVar.setArguments(bundle);
        return dVar;
    }

    public int getLayout() {
        return R.layout.ib_core_lyt_onboarding_pager_fragment;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void initViews(View view, Bundle bundle) {
        TextView textView = (TextView) findViewById(R.id.ib_core_tv_title);
        TextView textView2 = (TextView) findViewById(R.id.ib_core_tv_subtitle);
        ImageView imageView = (ImageView) findViewById(R.id.ib_core_img_onboarding);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.ib_core_lyt_onboarding_pager_fragment);
        Context context = getContext();
        if (!(relativeLayout == null || context == null)) {
            if (LocaleUtils.isRTL(Instabug.getLocale(context))) {
                relativeLayout.setRotation(180.0f);
            }
            if (this.x) {
                relativeLayout.setPadding(ViewUtils.convertDpToPx(context, 16.0f), ViewUtils.convertDpToPx(context, 24.0f), ViewUtils.convertDpToPx(context, 16.0f), ViewUtils.convertDpToPx(context, 16.0f));
            }
        }
        if (textView != null) {
            textView.setText(this.c);
        }
        if (textView2 != null) {
            textView2.setText(this.d);
        }
        if (imageView != null) {
            try {
                imageView.setImageResource(this.q);
                imageView.setBackgroundColor(Instabug.getPrimaryColor());
                int i = -ViewUtils.convertDpToPx(context, 1.0f);
                imageView.setPadding(i, i, i, i);
            } catch (Exception e) {
                StringBuilder P0 = a.P0("couldn't setImageResource for drawableId {");
                P0.append(this.q);
                P0.append("}");
                InstabugSDKLogger.e("OnboardingPagerFragment", P0.toString(), e);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = getArguments().getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
            this.d = getArguments().getString("subtitle");
            this.q = getArguments().getInt("img");
            this.x = getArguments().getBoolean("setLivePadding");
        }
    }
}
