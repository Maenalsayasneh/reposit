package m0.r.t.a.r.m;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.r.t.a.r.m.x0.e;

/* compiled from: TypeProjectionImpl */
public class o0 extends n0 {
    public final Variance a;
    public final v b;

    public o0(Variance variance, v vVar) {
        if (variance == null) {
            d(0);
            throw null;
        } else if (vVar != null) {
            this.a = variance;
            this.b = vVar;
        } else {
            d(1);
            throw null;
        }
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (!(i == 4 || i == 5)) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public m0 a(e eVar) {
        return new o0(this.a, eVar.g(this.b));
    }

    public Variance b() {
        Variance variance = this.a;
        if (variance != null) {
            return variance;
        }
        d(4);
        throw null;
    }

    public boolean c() {
        return false;
    }

    public v getType() {
        v vVar = this.b;
        if (vVar != null) {
            return vVar;
        }
        d(5);
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o0(v vVar) {
        this(Variance.INVARIANT, vVar);
        if (vVar != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
