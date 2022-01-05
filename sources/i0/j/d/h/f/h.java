package i0.j.d.h.f;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.custom.SnackbarLayout;
import com.instabug.featuresrequest.ui.e.c;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.util.LocaleHelper;
import com.instabug.library.util.PlaceHolderUtils;
import h0.i.b.a;
import i0.j.d.h.d.d;
import i0.j.d.h.d.e;
import i0.j.d.h.d.j;

/* compiled from: AddNewFeatureFragment */
public class h implements Runnable {
    public final /* synthetic */ c c;

    public h(c cVar) {
        this.c = cVar;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void run() {
        if (this.c.getContext() != null) {
            c cVar = this.c;
            RelativeLayout relativeLayout = cVar.g2;
            String placeHolder = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.FEATURES_REQUEST_ADD_FEATURE_TOAST, cVar.getString(R.string.feature_requests_new_toast_message));
            d dVar = new d(relativeLayout);
            dVar.e.getMessageView().setText(placeHolder);
            dVar.f = 0;
            dVar.e.getActionView().setTextColor(-1);
            if (LocaleHelper.isRTL(this.c.getContext())) {
                int i = R.drawable.ibg_core_ic_close;
                TextView messageView = dVar.e.getMessageView();
                Drawable drawable = a.getDrawable(dVar.d, i);
                if (drawable != null) {
                    Drawable a = dVar.a(drawable, (int) ((((float) dVar.d.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 24.0f));
                    Drawable[] compoundDrawables = messageView.getCompoundDrawables();
                    messageView.setCompoundDrawables(a, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
                } else {
                    throw new IllegalArgumentException("resource_id is not a valid drawable!");
                }
            } else {
                int i2 = R.drawable.ibg_core_ic_close;
                TextView messageView2 = dVar.e.getMessageView();
                Drawable drawable2 = a.getDrawable(dVar.d, i2);
                if (drawable2 != null) {
                    Drawable a2 = dVar.a(drawable2, (int) ((((float) dVar.d.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 24.0f));
                    Drawable[] compoundDrawables2 = messageView2.getCompoundDrawables();
                    messageView2.setCompoundDrawables(compoundDrawables2[0], compoundDrawables2[1], a2, compoundDrawables2[3]);
                } else {
                    throw new IllegalArgumentException("resource_id is not a valid drawable!");
                }
            }
            SnackbarLayout snackbarLayout = dVar.e;
            snackbarLayout.q = 3000;
            snackbarLayout.setBackgroundColor(this.c.getResources().getColor(R.color.ib_fr_new_feature_toast_bg));
            ((TextView) snackbarLayout.findViewById(R.id.snackbar_text)).setTextColor(-1);
            j a3 = j.a();
            int i3 = dVar.f;
            j.b bVar = dVar.g;
            synchronized (a3.b) {
                if (a3.d != null) {
                    if (a3.e != null) {
                        if (a3.h(bVar)) {
                            j.c cVar2 = a3.d;
                            cVar2.b = i3;
                            a3.c.removeCallbacksAndMessages(cVar2);
                            a3.e(a3.d);
                        } else {
                            if (a3.i(bVar)) {
                                a3.e.b = i3;
                            } else {
                                a3.e = new j.c(i3, bVar);
                            }
                            j.c cVar3 = a3.d;
                            if (cVar3 == null || !a3.c(cVar3, 4)) {
                                a3.d = null;
                                a3.d();
                            }
                        }
                    }
                }
            }
            dVar.e.setOnTouchListener(new e(dVar));
        }
    }
}
