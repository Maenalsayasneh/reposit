package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n0.c.b;
import n0.c.j.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020!H'¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020!H&¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100R\u0016\u00104\u001a\u0002018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "", "u", "()Z", "", "l", "()Ljava/lang/Void;", "e", "", "C", "()B", "", "D", "()S", "", "f", "()C", "", "j", "()I", "", "r", "()J", "", "E", "()F", "", "G", "()D", "", "n", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "descriptor", "Ln0/c/j/c;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ln0/c/j/c;", "T", "Ln0/c/b;", "deserializer", "B", "(Ln0/c/b;)Ljava/lang/Object;", "Ln0/c/m/b;", "a", "()Ln0/c/m/b;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {1, 4, 2})
/* compiled from: Decoding.kt */
public interface Decoder {
    <T> T B(b<T> bVar);

    byte C();

    short D();

    float E();

    double G();

    n0.c.m.b a();

    c c(SerialDescriptor serialDescriptor);

    boolean e();

    char f();

    int g(SerialDescriptor serialDescriptor);

    int j();

    Void l();

    String n();

    long r();

    boolean u();

    Decoder z(SerialDescriptor serialDescriptor);
}
