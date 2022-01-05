package n0.c.k;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.j.c;

/* compiled from: CollectionSerializers.kt */
public abstract class a<Element, Collection, Builder> implements KSerializer<Collection> {
    public a() {
    }

    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract void c(Builder builder, int i);

    public abstract Iterator<Element> d(Collection collection);

    public Collection deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return f(decoder, (Object) null);
    }

    public abstract int e(Collection collection);

    public final Collection f(Decoder decoder, Collection collection) {
        i.e(decoder, "decoder");
        Object a = a();
        int b = b(a);
        c c = decoder.c(getDescriptor());
        if (c.y()) {
            int o = c.o(getDescriptor());
            c(a, o);
            g(c, a, b, o);
        } else {
            while (true) {
                int x = c.x(getDescriptor());
                if (x == -1) {
                    break;
                }
                h(c, x + b, a, true);
            }
        }
        c.b(getDescriptor());
        return j(a);
    }

    public abstract void g(c cVar, Builder builder, int i, int i2);

    public abstract void h(c cVar, int i, Builder builder, boolean z);

    public abstract Builder i(Collection collection);

    public abstract Collection j(Builder builder);

    public a(f fVar) {
    }
}
