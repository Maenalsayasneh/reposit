package s0.a.f.b.h;

import s0.a.e.b.b0.c.h3;
import s0.a.f.b.h.l;

public final class d extends l {
    public final int e;
    public final int f;

    public static class b extends l.a<b> {
        public int e = 0;
        public int f = 0;

        public b() {
            super(2);
        }

        public l.a a() {
            return this;
        }

        public l e() {
            return new d(this, (a) null);
        }
    }

    public d(b bVar, a aVar) {
        super(bVar);
        this.e = bVar.e;
        this.f = bVar.f;
    }

    public byte[] a() {
        byte[] a2 = super.a();
        h3.B1(0, a2, 16);
        h3.B1(this.e, a2, 20);
        h3.B1(this.f, a2, 24);
        return a2;
    }
}
