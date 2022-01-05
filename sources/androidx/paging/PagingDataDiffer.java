package androidx.paging;

import h0.u.b;
import h0.u.e;
import h0.u.g0;
import h0.u.j;
import h0.u.m;
import h0.u.o;
import h0.u.s;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import n0.a.d0;
import n0.a.g2.a0;
import n0.a.g2.q;

/* compiled from: PagingDataDiffer.kt */
public abstract class PagingDataDiffer<T> {
    public s<T> a;
    public g0 b;
    public final m c;
    public final CopyOnWriteArrayList<l<b, i>> d;
    public final SingleRunner e = new SingleRunner(false, 1);
    public volatile boolean f;
    public volatile int g;
    public final a h = new a(this);
    public final q<b> i;
    public final e j;
    public final d0 k;

    /* compiled from: PagingDataDiffer.kt */
    public static final class a implements s.b {
        public final /* synthetic */ PagingDataDiffer a;

        public a(PagingDataDiffer pagingDataDiffer) {
            this.a = pagingDataDiffer;
        }

        public void a(LoadType loadType, boolean z, j jVar) {
            m0.n.b.i.e(loadType, "loadType");
            m0.n.b.i.e(jVar, "loadState");
            if (!m0.n.b.i.a(this.a.c.b(loadType, z), jVar)) {
                this.a.c.d(loadType, z, jVar);
                b e = this.a.c.e();
                for (l invoke : this.a.d) {
                    invoke.invoke(e);
                }
            }
        }

        public void b(int i, int i2) {
            this.a.j.c(i, i2);
        }

        public void c(int i, int i2) {
            this.a.j.a(i, i2);
        }

        public void d(int i, int i2) {
            this.a.j.b(i, i2);
        }
    }

    public PagingDataDiffer(e eVar, d0 d0Var) {
        m0.n.b.i.e(eVar, "differCallback");
        m0.n.b.i.e(d0Var, "mainDispatcher");
        this.j = eVar;
        this.k = d0Var;
        s.a aVar = s.b;
        s<Object> sVar = s.a;
        Objects.requireNonNull(sVar, "null cannot be cast to non-null type androidx.paging.PagePresenter<T>");
        this.a = sVar;
        m mVar = new m();
        this.c = mVar;
        CopyOnWriteArrayList<l<b, i>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.d = copyOnWriteArrayList;
        this.i = a0.a(mVar.e());
        AnonymousClass1 r02 = new l<b, i>(this) {
            public final /* synthetic */ PagingDataDiffer c;

            {
                this.c = r1;
            }

            public Object invoke(Object obj) {
                b bVar = (b) obj;
                m0.n.b.i.e(bVar, "it");
                this.c.i.setValue(bVar);
                return i.a;
            }
        };
        m0.n.b.i.e(r02, "listener");
        copyOnWriteArrayList.add(r02);
        r02.invoke(mVar.e());
    }

    public final T a(int i2) {
        this.f = true;
        this.g = i2;
        g0 g0Var = this.b;
        if (g0Var != null) {
            g0Var.a(this.a.f(i2));
        }
        s<T> sVar = this.a;
        Objects.requireNonNull(sVar);
        if (i2 < 0 || i2 >= sVar.e()) {
            StringBuilder Q0 = i0.d.a.a.a.Q0("Index: ", i2, ", Size: ");
            Q0.append(sVar.e());
            throw new IndexOutOfBoundsException(Q0.toString());
        }
        int i3 = i2 - sVar.e;
        if (i3 < 0 || i3 >= sVar.d) {
            return null;
        }
        return sVar.d(i3);
    }

    public abstract Object b(o<T> oVar, o<T> oVar2, b bVar, int i2, m0.n.a.a<i> aVar, c<? super Integer> cVar);
}
