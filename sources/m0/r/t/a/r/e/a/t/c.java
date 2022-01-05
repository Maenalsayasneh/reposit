package m0.r.t.a.r.e.a.t;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.g;
import m0.r.t.a.r.m.v;

/* compiled from: JavaClassConstructorDescriptor */
public class c extends g implements b {
    public Boolean y2;
    public Boolean z2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, c cVar, f fVar, boolean z, CallableMemberDescriptor.Kind kind, h0 h0Var) {
        super(dVar, cVar, fVar, z, kind, h0Var);
        if (dVar == null) {
            D(0);
            throw null;
        } else if (fVar == null) {
            D(1);
            throw null;
        } else if (kind == null) {
            D(2);
            throw null;
        } else if (h0Var != null) {
            this.y2 = null;
            this.z2 = null;
        } else {
            D(3);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 11 || i == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static c U0(d dVar, f fVar, boolean z, h0 h0Var) {
        if (dVar == null) {
            D(4);
            throw null;
        } else if (fVar == null) {
            D(5);
            throw null;
        } else if (h0Var != null) {
            return new c(dVar, (c) null, fVar, z, CallableMemberDescriptor.Kind.DECLARATION, h0Var);
        } else {
            D(6);
            throw null;
        }
    }

    public boolean C() {
        return this.z2.booleanValue();
    }

    public void N0(boolean z) {
        this.y2 = Boolean.valueOf(z);
    }

    public void O0(boolean z) {
        this.z2 = Boolean.valueOf(z);
    }

    /* renamed from: V0 */
    public c Q0(i iVar, r rVar, CallableMemberDescriptor.Kind kind, m0.r.t.a.r.g.d dVar, f fVar, h0 h0Var) {
        if (iVar == null) {
            D(7);
            throw null;
        } else if (kind == null) {
            D(8);
            throw null;
        } else if (fVar == null) {
            D(9);
            throw null;
        } else if (h0Var == null) {
            D(10);
            throw null;
        } else if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            d dVar2 = (d) iVar;
            c cVar = (c) rVar;
            if (dVar2 == null) {
                D(12);
                throw null;
            } else if (kind == null) {
                D(13);
                throw null;
            } else if (h0Var == null) {
                D(14);
                throw null;
            } else if (fVar != null) {
                c cVar2 = new c(dVar2, cVar, fVar, this.x2, kind, h0Var);
                cVar2.N0(W0());
                cVar2.O0(C());
                return cVar2;
            } else {
                D(15);
                throw null;
            }
        } else {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + iVar + "\n" + "kind: " + kind);
        }
    }

    public boolean W0() {
        return this.y2.booleanValue();
    }

    public b v(v vVar, List list, v vVar2, Pair pair) {
        v vVar3 = vVar;
        Pair pair2 = pair;
        f0 f0Var = null;
        if (vVar2 != null) {
            c V0 = Q0(b(), (r) null, f(), (m0.r.t.a.r.g.d) null, getAnnotations(), r());
            if (vVar3 != null) {
                Objects.requireNonNull(f.i);
                f0Var = h.k0(V0, vVar, f.a.b);
            }
            List list2 = list;
            V0.K0(f0Var, this.b2, getTypeParameters(), h.Z(list, h(), V0), vVar2, j(), getVisibility());
            if (pair2 != null) {
                V0.M0((a.C0250a) pair2.c, pair2.d);
            }
            return V0;
        }
        D(17);
        throw null;
    }
}
