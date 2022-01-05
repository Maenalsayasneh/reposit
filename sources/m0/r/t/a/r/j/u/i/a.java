package m0.r.t.a.r.j.u.i;

import m0.r.t.a.r.m.v;

/* compiled from: AbstractReceiverValue */
public abstract class a implements d {
    public final v a;
    public final d b;

    public a(v vVar, d dVar) {
        if (vVar != null) {
            this.a = vVar;
            this.b = dVar == null ? this : dVar;
            return;
        }
        b(0);
        throw null;
    }

    public static /* synthetic */ void b(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public v getType() {
        v vVar = this.a;
        if (vVar != null) {
            return vVar;
        }
        b(1);
        throw null;
    }
}
