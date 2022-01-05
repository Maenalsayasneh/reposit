package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.j.g;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.j.u.c;
import m0.r.t.a.r.j.u.d;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$allDescriptors$1 extends Lambda implements a<Collection<? extends i>> {
    public final /* synthetic */ LazyJavaScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$allDescriptors$1(LazyJavaScope lazyJavaScope) {
        super(0);
        this.c = lazyJavaScope;
    }

    public Object invoke() {
        LazyJavaScope lazyJavaScope = this.c;
        d dVar = d.m;
        Objects.requireNonNull(MemberScope.a);
        l<m0.r.t.a.r.g.d, Boolean> lVar = MemberScope.Companion.b;
        Objects.requireNonNull(lazyJavaScope);
        m0.n.b.i.e(dVar, "kindFilter");
        m0.n.b.i.e(lVar, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d.a aVar = d.a;
        if (dVar.a(d.j)) {
            for (m0.r.t.a.r.g.d next : lazyJavaScope.h(dVar, lVar)) {
                if (lVar.invoke(next).booleanValue()) {
                    m0.r.t.a.r.m.a1.a.N(linkedHashSet, lazyJavaScope.f(next, noLookupLocation));
                }
            }
        }
        d.a aVar2 = d.a;
        if (dVar.a(d.g) && !dVar.t.contains(c.a.a)) {
            for (m0.r.t.a.r.g.d next2 : lazyJavaScope.i(dVar, lVar)) {
                if (lVar.invoke(next2).booleanValue()) {
                    linkedHashSet.addAll(lazyJavaScope.a(next2, noLookupLocation));
                }
            }
        }
        d.a aVar3 = d.a;
        if (dVar.a(d.h) && !dVar.t.contains(c.a.a)) {
            for (m0.r.t.a.r.g.d next3 : lazyJavaScope.o(dVar, lVar)) {
                if (lVar.invoke(next3).booleanValue()) {
                    linkedHashSet.addAll(lazyJavaScope.c(next3, noLookupLocation));
                }
            }
        }
        return g.v0(linkedHashSet);
    }
}
