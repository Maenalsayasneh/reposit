package com.clubhouse.android.ui.selection;

import android.widget.TextView;
import i0.e.b.g3.x.f;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: SelectionFragment.kt */
public final class SelectionFragment$invalidate$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ SelectionFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionFragment$invalidate$1(SelectionFragment selectionFragment) {
        super(1);
        this.c = selectionFragment;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        m0.n.b.i.e(fVar, "state");
        SelectionFragment selectionFragment = this.c;
        k<Object>[] kVarArr = SelectionFragment.Z1;
        selectionFragment.N0().d.g();
        String str = fVar.a;
        if (str != null) {
            this.c.N0().g.setText(str);
        }
        String str2 = fVar.d;
        if (str2 != null) {
            SelectionFragment selectionFragment2 = this.c;
            selectionFragment2.N0().f.setText(str2);
            TextView textView = selectionFragment2.N0().f;
            m0.n.b.i.d(textView, "binding.selectionListHeader");
            i0.e.b.d3.k.K(textView);
        }
        String str3 = fVar.e;
        if (str3 == null) {
            return null;
        }
        SelectionFragment selectionFragment3 = this.c;
        selectionFragment3.N0().e.setText(str3);
        TextView textView2 = selectionFragment3.N0().e;
        m0.n.b.i.d(textView2, "binding.selectionListFooter");
        i0.e.b.d3.k.K(textView2);
        return i.a;
    }
}
