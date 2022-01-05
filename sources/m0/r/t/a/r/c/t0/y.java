package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.b0;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;

/* compiled from: PropertyAccessorDescriptorImpl */
public abstract class y extends l implements b0 {
    public final boolean Y1;
    public final Modality Z1;
    public final c0 a2;
    public final boolean b2;
    public final CallableMemberDescriptor.Kind c2;
    public p d2;
    public r e2;
    public boolean y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(Modality modality, p pVar, c0 c0Var, f fVar, d dVar, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, h0 h0Var) {
        super(c0Var.b(), fVar, dVar, h0Var);
        if (modality == null) {
            D(0);
            throw null;
        } else if (pVar == null) {
            D(1);
            throw null;
        } else if (fVar == null) {
            D(3);
            throw null;
        } else if (h0Var != null) {
            this.e2 = null;
            this.Z1 = modality;
            this.d2 = pVar;
            this.a2 = c0Var;
            this.y = z;
            this.Y1 = z2;
            this.b2 = z3;
            this.c2 = kind;
        } else {
            D(5);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public boolean A0() {
        return false;
    }

    /* renamed from: B0 */
    public abstract b0 a();

    public boolean C() {
        return false;
    }

    public Collection<b0> H0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (c0 c0Var : x0().e()) {
            Object getter = z ? c0Var.getGetter() : c0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    public boolean K() {
        return false;
    }

    public boolean O() {
        return false;
    }

    public boolean T() {
        return this.y;
    }

    public r c0() {
        return this.e2;
    }

    public f0 e0() {
        return x0().e0();
    }

    public CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kind = this.c2;
        if (kind != null) {
            return kind;
        }
        D(6);
        throw null;
    }

    public List<m0> getTypeParameters() {
        List<m0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D(8);
        throw null;
    }

    public p getVisibility() {
        p pVar = this.d2;
        if (pVar != null) {
            return pVar;
        }
        D(10);
        throw null;
    }

    public <V> V h0(a.C0250a<V> aVar) {
        return null;
    }

    public boolean isExternal() {
        return this.Y1;
    }

    public boolean isInfix() {
        return false;
    }

    public boolean isInline() {
        return this.b2;
    }

    public boolean isOperator() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    public Modality j() {
        Modality modality = this.Z1;
        if (modality != null) {
            return modality;
        }
        D(9);
        throw null;
    }

    public CallableMemberDescriptor j0(i iVar, Modality modality, p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public f0 l0() {
        return x0().l0();
    }

    public boolean u0() {
        return false;
    }

    public void v0(Collection<? extends CallableMemberDescriptor> collection) {
    }

    public c0 x0() {
        c0 c0Var = this.a2;
        if (c0Var != null) {
            return c0Var;
        }
        D(12);
        throw null;
    }

    public boolean y0() {
        return false;
    }

    public r c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            D(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }
}
