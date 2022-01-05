package i0.k.b.a.a.a;

import m0.n.b.f;
import m0.n.b.i;
import n0.c.b;
import n0.c.h;
import q0.d0;
import q0.f0;
import q0.y;

/* compiled from: Serializer.kt */
public abstract class d {

    /* compiled from: Serializer.kt */
    public static final class a extends d {
        public final h a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super((f) null);
            i.e(hVar, "format");
            this.a = hVar;
        }

        public <T> T a(b<T> bVar, f0 f0Var) {
            i.e(bVar, "loader");
            i.e(f0Var, "body");
            String string = f0Var.string();
            i.d(string, "body.string()");
            return this.a.b(bVar, string);
        }

        public n0.c.d b() {
            return this.a;
        }

        public <T> d0 c(y yVar, n0.c.f<? super T> fVar, T t) {
            i.e(yVar, "contentType");
            i.e(fVar, "saver");
            String c = this.a.c(fVar, t);
            d0.a aVar = d0.a;
            i.e(c, "content");
            d0 a2 = aVar.a(c, yVar);
            i.d(a2, "RequestBody.create(contentType, string)");
            return a2;
        }
    }

    public d(f fVar) {
    }

    public abstract <T> T a(b<T> bVar, f0 f0Var);

    public abstract n0.c.d b();

    public abstract <T> d0 c(y yVar, n0.c.f<? super T> fVar, T t);
}
