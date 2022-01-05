package i0.j.d.h.f;

import android.view.View;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.e.c;
import com.instabug.library.Instabug;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.view.ViewUtils;

/* compiled from: AddNewFeatureFragment */
public class d implements View.OnFocusChangeListener {
    public final /* synthetic */ c a;

    public d(c cVar) {
        this.a = cVar;
    }

    public void onFocusChange(View view, boolean z) {
        if (this.a.getContext() != null) {
            if (z) {
                this.a.e2.getLayoutParams().height = ViewUtils.convertDpToPx(this.a.getContext(), 2.0f);
                this.a.e2.setBackgroundColor(Instabug.getPrimaryColor());
            } else {
                this.a.e2.getLayoutParams().height = ViewUtils.convertDpToPx(this.a.getContext(), 1.0f);
                c cVar = this.a;
                cVar.e2.setBackgroundColor(AttrResolver.getColor(cVar.getContext(), R.attr.ib_fr_add_comment_edit_text_underline_color));
            }
            this.a.e2.requestLayout();
        }
    }
}
