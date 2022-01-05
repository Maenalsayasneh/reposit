package m0.r.t.a.r.c.v0.a;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.Set;
import kotlin.text.StringsKt__IndentKt;
import m0.r.t.a.r.c.v0.b.s;
import m0.r.t.a.r.e.a.i;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.a.w.t;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;

/* compiled from: ReflectJavaClassFinder.kt */
public final class d implements i {
    public final ClassLoader a;

    public d(ClassLoader classLoader) {
        m0.n.b.i.e(classLoader, "classLoader");
        this.a = classLoader;
    }

    public g a(i.a aVar) {
        m0.n.b.i.e(aVar, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        a aVar2 = aVar.a;
        b h = aVar2.h();
        m0.n.b.i.d(h, "classId.packageFqName");
        String b = aVar2.i().b();
        m0.n.b.i.d(b, "classId.relativeClassName.asString()");
        String A = StringsKt__IndentKt.A(b, '.', '$', false, 4);
        if (!h.d()) {
            A = h.b() + '.' + A;
        }
        Class<?> p4 = h.p4(this.a, A);
        if (p4 != null) {
            return new m0.r.t.a.r.c.v0.b.h(p4);
        }
        return null;
    }

    public t b(b bVar) {
        m0.n.b.i.e(bVar, "fqName");
        return new s(bVar);
    }

    public Set<String> c(b bVar) {
        m0.n.b.i.e(bVar, "packageFqName");
        return null;
    }
}
