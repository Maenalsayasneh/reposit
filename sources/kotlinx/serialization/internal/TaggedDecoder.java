package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m0.j.g;
import m0.n.b.i;
import n0.c.b;
import n0.c.j.c;
import n0.c.l.q.a;
import n0.c.l.q.e;

/* compiled from: Tagged.kt */
public abstract class TaggedDecoder<Tag> implements Decoder, c {
    public final ArrayList<Tag> a = new ArrayList<>();
    public boolean b;

    public final double A(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return K(((a) this).V(serialDescriptor, i));
    }

    public abstract <T> T B(b<T> bVar);

    public final byte C() {
        return I(Q());
    }

    public final short D() {
        return O(Q());
    }

    public final float E() {
        return L(Q());
    }

    public final float F(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return L(((a) this).V(serialDescriptor, i));
    }

    public final double G() {
        return K(Q());
    }

    public abstract boolean H(Tag tag);

    public abstract byte I(Tag tag);

    public abstract char J(Tag tag);

    public abstract double K(Tag tag);

    public abstract float L(Tag tag);

    public abstract int M(Tag tag);

    public abstract long N(Tag tag);

    public abstract short O(Tag tag);

    public abstract String P(Tag tag);

    public final Tag Q() {
        ArrayList<Tag> arrayList = this.a;
        Tag remove = arrayList.remove(g.y(arrayList));
        this.b = true;
        return remove;
    }

    public final boolean e() {
        return H(Q());
    }

    public final char f() {
        return J(Q());
    }

    public final int g(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "enumDescriptor");
        String str = (String) Q();
        i.e(str, "tag");
        i.e(serialDescriptor, "enumDescriptor");
        return m0.r.t.a.r.m.a1.a.L1(serialDescriptor, ((a) this).X(str).b());
    }

    public final long h(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return N(((a) this).V(serialDescriptor, i));
    }

    public final int j() {
        return M(Q());
    }

    public final int k(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return M(((a) this).V(serialDescriptor, i));
    }

    public final Void l() {
        return null;
    }

    public final <T> T m(SerialDescriptor serialDescriptor, int i, b<T> bVar, T t) {
        i.e(serialDescriptor, "descriptor");
        i.e(bVar, "deserializer");
        String V = ((a) this).V(serialDescriptor, i);
        TaggedDecoder$decodeSerializableElement$1 taggedDecoder$decodeSerializableElement$1 = new TaggedDecoder$decodeSerializableElement$1(this, bVar, t);
        this.a.add(V);
        T invoke = taggedDecoder$decodeSerializableElement$1.invoke();
        if (!this.b) {
            Q();
        }
        this.b = false;
        return invoke;
    }

    public final String n() {
        return P(Q());
    }

    public int o(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        m0.r.t.a.r.m.a1.a.Z0(serialDescriptor);
        return -1;
    }

    public final char p(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return J(((a) this).V(serialDescriptor, i));
    }

    public final byte q(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return I(((a) this).V(serialDescriptor, i));
    }

    public final long r() {
        return N(Q());
    }

    public final boolean s(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return H(((a) this).V(serialDescriptor, i));
    }

    public final String t(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return P(((a) this).V(serialDescriptor, i));
    }

    public final <T> T v(SerialDescriptor serialDescriptor, int i, b<T> bVar, T t) {
        i.e(serialDescriptor, "descriptor");
        i.e(bVar, "deserializer");
        String V = ((a) this).V(serialDescriptor, i);
        TaggedDecoder$decodeNullableSerializableElement$1 taggedDecoder$decodeNullableSerializableElement$1 = new TaggedDecoder$decodeNullableSerializableElement$1(this, bVar, t);
        this.a.add(V);
        T invoke = taggedDecoder$decodeNullableSerializableElement$1.invoke();
        if (!this.b) {
            Q();
        }
        this.b = false;
        return invoke;
    }

    public final short w(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return O(((a) this).V(serialDescriptor, i));
    }

    public boolean y() {
        return false;
    }

    public final Decoder z(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "inlineDescriptor");
        a aVar = (a) this;
        String str = (String) Q();
        i.e(str, "tag");
        i.e(serialDescriptor, "inlineDescriptor");
        return new e(new n0.c.l.q.i(aVar.X(str).b()), aVar.d);
    }
}
