package m0.r.t.a.r.b.k;

import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import m0.r.t.a.r.c.s0.a;
import m0.r.t.a.r.c.s0.c;
import m0.r.t.a.r.c.s0.e;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.d.a.c;
import m0.r.t.a.r.e.b.i;
import m0.r.t.a.r.k.b.b;
import m0.r.t.a.r.k.b.f;
import m0.r.t.a.r.k.b.g;
import m0.r.t.a.r.k.b.h;
import m0.r.t.a.r.k.b.m;
import m0.r.t.a.r.k.b.p;
import m0.r.t.a.r.l.l;

/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
public final class j extends AbstractDeserializedPackageFragmentProvider {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(l lVar, i iVar, u uVar, NotFoundClasses notFoundClasses, a aVar, c cVar, h hVar, m0.r.t.a.r.m.x0.h hVar2, m0.r.t.a.r.j.t.a aVar2) {
        super(lVar, iVar, uVar);
        l lVar2 = lVar;
        u uVar2 = uVar;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        m0.n.b.i.e(lVar2, "storageManager");
        m0.n.b.i.e(iVar, "finder");
        m0.n.b.i.e(uVar2, "moduleDescriptor");
        m0.n.b.i.e(notFoundClasses2, "notFoundClasses");
        m0.n.b.i.e(aVar, "additionalClassPartsProvider");
        m0.n.b.i.e(cVar, "platformDependentDeclarationFilter");
        m0.n.b.i.e(hVar, "deserializationConfiguration");
        m0.n.b.i.e(hVar2, "kotlinTypeChecker");
        m0.n.b.i.e(aVar2, "samConversionResolver");
        m0.r.t.a.r.k.b.j jVar = r5;
        m0.r.t.a.r.k.b.j jVar2 = new m0.r.t.a.r.k.b.j(this);
        b bVar = r8;
        m0.r.t.a.r.k.b.v.a aVar3 = m0.r.t.a.r.k.b.v.a.m;
        b bVar2 = new b(uVar2, notFoundClasses2, aVar3);
        p.a aVar4 = p.a.a;
        m0.r.t.a.r.k.b.l lVar3 = m0.r.t.a.r.k.b.l.a;
        m0.n.b.i.d(lVar3, "DO_NOTHING");
        c.a aVar5 = c.a.a;
        u uVar3 = uVar;
        g gVar = r0;
        m.a aVar6 = m.a.a;
        List K = m0.j.g.K(new m0.r.t.a.r.b.j.a(lVar2, uVar3), new e(lVar2, uVar3, (m0.n.a.l) null, 4));
        Objects.requireNonNull(f.a);
        m0.r.t.a.r.k.b.j jVar3 = jVar;
        l lVar4 = lVar;
        u uVar4 = uVar;
        h hVar3 = hVar;
        g gVar2 = new g(lVar4, uVar4, hVar3, jVar3, bVar, this, aVar4, lVar3, aVar5, aVar6, K, notFoundClasses, f.a.b, aVar, cVar, aVar3.a, hVar2, aVar2, (e) null, 262144);
        g gVar3 = gVar;
        m0.n.b.i.e(gVar3, "<set-?>");
        this.d = gVar3;
    }
}
