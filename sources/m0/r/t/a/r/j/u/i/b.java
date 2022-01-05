package m0.r.t.a.r.j.u.i;

import m0.r.t.a.r.c.a;
import m0.r.t.a.r.m.v;

/* compiled from: ExtensionReceiver */
public class b extends a implements d {
    public final a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, v vVar, d dVar) {
        super(vVar, dVar);
        if (aVar != null) {
            this.c = aVar;
            return;
        }
        b(0);
        throw null;
    }

    public static /* synthetic */ void b(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
