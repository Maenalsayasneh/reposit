package s0.a.f.b.h;

import s0.a.e.b.b0.c.h3;
import s0.a.f.b.h.l;

public final class g extends l {
    public final int e;
    public final int f;
    public final int g;

    public static class b extends l.a<b> {
        public int e = 0;
        public int f = 0;
        public int g = 0;

        public b() {
            super(0);
        }

        public l.a a() {
            return this;
        }

        public l e() {
            return new g(this, (a) null);
        }
    }

    public g(b bVar, a aVar) {
        super(bVar);
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
    }

    public byte[] a() {
        byte[] a2 = super.a();
        h3.B1(this.e, a2, 16);
        h3.B1(this.f, a2, 20);
        h3.B1(this.g, a2, 24);
        return a2;
    }
}
