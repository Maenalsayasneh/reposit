package androidx.paging;

import h0.u.j;
import h0.u.t;
import h0.u.z;
import h0.v.a.r;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import m0.i;
import m0.n.a.p;
import m0.r.g;

/* compiled from: AsyncPagedListDiffer.kt */
public class AsyncPagedListDiffer<T> {
    public r a;
    public final h0.v.a.c<T> b;
    public Executor c;
    public final CopyOnWriteArrayList<a<T>> d = new CopyOnWriteArrayList<>();
    public t<T> e;
    public t<T> f;
    public int g;
    public final t.b h;
    public final g<i> i;
    public final List<p<LoadType, j, i>> j;
    public final t.a k;

    /* compiled from: AsyncPagedListDiffer.kt */
    public interface a<T> {
        void a(t<T> tVar, t<T> tVar2);
    }

    /* compiled from: AsyncPagedListDiffer.kt */
    public static final class b extends t.b {
        public final /* synthetic */ AsyncPagedListDiffer a;

        public b(AsyncPagedListDiffer asyncPagedListDiffer) {
            this.a = asyncPagedListDiffer;
        }

        public void a(LoadType loadType, j jVar) {
            m0.n.b.i.e(loadType, "type");
            m0.n.b.i.e(jVar, "state");
            for (p invoke : this.a.j) {
                invoke.invoke(loadType, jVar);
            }
        }
    }

    /* compiled from: AsyncPagedListDiffer.kt */
    public static final class c extends t.a {
        public final /* synthetic */ AsyncPagedListDiffer a;

        public c(AsyncPagedListDiffer asyncPagedListDiffer) {
            this.a = asyncPagedListDiffer;
        }
    }

    public AsyncPagedListDiffer(r rVar, h0.v.a.c<T> cVar) {
        m0.n.b.i.e(rVar, "listUpdateCallback");
        m0.n.b.i.e(cVar, "config");
        Executor executor = h0.c.a.a.a.b;
        m0.n.b.i.d(executor, "ArchTaskExecutor.getMainThreadExecutor()");
        this.c = executor;
        b bVar = new b(this);
        this.h = bVar;
        this.i = new AsyncPagedListDiffer$loadStateListener$1(bVar);
        this.j = new CopyOnWriteArrayList();
        this.k = new c(this);
        this.a = rVar;
        this.b = cVar;
    }

    public t<T> a() {
        t<T> tVar = this.f;
        return tVar != null ? tVar : this.e;
    }

    public final void b(t<T> tVar, t<T> tVar2, Runnable runnable) {
        for (a a2 : this.d) {
            a2.a(tVar, (t<T>) null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void c(t<T> tVar) {
        this.g++;
        if (tVar != this.e) {
            t a2 = a();
            if (tVar == null) {
                if (a() == null) {
                    if (this.e != null) {
                        t.a aVar = this.k;
                        m0.n.b.i.e(aVar, "callback");
                        m0.j.g.g0((List) null, new PagedList$removeWeakCallback$1(aVar));
                        p pVar = (p) this.i;
                        m0.n.b.i.e(pVar, "listener");
                        m0.j.g.g0((List) null, new PagedList$removeWeakLoadStateListener$1(pVar));
                        this.e = null;
                    } else if (this.f != null) {
                        this.f = null;
                    }
                    r rVar = this.a;
                    if (rVar != null) {
                        rVar.b(0, 0);
                        b(a2, (t) null, (Runnable) null);
                        return;
                    }
                    m0.n.b.i.m("updateCallback");
                    throw null;
                }
                throw null;
            } else if (a() != null) {
                t<T> tVar2 = this.e;
                if (tVar2 != null) {
                    t.a aVar2 = this.k;
                    m0.n.b.i.e(aVar2, "callback");
                    m0.j.g.g0((List) null, new PagedList$removeWeakCallback$1(aVar2));
                    p pVar2 = (p) this.i;
                    m0.n.b.i.e(pVar2, "listener");
                    m0.j.g.g0((List) null, new PagedList$removeWeakLoadStateListener$1(pVar2));
                    if (tVar2.c()) {
                        this.f = tVar2;
                        this.e = null;
                    } else {
                        m0.n.b.i.e(tVar2, "pagedList");
                        throw null;
                    }
                }
                if (this.f == null || this.e != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                } else if (tVar.c()) {
                    tVar.b(new z());
                    throw null;
                } else {
                    m0.n.b.i.e(tVar, "pagedList");
                    throw null;
                }
            } else {
                this.e = tVar;
                p pVar3 = (p) this.i;
                m0.n.b.i.e(pVar3, "listener");
                m0.j.g.g0((List) null, PagedList$addWeakLoadStateListener$1.c);
                new WeakReference(pVar3);
                throw null;
            }
        }
    }
}
