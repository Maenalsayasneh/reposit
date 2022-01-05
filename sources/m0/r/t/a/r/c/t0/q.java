package m0.r.t.a.r.c.t0;

import i0.d.a.a.a;
import java.util.Objects;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.j.u.i.c;

/* compiled from: LazyClassReceiverParameterDescriptor */
public class q extends d {
    public final d x;
    public final c y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(d dVar) {
        super(f.a.b);
        if (dVar != null) {
            Objects.requireNonNull(f.i);
            this.x = dVar;
            this.y = new c(dVar, (c) null);
            return;
        }
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public i b() {
        d dVar = this.x;
        if (dVar != null) {
            return dVar;
        }
        D(2);
        throw null;
    }

    public m0.r.t.a.r.j.u.i.d getValue() {
        c cVar = this.y;
        if (cVar != null) {
            return cVar;
        }
        D(1);
        throw null;
    }

    public String toString() {
        StringBuilder P0 = a.P0("class ");
        P0.append(this.x.getName());
        P0.append("::this");
        return P0.toString();
    }
}
