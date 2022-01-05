package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.i;
import m0.r.d;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.c;
import n0.c.k.b;

/* compiled from: PolymorphicSerializer.kt */
public final class PolymorphicSerializer<T> extends b<T> {
    public final SerialDescriptor a;
    public final d<T> b;

    public PolymorphicSerializer(d<T> dVar) {
        i.e(dVar, "baseClass");
        this.b = dVar;
        SerialDescriptor f0 = a.f0("kotlinx.serialization.Polymorphic", c.a.a, new SerialDescriptor[0], new PolymorphicSerializer$descriptor$1(this));
        i.e(f0, "$this$withContext");
        i.e(dVar, "context");
        this.a = new n0.c.i.b(f0, dVar);
    }

    public d<T> a() {
        return this.b;
    }

    public SerialDescriptor getDescriptor() {
        return this.a;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
