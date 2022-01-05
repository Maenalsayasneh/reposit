package com.clubhouse.android.ui.events.creation;

import i0.e.b.g3.o.w0.w;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$initDescription$3 extends Lambda implements l<w, i> {
    public final /* synthetic */ AddEditEventFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$initDescription$3(AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        String str = wVar.e;
        if (str == null) {
            return null;
        }
        AddEditEventFragment addEditEventFragment = this.c;
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        addEditEventFragment.N0().i.setText(str);
        return i.a;
    }
}
