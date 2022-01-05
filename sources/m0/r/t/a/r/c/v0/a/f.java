package m0.r.t.a.r.c.v0.a;

import i0.j.f.p.h;
import java.io.InputStream;
import kotlin.text.StringsKt__IndentKt;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.b.i;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.k.b.v.a;
import m0.r.t.a.r.k.b.v.c;

/* compiled from: ReflectKotlinClassFinder.kt */
public final class f implements i {
    public final ClassLoader a;
    public final c b = new c();

    public f(ClassLoader classLoader) {
        m0.n.b.i.e(classLoader, "classLoader");
        this.a = classLoader;
    }

    public i.a a(g gVar) {
        m0.n.b.i.e(gVar, "javaClass");
        b d = gVar.d();
        String b2 = d == null ? null : d.b();
        if (b2 == null) {
            return null;
        }
        return d(b2);
    }

    public InputStream b(b bVar) {
        m0.n.b.i.e(bVar, "packageFqName");
        if (!bVar.i(m0.r.t.a.r.b.g.k)) {
            return null;
        }
        return this.b.a(a.m.a(bVar));
    }

    public i.a c(m0.r.t.a.r.g.a aVar) {
        m0.n.b.i.e(aVar, "classId");
        String b2 = aVar.i().b();
        m0.n.b.i.d(b2, "relativeClassName.asString()");
        String A = StringsKt__IndentKt.A(b2, '.', '$', false, 4);
        if (!aVar.h().d()) {
            A = aVar.h() + '.' + A;
        }
        return d(A);
    }

    public final i.a d(String str) {
        e d;
        Class<?> p4 = h.p4(this.a, str);
        if (p4 == null || (d = e.d(p4)) == null) {
            return null;
        }
        return new i.a.b(d, (byte[]) null, 2);
    }
}
