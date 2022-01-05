package com.clubhouse.android.ui.actionsheet;

import android.view.View;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.i.a;
import i0.e.b.g3.i.c;
import i0.e.b.g3.i.f;
import i0.e.b.g3.i.h;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ActionSheetFragment.kt */
public final class ActionSheetFragment$onViewCreated$3 extends Lambda implements l<o, i> {
    public final /* synthetic */ ActionSheetFragment c;
    public final /* synthetic */ View d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionSheetFragment$onViewCreated$3(ActionSheetFragment actionSheetFragment, View view) {
        super(1);
        this.c = actionSheetFragment;
        this.d = view;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        ActionSheetFragment actionSheetFragment = this.c;
        k<Object>[] kVarArr = ActionSheetFragment.p2;
        ActionSheetViewModel V0 = actionSheetFragment.V0();
        final ActionSheetFragment actionSheetFragment2 = this.c;
        final View view = this.d;
        v.v2(V0, new l<h, i>() {
            public Object invoke(Object obj) {
                h hVar = (h) obj;
                m0.n.b.i.e(hVar, "state");
                ActionSheetFragment actionSheetFragment = ActionSheetFragment.this;
                List<c> list = actionSheetFragment.s2;
                o oVar = oVar;
                View view = view;
                for (c cVar : list) {
                    f fVar = new f();
                    fVar.M(cVar.d);
                    fVar.L(cVar);
                    fVar.O(m0.n.b.i.a(cVar, hVar.d));
                    fVar.N(new a(actionSheetFragment, cVar, view));
                    oVar.add(fVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
