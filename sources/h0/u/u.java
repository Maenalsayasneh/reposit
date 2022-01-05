package h0.u;

import androidx.paging.PageFetcher;
import androidx.paging.Pager$flow$1;
import androidx.paging.Pager$flow$2;
import m0.l.c;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;
import n0.a.g2.d;

/* compiled from: Pager.kt */
public final class u<Key, Value> {
    public final d<w<Value>> a;

    public u(v vVar, Object obj, a aVar, int i) {
        l lVar;
        int i2 = i & 2;
        i.e(vVar, "config");
        i.e(aVar, "pagingSourceFactory");
        i.e(vVar, "config");
        i.e(aVar, "pagingSourceFactory");
        if (aVar instanceof e0) {
            lVar = new Pager$flow$1(aVar);
        } else {
            lVar = new Pager$flow$2(aVar, (c) null);
        }
        this.a = new PageFetcher(lVar, (Object) null, vVar).c;
    }
}
