package com.clubhouse.android.ui.onboarding;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.r.g;
import i0.e.b.g3.r.h;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: CollectPhoneNumberFragment.kt */
public final class CollectPhoneNumberFragment$validatePhoneNumber$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ CollectPhoneNumberFragment c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectPhoneNumberFragment$validatePhoneNumber$1(CollectPhoneNumberFragment collectPhoneNumberFragment, String str) {
        super(1);
        this.c = collectPhoneNumberFragment;
        this.d = str;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.confirm_phone_number);
        aVar.a.f = this.c.getString(R.string.may_be_invalid, this.d);
        aVar.d(R.string.continue_confirmation, new h(this.c, this.d));
        aVar.c(R.string.cancel, g.c);
        return i.a;
    }
}
