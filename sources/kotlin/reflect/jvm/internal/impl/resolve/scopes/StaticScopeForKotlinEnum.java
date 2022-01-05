package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.j.u.g;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;

/* compiled from: StaticScopeForKotlinEnum.kt */
public final class StaticScopeForKotlinEnum extends g {
    public static final /* synthetic */ k<Object>[] b = {m.c(new PropertyReference1Impl(m.a(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};
    public final d c;
    public final h d;

    public StaticScopeForKotlinEnum(l lVar, d dVar) {
        i.e(lVar, "storageManager");
        i.e(dVar, "containingClass");
        this.c = dVar;
        ClassKind classKind = ClassKind.ENUM_CLASS;
        this.d = lVar.d(new StaticScopeForKotlinEnum$functions$2(this));
    }

    public Collection a(m0.r.t.a.r.g.d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        m0.r.t.a.r.o.i iVar = new m0.r.t.a.r.o.i();
        for (Object next : (List) i0.j.f.p.h.K1(this.d, b[0])) {
            if (i.a(((g0) next).getName(), dVar)) {
                iVar.add(next);
            }
        }
        return iVar;
    }

    public f f(m0.r.t.a.r.g.d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return null;
    }

    public Collection g(m0.r.t.a.r.j.u.d dVar, m0.n.a.l lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        return (List) i0.j.f.p.h.K1(this.d, b[0]);
    }
}
