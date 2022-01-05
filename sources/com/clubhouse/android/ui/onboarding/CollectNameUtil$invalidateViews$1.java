package com.clubhouse.android.ui.onboarding;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.clubhouse.android.data.models.local.user.BasicUser;
import h0.b0.v;
import i0.e.b.d3.k;
import i0.e.b.g3.r.o0;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.n.a.l;

/* compiled from: CollectNameUtil.kt */
public final class CollectNameUtil$invalidateViews$1 extends Lambda implements l<o0, i> {
    public final /* synthetic */ CollectNameUtil c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectNameUtil$invalidateViews$1(CollectNameUtil collectNameUtil) {
        super(1);
        this.c = collectNameUtil;
    }

    public Object invoke(Object obj) {
        o0 o0Var = (o0) obj;
        m0.n.b.i.e(o0Var, "state");
        ProgressBar progressBar = this.c.b.d;
        m0.n.b.i.d(progressBar, "binding.loading");
        boolean z = false;
        progressBar.setVisibility(o0Var.b ? 0 : 8);
        String obj2 = this.c.b.b.getText().toString();
        String obj3 = this.c.b.c.getText().toString();
        Button button = this.c.b.e;
        m0.n.b.i.d(button, "binding.nextButton");
        if ((!StringsKt__IndentKt.o(obj2)) && (!StringsKt__IndentKt.o(obj3))) {
            z = true;
        }
        k.k(button, Boolean.valueOf(z));
        BasicUser basicUser = o0Var.a;
        if (basicUser == null || basicUser.d == null) {
            return null;
        }
        CollectNameUtil collectNameUtil = this.c;
        collectNameUtil.b.b.setText(v.g0(basicUser));
        EditText editText = collectNameUtil.b.b;
        editText.setSelection(editText.length());
        EditText editText2 = collectNameUtil.b.c;
        BasicUser basicUser2 = o0Var.a;
        Objects.requireNonNull(basicUser2);
        editText2.setText(v.O0(basicUser2));
        return i.a;
    }
}
