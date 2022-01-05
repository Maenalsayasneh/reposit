package i0.j.d.h.f;

import android.content.Context;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.e.c;
import com.instabug.library.Instabug;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.view.ViewUtils;
import i0.j.c.l.a;

/* compiled from: AddNewFeatureFragment */
public class b implements View.OnFocusChangeListener {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public void onFocusChange(View view, boolean z) {
        if (this.a.getContext() != null) {
            if (z) {
                this.a.c2.getLayoutParams().height = ViewUtils.convertDpToPx(this.a.getContext(), 2.0f);
                if (this.a.d.isErrorEnabled()) {
                    c cVar = this.a;
                    TextInputLayout textInputLayout = cVar.d;
                    Context context = cVar.getContext();
                    int i = R.color.ib_fr_add_comment_error;
                    a.I(textInputLayout, h0.i.b.a.getColor(context, i));
                    c cVar2 = this.a;
                    cVar2.c2.setBackgroundColor(h0.i.b.a.getColor(cVar2.getContext(), i));
                } else {
                    a.I(this.a.d, Instabug.getPrimaryColor());
                    this.a.c2.setBackgroundColor(Instabug.getPrimaryColor());
                }
            } else {
                a.I(this.a.d, Instabug.getPrimaryColor());
                c cVar3 = this.a;
                cVar3.c2.setBackgroundColor(AttrResolver.getColor(cVar3.getContext(), R.attr.ib_fr_add_comment_edit_text_underline_color));
                this.a.c2.getLayoutParams().height = ViewUtils.convertDpToPx(this.a.getContext(), 1.0f);
            }
            this.a.c2.requestLayout();
        }
    }
}
