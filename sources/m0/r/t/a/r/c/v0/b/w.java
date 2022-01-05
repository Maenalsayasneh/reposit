package m0.r.t.a.r.c.v0.b;

import i0.j.f.p.h;
import java.lang.annotation.Annotation;
import java.util.Collection;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.z;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaValueParameter.kt */
public final class w extends l implements z {
    public final u a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public w(u uVar, Annotation[] annotationArr, String str, boolean z) {
        i.e(uVar, "type");
        i.e(annotationArr, "reflectAnnotations");
        this.a = uVar;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    public a f(b bVar) {
        i.e(bVar, "fqName");
        return h.C0(this.b, bVar);
    }

    public boolean g() {
        return this.d;
    }

    public Collection getAnnotations() {
        return h.Q0(this.b);
    }

    public d getName() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        return d.f(str);
    }

    public m0.r.t.a.r.e.a.w.w getType() {
        return this.a;
    }

    public boolean m() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        i0.d.a.a.a.p(w.class, sb, ": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str == null ? null : d.f(str));
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
