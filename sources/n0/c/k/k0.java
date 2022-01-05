package n0.c.k;

import i0.d.a.a.a;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.i.g;
import n0.c.i.h;

/* compiled from: CollectionDescriptors.kt */
public abstract class k0 implements SerialDescriptor {
    public final int a = 1;
    public final SerialDescriptor b;

    public k0(SerialDescriptor serialDescriptor, f fVar) {
        this.b = serialDescriptor;
    }

    public boolean c() {
        return false;
    }

    public int d(String str) {
        i.e(str, "name");
        Integer S = StringsKt__IndentKt.S(str);
        if (S != null) {
            return S.intValue();
        }
        throw new IllegalArgumentException(a.n0(str, " is not a valid list index"));
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return i.a(this.b, k0Var.b) && i.a(a(), k0Var.a());
    }

    public g f() {
        return h.b.a;
    }

    public String g(int i) {
        return String.valueOf(i);
    }

    public SerialDescriptor h(int i) {
        if (i >= 0) {
            return this.b;
        }
        StringBuilder Q0 = a.Q0("Illegal index ", i, ", ");
        Q0.append(a());
        Q0.append(" expects only non-negative indices");
        throw new IllegalArgumentException(Q0.toString().toString());
    }

    public int hashCode() {
        return a().hashCode() + (this.b.hashCode() * 31);
    }

    public boolean isInline() {
        return false;
    }

    public String toString() {
        return a() + '(' + this.b + ')';
    }
}
