package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.u.v1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$showEditNameWarningDialog$2 extends Lambda implements l<d.a, i> {
    public static final HalfProfileUtil$showEditNameWarningDialog$2 c = new HalfProfileUtil$showEditNameWarningDialog$2();

    public HalfProfileUtil$showEditNameWarningDialog$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.your_name_cant_be_changed, R.string.you_have_already_changed_your_name);
        aVar.d(R.string.ok, v1.c);
        return i.a;
    }
}
