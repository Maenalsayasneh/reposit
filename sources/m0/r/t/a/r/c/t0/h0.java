package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;

/* compiled from: VariableDescriptorImpl */
public abstract class h0 extends l implements p0 {
    public v y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(i iVar, f fVar, d dVar, v vVar, m0.r.t.a.r.c.h0 h0Var) {
        super(iVar, fVar, dVar, h0Var);
        if (iVar == null) {
            D(0);
            throw null;
        } else if (fVar == null) {
            D(1);
            throw null;
        } else if (dVar == null) {
            D(2);
            throw null;
        } else if (h0Var != null) {
            this.y = vVar;
        } else {
            D(3);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: B0 */
    public p0 a() {
        return this;
    }

    public boolean C() {
        return false;
    }

    public Collection<? extends a> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        D(7);
        throw null;
    }

    public f0 e0() {
        return null;
    }

    public v getReturnType() {
        v type = getType();
        if (type != null) {
            return type;
        }
        D(9);
        throw null;
    }

    public v getType() {
        v vVar = this.y;
        if (vVar != null) {
            return vVar;
        }
        D(4);
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

    public List<o0> h() {
        List<o0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D(6);
        throw null;
    }

    public f0 l0() {
        return null;
    }
}
