package androidx.paging;

import h0.u.d;
import h0.u.x;
import h0.u.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: LegacyPagingSource.kt */
public final class LegacyPagingSource<Key, Value> extends x<Key, Value> {
    public int c;

    public boolean a() {
        throw null;
    }

    public Key b(y<Key, Value> yVar) {
        i.e(yVar, "state");
        throw null;
    }

    public Object c(x.a<Key> aVar, c<? super x.b<Key, Value>> cVar) {
        LoadType loadType;
        int i;
        boolean z = aVar instanceof x.a.c;
        if (z) {
            loadType = LoadType.REFRESH;
        } else if (aVar instanceof x.a.C0068a) {
            loadType = LoadType.APPEND;
        } else if (aVar instanceof x.a.b) {
            loadType = LoadType.PREPEND;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        LoadType loadType2 = loadType;
        if (this.c == Integer.MIN_VALUE) {
            System.out.println("WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z) {
                int i2 = aVar.a;
                if (i2 % 3 == 0) {
                    i = i2 / 3;
                    this.c = i;
                }
            }
            i = aVar.a;
            this.c = i;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.c = new d(loadType2, aVar.a(), aVar.a, aVar.b, this.c);
        return a.k4((e) null, new LegacyPagingSource$load$2(this, ref$ObjectRef, aVar, (c) null), cVar);
    }
}
