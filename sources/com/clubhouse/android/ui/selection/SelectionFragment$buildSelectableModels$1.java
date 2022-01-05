package com.clubhouse.android.ui.selection;

import i0.b.a.o;
import i0.e.b.g3.x.c;
import i0.e.b.g3.x.f;
import i0.e.b.g3.x.g.e;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: SelectionFragment.kt */
public final class SelectionFragment$buildSelectableModels$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ SelectionFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionFragment$buildSelectableModels$1(o oVar, SelectionFragment selectionFragment) {
        super(1);
        this.c = oVar;
        this.d = selectionFragment;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        m0.n.b.i.e(fVar, "state");
        Set<Selection> set = fVar.b;
        o oVar = this.c;
        SelectionFragment selectionFragment = this.d;
        for (Selection selection : set) {
            i0.e.b.g3.x.g.f fVar2 = new i0.e.b.g3.x.g.f();
            fVar2.M(new Number[]{Integer.valueOf(selection.c)});
            fVar2.Q(selectionFragment.getResources().getString(selection.c));
            fVar2.O(m0.n.b.i.a(selection, fVar.c));
            fVar2.N(new c(selectionFragment, selection));
            oVar.add(fVar2);
            if (!m0.n.b.i.a(g.F(fVar.b), selection)) {
                e eVar = new e();
                eVar.K(m0.n.b.i.k("divider", selection));
                oVar.add(eVar);
            }
        }
        return i.a;
    }
}
