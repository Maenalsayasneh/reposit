package m0.r.t.a.r.c.r0;

import i0.j.f.p.h;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;
import m0.r.t.a.r.g.b;

/* compiled from: Annotations.kt */
public interface f extends Iterable<c>, m0.n.b.s.a {
    public static final a i = a.a;

    /* compiled from: Annotations.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final f b = new C0251a();

        /* renamed from: m0.r.t.a.r.c.r0.f$a$a  reason: collision with other inner class name */
        /* compiled from: Annotations.kt */
        public static final class C0251a implements f {
            public c f(b bVar) {
                i.e(bVar, "fqName");
                return null;
            }

            public boolean isEmpty() {
                return true;
            }

            public Iterator<c> iterator() {
                return EmptyList.c.iterator();
            }

            public boolean n(b bVar) {
                return h.O1(this, bVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        public final f a(List<? extends c> list) {
            i.e(list, "annotations");
            return list.isEmpty() ? b : new g(list);
        }
    }

    c f(b bVar);

    boolean isEmpty();

    boolean n(b bVar);
}
