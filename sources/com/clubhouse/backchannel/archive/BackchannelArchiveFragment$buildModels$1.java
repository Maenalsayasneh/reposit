package com.clubhouse.backchannel.archive;

import h0.b0.v;
import i0.b.a.o;
import i0.e.c.b.b;
import i0.e.c.b.f;
import i0.e.c.f.b.a.a;
import i0.e.c.h.p.c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelArchiveFragment.kt */
public final class BackchannelArchiveFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ BackchannelArchiveFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelArchiveFragment$buildModels$1(BackchannelArchiveFragment backchannelArchiveFragment) {
        super(1);
        this.c = backchannelArchiveFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        final BackchannelArchiveFragment backchannelArchiveFragment = this.c;
        v.v2((BackchannelArchiveViewModel) this.c.b2.getValue(), new l<f, i>() {
            public Object invoke(Object obj) {
                f fVar = (f) obj;
                m0.n.b.i.e(fVar, "state");
                List<a> list = fVar.a;
                o oVar = o.this;
                BackchannelArchiveFragment backchannelArchiveFragment = backchannelArchiveFragment;
                for (a aVar : list) {
                    c cVar = new c();
                    cVar.N(aVar.a);
                    cVar.L(aVar);
                    cVar.M(new b(backchannelArchiveFragment, aVar));
                    cVar.O(new i0.e.c.b.c(backchannelArchiveFragment, aVar));
                    oVar.add(cVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
