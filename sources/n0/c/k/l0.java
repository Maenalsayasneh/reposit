package n0.c.k;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: CollectionSerializers.kt */
public abstract class l0<Element, Collection, Builder> extends a<Element, Collection, Builder> {
    public final KSerializer<Element> a;

    public l0(KSerializer kSerializer, f fVar) {
        super((f) null);
        this.a = kSerializer;
    }

    public final void g(c cVar, Builder builder, int i, int i2) {
        i.e(cVar, "decoder");
        if (i2 >= 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                h(cVar, i + i3, builder, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    public abstract SerialDescriptor getDescriptor();

    public void h(c cVar, int i, Builder builder, boolean z) {
        i.e(cVar, "decoder");
        k(builder, i, a.c1(cVar, getDescriptor(), i, this.a, (Object) null, 8, (Object) null));
    }

    public abstract void k(Builder builder, int i, Element element);

    public void serialize(Encoder encoder, Collection collection) {
        i.e(encoder, "encoder");
        int e = e(collection);
        d t = encoder.t(getDescriptor(), e);
        Iterator d = d(collection);
        for (int i = 0; i < e; i++) {
            t.z(getDescriptor(), i, this.a, d.next());
        }
        t.b(getDescriptor());
    }
}
