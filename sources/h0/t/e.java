package h0.t;

import i0.d.a.a.a;

/* compiled from: NavArgument */
public final class e {
    public final r a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public e(r<?> rVar, boolean z, Object obj, boolean z2) {
        if (!rVar.l && z) {
            throw new IllegalArgumentException(rVar.b() + " does not allow nullable values");
        } else if (z || !z2 || obj != null) {
            this.a = rVar;
            this.b = z;
            this.d = obj;
            this.c = z2;
        } else {
            StringBuilder P0 = a.P0("Argument with type ");
            P0.append(rVar.b());
            P0.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.b != eVar.b || this.c != eVar.c || !this.a.equals(eVar.a)) {
            return false;
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            return obj2.equals(eVar.d);
        }
        if (eVar.d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
