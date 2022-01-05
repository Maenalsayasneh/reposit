package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.v;

/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2 extends Lambda implements a<TypeAliasConstructorDescriptorImpl> {
    public final /* synthetic */ TypeAliasConstructorDescriptorImpl c;
    public final /* synthetic */ c d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, c cVar) {
        super(0);
        this.c = typeAliasConstructorDescriptorImpl;
        this.d = cVar;
    }

    public Object invoke() {
        TypeSubstitutor typeSubstitutor;
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.c;
        l lVar = typeAliasConstructorDescriptorImpl.y2;
        l0 l0Var = typeAliasConstructorDescriptorImpl.z2;
        c cVar = this.d;
        f annotations = cVar.getAnnotations();
        CallableMemberDescriptor.Kind f = this.d.f();
        i.d(f, "underlyingConstructorDescriptor.kind");
        h0 r = this.c.z2.r();
        i.d(r, "typeAliasDescriptor.source");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(lVar, l0Var, cVar, typeAliasConstructorDescriptorImpl, annotations, f, r);
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl3 = this.c;
        c cVar2 = this.d;
        TypeAliasConstructorDescriptorImpl.a aVar = TypeAliasConstructorDescriptorImpl.w2;
        l0 l0Var2 = typeAliasConstructorDescriptorImpl3.z2;
        if (l0Var2.p() == null) {
            typeSubstitutor = null;
        } else {
            typeSubstitutor = TypeSubstitutor.d(l0Var2.U());
        }
        if (typeSubstitutor == null) {
            return null;
        }
        f0 e0 = cVar2.e0();
        f0 c2 = e0 == null ? null : e0.c(typeSubstitutor);
        List<m0> t = typeAliasConstructorDescriptorImpl3.z2.t();
        List<o0> h = typeAliasConstructorDescriptorImpl3.h();
        v vVar = typeAliasConstructorDescriptorImpl3.Z1;
        i.c(vVar);
        typeAliasConstructorDescriptorImpl2.K0((f0) null, c2, t, h, vVar, Modality.FINAL, typeAliasConstructorDescriptorImpl3.z2.getVisibility());
        return typeAliasConstructorDescriptorImpl2;
    }
}
