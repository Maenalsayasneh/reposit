package kotlin.reflect.jvm.internal.impl.types;

import i0.j.f.p.h;
import java.util.ArrayDeque;
import java.util.Set;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.x0.b;
import m0.r.t.a.r.m.z0.g;
import m0.r.t.a.r.m.z0.l;
import m0.r.t.a.r.o.j;

/* compiled from: AbstractTypeChecker.kt */
public abstract class AbstractTypeCheckerContext implements l {
    public int a;
    public boolean b;
    public ArrayDeque<g> c;
    public Set<g> d;

    /* compiled from: AbstractTypeChecker.kt */
    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* compiled from: AbstractTypeChecker.kt */
    public static abstract class a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$a  reason: collision with other inner class name */
        /* compiled from: AbstractTypeChecker.kt */
        public static abstract class C0239a extends a {
            public C0239a() {
                super((f) null);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class b extends a {
            public static final b a = new b();

            public b() {
                super((f) null);
            }

            public g a(AbstractTypeCheckerContext abstractTypeCheckerContext, m0.r.t.a.r.m.z0.f fVar) {
                i.e(abstractTypeCheckerContext, "context");
                i.e(fVar, "type");
                return h.O2(abstractTypeCheckerContext, fVar);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class c extends a {
            public static final c a = new c();

            public c() {
                super((f) null);
            }

            public g a(AbstractTypeCheckerContext abstractTypeCheckerContext, m0.r.t.a.r.m.z0.f fVar) {
                i.e(abstractTypeCheckerContext, "context");
                i.e(fVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class d extends a {
            public static final d a = new d();

            public d() {
                super((f) null);
            }

            public g a(AbstractTypeCheckerContext abstractTypeCheckerContext, m0.r.t.a.r.m.z0.f fVar) {
                i.e(abstractTypeCheckerContext, "context");
                i.e(fVar, "type");
                return h.A4(abstractTypeCheckerContext, fVar);
            }
        }

        public a(f fVar) {
        }

        public abstract g a(AbstractTypeCheckerContext abstractTypeCheckerContext, m0.r.t.a.r.m.z0.f fVar);
    }

    public final void A() {
        ArrayDeque<g> arrayDeque = this.c;
        i.c(arrayDeque);
        arrayDeque.clear();
        Set<g> set = this.d;
        i.c(set);
        set.clear();
        this.b = false;
    }

    public boolean B(m0.r.t.a.r.m.z0.f fVar) {
        i.e(this, "this");
        i.e(fVar, "receiver");
        b bVar = (b) this;
        return h.p2(bVar, h.O2(this, fVar)) != h.p2(bVar, h.A4(this, fVar));
    }

    public final void C() {
        this.b = true;
        if (this.c == null) {
            this.c = new ArrayDeque<>(4);
        }
        if (this.d == null) {
            this.d = j.b.a();
        }
    }

    public boolean D(g gVar) {
        i.e(this, "this");
        i.e(gVar, "receiver");
        b bVar = (b) this;
        return bVar.Q(bVar.h(gVar));
    }

    public boolean E(m0.r.t.a.r.m.z0.f fVar) {
        i.e(this, "this");
        i.e(fVar, "receiver");
        b bVar = (b) this;
        g a2 = bVar.a(fVar);
        return (a2 == null ? null : bVar.s(a2)) != null;
    }

    public abstract boolean F();

    public boolean G(g gVar) {
        i.e(this, "this");
        i.e(gVar, "receiver");
        b bVar = (b) this;
        return bVar.S(bVar.h(gVar));
    }

    public abstract boolean H();

    public abstract m0.r.t.a.r.m.z0.f I(m0.r.t.a.r.m.z0.f fVar);

    public abstract m0.r.t.a.r.m.z0.f J(m0.r.t.a.r.m.z0.f fVar);

    public abstract a K(g gVar);

    public m0.r.t.a.r.m.z0.j d(m0.r.t.a.r.m.z0.f fVar) {
        return h.t4(this, fVar);
    }

    public g o(m0.r.t.a.r.m.z0.f fVar) {
        return h.O2(this, fVar);
    }

    public boolean q(m0.r.t.a.r.m.z0.f fVar) {
        return h.q2(this, fVar);
    }

    public Boolean z(m0.r.t.a.r.m.z0.f fVar, m0.r.t.a.r.m.z0.f fVar2) {
        i.e(fVar, "subType");
        i.e(fVar2, "superType");
        return null;
    }
}
