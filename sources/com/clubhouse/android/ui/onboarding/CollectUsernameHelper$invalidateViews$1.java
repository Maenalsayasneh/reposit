package com.clubhouse.android.ui.onboarding;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.e.b.g3.r.w0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: CollectUsernameUtil.kt */
public final class CollectUsernameHelper$invalidateViews$1 extends Lambda implements l<w0, i> {
    public final /* synthetic */ CollectUsernameHelper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectUsernameHelper$invalidateViews$1(CollectUsernameHelper collectUsernameHelper) {
        super(1);
        this.c = collectUsernameHelper;
    }

    public Object invoke(Object obj) {
        w0 w0Var = (w0) obj;
        m0.n.b.i.e(w0Var, "state");
        Button button = this.c.b.c;
        m0.n.b.i.d(button, "binding.nextButton");
        k.k(button, Boolean.valueOf(this.c.b.f.length() > 1));
        ProgressBar progressBar = this.c.b.b;
        m0.n.b.i.d(progressBar, "binding.loading");
        progressBar.setVisibility(w0Var.f ? 0 : 8);
        String str = w0Var.c;
        if (str == null) {
            return null;
        }
        CollectUsernameHelper collectUsernameHelper = this.c;
        collectUsernameHelper.b.f.setText(collectUsernameHelper.a.getString(R.string.username, str));
        EditText editText = collectUsernameHelper.b.f;
        editText.setSelection(editText.length());
        return i.a;
    }
}
