package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import i0.j.f.p.h;
import java.util.Objects;
import java.util.Set;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.d;

/* compiled from: ClassDeserializer.kt */
public final class ClassDeserializer {
    public static final ClassDeserializer a = null;
    public static final Set<m0.r.t.a.r.g.a> b = h.N3(m0.r.t.a.r.g.a.l(g.a.d.i()));
    public final m0.r.t.a.r.k.b.g c;
    public final l<a, d> d;

    /* compiled from: ClassDeserializer.kt */
    public static final class a {
        public final m0.r.t.a.r.g.a a;
        public final m0.r.t.a.r.k.b.d b;

        public a(m0.r.t.a.r.g.a aVar, m0.r.t.a.r.k.b.d dVar) {
            i.e(aVar, "classId");
            this.a = aVar;
            this.b = dVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public ClassDeserializer(m0.r.t.a.r.k.b.g gVar) {
        i.e(gVar, "components");
        this.c = gVar;
        this.d = gVar.a.h(new ClassDeserializer$classes$1(this));
    }

    public static d a(ClassDeserializer classDeserializer, m0.r.t.a.r.g.a aVar, m0.r.t.a.r.k.b.d dVar, int i) {
        int i2 = i & 2;
        Objects.requireNonNull(classDeserializer);
        i.e(aVar, "classId");
        return classDeserializer.d.invoke(new a(aVar, (m0.r.t.a.r.k.b.d) null));
    }
}
