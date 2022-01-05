package m0.r.t.a.r.e.a.x;

import i0.d.a.a.a;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import m0.n.b.i;

/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
public final class g {
    public final NullabilityQualifier a;
    public final boolean b;

    public g(NullabilityQualifier nullabilityQualifier, boolean z) {
        i.e(nullabilityQualifier, "qualifier");
        this.a = nullabilityQualifier;
        this.b = z;
    }

    public static g a(g gVar, NullabilityQualifier nullabilityQualifier, boolean z, int i) {
        NullabilityQualifier nullabilityQualifier2 = (i & 1) != 0 ? gVar.a : null;
        if ((i & 2) != 0) {
            z = gVar.b;
        }
        Objects.requireNonNull(gVar);
        i.e(nullabilityQualifier2, "qualifier");
        return new g(nullabilityQualifier2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("NullabilityQualifierWithMigrationStatus(qualifier=");
        P0.append(this.a);
        P0.append(", isForWarningOnly=");
        return a.C0(P0, this.b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(NullabilityQualifier nullabilityQualifier, boolean z, int i) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z);
    }
}
