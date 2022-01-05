package m0.r.t.a.r.m.x0;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$getScope$1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;

/* compiled from: KotlinTypeRefiner.kt */
public abstract class e {

    /* compiled from: KotlinTypeRefiner.kt */
    public static final class a extends e {
        public static final a a = new a();

        public d a(m0.r.t.a.r.g.a aVar) {
            i.e(aVar, "classId");
            return null;
        }

        public <S extends MemberScope> S b(d dVar, m0.n.a.a<? extends S> aVar) {
            i.e(dVar, "classDescriptor");
            i.e(aVar, "compute");
            return (MemberScope) ((ScopesHolderForClass$getScope$1) aVar).invoke();
        }

        public boolean c(u uVar) {
            i.e(uVar, "moduleDescriptor");
            return false;
        }

        public boolean d(j0 j0Var) {
            i.e(j0Var, "typeConstructor");
            return false;
        }

        public f e(m0.r.t.a.r.c.i iVar) {
            i.e(iVar, "descriptor");
            return null;
        }

        public Collection<v> f(d dVar) {
            i.e(dVar, "classDescriptor");
            Collection<v> b = dVar.i().b();
            i.d(b, "classDescriptor.typeConstructor.supertypes");
            return b;
        }

        public v g(v vVar) {
            i.e(vVar, "type");
            return vVar;
        }
    }

    public abstract d a(m0.r.t.a.r.g.a aVar);

    public abstract <S extends MemberScope> S b(d dVar, m0.n.a.a<? extends S> aVar);

    public abstract boolean c(u uVar);

    public abstract boolean d(j0 j0Var);

    public abstract f e(m0.r.t.a.r.c.i iVar);

    public abstract Collection<v> f(d dVar);

    public abstract v g(v vVar);
}
