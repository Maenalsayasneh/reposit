package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.l.i;
import m0.r.t.a.r.m.v;

/* compiled from: VariableDescriptorWithInitializerImpl */
public abstract class i0 extends h0 {
    public final boolean Y1;
    public i<g<?>> Z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(m0.r.t.a.r.c.i iVar, f fVar, d dVar, v vVar, boolean z, h0 h0Var) {
        super(iVar, fVar, dVar, (v) null, h0Var);
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
            this.Y1 = z;
        } else {
            D(3);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        } else if (i != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void H0(i<g<?>> iVar) {
        if (iVar != null) {
            this.Z1 = iVar;
        } else {
            D(4);
            throw null;
        }
    }

    public g<?> V() {
        i<g<?>> iVar = this.Z1;
        if (iVar != null) {
            return (g) iVar.invoke();
        }
        return null;
    }

    public boolean i0() {
        return this.Y1;
    }
}
