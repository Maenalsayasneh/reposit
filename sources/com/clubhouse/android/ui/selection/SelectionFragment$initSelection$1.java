package com.clubhouse.android.ui.selection;

import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: SelectionFragment.kt */
public final class SelectionFragment$initSelection$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ SelectionFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionFragment$initSelection$1(SelectionFragment selectionFragment) {
        super(1);
        this.c = selectionFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        SelectionFragment selectionFragment = this.c;
        k<Object>[] kVarArr = SelectionFragment.Z1;
        v.v2(selectionFragment.O0(), new SelectionFragment$buildSelectableModels$1(oVar, selectionFragment));
        return i.a;
    }
}
