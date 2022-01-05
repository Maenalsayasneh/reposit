package androidx.paging;

import h0.u.b;
import h0.u.e;
import h0.u.f0;
import h0.u.s;
import h0.v.a.g;
import h0.v.a.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import m0.n.b.i;
import n0.a.d0;
import n0.a.g2.d;

/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer<T> {
    public final e a;
    public boolean b;
    public final AsyncPagingDataDiffer$differBase$1 c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final d<b> e;
    public final g.e<T> f;
    public final r g;
    public final d0 h;
    public final d0 i;

    /* compiled from: AsyncPagingDataDiffer.kt */
    public static final class a implements e {
        public final /* synthetic */ AsyncPagingDataDiffer a;

        public a(AsyncPagingDataDiffer asyncPagingDataDiffer) {
            this.a = asyncPagingDataDiffer;
        }

        public void a(int i, int i2) {
            if (i2 > 0) {
                this.a.g.a(i, i2);
            }
        }

        public void b(int i, int i2) {
            if (i2 > 0) {
                this.a.g.b(i, i2);
            }
        }

        public void c(int i, int i2) {
            if (i2 > 0) {
                this.a.g.d(i, i2, (Object) null);
            }
        }
    }

    public AsyncPagingDataDiffer(g.e<T> eVar, r rVar, d0 d0Var, d0 d0Var2) {
        i.e(eVar, "diffCallback");
        i.e(rVar, "updateCallback");
        i.e(d0Var, "mainDispatcher");
        i.e(d0Var2, "workerDispatcher");
        this.f = eVar;
        this.g = rVar;
        this.h = d0Var;
        this.i = d0Var2;
        a aVar = new a(this);
        this.a = aVar;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = new AsyncPagingDataDiffer$differBase$1(this, aVar, d0Var);
        this.c = asyncPagingDataDiffer$differBase$1;
        this.e = asyncPagingDataDiffer$differBase$1.i;
    }

    public final h0.u.i<T> a() {
        s<T> sVar = this.c.a;
        int i2 = sVar.e;
        int i3 = sVar.f;
        List<f0<T>> list = sVar.c;
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : list) {
            m0.j.g.b(arrayList, f0Var.d);
        }
        return new h0.u.i<>(i2, i3, arrayList);
    }
}
