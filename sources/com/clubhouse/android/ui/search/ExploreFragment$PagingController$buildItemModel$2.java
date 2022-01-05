package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import i0.e.b.b3.b.e.j;
import i0.e.b.b3.b.e.m;
import i0.e.b.f3.m.b.c;
import i0.e.b.g3.w.e;
import i0.e.b.g3.w.f;
import i0.e.b.g3.w.z;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ExploreFragment.kt */
public final class ExploreFragment$PagingController$buildItemModel$2 extends Lambda implements l<z, c> {
    public final /* synthetic */ j c;
    public final /* synthetic */ ExploreFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreFragment$PagingController$buildItemModel$2(j jVar, ExploreFragment exploreFragment) {
        super(1);
        this.c = jVar;
        this.d = exploreFragment;
    }

    public Object invoke(Object obj) {
        final z zVar = (z) obj;
        i.e(zVar, "state");
        c cVar = new c();
        boolean z = true;
        cVar.t(((m) this.c).g.getId());
        final ExploreFragment exploreFragment = this.d;
        final j jVar = this.c;
        AnonymousClass1 r2 = new a<m0.i>() {
            public Object invoke() {
                if (z.this.b == Mode.SUGGESTED) {
                    i0.e.a.b.a aVar = exploreFragment.a2;
                    if (aVar != null) {
                        aVar.c(SourceLocation.EXPLORE, ((m) jVar).g.b2);
                    } else {
                        i.m("actionTrailRecorder");
                        throw null;
                    }
                }
                return m0.i.a;
            }
        };
        cVar.w();
        cVar.i = r2;
        UserInList userInList = ((m) this.c).g;
        cVar.w();
        cVar.j = userInList;
        String str = ((m) this.c).g.c;
        cVar.w();
        cVar.k = str;
        boolean z2 = ((m) this.c).i;
        cVar.w();
        cVar.n = z2;
        boolean z3 = ((m) this.c).j;
        cVar.w();
        cVar.p = z3;
        boolean z4 = ((m) this.c).h;
        cVar.w();
        cVar.q = z4;
        if (zVar.b != Mode.SUGGESTED) {
            z = false;
        }
        cVar.w();
        cVar.m = z;
        e eVar = new e(this.d, this.c);
        cVar.w();
        cVar.l = eVar;
        f fVar = new f(this.d, this.c);
        cVar.w();
        cVar.o = fVar;
        return cVar;
    }
}
