package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.j;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;

/* compiled from: DeclarationDescriptorNonRootImpl */
public abstract class l extends k implements j {
    public final i q;
    public final h0 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(i iVar, f fVar, d dVar, h0 h0Var) {
        super(fVar, dVar);
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
            this.q = iVar;
            this.x = h0Var;
        } else {
            D(3);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: I */
    public m0.r.t.a.r.c.l a() {
        return this;
    }

    public i b() {
        i iVar = this.q;
        if (iVar != null) {
            return iVar;
        }
        D(5);
        throw null;
    }

    public h0 r() {
        h0 h0Var = this.x;
        if (h0Var != null) {
            return h0Var;
        }
        D(6);
        throw null;
    }
}
