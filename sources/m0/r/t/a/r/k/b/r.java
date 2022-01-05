package m0.r.t.a.r.k.b;

import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.f.c.c;
import m0.r.t.a.r.f.c.e;

/* compiled from: ProtoContainer.kt */
public abstract class r {
    public final c a;
    public final e b;
    public final h0 c;

    /* compiled from: ProtoContainer.kt */
    public static final class a extends r {
        public final ProtoBuf$Class d;
        public final a e;
        public final m0.r.t.a.r.g.a f;
        public final ProtoBuf$Class.Kind g;
        public final boolean h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ProtoBuf$Class protoBuf$Class, c cVar, e eVar, h0 h0Var, a aVar) {
            super(cVar, eVar, h0Var, (f) null);
            i.e(protoBuf$Class, "classProto");
            i.e(cVar, "nameResolver");
            i.e(eVar, "typeTable");
            this.d = protoBuf$Class;
            this.e = aVar;
            this.f = h.X0(cVar, protoBuf$Class.Z1);
            ProtoBuf$Class.Kind d2 = m0.r.t.a.r.f.c.b.e.d(protoBuf$Class.Y1);
            this.g = d2 == null ? ProtoBuf$Class.Kind.CLASS : d2;
            this.h = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.f, protoBuf$Class.Y1, "IS_INNER.get(classProto.flags)");
        }

        public m0.r.t.a.r.g.b a() {
            m0.r.t.a.r.g.b b = this.f.b();
            i.d(b, "classId.asSingleFqName()");
            return b;
        }
    }

    /* compiled from: ProtoContainer.kt */
    public static final class b extends r {
        public final m0.r.t.a.r.g.b d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m0.r.t.a.r.g.b bVar, c cVar, e eVar, h0 h0Var) {
            super(cVar, eVar, h0Var, (f) null);
            i.e(bVar, "fqName");
            i.e(cVar, "nameResolver");
            i.e(eVar, "typeTable");
            this.d = bVar;
        }

        public m0.r.t.a.r.g.b a() {
            return this.d;
        }
    }

    public r(c cVar, e eVar, h0 h0Var, f fVar) {
        this.a = cVar;
        this.b = eVar;
        this.c = h0Var;
    }

    public abstract m0.r.t.a.r.g.b a();

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
