package com.clubhouse.android.ui.selection;

import h0.b0.v;
import i0.e.b.g3.x.f;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SelectionFragment.kt */
public final class SelectionFragment$handleSelection$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ SelectionFragment c;
    public final /* synthetic */ Selection d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionFragment$handleSelection$1(SelectionFragment selectionFragment, Selection selection) {
        super(1);
        this.c = selectionFragment;
        this.d = selection;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        m0.n.b.i.e(fVar, "state");
        v.V1(this.c, "selected_item_result", new Pair(fVar.a, this.d));
        v.c1(this.c);
        return i.a;
    }
}
