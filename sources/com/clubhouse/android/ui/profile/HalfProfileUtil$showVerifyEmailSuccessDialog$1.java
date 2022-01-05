package com.clubhouse.android.ui.profile;

import androidx.fragment.app.Fragment;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.u.f2;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$showVerifyEmailSuccessDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$showVerifyEmailSuccessDialog$1(Fragment fragment, String str) {
        super(1);
        this.c = fragment;
        this.d = str;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.email_verify_success_title);
        aVar.a.f = this.c.getString(R.string.email_verify_success_body, this.d);
        aVar.d(R.string.ok, f2.c);
        return i.a;
    }
}
