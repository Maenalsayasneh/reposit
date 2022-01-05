package m0.r.t.a.r.c.t0;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.j.u.i.g;
import m0.r.t.a.r.m.v;

/* compiled from: AbstractReceiverParameterDescriptor */
public abstract class d extends k implements f0 {
    public static final m0.r.t.a.r.g.d q = m0.r.t.a.r.g.d.j("<this>");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(fVar, q);
        if (fVar != null) {
        } else {
            D(0);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public boolean C() {
        return false;
    }

    public <R, D> R J(k<R, D> kVar, D d) {
        return kVar.l(this, d);
    }

    public a a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public i m55a() {
        return this;
    }

    public Collection<? extends a> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        D(5);
        throw null;
    }

    public f0 e0() {
        return null;
    }

    public v getReturnType() {
        return getType();
    }

    public v getType() {
        v type = getValue().getType();
        if (type != null) {
            return type;
        }
        D(3);
        throw null;
    }

    public List<m0> getTypeParameters() {
        List<m0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D(2);
        throw null;
    }

    public p getVisibility() {
        p pVar = o.f;
        if (pVar != null) {
            return pVar;
        }
        D(6);
        throw null;
    }

    public List<o0> h() {
        List<o0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D(4);
        throw null;
    }

    public f0 l0() {
        return null;
    }

    public h0 r() {
        return h0.a;
    }

    public f0 c(TypeSubstitutor typeSubstitutor) {
        v vVar;
        if (typeSubstitutor == null) {
            D(1);
            throw null;
        } else if (typeSubstitutor.h()) {
            return this;
        } else {
            if (b() instanceof m0.r.t.a.r.c.d) {
                vVar = typeSubstitutor.k(getType(), Variance.OUT_VARIANCE);
            } else {
                vVar = typeSubstitutor.k(getType(), Variance.INVARIANT);
            }
            if (vVar == null) {
                return null;
            }
            if (vVar == getType()) {
                return this;
            }
            return new c0(b(), new g(vVar), getAnnotations());
        }
    }
}
