package n0.c.j;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.m.a1.a;
import n0.c.f;

/* compiled from: AbstractEncoder.kt */
public abstract class b implements Encoder, d {
    public final void A(SerialDescriptor serialDescriptor, int i, short s) {
        i.e(serialDescriptor, "descriptor");
        if (G(serialDescriptor, i)) {
            i(s);
        }
    }

    public final void B(SerialDescriptor serialDescriptor, int i, double d) {
        i.e(serialDescriptor, "descriptor");
        if (G(serialDescriptor, i)) {
            h(d);
        }
    }

    public abstract void C(long j);

    public final void D(SerialDescriptor serialDescriptor, int i, long j) {
        i.e(serialDescriptor, "descriptor");
        if (G(serialDescriptor, i)) {
            C(j);
        }
    }

    public final void E(SerialDescriptor serialDescriptor, int i, char c) {
        i.e(serialDescriptor, "descriptor");
        if (G(serialDescriptor, i)) {
            o(c);
        }
    }

    public void F(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        I(str);
        throw null;
    }

    public boolean G(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return true;
    }

    public <T> void H(f<? super T> fVar, T t) {
        i.e(fVar, "serializer");
        a.l1(this, fVar, t);
    }

    public void I(Object obj) {
        i.e(obj, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        StringBuilder P0 = i0.d.a.a.a.P0("Non-serializable ");
        P0.append(m.a(obj.getClass()));
        P0.append(" is not supported by ");
        P0.append(m.a(getClass()));
        P0.append(" encoder");
        throw new SerializationException(P0.toString());
    }

    public void b(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
    }

    public d c(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        return this;
    }

    public <T> void e(f<? super T> fVar, T t) {
        i.e(fVar, "serializer");
        i.e(fVar, "serializer");
        fVar.serialize(this, t);
    }

    public void f() {
        throw new SerializationException("'null' is not supported by default");
    }

    public final void g(SerialDescriptor serialDescriptor, int i, byte b) {
        i.e(serialDescriptor, "descriptor");
        if (G(serialDescriptor, i)) {
            j(b);
        }
    }

    public void h(double d) {
        I(Double.valueOf(d));
        throw null;
    }

    public abstract void i(short s);

    public abstract void j(byte b);

    public void k(boolean z) {
        I(Boolean.valueOf(z));
        throw null;
    }

    public final <T> void l(SerialDescriptor serialDescriptor, int i, f<? super T> fVar, T t) {
        i.e(serialDescriptor, "descriptor");
        i.e(fVar, "serializer");
        if (G(serialDescriptor, i)) {
            H(fVar, t);
        }
    }

    public final void m(SerialDescriptor serialDescriptor, int i, float f) {
        i.e(serialDescriptor, "descriptor");
        if (G(serialDescriptor, i)) {
            n(f);
        }
    }

    public void n(float f) {
        I(Float.valueOf(f));
        throw null;
    }

    public void o(char c) {
        I(Character.valueOf(c));
        throw null;
    }

    public void p() {
    }

    public final void q(SerialDescriptor serialDescriptor, int i, int i2) {
        i.e(serialDescriptor, "descriptor");
        if (G(serialDescriptor, i)) {
            x(i2);
        }
    }

    public final void r(SerialDescriptor serialDescriptor, int i, boolean z) {
        i.e(serialDescriptor, "descriptor");
        if (G(serialDescriptor, i)) {
            k(z);
        }
    }

    public final void s(SerialDescriptor serialDescriptor, int i, String str) {
        i.e(serialDescriptor, "descriptor");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        if (G(serialDescriptor, i)) {
            F(str);
        }
    }

    public d t(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return a.a0(this, serialDescriptor);
    }

    public void u(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "enumDescriptor");
        I(Integer.valueOf(i));
        throw null;
    }

    public boolean v(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        i.e(serialDescriptor, "descriptor");
        return true;
    }

    public abstract void x(int i);

    public Encoder y(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "inlineDescriptor");
        return this;
    }

    public final <T> void z(SerialDescriptor serialDescriptor, int i, f<? super T> fVar, T t) {
        i.e(serialDescriptor, "descriptor");
        i.e(fVar, "serializer");
        if (G(serialDescriptor, i)) {
            e(fVar, t);
        }
    }
}
