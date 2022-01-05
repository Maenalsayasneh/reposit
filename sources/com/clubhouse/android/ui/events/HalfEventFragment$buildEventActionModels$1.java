package com.clubhouse.android.ui.events;

import androidx.recyclerview.widget.GridLayoutManager;
import com.clubhouse.android.ui.events.HalfEventFragment;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.o.l0;
import i0.e.b.g3.o.m;
import i0.e.b.g3.o.x0.e;
import i0.e.b.g3.o.x0.t;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$buildEventActionModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ GridLayoutManager c;
    public final /* synthetic */ HalfEventFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$buildEventActionModels$1(GridLayoutManager gridLayoutManager, HalfEventFragment halfEventFragment) {
        super(1);
        this.c = gridLayoutManager;
        this.d = halfEventFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        this.c.g = oVar.getSpanSizeLookup();
        HalfEventFragment halfEventFragment = this.d;
        HalfEventFragment.b bVar = HalfEventFragment.p2;
        HalfEventViewModel V0 = halfEventFragment.V0();
        final HalfEventFragment halfEventFragment2 = this.d;
        v.v2(V0, new l<l0, i>() {
            public Object invoke(Object obj) {
                l0 l0Var = (l0) obj;
                m0.n.b.i.e(l0Var, "state");
                if (l0Var.c != null) {
                    o oVar = o.this;
                    HalfEventFragment halfEventFragment = halfEventFragment2;
                    EventActionType[] values = EventActionType.values();
                    for (int i = 0; i < 4; i++) {
                        EventActionType eventActionType = values[i];
                        e eVar = new e();
                        eVar.P(new Number[]{Integer.valueOf(eventActionType.ordinal())});
                        eVar.Q(halfEventFragment.getString(eventActionType.getTitle()));
                        eVar.O(Integer.valueOf(eventActionType.getIcon()));
                        eVar.M(l0Var.c.g2);
                        eVar.L(new m(halfEventFragment, eventActionType, l0Var));
                        oVar.add(eVar);
                        int ordinal = eventActionType.ordinal();
                        EventActionType.values();
                        if (ordinal != 3) {
                            t tVar = new t();
                            tVar.K(m0.n.b.i.k("divider", Integer.valueOf(eventActionType.ordinal())));
                            oVar.add(tVar);
                        }
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
