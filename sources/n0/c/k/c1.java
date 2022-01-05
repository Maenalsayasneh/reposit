package n0.c.k;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.i;
import n0.c.i.g;

/* compiled from: NullableSerializer.kt */
public final class c1 implements SerialDescriptor, l {
    public final String a;
    public final Set<String> b;
    public final SerialDescriptor c;

    public c1(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "original");
        this.c = serialDescriptor;
        this.a = serialDescriptor.a() + "?";
        this.b = u0.a(serialDescriptor);
    }

    public String a() {
        return this.a;
    }

    public Set<String> b() {
        return this.b;
    }

    public boolean c() {
        return true;
    }

    public int d(String str) {
        i.e(str, "name");
        return this.c.d(str);
    }

    public int e() {
        return this.c.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && !(i.a(this.c, ((c1) obj).c) ^ true);
    }

    public g f() {
        return this.c.f();
    }

    public String g(int i) {
        return this.c.g(i);
    }

    public SerialDescriptor h(int i) {
        return this.c.h(i);
    }

    public int hashCode() {
        return this.c.hashCode() * 31;
    }

    public boolean isInline() {
        return this.c.isInline();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('?');
        return sb.toString();
    }
}
