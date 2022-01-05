package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.n.a.l;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.u.g;
import m0.r.t.a.r.j.u.h;

/* compiled from: MemberScope.kt */
public interface MemberScope extends h {
    public static final Companion a = Companion.a;

    /* compiled from: MemberScope.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static final l<d, Boolean> b = MemberScope$Companion$ALL_NAME_FILTER$1.c;
    }

    /* compiled from: MemberScope.kt */
    public static final class a extends g {
        public static final a b = new a();

        public Set<d> b() {
            return EmptySet.c;
        }

        public Set<d> d() {
            return EmptySet.c;
        }

        public Set<d> e() {
            return EmptySet.c;
        }
    }

    Collection<? extends g0> a(d dVar, b bVar);

    Set<d> b();

    Collection<? extends c0> c(d dVar, b bVar);

    Set<d> d();

    Set<d> e();
}
