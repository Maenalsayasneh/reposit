package kotlinx.serialization.json.internal;

import java.util.Objects;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import m0.i;
import m0.n.a.l;
import m0.n.b.f;
import n0.c.i.c;
import n0.c.i.g;
import n0.c.i.h;
import n0.c.k.r0;
import n0.c.l.a;
import n0.c.l.g;
import n0.c.l.k;
import n0.c.l.q.d;
import n0.c.l.q.m;
import n0.c.l.q.o;
import n0.c.l.q.p;
import n0.c.m.b;

/* compiled from: TreeJsonEncoder.kt */
public abstract class AbstractJsonTreeEncoder extends r0 implements g {
    public final d b;
    public boolean c;
    public final a d;
    public final l<JsonElement, i> e;

    public AbstractJsonTreeEncoder(a aVar, l lVar, f fVar) {
        this.d = aVar;
        this.e = lVar;
        this.b = aVar.b;
    }

    public void H(Object obj, boolean z) {
        JsonElement jsonElement;
        String str = (String) obj;
        m0.n.b.i.e(str, "tag");
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf == null) {
            jsonElement = k.a;
        } else {
            jsonElement = new n0.c.l.i(valueOf, false);
        }
        O(str, jsonElement);
    }

    public void I(Object obj, double d2) {
        String str = (String) obj;
        m0.n.b.i.e(str, "tag");
        O(str, m0.r.t.a.r.m.a1.a.r(Double.valueOf(d2)));
        if (!this.b.j) {
            if (!(!Double.isInfinite(d2) && !Double.isNaN(d2))) {
                throw m0.r.t.a.r.m.a1.a.l(Double.valueOf(d2), str, N().toString());
            }
        }
    }

    public void J(Object obj, float f) {
        String str = (String) obj;
        m0.n.b.i.e(str, "tag");
        O(str, m0.r.t.a.r.m.a1.a.r(Float.valueOf(f)));
        if (!this.b.j) {
            if (!(!Float.isInfinite(f) && !Float.isNaN(f))) {
                throw m0.r.t.a.r.m.a1.a.l(Float.valueOf(f), str, N().toString());
            }
        }
    }

    public abstract JsonElement N();

    public abstract void O(String str, JsonElement jsonElement);

    public final b a() {
        return this.d.b.k;
    }

    public n0.c.j.d c(SerialDescriptor serialDescriptor) {
        l lVar;
        AbstractJsonTreeEncoder abstractJsonTreeEncoder;
        m0.n.b.i.e(serialDescriptor, "descriptor");
        if (K() == null) {
            lVar = this.e;
        } else {
            lVar = new AbstractJsonTreeEncoder$beginStructure$consumer$1(this);
        }
        n0.c.i.g f = serialDescriptor.f();
        if (m0.n.b.i.a(f, h.b.a) || (f instanceof c)) {
            abstractJsonTreeEncoder = new m(this.d, lVar);
        } else if (m0.n.b.i.a(f, h.c.a)) {
            a aVar = this.d;
            SerialDescriptor h = serialDescriptor.h(0);
            n0.c.i.g f2 = h.f();
            if ((f2 instanceof n0.c.i.d) || m0.n.b.i.a(f2, g.b.a)) {
                abstractJsonTreeEncoder = new o(this.d, lVar);
            } else if (aVar.b.d) {
                abstractJsonTreeEncoder = new m(this.d, lVar);
            } else {
                throw m0.r.t.a.r.m.a1.a.m(h);
            }
        } else {
            abstractJsonTreeEncoder = new n0.c.l.q.k(this.d, lVar);
        }
        if (this.c) {
            this.c = false;
            abstractJsonTreeEncoder.O(this.b.i, m0.r.t.a.r.m.a1.a.s(serialDescriptor.a()));
        }
        return abstractJsonTreeEncoder;
    }

    public final a d() {
        return this.d;
    }

    public <T> void e(n0.c.f<? super T> fVar, T t) {
        m0.n.b.i.e(fVar, "serializer");
        if (K() == null && ((fVar.getDescriptor().f() instanceof n0.c.i.d) || fVar.getDescriptor().f() == g.b.a)) {
            n0.c.l.q.h hVar = new n0.c.l.q.h(this.d, this.e);
            hVar.e(fVar, t);
            m0.n.b.i.e(fVar.getDescriptor(), "descriptor");
            hVar.e.invoke(hVar.N());
        } else if (!(fVar instanceof n0.c.k.b) || this.d.b.h) {
            fVar.serialize(this, t);
        } else {
            Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.Any");
            n0.c.f a = p.a(this, fVar, t);
            this.c = true;
            a.serialize(this, t);
        }
    }

    public void f() {
        String str = (String) K();
        if (str != null) {
            m0.n.b.i.e(str, "tag");
            O(str, k.a);
            return;
        }
        this.e.invoke(k.a);
    }

    public boolean v(SerialDescriptor serialDescriptor, int i) {
        m0.n.b.i.e(serialDescriptor, "descriptor");
        return this.b.a;
    }

    public void w(JsonElement jsonElement) {
        m0.n.b.i.e(jsonElement, "element");
        e(JsonElementSerializer.b, jsonElement);
    }
}
