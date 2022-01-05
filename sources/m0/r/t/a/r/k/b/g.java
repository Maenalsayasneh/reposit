package m0.r.t.a.r.k.b;

import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.s0.a;
import m0.r.t.a.r.c.s0.b;
import m0.r.t.a.r.c.s0.c;
import m0.r.t.a.r.c.s0.e;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.c.w;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.k.b.w.d;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.x0.h;
import m0.r.t.a.r.m.x0.i;

/* compiled from: context.kt */
public final class g {
    public final l a;
    public final u b;
    public final h c;
    public final e d;
    public final a<c, m0.r.t.a.r.j.p.g<?>> e;
    public final w f;
    public final p g;
    public final l h;
    public final m0.r.t.a.r.d.a.c i;
    public final m j;
    public final Iterable<b> k;
    public final NotFoundClasses l;
    public final f m;
    public final a n;
    public final m0.r.t.a.r.c.s0.c o;
    public final e p;
    public final h q;
    public final m0.r.t.a.r.j.t.a r;
    public final m0.r.t.a.r.c.s0.e s;
    public final ClassDeserializer t;

    public g(l lVar, u uVar, h hVar, e eVar, a aVar, w wVar, p pVar, l lVar2, m0.r.t.a.r.d.a.c cVar, m mVar, Iterable iterable, NotFoundClasses notFoundClasses, f fVar, a aVar2, m0.r.t.a.r.c.s0.c cVar2, e eVar2, h hVar2, m0.r.t.a.r.j.t.a aVar3, m0.r.t.a.r.c.s0.e eVar3, int i2) {
        i iVar;
        l lVar3 = lVar;
        u uVar2 = uVar;
        h hVar3 = hVar;
        e eVar4 = eVar;
        a aVar4 = aVar;
        w wVar2 = wVar;
        p pVar2 = pVar;
        l lVar4 = lVar2;
        m0.r.t.a.r.d.a.c cVar3 = cVar;
        m mVar2 = mVar;
        Iterable iterable2 = iterable;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        f fVar2 = fVar;
        e eVar5 = eVar2;
        m0.r.t.a.r.j.t.a aVar5 = aVar3;
        int i3 = i2;
        a aVar6 = (i3 & 8192) != 0 ? a.C0252a.a : aVar2;
        m0.r.t.a.r.c.s0.c cVar4 = (i3 & 16384) != 0 ? c.a.a : cVar2;
        if ((i3 & 65536) != 0) {
            Objects.requireNonNull(h.b);
            iVar = h.a.b;
        } else {
            iVar = hVar2;
        }
        e.a aVar7 = (i3 & 262144) != 0 ? e.a.a : null;
        m0.n.b.i.e(lVar3, "storageManager");
        m0.n.b.i.e(uVar2, "moduleDescriptor");
        m0.n.b.i.e(hVar3, "configuration");
        m0.n.b.i.e(eVar4, "classDataFinder");
        m0.n.b.i.e(aVar4, "annotationAndConstantLoader");
        m0.n.b.i.e(wVar2, "packageFragmentProvider");
        m0.n.b.i.e(pVar2, "localClassifierTypeSettings");
        m0.n.b.i.e(lVar4, "errorReporter");
        m0.n.b.i.e(cVar3, "lookupTracker");
        m0.n.b.i.e(mVar2, "flexibleTypeDeserializer");
        m0.n.b.i.e(iterable2, "fictitiousClassDescriptorFactories");
        m0.n.b.i.e(notFoundClasses2, "notFoundClasses");
        m0.n.b.i.e(fVar2, "contractDeserializer");
        m0.n.b.i.e(aVar6, "additionalClassPartsProvider");
        m0.n.b.i.e(cVar4, "platformDependentDeclarationFilter");
        m0.r.t.a.r.c.s0.c cVar5 = cVar4;
        m0.n.b.i.e(eVar2, "extensionRegistryLite");
        m0.n.b.i.e(iVar, "kotlinTypeChecker");
        m0.n.b.i.e(aVar3, "samConversionResolver");
        e.a aVar8 = aVar7;
        m0.n.b.i.e(aVar8, "platformDependentTypeTransformer");
        this.a = lVar3;
        this.b = uVar2;
        this.c = hVar3;
        this.d = eVar4;
        this.e = aVar4;
        this.f = wVar2;
        this.g = pVar2;
        this.h = lVar4;
        this.i = cVar3;
        this.j = mVar2;
        this.k = iterable2;
        this.l = notFoundClasses2;
        this.m = fVar2;
        this.n = aVar6;
        this.o = cVar5;
        this.p = eVar2;
        this.q = iVar;
        this.r = aVar3;
        this.s = aVar8;
        this.t = new ClassDeserializer(this);
    }

    public final i a(v vVar, m0.r.t.a.r.f.c.c cVar, m0.r.t.a.r.f.c.e eVar, m0.r.t.a.r.f.c.g gVar, m0.r.t.a.r.f.c.a aVar, d dVar) {
        m0.n.b.i.e(vVar, "descriptor");
        m0.r.t.a.r.f.c.c cVar2 = cVar;
        m0.n.b.i.e(cVar, "nameResolver");
        m0.n.b.i.e(eVar, "typeTable");
        m0.n.b.i.e(gVar, "versionRequirementTable");
        m0.r.t.a.r.f.c.a aVar2 = aVar;
        m0.n.b.i.e(aVar2, "metadataVersion");
        return new i(this, cVar2, vVar, eVar, gVar, aVar2, dVar, (TypeDeserializer) null, EmptyList.c);
    }

    public final m0.r.t.a.r.c.d b(m0.r.t.a.r.g.a aVar) {
        m0.n.b.i.e(aVar, "classId");
        return ClassDeserializer.a(this.t, aVar, (d) null, 2);
    }
}
