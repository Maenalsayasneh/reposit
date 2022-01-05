package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;

/* compiled from: AbstractLazyTypeParameterDescriptor */
public abstract class c extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(l lVar, i iVar, d dVar, Variance variance, boolean z, int i, h0 h0Var, k0 k0Var) {
        super(lVar, iVar, f.a.b, dVar, variance, z, i, h0Var, k0Var);
        if (lVar == null) {
            D(0);
            throw null;
        } else if (iVar == null) {
            D(1);
            throw null;
        } else if (dVar == null) {
            D(2);
            throw null;
        } else if (variance == null) {
            D(3);
            throw null;
        } else if (k0Var != null) {
            Objects.requireNonNull(f.i);
        } else {
            D(5);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "variance";
        } else if (i == 4) {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        } else if (i != 5) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "supertypeLoopChecker";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = this.Y1 ? "reified " : str;
        if (l() != Variance.INVARIANT) {
            str = l() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
