package m0.r.t.a.r.j;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.h;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.g;

/* compiled from: DescriptorFactory */
public class c extends g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, h0 h0Var, boolean z) {
        super(dVar, (h) null, f.a.b, true, CallableMemberDescriptor.Kind.DECLARATION, h0Var);
        p pVar;
        if (dVar == null) {
            D(0);
            throw null;
        } else if (h0Var != null) {
            Objects.requireNonNull(f.i);
            List emptyList = Collections.emptyList();
            int i = d.a;
            ClassKind f = dVar.f();
            if (f == ClassKind.ENUM_CLASS || f.isSingleton()) {
                pVar = o.a;
                if (pVar == null) {
                    d.a(47);
                    throw null;
                }
            } else if (d.v(dVar)) {
                if (z) {
                    pVar = o.d;
                    if (pVar == null) {
                        d.a(48);
                        throw null;
                    }
                } else {
                    pVar = o.a;
                    if (pVar == null) {
                        d.a(49);
                        throw null;
                    }
                }
            } else if (d.n(dVar)) {
                pVar = o.k;
                if (pVar == null) {
                    d.a(50);
                    throw null;
                }
            } else {
                pVar = o.e;
                if (pVar == null) {
                    d.a(51);
                    throw null;
                }
            }
            S0(emptyList, pVar);
        } else {
            D(1);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "containingClass";
        } else {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
