package n0.c.k;

import i0.d.a.a.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.i;
import n0.c.i.d;
import n0.c.i.g;

/* compiled from: Primitives.kt */
public final class z0 implements SerialDescriptor {
    public final String a;
    public final d b;

    public z0(String str, d dVar) {
        i.e(str, "serialName");
        i.e(dVar, "kind");
        this.a = str;
        this.b = dVar;
    }

    public String a() {
        return this.a;
    }

    public final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public boolean c() {
        return false;
    }

    public int d(String str) {
        i.e(str, "name");
        b();
        throw null;
    }

    public int e() {
        return 0;
    }

    public g f() {
        return this.b;
    }

    public String g(int i) {
        b();
        throw null;
    }

    public SerialDescriptor h(int i) {
        b();
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    public String toString() {
        return a.x0(a.P0("PrimitiveDescriptor("), this.a, ')');
    }
}
