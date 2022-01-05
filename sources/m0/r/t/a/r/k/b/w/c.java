package m0.r.t.a.r.k.b.w;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.h;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.g;
import m0.r.t.a.r.c.t0.p;
import m0.r.t.a.r.f.c.e;
import m0.r.t.a.r.h.l;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class c extends g implements b {
    public final e A2;
    public final m0.r.t.a.r.f.c.g B2;
    public final d C2;
    public DeserializedMemberDescriptor.CoroutinesCompatibilityMode D2;
    public final ProtoBuf$Constructor y2;
    public final m0.r.t.a.r.f.c.c z2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, h hVar, f fVar, boolean z, CallableMemberDescriptor.Kind kind, ProtoBuf$Constructor protoBuf$Constructor, m0.r.t.a.r.f.c.c cVar, e eVar, m0.r.t.a.r.f.c.g gVar, d dVar2, h0 h0Var) {
        super(dVar, hVar, fVar, z, kind, h0Var == null ? h0.a : h0Var);
        ProtoBuf$Constructor protoBuf$Constructor2 = protoBuf$Constructor;
        m0.r.t.a.r.f.c.c cVar2 = cVar;
        e eVar2 = eVar;
        m0.r.t.a.r.f.c.g gVar2 = gVar;
        d dVar3 = dVar;
        i.e(dVar, "containingDeclaration");
        f fVar2 = fVar;
        i.e(fVar, "annotations");
        i.e(kind, "kind");
        i.e(protoBuf$Constructor2, "proto");
        i.e(cVar2, "nameResolver");
        i.e(eVar2, "typeTable");
        i.e(gVar2, "versionRequirementTable");
        this.y2 = protoBuf$Constructor2;
        this.z2 = cVar2;
        this.A2 = eVar2;
        this.B2 = gVar2;
        this.C2 = dVar2;
        this.D2 = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    public l A() {
        return this.y2;
    }

    public List<m0.r.t.a.r.f.c.f> F0() {
        return i0.j.f.p.h.M1(this);
    }

    public /* bridge */ /* synthetic */ p H0(m0.r.t.a.r.c.i iVar, r rVar, CallableMemberDescriptor.Kind kind, m0.r.t.a.r.g.d dVar, f fVar, h0 h0Var) {
        return U0(iVar, rVar, kind, fVar, h0Var);
    }

    public boolean O() {
        return false;
    }

    public /* bridge */ /* synthetic */ g Q0(m0.r.t.a.r.c.i iVar, r rVar, CallableMemberDescriptor.Kind kind, m0.r.t.a.r.g.d dVar, f fVar, h0 h0Var) {
        return U0(iVar, rVar, kind, fVar, h0Var);
    }

    public e R() {
        return this.A2;
    }

    public c U0(m0.r.t.a.r.c.i iVar, r rVar, CallableMemberDescriptor.Kind kind, f fVar, h0 h0Var) {
        m0.r.t.a.r.c.i iVar2 = iVar;
        i.e(iVar2, "newOwner");
        CallableMemberDescriptor.Kind kind2 = kind;
        i.e(kind2, "kind");
        f fVar2 = fVar;
        i.e(fVar2, "annotations");
        h0 h0Var2 = h0Var;
        i.e(h0Var2, Stripe3ds2AuthParams.FIELD_SOURCE);
        c cVar = new c((d) iVar2, (h) rVar, fVar2, this.x2, kind2, this.y2, this.z2, this.A2, this.B2, this.C2, h0Var2);
        cVar.o2 = this.o2;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode = this.D2;
        i.e(coroutinesCompatibilityMode, "<set-?>");
        cVar.D2 = coroutinesCompatibilityMode;
        return cVar;
    }

    public m0.r.t.a.r.f.c.g X() {
        return this.B2;
    }

    public m0.r.t.a.r.f.c.c Y() {
        return this.z2;
    }

    public d b0() {
        return this.C2;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }
}
