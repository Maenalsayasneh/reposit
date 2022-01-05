package com.clubhouse.android.ui.onboarding;

import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: CollectNameUtil.kt */
public final class CollectNameUtil$updateName$1 extends Lambda implements l<j, i> {
    public static final CollectNameUtil$updateName$1 c = new CollectNameUtil$updateName$1();

    public CollectNameUtil$updateName$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showNegativeBanner");
        jVar.d(R.string.full_name_error);
        return i.a;
    }
}
