package i0.h.a.b.c.g.j;

import android.os.Looper;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.a.d;
import i0.h.a.b.c.g.b;
import i0.h.a.b.c.g.h;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class x<O extends a.d> extends o {
    @NotOnlyInitialized
    public final b<O> b;

    public x(b<O> bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.b = bVar;
    }

    public final <A extends a.b, R extends h, T extends d<R, A>> T a(T t) {
        this.b.b(0, t);
        return t;
    }

    public final <A extends a.b, T extends d<? extends h, A>> T b(T t) {
        this.b.b(1, t);
        return t;
    }

    public final Looper c() {
        return this.b.f;
    }
}
