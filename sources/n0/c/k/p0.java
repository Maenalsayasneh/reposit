package n0.c.k;

import i0.d.a.a.a;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.i.g;
import n0.c.i.h;

/* compiled from: CollectionDescriptors.kt */
public abstract class p0 implements SerialDescriptor {
    public final int a = 2;
    public final String b;
    public final SerialDescriptor c;
    public final SerialDescriptor d;

    public p0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, f fVar) {
        this.b = str;
        this.c = serialDescriptor;
        this.d = serialDescriptor2;
    }

    public String a() {
        return this.b;
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
        throw new IllegalArgumentException(a.n0(str, " is not a valid map index"));
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return !(i.a(this.b, p0Var.b) ^ true) && !(i.a(this.c, p0Var.c) ^ true) && !(i.a(this.d, p0Var.d) ^ true);
    }

    public g f() {
        return h.c.a;
    }

    public String g(int i) {
        return String.valueOf(i);
    }

    public SerialDescriptor h(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.c;
            }
            if (i2 == 1) {
                return this.d;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(a.y0(a.Q0("Illegal index ", i, ", "), this.b, " expects only non-negative indices").toString());
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public boolean isInline() {
        return false;
    }

    public String toString() {
        return this.b + '(' + this.c + ", " + this.d + ')';
    }
}
