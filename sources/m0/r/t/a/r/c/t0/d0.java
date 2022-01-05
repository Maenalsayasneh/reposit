package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;

/* compiled from: SimpleFunctionDescriptorImpl */
public class d0 extends p implements g0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(i iVar, g0 g0Var, f fVar, d dVar, CallableMemberDescriptor.Kind kind, h0 h0Var) {
        super(iVar, g0Var, fVar, dVar, kind, h0Var);
        if (iVar == null) {
            D(0);
            throw null;
        } else if (fVar == null) {
            D(1);
            throw null;
        } else if (dVar == null) {
            D(2);
            throw null;
        } else if (kind == null) {
            D(3);
            throw null;
        } else if (h0Var != null) {
        } else {
            D(4);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 21:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 20:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 22:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 10:
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "visibility";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 19:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13 || i == 17) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "getOriginal";
        } else if (i == 23) {
            objArr[1] = "copy";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static d0 R0(i iVar, f fVar, d dVar, CallableMemberDescriptor.Kind kind, h0 h0Var) {
        if (iVar == null) {
            D(5);
            throw null;
        } else if (fVar == null) {
            D(6);
            throw null;
        } else if (dVar == null) {
            D(7);
            throw null;
        } else if (kind == null) {
            D(8);
            throw null;
        } else if (h0Var != null) {
            return new d0(iVar, (g0) null, fVar, dVar, kind, h0Var);
        } else {
            D(9);
            throw null;
        }
    }

    public p H0(i iVar, r rVar, CallableMemberDescriptor.Kind kind, d dVar, f fVar, h0 h0Var) {
        if (iVar == null) {
            D(19);
            throw null;
        } else if (kind == null) {
            D(20);
            throw null;
        } else if (fVar != null) {
            g0 g0Var = (g0) rVar;
            if (dVar == null) {
                dVar = getName();
            }
            return new d0(iVar, g0Var, fVar, dVar, kind, h0Var);
        } else {
            D(21);
            throw null;
        }
    }

    /* renamed from: Q0 */
    public g0 j0(i iVar, Modality modality, p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        g0 g0Var = (g0) super.j0(iVar, modality, pVar, kind, z);
        if (g0Var != null) {
            return g0Var;
        }
        D(23);
        throw null;
    }

    /* renamed from: S0 */
    public g0 a() {
        g0 g0Var = (g0) super.a();
        if (g0Var != null) {
            return g0Var;
        }
        D(18);
        throw null;
    }

    /* renamed from: T0 */
    public d0 K0(f0 f0Var, f0 f0Var2, List<? extends m0> list, List<o0> list2, v vVar, Modality modality, p pVar) {
        if (list == null) {
            D(10);
            throw null;
        } else if (list2 == null) {
            D(11);
            throw null;
        } else if (pVar != null) {
            d0 U0 = U0(f0Var, f0Var2, list, list2, vVar, modality, pVar, (Map<? extends a.C0250a<?>, ?>) null);
            if (U0 != null) {
                return U0;
            }
            D(13);
            throw null;
        } else {
            D(12);
            throw null;
        }
    }

    public d0 U0(f0 f0Var, f0 f0Var2, List<? extends m0> list, List<o0> list2, v vVar, Modality modality, p pVar, Map<? extends a.C0250a<?>, ?> map) {
        if (list == null) {
            D(14);
            throw null;
        } else if (list2 == null) {
            D(15);
            throw null;
        } else if (pVar != null) {
            super.K0(f0Var, f0Var2, list, list2, vVar, modality, pVar);
            if (map != null && !map.isEmpty()) {
                this.v2 = new LinkedHashMap(map);
            }
            return this;
        } else {
            D(16);
            throw null;
        }
    }

    public r.a<? extends g0> s() {
        return super.s();
    }
}
