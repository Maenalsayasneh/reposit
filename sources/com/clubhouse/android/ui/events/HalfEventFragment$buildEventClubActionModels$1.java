package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.b.a.o;
import i0.e.b.g3.o.l0;
import i0.e.b.g3.o.x0.h;
import i0.e.b.g3.o.x0.k;
import i0.e.b.g3.o.x0.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$buildEventClubActionModels$1 extends Lambda implements l<l0, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ HalfEventFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$buildEventClubActionModels$1(o oVar, HalfEventFragment halfEventFragment) {
        super(1);
        this.c = oVar;
        this.d = halfEventFragment;
    }

    public Object invoke(Object obj) {
        l0 l0Var = (l0) obj;
        m0.n.b.i.e(l0Var, "state");
        EventInClub eventInClub = l0Var.c;
        if (eventInClub == null) {
            return null;
        }
        o oVar = this.c;
        HalfEventFragment halfEventFragment = this.d;
        n nVar = new n();
        nVar.K("club_header");
        nVar.L(eventInClub.y);
        nVar.J(new i0.e.b.g3.o.n(halfEventFragment, l0Var));
        oVar.add(nVar);
        EventActionType[] values = EventActionType.values();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= 4) {
                break;
            }
            EventActionType eventActionType = values[i];
            if (eventActionType == EventActionType.Share) {
                z = false;
            }
            if (z) {
                arrayList.add(eventActionType);
            }
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EventActionType eventActionType2 = (EventActionType) it.next();
            if (eventActionType2.ordinal() > 1) {
                k kVar = new k();
                kVar.I(m0.n.b.i.k("club_divider", Integer.valueOf(eventActionType2.ordinal())));
                oVar.add(kVar);
            }
            h hVar = new h();
            hVar.M(new Number[]{Integer.valueOf(eventActionType2.ordinal())});
            hVar.L(Integer.valueOf(eventActionType2.getIcon()));
            hVar.N(halfEventFragment.getString(eventActionType2.getTitleFull()));
            hVar.J(halfEventFragment.getString(eventActionType2.getBody()));
            hVar.K(new i0.e.b.g3.o.o(halfEventFragment, eventActionType2, l0Var));
            oVar.add(hVar);
        }
        return i.a;
    }
}
