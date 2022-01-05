package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;

/* compiled from: ClassConstructorDescriptorImpl */
public class g extends p implements c {
    public static final d w2 = d.j("<init>");
    public final boolean x2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(m0.r.t.a.r.c.d dVar, h hVar, f fVar, boolean z, CallableMemberDescriptor.Kind kind, h0 h0Var) {
        super(dVar, hVar, fVar, w2, kind, h0Var);
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
            this.x2 = z;
        } else {
            D(3);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 23:
                objArr[0] = "annotations";
                break;
            case 2:
            case 22:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 24:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 18:
                objArr[0] = "originalSubstitutor";
                break;
            case 20:
                objArr[0] = "overriddenDescriptors";
                break;
            case 21:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 19) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 25) {
            switch (i) {
                case 15:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 16:
                    objArr[1] = "getConstructedClass";
                    break;
                case 17:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            case 20:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public r B0(i iVar, Modality modality, p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        c cVar = (c) super.j0(iVar, modality, pVar, kind, z);
        if (cVar != null) {
            return cVar;
        }
        D(25);
        throw null;
    }

    public <R, D> R J(k<R, D> kVar, D d) {
        return kVar.h(this, d);
    }

    /* renamed from: Q0 */
    public g H0(i iVar, r rVar, CallableMemberDescriptor.Kind kind, d dVar, f fVar, h0 h0Var) {
        if (iVar == null) {
            D(21);
            throw null;
        } else if (kind == null) {
            D(22);
            throw null;
        } else if (fVar == null) {
            D(23);
            throw null;
        } else if (h0Var != null) {
            CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
            if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
                return new g((m0.r.t.a.r.c.d) iVar, this, fVar, this.x2, kind2, h0Var);
            }
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + iVar + "\n" + "kind: " + kind);
        } else {
            D(24);
            throw null;
        }
    }

    /* renamed from: R0 */
    public m0.r.t.a.r.c.d b() {
        m0.r.t.a.r.c.d dVar = (m0.r.t.a.r.c.d) super.b();
        if (dVar != null) {
            return dVar;
        }
        D(15);
        throw null;
    }

    public g S0(List<o0> list, p pVar) {
        if (list == null) {
            D(13);
            throw null;
        } else if (pVar != null) {
            T0(list, pVar, b().t());
            return this;
        } else {
            D(14);
            throw null;
        }
    }

    public g T0(List<o0> list, p pVar, List<m0> list2) {
        f0 f0Var = null;
        if (list == null) {
            D(10);
            throw null;
        } else if (pVar == null) {
            D(11);
            throw null;
        } else if (list2 != null) {
            m0.r.t.a.r.c.d R0 = b();
            if (R0.L()) {
                i b = R0.b();
                if (b instanceof m0.r.t.a.r.c.d) {
                    f0Var = ((m0.r.t.a.r.c.d) b).G0();
                }
            }
            K0((f0) null, f0Var, list2, list, (v) null, Modality.FINAL, pVar);
            return this;
        } else {
            D(12);
            throw null;
        }
    }

    public Collection<? extends r> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        D(19);
        throw null;
    }

    public CallableMemberDescriptor j0(i iVar, Modality modality, p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        c cVar = (c) super.j0(iVar, modality, pVar, kind, z);
        if (cVar != null) {
            return cVar;
        }
        D(25);
        throw null;
    }

    public void v0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            D(20);
            throw null;
        }
    }

    public boolean x() {
        return this.x2;
    }

    public m0.r.t.a.r.c.d y() {
        m0.r.t.a.r.c.d R0 = b();
        if (R0 != null) {
            return R0;
        }
        D(16);
        throw null;
    }

    public c c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return (c) super.c(typeSubstitutor);
        }
        D(18);
        throw null;
    }

    public c a() {
        c cVar = (c) super.a();
        if (cVar != null) {
            return cVar;
        }
        D(17);
        throw null;
    }
}
