package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.a.l;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;

/* compiled from: TypeParameterDescriptorImpl */
public class g0 extends e {
    public final l<v, Void> d2;
    public final List<v> e2;
    public boolean f2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(i iVar, f fVar, boolean z, Variance variance, d dVar, int i, h0 h0Var, l<v, Void> lVar, k0 k0Var, m0.r.t.a.r.l.l lVar2) {
        super(lVar2, iVar, fVar, dVar, variance, z, i, h0Var, k0Var);
        if (iVar == null) {
            D(19);
            throw null;
        } else if (fVar == null) {
            D(20);
            throw null;
        } else if (variance == null) {
            D(21);
            throw null;
        } else if (dVar == null) {
            D(22);
            throw null;
        } else if (h0Var == null) {
            D(23);
            throw null;
        } else if (k0Var == null) {
            D(24);
            throw null;
        } else if (lVar2 != null) {
            this.e2 = new ArrayList(1);
            this.f2 = false;
            this.d2 = lVar;
        } else {
            D(25);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 28) ? 2 : 3)];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 28) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static g0 L0(i iVar, f fVar, boolean z, Variance variance, d dVar, int i, h0 h0Var, m0.r.t.a.r.l.l lVar) {
        if (iVar == null) {
            D(6);
            throw null;
        } else if (fVar == null) {
            D(7);
            throw null;
        } else if (variance == null) {
            D(8);
            throw null;
        } else if (dVar == null) {
            D(9);
            throw null;
        } else if (lVar != null) {
            return new g0(iVar, fVar, z, variance, dVar, i, h0Var, (l<v, Void>) null, k0.a.a, lVar);
        } else {
            D(11);
            throw null;
        }
    }

    public static m0 M0(i iVar, f fVar, boolean z, Variance variance, d dVar, int i, m0.r.t.a.r.l.l lVar) {
        if (iVar == null) {
            D(0);
            throw null;
        } else if (fVar == null) {
            D(1);
            throw null;
        } else if (variance == null) {
            D(2);
            throw null;
        } else if (lVar != null) {
            g0 L0 = L0(iVar, fVar, z, variance, dVar, i, h0.a, lVar);
            L0.J0(DescriptorUtilsKt.f(iVar).m());
            L0.K0();
            L0.f2 = true;
            return L0;
        } else {
            D(4);
            throw null;
        }
    }

    public void H0(v vVar) {
        if (vVar != null) {
            l<v, Void> lVar = this.d2;
            if (lVar != null) {
                lVar.invoke(vVar);
                return;
            }
            return;
        }
        D(27);
        throw null;
    }

    public List<v> I0() {
        if (this.f2) {
            List<v> list = this.e2;
            if (list != null) {
                return list;
            }
            D(28);
            throw null;
        }
        StringBuilder P0 = a.P0("Type parameter descriptor is not initialized: ");
        P0.append(N0());
        throw new IllegalStateException(P0.toString());
    }

    public void J0(v vVar) {
        if (vVar != null) {
            K0();
            if (!h.h2(vVar)) {
                this.e2.add(vVar);
                return;
            }
            return;
        }
        D(26);
        throw null;
    }

    public final void K0() {
        if (this.f2) {
            StringBuilder P0 = a.P0("Type parameter descriptor is already initialized: ");
            P0.append(N0());
            throw new IllegalStateException(P0.toString());
        }
    }

    public final String N0() {
        return getName() + " declared in " + m0.r.t.a.r.j.d.g(b());
    }
}
