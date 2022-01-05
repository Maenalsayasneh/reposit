package m0.r.t.a.r.e.a.t;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.a0;
import m0.r.t.a.r.c.t0.b0;
import m0.r.t.a.r.c.t0.z;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.m.v;

/* compiled from: JavaPropertyDescriptor */
public class f extends z implements b {
    public final boolean t2;
    public final Pair<a.C0250a<?>, ?> u2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(i iVar, m0.r.t.a.r.c.r0.f fVar, Modality modality, p pVar, boolean z, d dVar, h0 h0Var, c0 c0Var, CallableMemberDescriptor.Kind kind, boolean z2, Pair<a.C0250a<?>, ?> pair) {
        super(iVar, c0Var, fVar, modality, pVar, z, dVar, kind, h0Var, false, false, false, false, false, false);
        if (iVar == null) {
            D(0);
            throw null;
        } else if (fVar == null) {
            D(1);
            throw null;
        } else if (modality == null) {
            D(2);
            throw null;
        } else if (pVar == null) {
            D(3);
            throw null;
        } else if (dVar == null) {
            D(4);
            throw null;
        } else if (h0Var == null) {
            D(5);
            throw null;
        } else if (kind != null) {
            this.t2 = z2;
            this.u2 = pair;
        } else {
            D(6);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 21 ? 3 : 2)];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 21 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static f M0(i iVar, m0.r.t.a.r.c.r0.f fVar, Modality modality, p pVar, boolean z, d dVar, h0 h0Var, boolean z2) {
        if (iVar == null) {
            D(7);
            throw null;
        } else if (modality == null) {
            D(9);
            throw null;
        } else if (dVar == null) {
            D(11);
            throw null;
        } else if (h0Var != null) {
            return new f(iVar, fVar, modality, pVar, z, dVar, h0Var, (c0) null, CallableMemberDescriptor.Kind.DECLARATION, z2, (Pair<a.C0250a<?>, ?>) null);
        } else {
            D(12);
            throw null;
        }
    }

    public boolean C() {
        return false;
    }

    public z I0(i iVar, Modality modality, p pVar, c0 c0Var, CallableMemberDescriptor.Kind kind, d dVar, h0 h0Var) {
        if (iVar == null) {
            D(13);
            throw null;
        } else if (modality == null) {
            D(14);
            throw null;
        } else if (pVar == null) {
            D(15);
            throw null;
        } else if (kind == null) {
            D(16);
            throw null;
        } else if (dVar != null) {
            return new f(iVar, getAnnotations(), modality, pVar, this.Y1, dVar, h0Var, c0Var, kind, this.t2, this.u2);
        } else {
            D(17);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r5 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r5 = m0.r.t.a.r.e.a.x.l.a;
        m0.n.b.i.e(r0, "<this>");
        r5 = m0.r.t.a.r.m.x0.k.a;
        m0.n.b.i.e(r5, "<this>");
        m0.n.b.i.e(r0, "type");
        r1 = m0.r.t.a.r.e.a.q.o;
        m0.n.b.i.d(r1, "ENHANCED_NULLABILITY_ANNOTATION");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r5.z(r0, r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (m0.r.t.a.r.b.f.K(r0) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (m0.r.t.a.r.b.i.a(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (m0.r.t.a.r.m.s0.g(r0) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (m0.r.t.a.r.b.f.K(r0) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isConst() {
        /*
            r6 = this;
            m0.r.t.a.r.m.v r0 = r6.getType()
            boolean r1 = r6.t2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = "type"
            m0.n.b.i.e(r0, r1)
            java.lang.String r4 = "<this>"
            m0.n.b.i.e(r0, r4)
            boolean r5 = m0.r.t.a.r.b.f.I(r0)
            if (r5 != 0) goto L_0x0022
            m0.r.t.a.r.b.i r5 = m0.r.t.a.r.b.i.a
            boolean r5 = m0.r.t.a.r.b.i.a(r0)
            if (r5 == 0) goto L_0x0028
        L_0x0022:
            boolean r5 = m0.r.t.a.r.m.s0.g(r0)
            if (r5 == 0) goto L_0x0031
        L_0x0028:
            boolean r5 = m0.r.t.a.r.b.f.K(r0)
            if (r5 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r5 = r3
            goto L_0x0032
        L_0x0031:
            r5 = r2
        L_0x0032:
            if (r5 == 0) goto L_0x0055
            m0.r.t.a.r.e.a.x.b r5 = m0.r.t.a.r.e.a.x.l.a
            m0.n.b.i.e(r0, r4)
            m0.r.t.a.r.m.x0.k r5 = m0.r.t.a.r.m.x0.k.a
            m0.n.b.i.e(r5, r4)
            m0.n.b.i.e(r0, r1)
            m0.r.t.a.r.g.b r1 = m0.r.t.a.r.e.a.q.o
            java.lang.String r4 = "ENHANCED_NULLABILITY_ANNOTATION"
            m0.n.b.i.d(r1, r4)
            boolean r1 = r5.z(r0, r1)
            if (r1 == 0) goto L_0x0056
            boolean r0 = m0.r.t.a.r.b.f.K(r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.e.a.t.f.isConst():boolean");
    }

    public b v(v vVar, List<j> list, v vVar2, Pair<a.C0250a<?>, ?> pair) {
        a0 a0Var;
        b0 b0Var;
        f0 f0Var;
        v vVar3 = vVar;
        v vVar4 = vVar2;
        if (vVar4 != null) {
            c0 a = a() == this ? null : a();
            f fVar = r5;
            f fVar2 = new f(b(), getAnnotations(), j(), getVisibility(), this.Y1, getName(), r(), a, f(), this.t2, pair);
            a0 a0Var2 = this.o2;
            if (a0Var2 != null) {
                a0Var = r5;
                a0 a0Var3 = new a0(fVar, a0Var2.getAnnotations(), a0Var2.j(), a0Var2.getVisibility(), a0Var2.y, a0Var2.Y1, a0Var2.b2, f(), a == null ? null : a.getGetter(), a0Var2.r());
                a0Var.e2 = a0Var2.e2;
                a0Var.f2 = vVar4;
            } else {
                a0Var = null;
            }
            e0 e0Var = this.p2;
            if (e0Var != null) {
                b0 b0Var2 = r5;
                b0 b0Var3 = new b0(fVar, e0Var.getAnnotations(), e0Var.j(), e0Var.getVisibility(), e0Var.T(), e0Var.isExternal(), e0Var.isInline(), f(), a == null ? null : a.getSetter(), e0Var.r());
                b0Var2.e2 = b0Var2.e2;
                b0Var2.K0(e0Var.h().get(0));
                b0Var = b0Var2;
            } else {
                b0Var = null;
            }
            f fVar3 = fVar;
            fVar3.K0(a0Var, b0Var, this.r2, this.s2);
            fVar3.q2 = this.q2;
            m0.r.t.a.r.l.i<g<?>> iVar = this.Z1;
            if (iVar != null) {
                fVar3.H0(iVar);
            }
            fVar3.v0(e());
            v vVar5 = vVar;
            if (vVar5 == null) {
                f0Var = null;
            } else {
                Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
                f0Var = h.k0(this, vVar5, f.a.b);
            }
            fVar3.L0(vVar2, getTypeParameters(), this.l2, f0Var);
            return fVar3;
        }
        D(20);
        throw null;
    }
}
