package com.clubhouse.android.ui.events.creation;

import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$initCoHosts$2 extends Lambda implements l<o, i> {
    public final /* synthetic */ AddEditEventFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$initCoHosts$2(AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        AddEditEventFragment addEditEventFragment = this.c;
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        v.v2(addEditEventFragment.O0(), new AddEditEventFragment$buildCoHostsModels$1(oVar, addEditEventFragment));
        return i.a;
    }
}
