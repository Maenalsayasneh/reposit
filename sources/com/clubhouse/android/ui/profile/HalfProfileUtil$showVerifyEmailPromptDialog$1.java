package com.clubhouse.android.ui.profile;

import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.a3.b.a;
import i0.e.b.g3.u.d2;
import i0.e.b.g3.u.e2;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$showVerifyEmailPromptDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ DialogEditTextBinding c;
    public final /* synthetic */ a<?> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$showVerifyEmailPromptDialog$1(DialogEditTextBinding dialogEditTextBinding, a<?> aVar) {
        super(1);
        this.c = dialogEditTextBinding;
        this.d = aVar;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.email_verify_prompt_title);
        aVar.f(this.c.a);
        aVar.b(R.string.email_verify_prompt_body);
        aVar.d(R.string.verify, new e2(this.d, this.c));
        aVar.c(R.string.cancel, d2.c);
        return i.a;
    }
}
