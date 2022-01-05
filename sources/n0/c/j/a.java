package n0.c.j;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.b;

/* compiled from: AbstractDecoder.kt */
public abstract class a implements Decoder, c {
    public final double A(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return G();
    }

    public <T> T B(b<T> bVar) {
        i.e(bVar, "deserializer");
        i.e(bVar, "deserializer");
        return bVar.deserialize(this);
    }

    public abstract byte C();

    public abstract short D();

    public float E() {
        H();
        throw null;
    }

    public final float F(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return E();
    }

    public double G() {
        H();
        throw null;
    }

    public Object H() {
        throw new SerializationException(m.a(getClass()) + " can't retrieve untyped values");
    }

    public void b(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
    }

    public c c(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        return this;
    }

    public boolean e() {
        H();
        throw null;
    }

    public char f() {
        H();
        throw null;
    }

    public int g(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "enumDescriptor");
        H();
        throw null;
    }

    public final long h(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return r();
    }

    public abstract int j();

    public final int k(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return j();
    }

    public Void l() {
        return null;
    }

    public final <T> T m(SerialDescriptor serialDescriptor, int i, b<T> bVar, T t) {
        i.e(serialDescriptor, "descriptor");
        i.e(bVar, "deserializer");
        i.e(bVar, "deserializer");
        return B(bVar);
    }

    public String n() {
        H();
        throw null;
    }

    public int o(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        m0.r.t.a.r.m.a1.a.Z0(serialDescriptor);
        return -1;
    }

    public final char p(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return f();
    }

    public final byte q(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return C();
    }

    public abstract long r();

    public final boolean s(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return e();
    }

    public final String t(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return n();
    }

    public boolean u() {
        return true;
    }

    public final <T> T v(SerialDescriptor serialDescriptor, int i, b<T> bVar, T t) {
        i.e(serialDescriptor, "descriptor");
        i.e(bVar, "deserializer");
        if (!bVar.getDescriptor().c() && !u()) {
            return l();
        }
        i.e(bVar, "deserializer");
        return B(bVar);
    }

    public final short w(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return D();
    }

    public boolean y() {
        return false;
    }

    public Decoder z(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "inlineDescriptor");
        return this;
    }
}
