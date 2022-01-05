package m0.r.t.a.r.k.b.w;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.d0;
import m0.r.t.a.r.c.t0.p;
import m0.r.t.a.r.f.c.c;
import m0.r.t.a.r.f.c.e;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.h.l;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class g extends d0 implements b {
    public final d A2;
    public DeserializedMemberDescriptor.CoroutinesCompatibilityMode B2;
    public final ProtoBuf$Function w2;
    public final c x2;
    public final e y2;
    public final m0.r.t.a.r.f.c.g z2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar, g0 g0Var, f fVar, d dVar, CallableMemberDescriptor.Kind kind, ProtoBuf$Function protoBuf$Function, c cVar, e eVar, m0.r.t.a.r.f.c.g gVar, d dVar2, h0 h0Var) {
        super(iVar, g0Var, fVar, dVar, kind, h0Var == null ? h0.a : h0Var);
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        c cVar2 = cVar;
        e eVar2 = eVar;
        m0.r.t.a.r.f.c.g gVar2 = gVar;
        i iVar2 = iVar;
        m0.n.b.i.e(iVar, "containingDeclaration");
        f fVar2 = fVar;
        m0.n.b.i.e(fVar, "annotations");
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(kind, "kind");
        m0.n.b.i.e(protoBuf$Function2, "proto");
        m0.n.b.i.e(cVar2, "nameResolver");
        m0.n.b.i.e(eVar2, "typeTable");
        m0.n.b.i.e(gVar2, "versionRequirementTable");
        this.w2 = protoBuf$Function2;
        this.x2 = cVar2;
        this.y2 = eVar2;
        this.z2 = gVar2;
        this.A2 = dVar2;
        this.B2 = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    public l A() {
        return this.w2;
    }

    public List<m0.r.t.a.r.f.c.f> F0() {
        return h.M1(this);
    }

    public p H0(i iVar, r rVar, CallableMemberDescriptor.Kind kind, d dVar, f fVar, h0 h0Var) {
        d dVar2;
        i iVar2 = iVar;
        m0.n.b.i.e(iVar, "newOwner");
        m0.n.b.i.e(kind, "kind");
        m0.n.b.i.e(fVar, "annotations");
        m0.n.b.i.e(h0Var, Stripe3ds2AuthParams.FIELD_SOURCE);
        g0 g0Var = (g0) rVar;
        if (dVar == null) {
            d name = getName();
            m0.n.b.i.d(name, "name");
            dVar2 = name;
        } else {
            dVar2 = dVar;
        }
        g gVar = new g(iVar, g0Var, fVar, dVar2, kind, this.w2, this.x2, this.y2, this.z2, this.A2, h0Var);
        gVar.o2 = this.o2;
        gVar.B2 = this.B2;
        return gVar;
    }

    public e R() {
        return this.y2;
    }

    public m0.r.t.a.r.f.c.g X() {
        return this.z2;
    }

    public c Y() {
        return this.x2;
    }

    public d b0() {
        return this.A2;
    }
}
