package m0.r.t.a.r.e.a;

import i0.d.a.a.a;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import m0.n.b.i;
import m0.r.t.a.r.e.a.x.g;

/* compiled from: AnnotationQualifiersFqNames.kt */
public final class k {
    public final g a;
    public final Collection<AnnotationQualifierApplicabilityType> b;
    public final boolean c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(g gVar, Collection collection, boolean z, int i) {
        this(gVar, collection, (i & 4) != 0 ? gVar.a == NullabilityQualifier.NOT_NULL : z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.a, kVar.a) && i.a(this.b, kVar.b) && this.c == kVar.c;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("JavaDefaultQualifiers(nullabilityQualifier=");
        P0.append(this.a);
        P0.append(", qualifierApplicabilityTypes=");
        P0.append(this.b);
        P0.append(", affectsTypeParameterBasedTypes=");
        return a.C0(P0, this.c, ')');
    }

    public k(g gVar, Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z) {
        i.e(gVar, "nullabilityQualifier");
        i.e(collection, "qualifierApplicabilityTypes");
        this.a = gVar;
        this.b = collection;
        this.c = z;
    }
}
