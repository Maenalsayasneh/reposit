package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n0.c.f;
import n0.c.j.d;
import n0.c.m.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0013H&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\"H'¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\"H&¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020+2\u0006\u0010*\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J+\u00104\u001a\u00020\u0002\"\u0004\b\u0000\u001012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000022\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u00105R\u0016\u00109\u001a\u0002068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "Lm0/i;", "p", "()V", "f", "", "value", "k", "(Z)V", "", "j", "(B)V", "", "i", "(S)V", "", "o", "(C)V", "", "x", "(I)V", "", "C", "(J)V", "", "n", "(F)V", "", "h", "(D)V", "", "F", "(Ljava/lang/String;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "index", "u", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "inlineDescriptor", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "descriptor", "Ln0/c/j/d;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ln0/c/j/d;", "collectionSize", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ln0/c/j/d;", "T", "Ln0/c/f;", "serializer", "e", "(Ln0/c/f;Ljava/lang/Object;)V", "Ln0/c/m/b;", "a", "()Ln0/c/m/b;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {1, 4, 2})
/* compiled from: Encoding.kt */
public interface Encoder {
    void C(long j);

    void F(String str);

    b a();

    d c(SerialDescriptor serialDescriptor);

    <T> void e(f<? super T> fVar, T t);

    void f();

    void h(double d);

    void i(short s);

    void j(byte b);

    void k(boolean z);

    void n(float f);

    void o(char c);

    void p();

    d t(SerialDescriptor serialDescriptor, int i);

    void u(SerialDescriptor serialDescriptor, int i);

    void x(int i);

    Encoder y(SerialDescriptor serialDescriptor);
}
