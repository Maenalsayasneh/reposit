package com.clubhouse.android.ui.payments;

import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.s.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PaymentsRegistrationFragment.kt */
public final class PaymentsRegistrationFragment$showVerifyEmailPromptDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ DialogEditTextBinding c;
    public final /* synthetic */ PaymentsRegistrationFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationFragment$showVerifyEmailPromptDialog$1(DialogEditTextBinding dialogEditTextBinding, PaymentsRegistrationFragment paymentsRegistrationFragment) {
        super(1);
        this.c = dialogEditTextBinding;
        this.d = paymentsRegistrationFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.email_verify_prompt_title);
        aVar.f(this.c.a);
        aVar.b(R.string.email_verify_prompt_body);
        aVar.d(R.string.verify, new i0.e.b.g3.s.i(this.d, this.c));
        aVar.c(R.string.cancel, j.c);
        return i.a;
    }
}
