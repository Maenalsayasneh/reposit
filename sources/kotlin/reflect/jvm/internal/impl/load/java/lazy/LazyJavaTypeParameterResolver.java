package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.u.f;
import m0.r.t.a.r.e.a.u.g.e;
import m0.r.t.a.r.e.a.w.x;
import m0.r.t.a.r.e.a.w.y;
import m0.r.t.a.r.l.g;

/* compiled from: resolvers.kt */
public final class LazyJavaTypeParameterResolver implements f {
    public final c a;
    public final i b;
    public final int c;
    public final Map<x, Integer> d;
    public final g<x, e> e;

    public LazyJavaTypeParameterResolver(c cVar, i iVar, y yVar, int i) {
        m0.n.b.i.e(cVar, "c");
        m0.n.b.i.e(iVar, "containingDeclaration");
        m0.n.b.i.e(yVar, "typeParameterOwner");
        this.a = cVar;
        this.b = iVar;
        this.c = i;
        List<x> typeParameters = yVar.getTypeParameters();
        m0.n.b.i.e(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.d = linkedHashMap;
        this.e = this.a.a.a.h(new LazyJavaTypeParameterResolver$resolve$1(this));
    }

    public m0 a(x xVar) {
        m0.n.b.i.e(xVar, "javaTypeParameter");
        e invoke = this.e.invoke(xVar);
        return invoke == null ? this.a.b.a(xVar) : invoke;
    }
}
