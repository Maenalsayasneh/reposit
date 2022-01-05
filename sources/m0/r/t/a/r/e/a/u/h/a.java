package m0.r.t.a.r.e.a.u.h;

import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;

/* compiled from: JavaTypeResolver.kt */
public final class a {
    public final TypeUsage a;
    public final JavaTypeFlexibility b;
    public final boolean c;
    public final m0 d;

    public a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, m0 m0Var) {
        i.e(typeUsage, "howThisTypeIsUsed");
        i.e(javaTypeFlexibility, "flexibility");
        this.a = typeUsage;
        this.b = javaTypeFlexibility;
        this.c = z;
        this.d = m0Var;
    }

    public final a a(JavaTypeFlexibility javaTypeFlexibility) {
        i.e(javaTypeFlexibility, "flexibility");
        TypeUsage typeUsage = this.a;
        boolean z = this.c;
        m0 m0Var = this.d;
        i.e(typeUsage, "howThisTypeIsUsed");
        i.e(javaTypeFlexibility, "flexibility");
        return new a(typeUsage, javaTypeFlexibility, z, m0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && i.a(this.d, aVar.d);
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        m0 m0Var = this.d;
        return i + (m0Var == null ? 0 : m0Var.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("JavaTypeAttributes(howThisTypeIsUsed=");
        P0.append(this.a);
        P0.append(", flexibility=");
        P0.append(this.b);
        P0.append(", isForAnnotationParameter=");
        P0.append(this.c);
        P0.append(", upperBoundOfTypeParameter=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    public a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, m0 m0Var, int i) {
        JavaTypeFlexibility javaTypeFlexibility2 = (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : null;
        z = (i & 4) != 0 ? false : z;
        m0Var = (i & 8) != 0 ? null : m0Var;
        i.e(typeUsage, "howThisTypeIsUsed");
        i.e(javaTypeFlexibility2, "flexibility");
        this.a = typeUsage;
        this.b = javaTypeFlexibility2;
        this.c = z;
        this.d = m0Var;
    }
}
