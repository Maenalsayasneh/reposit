package n0.c.i;

import i0.d.a.a.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.i;
import m0.r.d;

/* compiled from: ContextAware.kt */
public final class b implements SerialDescriptor {
    public final String a;
    public final SerialDescriptor b;
    public final d<?> c;

    public b(SerialDescriptor serialDescriptor, d<?> dVar) {
        i.e(serialDescriptor, "original");
        i.e(dVar, "kClass");
        this.b = serialDescriptor;
        this.c = dVar;
        this.a = serialDescriptor.a() + '<' + dVar.e() + '>';
    }

    public String a() {
        return this.a;
    }

    public boolean c() {
        return this.b.c();
    }

    public int d(String str) {
        i.e(str, "name");
        return this.b.d(str);
    }

    public int e() {
        return this.b.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null || !i.a(this.b, bVar.b) || !i.a(bVar.c, this.c)) {
            return false;
        }
        return true;
    }

    public g f() {
        return this.b.f();
    }

    public String g(int i) {
        return this.b.g(i);
    }

    public SerialDescriptor h(int i) {
        return this.b.h(i);
    }

    public int hashCode() {
        return this.a.hashCode() + (this.c.hashCode() * 31);
    }

    public boolean isInline() {
        return this.b.isInline();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ContextDescriptor(kClass: ");
        P0.append(this.c);
        P0.append(", original: ");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
