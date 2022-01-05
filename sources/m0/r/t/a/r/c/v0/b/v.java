package m0.r.t.a.r.c.v0.b;

import i0.j.f.p.h;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.x;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaTypeParameter.kt */
public final class v extends l implements e, x {
    public final TypeVariable<?> a;

    public v(TypeVariable<?> typeVariable) {
        i.e(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && i.a(this.a, ((v) obj).a);
    }

    public a f(b bVar) {
        return h.B0(this, bVar);
    }

    public Collection getAnnotations() {
        return h.P0(this);
    }

    public d getName() {
        d g = d.g(this.a.getName());
        i.d(g, "identifier(typeVariable.name)");
        return g;
    }

    public Collection getUpperBounds() {
        Type type;
        Type[] bounds = this.a.getBounds();
        i.d(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type jVar : bounds) {
            arrayList.add(new j(jVar));
        }
        j jVar2 = (j) g.l0(arrayList);
        if (jVar2 == null) {
            type = null;
        } else {
            type = jVar2.a;
        }
        return i.a(type, Object.class) ? EmptyList.c : arrayList;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean m() {
        h.e2(this);
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        i0.d.a.a.a.p(v.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    public AnnotatedElement u() {
        TypeVariable<?> typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }
}
