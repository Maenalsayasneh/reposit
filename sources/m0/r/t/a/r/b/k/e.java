package m0.r.t.a.r.b.k;

import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$cloneable$2;
import m0.n.a.l;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.s0.b;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.c;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.h;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class e implements b {
    public static final e a = null;
    public static final /* synthetic */ k<Object>[] b = {m.c(new PropertyReference1Impl(m.a(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final m0.r.t.a.r.g.b c = g.l;
    public static final d d;
    public static final a e;
    public final u f;
    public final l<u, i> g;
    public final h h;

    static {
        c cVar = g.a.d;
        d h2 = cVar.h();
        m0.n.b.i.d(h2, "cloneable.shortName()");
        d = h2;
        a l = a.l(cVar.i());
        m0.n.b.i.d(l, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        e = l;
    }

    public e(m0.r.t.a.r.l.l lVar, u uVar, l lVar2, int i) {
        JvmBuiltInClassDescriptorFactory$1 jvmBuiltInClassDescriptorFactory$1 = (i & 4) != 0 ? JvmBuiltInClassDescriptorFactory$1.c : null;
        m0.n.b.i.e(lVar, "storageManager");
        m0.n.b.i.e(uVar, "moduleDescriptor");
        m0.n.b.i.e(jvmBuiltInClassDescriptorFactory$1, "computeContainingDeclaration");
        this.f = uVar;
        this.g = jvmBuiltInClassDescriptorFactory$1;
        this.h = lVar.d(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, lVar));
    }

    public Collection<m0.r.t.a.r.c.d> a(m0.r.t.a.r.g.b bVar) {
        m0.n.b.i.e(bVar, "packageFqName");
        if (m0.n.b.i.a(bVar, c)) {
            return i0.j.f.p.h.N3((m0.r.t.a.r.c.t0.i) i0.j.f.p.h.K1(this.h, b[0]));
        }
        return EmptySet.c;
    }

    public boolean b(m0.r.t.a.r.g.b bVar, d dVar) {
        m0.n.b.i.e(bVar, "packageFqName");
        m0.n.b.i.e(dVar, "name");
        return m0.n.b.i.a(dVar, d) && m0.n.b.i.a(bVar, c);
    }

    public m0.r.t.a.r.c.d c(a aVar) {
        m0.n.b.i.e(aVar, "classId");
        if (m0.n.b.i.a(aVar, e)) {
            return (m0.r.t.a.r.c.t0.i) i0.j.f.p.h.K1(this.h, b[0]);
        }
        return null;
    }
}
