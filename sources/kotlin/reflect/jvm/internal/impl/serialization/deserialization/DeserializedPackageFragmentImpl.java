package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.f.c.a;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.k.b.e;
import m0.r.t.a.r.k.b.g;
import m0.r.t.a.r.k.b.k;
import m0.r.t.a.r.k.b.q;
import m0.r.t.a.r.k.b.w.d;
import m0.r.t.a.r.l.l;

/* compiled from: DeserializedPackageFragmentImpl.kt */
public abstract class DeserializedPackageFragmentImpl extends k {
    public final a Z1;
    public final d a2 = null;
    public final m0.r.t.a.r.f.c.d b2;
    public final q c2;
    public ProtoBuf$PackageFragment d2;
    public MemberScope e2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(b bVar, l lVar, u uVar, ProtoBuf$PackageFragment protoBuf$PackageFragment, a aVar, d dVar) {
        super(bVar, lVar, uVar);
        i.e(bVar, "fqName");
        i.e(lVar, "storageManager");
        i.e(uVar, "module");
        i.e(protoBuf$PackageFragment, "proto");
        i.e(aVar, "metadataVersion");
        this.Z1 = aVar;
        ProtoBuf$StringTable protoBuf$StringTable = protoBuf$PackageFragment.Y1;
        i.d(protoBuf$StringTable, "proto.strings");
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = protoBuf$PackageFragment.Z1;
        i.d(protoBuf$QualifiedNameTable, "proto.qualifiedNames");
        m0.r.t.a.r.f.c.d dVar2 = new m0.r.t.a.r.f.c.d(protoBuf$StringTable, protoBuf$QualifiedNameTable);
        this.b2 = dVar2;
        this.c2 = new q(protoBuf$PackageFragment, dVar2, aVar, new DeserializedPackageFragmentImpl$classDataFinder$1(this));
        this.d2 = protoBuf$PackageFragment;
    }

    public e B0() {
        return this.c2;
    }

    public void H0(g gVar) {
        i.e(gVar, "components");
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.d2;
        if (protoBuf$PackageFragment != null) {
            this.d2 = null;
            ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.a2;
            i.d(protoBuf$Package, "proto.`package`");
            this.e2 = new m0.r.t.a.r.k.b.w.e(this, protoBuf$Package, this.b2, this.Z1, this.a2, gVar, new DeserializedPackageFragmentImpl$initialize$1(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    public MemberScope o() {
        MemberScope memberScope = this.e2;
        if (memberScope != null) {
            return memberScope;
        }
        i.m("_memberScope");
        throw null;
    }
}
