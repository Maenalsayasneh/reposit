package n0.c.k;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.f;
import n0.c.j.d;
import n0.c.l.q.b;

/* compiled from: Tagged.kt */
public abstract class r0 implements Encoder, d {
    public final ArrayList<Tag> a = new ArrayList<>();

    public final void A(SerialDescriptor serialDescriptor, int i, short s) {
        i.e(serialDescriptor, "descriptor");
        String str = (String) L(serialDescriptor, i);
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.r(Short.valueOf(s)));
    }

    public final void B(SerialDescriptor serialDescriptor, int i, double d) {
        i.e(serialDescriptor, "descriptor");
        I(L(serialDescriptor, i), d);
    }

    public final void C(long j) {
        String str = (String) M();
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.r(Long.valueOf(j)));
    }

    public final void D(SerialDescriptor serialDescriptor, int i, long j) {
        i.e(serialDescriptor, "descriptor");
        String str = (String) L(serialDescriptor, i);
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.r(Long.valueOf(j)));
    }

    public final void E(SerialDescriptor serialDescriptor, int i, char c) {
        i.e(serialDescriptor, "descriptor");
        String str = (String) L(serialDescriptor, i);
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.s(String.valueOf(c)));
    }

    public final void F(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        String str2 = (String) M();
        i.e(str2, "tag");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        ((AbstractJsonTreeEncoder) this).O(str2, a.s(str));
    }

    public String G(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return serialDescriptor.g(i);
    }

    public abstract void H(Tag tag, boolean z);

    public abstract void I(Tag tag, double d);

    public abstract void J(Tag tag, float f);

    public final Object K() {
        return g.I(this.a);
    }

    public Object L(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "$this$getTag");
        String G = G(serialDescriptor, i);
        i.e(G, "nestedName");
        String str = (String) K();
        if (str == null) {
            str = "";
        }
        i.e(str, "parentName");
        i.e(G, "childName");
        return G;
    }

    public final Object M() {
        if (!this.a.isEmpty()) {
            ArrayList<Tag> arrayList = this.a;
            return arrayList.remove(g.y(arrayList));
        }
        throw new SerializationException("No tag in stack for requested element");
    }

    public final void b(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        if (!this.a.isEmpty()) {
            M();
        }
        AbstractJsonTreeEncoder abstractJsonTreeEncoder = (AbstractJsonTreeEncoder) this;
        i.e(serialDescriptor, "descriptor");
        abstractJsonTreeEncoder.e.invoke(abstractJsonTreeEncoder.N());
    }

    public abstract <T> void e(f<? super T> fVar, T t);

    public final void g(SerialDescriptor serialDescriptor, int i, byte b) {
        i.e(serialDescriptor, "descriptor");
        String str = (String) L(serialDescriptor, i);
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.r(Byte.valueOf(b)));
    }

    public final void h(double d) {
        I(M(), d);
    }

    public final void i(short s) {
        String str = (String) M();
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.r(Short.valueOf(s)));
    }

    public final void j(byte b) {
        String str = (String) M();
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.r(Byte.valueOf(b)));
    }

    public final void k(boolean z) {
        H(M(), z);
    }

    public final void l(SerialDescriptor serialDescriptor, int i, f fVar, Object obj) {
        i.e(serialDescriptor, "descriptor");
        i.e(fVar, "serializer");
        this.a.add(L(serialDescriptor, i));
        i.e(fVar, "serializer");
        a.l1(this, fVar, obj);
    }

    public final void m(SerialDescriptor serialDescriptor, int i, float f) {
        i.e(serialDescriptor, "descriptor");
        J(L(serialDescriptor, i), f);
    }

    public final void n(float f) {
        J(M(), f);
    }

    public final void o(char c) {
        String str = (String) M();
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.s(String.valueOf(c)));
    }

    public final void p() {
    }

    public final void q(SerialDescriptor serialDescriptor, int i, int i2) {
        i.e(serialDescriptor, "descriptor");
        String str = (String) L(serialDescriptor, i);
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.r(Integer.valueOf(i2)));
    }

    public final void r(SerialDescriptor serialDescriptor, int i, boolean z) {
        i.e(serialDescriptor, "descriptor");
        H(L(serialDescriptor, i), z);
    }

    public final void s(SerialDescriptor serialDescriptor, int i, String str) {
        i.e(serialDescriptor, "descriptor");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        String str2 = (String) L(serialDescriptor, i);
        i.e(str2, "tag");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        ((AbstractJsonTreeEncoder) this).O(str2, a.s(str));
    }

    public d t(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return a.a0(this, serialDescriptor);
    }

    public final void u(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "enumDescriptor");
        String str = (String) M();
        i.e(str, "tag");
        i.e(serialDescriptor, "enumDescriptor");
        ((AbstractJsonTreeEncoder) this).O(str, a.s(serialDescriptor.g(i)));
    }

    public final void x(int i) {
        String str = (String) M();
        i.e(str, "tag");
        ((AbstractJsonTreeEncoder) this).O(str, a.r(Integer.valueOf(i)));
    }

    public final Encoder y(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "inlineDescriptor");
        String str = (String) M();
        i.e(str, "tag");
        i.e(serialDescriptor, "inlineDescriptor");
        return new b((AbstractJsonTreeEncoder) this, str);
    }

    public final void z(SerialDescriptor serialDescriptor, int i, f fVar, Object obj) {
        i.e(serialDescriptor, "descriptor");
        i.e(fVar, "serializer");
        this.a.add(L(serialDescriptor, i));
        e(fVar, obj);
    }
}
