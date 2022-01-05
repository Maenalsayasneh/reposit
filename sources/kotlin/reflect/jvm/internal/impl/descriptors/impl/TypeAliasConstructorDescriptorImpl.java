package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Objects;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import m0.n.b.f;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.g;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.t0.f0;
import m0.r.t.a.r.c.t0.p;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.v;

/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class TypeAliasConstructorDescriptorImpl extends p implements f0 {
    public static final a w2 = new a((f) null);
    public static final /* synthetic */ k<Object>[] x2 = {m.c(new PropertyReference1Impl(m.a(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public c A2;
    public final l y2;
    public final l0 z2;

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    public TypeAliasConstructorDescriptorImpl(l lVar, l0 l0Var, c cVar, f0 f0Var, m0.r.t.a.r.c.r0.f fVar, CallableMemberDescriptor.Kind kind, h0 h0Var) {
        super(l0Var, f0Var, fVar, d.j("<init>"), kind, h0Var);
        this.y2 = lVar;
        this.z2 = l0Var;
        this.k2 = l0Var.A0();
        lVar.e(new TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(this, cVar));
        this.A2 = cVar;
    }

    public p H0(i iVar, r rVar, CallableMemberDescriptor.Kind kind, d dVar, m0.r.t.a.r.c.r0.f fVar, h0 h0Var) {
        m0.n.b.i.e(iVar, "newOwner");
        m0.n.b.i.e(kind, "kind");
        m0.n.b.i.e(fVar, "annotations");
        m0.n.b.i.e(h0Var, Stripe3ds2AuthParams.FIELD_SOURCE);
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.y2, this.z2, this.A2, this, fVar, kind2, h0Var);
    }

    /* renamed from: Q0 */
    public f0 j0(i iVar, Modality modality, m0.r.t.a.r.c.p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        m0.n.b.i.e(iVar, "newOwner");
        m0.n.b.i.e(modality, "modality");
        m0.n.b.i.e(pVar, "visibility");
        m0.n.b.i.e(kind, "kind");
        p.c cVar = (p.c) s();
        cVar.l(iVar);
        cVar.b(modality);
        cVar.k(pVar);
        cVar.n(kind);
        cVar.h(z);
        r build = cVar.build();
        Objects.requireNonNull(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (f0) build;
    }

    /* renamed from: R0 */
    public f0 a() {
        return (f0) super.a();
    }

    /* renamed from: S0 */
    public f0 c(TypeSubstitutor typeSubstitutor) {
        m0.n.b.i.e(typeSubstitutor, "substitutor");
        r c = super.c(typeSubstitutor);
        Objects.requireNonNull(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) c;
        v vVar = typeAliasConstructorDescriptorImpl.Z1;
        m0.n.b.i.c(vVar);
        TypeSubstitutor d = TypeSubstitutor.d(vVar);
        m0.n.b.i.d(d, "create(substitutedTypeAliasConstructor.returnType)");
        c c2 = this.A2.a().c(d);
        if (c2 == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.A2 = c2;
        return typeAliasConstructorDescriptorImpl;
    }

    public g b() {
        return this.z2;
    }

    public v getReturnType() {
        v vVar = this.Z1;
        m0.n.b.i.c(vVar);
        return vVar;
    }

    public c o0() {
        return this.A2;
    }

    public boolean x() {
        return this.A2.x();
    }

    public m0.r.t.a.r.c.d y() {
        m0.r.t.a.r.c.d y = this.A2.y();
        m0.n.b.i.d(y, "underlyingConstructorDescriptor.constructedClass");
        return y;
    }

    /* renamed from: b  reason: collision with other method in class */
    public i m52b() {
        return this.z2;
    }
}
