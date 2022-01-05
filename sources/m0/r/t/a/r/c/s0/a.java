package m0.r.t.a.r.c.s0;

import java.util.Collection;
import kotlin.collections.EmptyList;
import m0.n.b.i;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.m.v;

/* compiled from: AdditionalClassPartsProvider.kt */
public interface a {

    /* renamed from: m0.r.t.a.r.c.s0.a$a  reason: collision with other inner class name */
    /* compiled from: AdditionalClassPartsProvider.kt */
    public static final class C0252a implements a {
        public static final C0252a a = new C0252a();

        public Collection<c> a(d dVar) {
            i.e(dVar, "classDescriptor");
            return EmptyList.c;
        }

        public Collection<g0> b(m0.r.t.a.r.g.d dVar, d dVar2) {
            i.e(dVar, "name");
            i.e(dVar2, "classDescriptor");
            return EmptyList.c;
        }

        public Collection<v> d(d dVar) {
            i.e(dVar, "classDescriptor");
            return EmptyList.c;
        }

        public Collection<m0.r.t.a.r.g.d> e(d dVar) {
            i.e(dVar, "classDescriptor");
            return EmptyList.c;
        }
    }

    Collection<c> a(d dVar);

    Collection<g0> b(m0.r.t.a.r.g.d dVar, d dVar2);

    Collection<v> d(d dVar);

    Collection<m0.r.t.a.r.g.d> e(d dVar);
}
