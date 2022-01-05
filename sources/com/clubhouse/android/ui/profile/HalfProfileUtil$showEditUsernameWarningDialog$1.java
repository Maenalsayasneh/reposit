package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.u.w1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$showEditUsernameWarningDialog$1 extends Lambda implements l<d.a, i> {
    public static final HalfProfileUtil$showEditUsernameWarningDialog$1 c = new HalfProfileUtil$showEditUsernameWarningDialog$1();

    public HalfProfileUtil$showEditUsernameWarningDialog$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.your_username_cant_be_changed, R.string.your_username_lets_others);
        aVar.d(R.string.ok, w1.c);
        return i.a;
    }
}
