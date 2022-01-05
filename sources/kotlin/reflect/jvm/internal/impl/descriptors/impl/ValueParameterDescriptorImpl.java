package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import m0.c;
import m0.n.b.i;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.j;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.p0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.h0;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.m.v;

/* compiled from: ValueParameterDescriptorImpl.kt */
public class ValueParameterDescriptorImpl extends h0 implements o0 {
    public final int Y1;
    public final boolean Z1;
    public final boolean a2;
    public final boolean b2;
    public final v c2;
    public final o0 d2;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {
        public final c e2;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(a aVar, o0 o0Var, int i, f fVar, d dVar, v vVar, boolean z, boolean z2, boolean z3, v vVar2, m0.r.t.a.r.c.h0 h0Var, m0.n.a.a<? extends List<? extends p0>> aVar2) {
            super(aVar, o0Var, i, fVar, dVar, vVar, z, z2, z3, vVar2, h0Var);
            i.e(aVar, "containingDeclaration");
            i.e(fVar, "annotations");
            i.e(dVar, "name");
            i.e(vVar, "outType");
            i.e(h0Var, Stripe3ds2AuthParams.FIELD_SOURCE);
            i.e(aVar2, "destructuringVariables");
            this.e2 = h.H2(aVar2);
        }

        public o0 C0(a aVar, d dVar, int i) {
            a aVar2 = aVar;
            i.e(aVar2, "newOwner");
            d dVar2 = dVar;
            i.e(dVar2, "newName");
            f annotations = getAnnotations();
            i.d(annotations, "annotations");
            v type = getType();
            i.d(type, "type");
            boolean s02 = s0();
            boolean z = this.a2;
            boolean z2 = this.b2;
            v vVar = this.c2;
            m0.r.t.a.r.c.h0 h0Var = m0.r.t.a.r.c.h0.a;
            i.d(h0Var, "NO_SOURCE");
            return new WithDestructuringDeclaration(aVar2, (o0) null, i, annotations, dVar2, type, s02, z, z2, vVar, h0Var, new ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(this));
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [m0.r.t.a.r.c.o0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ValueParameterDescriptorImpl(m0.r.t.a.r.c.a r8, m0.r.t.a.r.c.o0 r9, int r10, m0.r.t.a.r.c.r0.f r11, m0.r.t.a.r.g.d r12, m0.r.t.a.r.m.v r13, boolean r14, boolean r15, boolean r16, m0.r.t.a.r.m.v r17, m0.r.t.a.r.c.h0 r18) {
        /*
            r7 = this;
            r6 = r7
            java.lang.String r0 = "containingDeclaration"
            r1 = r8
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "annotations"
            r2 = r11
            m0.n.b.i.e(r11, r0)
            java.lang.String r0 = "name"
            r3 = r12
            m0.n.b.i.e(r12, r0)
            java.lang.String r0 = "outType"
            r4 = r13
            m0.n.b.i.e(r13, r0)
            java.lang.String r0 = "source"
            r5 = r18
            m0.n.b.i.e(r5, r0)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r10
            r6.Y1 = r0
            r0 = r14
            r6.Z1 = r0
            r0 = r15
            r6.a2 = r0
            r0 = r16
            r6.b2 = r0
            r0 = r17
            r6.c2 = r0
            if (r9 != 0) goto L_0x0039
            r0 = r6
            goto L_0x003a
        L_0x0039:
            r0 = r9
        L_0x003a:
            r6.d2 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.<init>(m0.r.t.a.r.c.a, m0.r.t.a.r.c.o0, int, m0.r.t.a.r.c.r0.f, m0.r.t.a.r.g.d, m0.r.t.a.r.m.v, boolean, boolean, boolean, m0.r.t.a.r.m.v, m0.r.t.a.r.c.h0):void");
    }

    public o0 C0(a aVar, d dVar, int i) {
        i.e(aVar, "newOwner");
        d dVar2 = dVar;
        i.e(dVar2, "newName");
        f annotations = getAnnotations();
        i.d(annotations, "annotations");
        v type = getType();
        i.d(type, "type");
        boolean s02 = s0();
        boolean z = this.a2;
        boolean z2 = this.b2;
        v vVar = this.c2;
        m0.r.t.a.r.c.h0 h0Var = m0.r.t.a.r.c.h0.a;
        i.d(h0Var, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(aVar, (o0) null, i, annotations, dVar2, type, s02, z, z2, vVar, h0Var);
    }

    public <R, D> R J(k<R, D> kVar, D d) {
        i.e(kVar, "visitor");
        return kVar.k(this, d);
    }

    public /* bridge */ /* synthetic */ g V() {
        return null;
    }

    public boolean W() {
        return this.b2;
    }

    public boolean a0() {
        return this.a2;
    }

    public j c(TypeSubstitutor typeSubstitutor) {
        i.e(typeSubstitutor, "substitutor");
        if (typeSubstitutor.h()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public Collection<o0> e() {
        Collection<? extends a> e = b().e();
        i.d(e, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(h.K(e, 10));
        for (a h : e) {
            arrayList.add(h.h().get(this.Y1));
        }
        return arrayList;
    }

    public int g() {
        return this.Y1;
    }

    public p getVisibility() {
        p pVar = o.f;
        i.d(pVar, "LOCAL");
        return pVar;
    }

    public boolean i0() {
        return false;
    }

    public v k0() {
        return this.c2;
    }

    public boolean s0() {
        return this.Z1 && ((CallableMemberDescriptor) b()).f().isReal();
    }

    public a b() {
        return (a) super.b();
    }

    public o0 a() {
        o0 o0Var = this.d2;
        return o0Var == this ? this : o0Var.a();
    }
}
