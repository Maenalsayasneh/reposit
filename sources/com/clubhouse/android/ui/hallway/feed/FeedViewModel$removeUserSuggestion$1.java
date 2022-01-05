package com.clubhouse.android.ui.hallway.feed;

import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.b3.a.a.d.a.e;
import i0.e.b.b3.a.a.d.a.j;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$removeUserSuggestion$1 extends Lambda implements l<v, i> {
    public final /* synthetic */ FeedViewModel c;
    public final /* synthetic */ m d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$removeUserSuggestion$1(FeedViewModel feedViewModel, m mVar) {
        super(1);
        this.c = feedViewModel;
        this.d = mVar;
    }

    public Object invoke(Object obj) {
        v vVar = (v) obj;
        m0.n.b.i.e(vVar, "state");
        List a = vVar.a.a();
        j jVar = null;
        final List A0 = a == null ? null : g.A0(a);
        if (A0 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : A0) {
                if (next instanceof j) {
                    arrayList.add(next);
                }
            }
            jVar = (j) g.w(arrayList);
        }
        if (jVar != null) {
            List<T> Q = g.Q(jVar.b, this.d);
            if (((ArrayList) Q).isEmpty()) {
                A0.remove(jVar);
            } else {
                int i = 0;
                Iterator it = A0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (m0.n.b.i.a((e) it.next(), jVar)) {
                        break;
                    } else {
                        i++;
                    }
                }
                A0.set(i, new j(jVar.a, Q));
            }
        }
        this.c.m(new l<v, v>() {
            public Object invoke(Object obj) {
                v vVar = (v) obj;
                m0.n.b.i.e(vVar, "$this$setState");
                return v.copy$default(vVar, new f0(A0), (Set) null, (List) null, (b) null, false, false, false, false, 0, 0, false, false, 4094, (Object) null);
            }
        });
        return i.a;
    }
}
