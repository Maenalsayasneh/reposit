package com.clubhouse.android.ui.payments;

import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.s.a0;
import i0.e.b.g3.s.b0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SendDirectPaymentFragment.kt */
public final class SendDirectPaymentFragment$onViewCreated$6$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ DialogEditTextBinding c;
    public final /* synthetic */ SendDirectPaymentFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentFragment$onViewCreated$6$1(DialogEditTextBinding dialogEditTextBinding, SendDirectPaymentFragment sendDirectPaymentFragment) {
        super(1);
        this.c = dialogEditTextBinding;
        this.d = sendDirectPaymentFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.enter_amount_title_dollars);
        aVar.f(this.c.a);
        aVar.d(R.string.select, new b0(this.d, this.c));
        aVar.c(R.string.cancel, a0.c);
        return i.a;
    }
}
