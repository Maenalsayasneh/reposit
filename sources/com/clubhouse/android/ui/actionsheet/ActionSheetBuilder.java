package com.clubhouse.android.ui.actionsheet;

import i0.e.b.g3.i.c;
import java.util.ArrayList;
import java.util.List;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ActionSheetFragment.kt */
public final class ActionSheetBuilder {
    public String a;
    public String b;
    public boolean c;
    public a<i> d = ActionSheetBuilder$onCancel$1.c;
    public final List<c> e = new ArrayList();

    public final boolean a(l<? super c, i> lVar) {
        m0.n.b.i.e(lVar, "f");
        c cVar = new c((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, false, (a) null, 127);
        lVar.invoke(cVar);
        return this.e.add(cVar);
    }
}
