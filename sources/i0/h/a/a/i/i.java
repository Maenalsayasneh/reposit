package i0.h.a.a.i;

import i0.h.a.a.b;
import i0.h.a.a.d;
import i0.h.a.a.e;
import i0.h.a.a.f;
import java.util.Set;

/* compiled from: TransportFactoryImpl */
public final class i implements f {
    public final Set<b> a;
    public final h b;
    public final l c;

    public i(Set<b> set, h hVar, l lVar) {
        this.a = set;
        this.b = hVar;
        this.c = lVar;
    }

    public <T> e<T> a(String str, Class<T> cls, b bVar, d<T, byte[]> dVar) {
        if (this.a.contains(bVar)) {
            return new k(this.b, str, bVar, dVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.a}));
    }
}
