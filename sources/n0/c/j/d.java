package n0.c.j;

import kotlinx.serialization.descriptors.SerialDescriptor;
import n0.c.f;

/* compiled from: Encoding.kt */
public interface d {
    void A(SerialDescriptor serialDescriptor, int i, short s);

    void B(SerialDescriptor serialDescriptor, int i, double d);

    void D(SerialDescriptor serialDescriptor, int i, long j);

    void E(SerialDescriptor serialDescriptor, int i, char c);

    void b(SerialDescriptor serialDescriptor);

    void g(SerialDescriptor serialDescriptor, int i, byte b);

    <T> void l(SerialDescriptor serialDescriptor, int i, f<? super T> fVar, T t);

    void m(SerialDescriptor serialDescriptor, int i, float f);

    void q(SerialDescriptor serialDescriptor, int i, int i2);

    void r(SerialDescriptor serialDescriptor, int i, boolean z);

    void s(SerialDescriptor serialDescriptor, int i, String str);

    boolean v(SerialDescriptor serialDescriptor, int i);

    <T> void z(SerialDescriptor serialDescriptor, int i, f<? super T> fVar, T t);
}
