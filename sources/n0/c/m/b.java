package n0.c.m;

import kotlinx.serialization.KSerializer;
import m0.r.d;
import n0.c.f;

/* compiled from: SerializersModule.kt */
public abstract class b {
    public b() {
    }

    public abstract void a(c cVar);

    public abstract <T> KSerializer<T> b(d<T> dVar);

    public abstract <T> n0.c.b<? extends T> c(d<? super T> dVar, String str);

    public abstract <T> f<T> d(d<? super T> dVar, T t);

    public b(m0.n.b.f fVar) {
    }
}
