package m0.r.t.a.r.c.t0;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.r0.b;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;

/* compiled from: DeclarationDescriptorImpl */
public abstract class k extends b implements i {
    public final d d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(f fVar, d dVar) {
        super(fVar);
        if (fVar == null) {
            D(0);
            throw null;
        } else if (dVar != null) {
            this.d = dVar;
        } else {
            D(1);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static String E(i iVar) {
        try {
            String str = DescriptorRenderer.b.q(iVar) + "[" + iVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(iVar)) + "]";
            if (str != null) {
                return str;
            }
            D(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = iVar.getClass().getSimpleName() + " " + iVar.getName();
            if (str2 != null) {
                return str2;
            }
            D(6);
            throw null;
        }
    }

    public i a() {
        return this;
    }

    public d getName() {
        d dVar = this.d;
        if (dVar != null) {
            return dVar;
        }
        D(2);
        throw null;
    }

    public String toString() {
        return E(this);
    }
}
