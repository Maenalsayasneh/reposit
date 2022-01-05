package i0.k.b.a.a.a;

import m0.n.b.i;
import n0.c.f;
import q0.d0;
import q0.y;
import t0.h;

/* compiled from: SerializationStrategyConverter.kt */
public final class c<T> implements h<T, d0> {
    public final y a;
    public final f<T> b;
    public final d c;

    public c(y yVar, f<? super T> fVar, d dVar) {
        i.e(yVar, "contentType");
        i.e(fVar, "saver");
        i.e(dVar, "serializer");
        this.a = yVar;
        this.b = fVar;
        this.c = dVar;
    }

    public Object a(Object obj) {
        return this.c.c(this.a, this.b, obj);
    }
}
