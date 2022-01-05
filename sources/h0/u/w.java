package h0.u;

import androidx.paging.PageEvent;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import h0.u.j;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.g2.d;

/* compiled from: PagingData.kt */
public final class w<T> {
    public static final g0 a;
    public static final w<Object> b;
    public static final b c = new b((f) null);
    public final d<PageEvent<T>> d;
    public final g0 e;

    /* compiled from: PagingData.kt */
    public static final class a implements g0 {
        public void a(h0 h0Var) {
            i.e(h0Var, "viewportHint");
        }

        public void refresh() {
        }

        public void retry() {
        }
    }

    /* compiled from: PagingData.kt */
    public static final class b {
        public b(f fVar) {
        }

        public final <T> w<T> a() {
            w<Object> wVar = w.b;
            Objects.requireNonNull(wVar, "null cannot be cast to non-null type androidx.paging.PagingData<T>");
            return wVar;
        }

        public final <T> w<T> b(List<? extends T> list) {
            i.e(list, MessageExtension.FIELD_DATA);
            PageEvent.Insert.a aVar = PageEvent.Insert.b;
            List L2 = h.L2(new f0(0, list));
            j.c cVar = j.c.c;
            j.c cVar2 = j.c.b;
            n0.a.g2.f fVar = new n0.a.g2.f(aVar.c(L2, 0, 0, new b(cVar, cVar2, cVar2, new k(cVar, cVar2, cVar2), (k) null, 16)));
            g0 g0Var = w.a;
            return new w<>(fVar, w.a);
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        PageEvent.Insert.a aVar2 = PageEvent.Insert.b;
        b = new w<>(new n0.a.g2.f(PageEvent.Insert.a), aVar);
    }

    public w(d<? extends PageEvent<T>> dVar, g0 g0Var) {
        i.e(dVar, "flow");
        i.e(g0Var, "receiver");
        this.d = dVar;
        this.e = g0Var;
    }
}
