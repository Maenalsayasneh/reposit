package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: ScopesHolderForClass.kt */
public final class ScopesHolderForClass<T extends MemberScope> {
    public static final ScopesHolderForClass a = null;
    public static final /* synthetic */ k<Object>[] b = {m.c(new PropertyReference1Impl(m.a(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public final d c;
    public final l<e, T> d;
    public final e e;
    public final h f;

    public ScopesHolderForClass(d dVar, m0.r.t.a.r.l.l lVar, l lVar2, e eVar, f fVar) {
        this.c = dVar;
        this.d = lVar2;
        this.e = eVar;
        this.f = lVar.d(new ScopesHolderForClass$scopeForOwnerModule$2(this));
    }

    public static final <T extends MemberScope> ScopesHolderForClass<T> a(d dVar, m0.r.t.a.r.l.l lVar, e eVar, l<? super e, ? extends T> lVar2) {
        i.e(dVar, "classDescriptor");
        i.e(lVar, "storageManager");
        i.e(eVar, "kotlinTypeRefinerForOwnerModule");
        i.e(lVar2, "scopeFactory");
        return new ScopesHolderForClass(dVar, lVar, lVar2, eVar, (f) null);
    }

    public final T b(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        if (!eVar.c(DescriptorUtilsKt.k(this.c))) {
            return (MemberScope) i0.j.f.p.h.K1(this.f, b[0]);
        }
        j0 i = this.c.i();
        i.d(i, "classDescriptor.typeConstructor");
        if (!eVar.d(i)) {
            return (MemberScope) i0.j.f.p.h.K1(this.f, b[0]);
        }
        return eVar.b(this.c, new ScopesHolderForClass$getScope$1(this, eVar));
    }
}
