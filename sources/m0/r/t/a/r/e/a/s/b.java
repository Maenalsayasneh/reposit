package m0.r.t.a.r.e.a.s;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.e.a.q;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.g.d;

/* compiled from: JavaAnnotationMapper.kt */
public final class b {
    public static final b a = new b();
    public static final d b;
    public static final d c;
    public static final d d;
    public static final Map<m0.r.t.a.r.g.b, m0.r.t.a.r.g.b> e;
    public static final Map<m0.r.t.a.r.g.b, m0.r.t.a.r.g.b> f;

    static {
        d g = d.g(InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.d(g, "identifier(\"message\")");
        b = g;
        d g2 = d.g("allowedTargets");
        i.d(g2, "identifier(\"allowedTargets\")");
        c = g2;
        d g3 = d.g(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.d(g3, "identifier(\"value\")");
        d = g3;
        m0.r.t.a.r.g.b bVar = g.a.A;
        m0.r.t.a.r.g.b bVar2 = q.c;
        m0.r.t.a.r.g.b bVar3 = g.a.D;
        m0.r.t.a.r.g.b bVar4 = q.d;
        m0.r.t.a.r.g.b bVar5 = g.a.E;
        m0.r.t.a.r.g.b bVar6 = q.g;
        m0.r.t.a.r.g.b bVar7 = g.a.F;
        m0.r.t.a.r.g.b bVar8 = q.f;
        e = m0.j.g.N(new Pair(bVar, bVar2), new Pair(bVar3, bVar4), new Pair(bVar5, bVar6), new Pair(bVar7, bVar8));
        f = m0.j.g.N(new Pair(bVar2, bVar), new Pair(bVar4, bVar3), new Pair(q.e, g.a.u), new Pair(bVar6, bVar5), new Pair(bVar8, bVar7));
    }

    public final c a(m0.r.t.a.r.g.b bVar, m0.r.t.a.r.e.a.w.d dVar, m0.r.t.a.r.e.a.u.c cVar) {
        a f2;
        i.e(bVar, "kotlinName");
        i.e(dVar, "annotationOwner");
        i.e(cVar, "c");
        if (i.a(bVar, g.a.u)) {
            m0.r.t.a.r.g.b bVar2 = q.e;
            i.d(bVar2, "DEPRECATED_ANNOTATION");
            a f3 = dVar.f(bVar2);
            if (f3 != null || dVar.m()) {
                return new JavaDeprecatedAnnotationDescriptor(f3, cVar);
            }
        }
        m0.r.t.a.r.g.b bVar3 = e.get(bVar);
        if (bVar3 == null || (f2 = dVar.f(bVar3)) == null) {
            return null;
        }
        return b(f2, cVar, false);
    }

    public final c b(a aVar, m0.r.t.a.r.e.a.u.c cVar, boolean z) {
        i.e(aVar, "annotation");
        i.e(cVar, "c");
        m0.r.t.a.r.g.a e2 = aVar.e();
        if (i.a(e2, m0.r.t.a.r.g.a.l(q.c))) {
            return new JavaTargetAnnotationDescriptor(aVar, cVar);
        }
        if (i.a(e2, m0.r.t.a.r.g.a.l(q.d))) {
            return new JavaRetentionAnnotationDescriptor(aVar, cVar);
        }
        if (i.a(e2, m0.r.t.a.r.g.a.l(q.g))) {
            return new JavaAnnotationDescriptor(cVar, aVar, g.a.E);
        }
        if (i.a(e2, m0.r.t.a.r.g.a.l(q.f))) {
            return new JavaAnnotationDescriptor(cVar, aVar, g.a.F);
        }
        if (i.a(e2, m0.r.t.a.r.g.a.l(q.e))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(cVar, aVar, z);
    }
}
