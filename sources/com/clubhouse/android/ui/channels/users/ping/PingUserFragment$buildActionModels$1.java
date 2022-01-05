package com.clubhouse.android.ui.channels.users.ping;

import com.clubhouse.android.ui.events.EventActionType;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.k.w0.b.b;
import i0.e.b.g3.k.w0.b.f;
import i0.e.b.g3.o.x0.e;
import i0.e.b.g3.o.x0.t;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: PingUserFragment.kt */
public final class PingUserFragment$buildActionModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ PingUserFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PingUserFragment$buildActionModels$1(PingUserFragment pingUserFragment) {
        super(1);
        this.c = pingUserFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        PingUserFragment pingUserFragment = this.c;
        k<Object>[] kVarArr = PingUserFragment.r2;
        PingUserViewModel Y0 = pingUserFragment.Y0();
        final PingUserFragment pingUserFragment2 = this.c;
        v.v2(Y0, new l<f, i>() {
            public Object invoke(Object obj) {
                f fVar = (f) obj;
                m0.n.b.i.e(fVar, "state");
                EventActionType[] values = EventActionType.values();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= 4) {
                        break;
                    }
                    EventActionType eventActionType = values[i];
                    if (eventActionType.getTitle() == R.string.add_to_cal) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(eventActionType);
                    }
                    i++;
                }
                o oVar = o.this;
                PingUserFragment pingUserFragment = pingUserFragment2;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    EventActionType eventActionType2 = (EventActionType) it.next();
                    e eVar = new e();
                    eVar.P(new Number[]{Integer.valueOf(eventActionType2.ordinal())});
                    eVar.Q(pingUserFragment.getString(eventActionType2.getTitle()));
                    eVar.O(Integer.valueOf(eventActionType2.getIcon()));
                    eVar.N(Integer.valueOf(pingUserFragment.getResources().getColor(R.color.clubhouse_dark_gray)));
                    eVar.L(new b(pingUserFragment, eventActionType2, fVar));
                    oVar.add(eVar);
                    if (eventActionType2.ordinal() != arrayList.size() - 1) {
                        t tVar = new t();
                        tVar.K(m0.n.b.i.k("divider", Integer.valueOf(eventActionType2.ordinal())));
                        oVar.add(tVar);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
