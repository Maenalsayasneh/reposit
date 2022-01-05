package com.instabug.featuresrequest.ui.custom;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.instabug.featuresrequest.R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.util.PlaceHolderUtils;

/* compiled from: ThanksDialog */
public class e extends DialogFragment {

    /* compiled from: ThanksDialog */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (e.this.isResumed() && e.this.isAdded()) {
                e.this.J0(false, false);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog = this.e2;
        if (!(dialog == null || dialog.getWindow() == null)) {
            this.e2.getWindow().requestFeature(1);
        }
        return layoutInflater.inflate(R.layout.ib_fr_thanks_dialog, viewGroup);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.feature_request_add_feature_thanks_msg);
        if (textView != null) {
            textView.setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.FEATURES_REQUEST_ADD_FEATURE_THANKS_MESSAGE, getString(R.string.feature_request_str_thanks_msg)));
            ImageView imageView = (ImageView) view.findViewById(R.id.instabug_img_thanks);
            if (imageView != null) {
                imageView.setColorFilter(Instabug.getPrimaryColor());
                new Handler().postDelayed(new a(), 3000);
            }
        }
    }
}
