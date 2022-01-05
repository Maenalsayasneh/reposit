package m0.r;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: KTypeProjection.kt */
public final class p {
    public static final p a = new p((KVariance) null, (n) null);
    public static final a b = new a((f) null);
    public final KVariance c;
    public final n d;

    /* compiled from: KTypeProjection.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final p a(n nVar) {
            i.e(nVar, "type");
            return new p(KVariance.INVARIANT, nVar);
        }
    }

    public p(KVariance kVariance, n nVar) {
        String str;
        this.c = kVariance;
        this.d = nVar;
        if (!((kVariance == null) != (nVar == null) ? false : true)) {
            if (kVariance == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVariance + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return i.a(this.c, pVar.c) && i.a(this.d, pVar.d);
    }

    public int hashCode() {
        KVariance kVariance = this.c;
        int i = 0;
        int hashCode = (kVariance != null ? kVariance.hashCode() : 0) * 31;
        n nVar = this.d;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        KVariance kVariance = this.c;
        if (kVariance == null) {
            return "*";
        }
        int ordinal = kVariance.ordinal();
        if (ordinal == 0) {
            return String.valueOf(this.d);
        }
        if (ordinal == 1) {
            StringBuilder P0 = i0.d.a.a.a.P0("in ");
            P0.append(this.d);
            return P0.toString();
        } else if (ordinal == 2) {
            StringBuilder P02 = i0.d.a.a.a.P0("out ");
            P02.append(this.d);
            return P02.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
