package m0.r.t.a.r.e.a.x;

import i0.d.a.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.e.a.k;
import m0.r.t.a.r.m.v;

/* compiled from: signatureEnhancement.kt */
public final class j {
    public final v a;
    public final k b;
    public final m0 c;
    public final boolean d;

    public j(v vVar, k kVar, m0 m0Var, boolean z) {
        i.e(vVar, "type");
        this.a = vVar;
        this.b = kVar;
        this.c = m0Var;
        this.d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.a, jVar.a) && i.a(this.b, jVar.b) && i.a(this.c, jVar.c) && this.d == jVar.d;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k kVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        m0 m0Var = this.c;
        if (m0Var != null) {
            i = m0Var.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("TypeAndDefaultQualifiers(type=");
        P0.append(this.a);
        P0.append(", defaultQualifiers=");
        P0.append(this.b);
        P0.append(", typeParameterForArgument=");
        P0.append(this.c);
        P0.append(", isFromStarProjection=");
        return a.C0(P0, this.d, ')');
    }
}
