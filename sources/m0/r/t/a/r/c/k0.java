package m0.r.t.a.r.c;

import java.util.Collection;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;

/* compiled from: SupertypeLoopChecker.kt */
public interface k0 {

    /* compiled from: SupertypeLoopChecker.kt */
    public static final class a implements k0 {
        public static final a a = new a();

        public Collection<v> a(j0 j0Var, Collection<? extends v> collection, l<? super j0, ? extends Iterable<? extends v>> lVar, l<? super v, i> lVar2) {
            m0.n.b.i.e(j0Var, "currentTypeConstructor");
            m0.n.b.i.e(collection, "superTypes");
            m0.n.b.i.e(lVar, "neighbors");
            m0.n.b.i.e(lVar2, "reportLoop");
            return collection;
        }
    }

    Collection<v> a(j0 j0Var, Collection<? extends v> collection, l<? super j0, ? extends Iterable<? extends v>> lVar, l<? super v, i> lVar2);
}
