package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;

/* compiled from: ClassDescriptorBase */
public abstract class h extends b {
    public final h0 Y1;
    public final boolean Z1;
    public final i y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(l lVar, i iVar, d dVar, h0 h0Var, boolean z) {
        super(lVar, dVar);
        if (lVar == null) {
            I(0);
            throw null;
        } else if (iVar == null) {
            I(1);
            throw null;
        } else if (dVar == null) {
            I(2);
            throw null;
        } else if (h0Var != null) {
            this.y = iVar;
            this.Y1 = h0Var;
            this.Z1 = z;
        } else {
            I(3);
            throw null;
        }
    }

    public static /* synthetic */ void I(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public i b() {
        i iVar = this.y;
        if (iVar != null) {
            return iVar;
        }
        I(4);
        throw null;
    }

    public boolean isExternal() {
        return this.Z1;
    }

    public h0 r() {
        h0 h0Var = this.Y1;
        if (h0Var != null) {
            return h0Var;
        }
        I(5);
        throw null;
    }
}
