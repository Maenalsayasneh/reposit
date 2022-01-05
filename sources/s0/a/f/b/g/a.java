package s0.a.f.b.g;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import s0.a.a.c3.m0;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.i;
import s0.a.f.a.j;
import s0.a.f.b.h.q;
import s0.a.f.b.h.s;
import s0.a.f.b.h.u;

public class a {
    public static Map a;

    public static class b extends f {
        public b(C0305a aVar) {
            super((C0305a) null);
        }

        public s0.a.b.k0.b a(m0 m0Var, Object obj) throws IOException {
            byte[] bArr = o.B(m0Var.t()).c;
            if (h3.y(bArr, 0) == 1) {
                return s0.a.f.b.a.h.a(h3.q0(bArr, 4, bArr.length));
            }
            if (bArr.length == 64) {
                bArr = h3.q0(bArr, 4, bArr.length);
            }
            return s0.a.f.b.a.d.a(bArr);
        }
    }

    public static class c extends f {
        public c(C0305a aVar) {
            super((C0305a) null);
        }

        public s0.a.b.k0.b a(m0 m0Var, Object obj) throws IOException {
            return new s0.a.f.b.c.b(m0Var.d.B());
        }
    }

    public static class d extends f {
        public d(C0305a aVar) {
            super((C0305a) null);
        }

        public s0.a.b.k0.b a(m0 m0Var, Object obj) throws IOException {
            return new s0.a.f.b.d.b(((Integer) b.i.get(m0Var.c.c)).intValue(), m0Var.d.C());
        }
    }

    public static class e extends f {
        public e(C0305a aVar) {
            super((C0305a) null);
        }

        public s0.a.b.k0.b a(m0 m0Var, Object obj) throws IOException {
            return new s0.a.f.b.f.c(m0Var.d.B(), b.d(s0.a.f.a.h.s(m0Var.c.d)));
        }
    }

    public static abstract class f {
        public f() {
        }

        public f(C0305a aVar) {
        }

        public abstract s0.a.b.k0.b a(m0 m0Var, Object obj) throws IOException;
    }

    public static class g extends f {
        public g(C0305a aVar) {
            super((C0305a) null);
        }

        public s0.a.b.k0.b a(m0 m0Var, Object obj) throws IOException {
            i s = i.s(m0Var.c.d);
            if (s != null) {
                n nVar = s.q.c;
                s0.a.f.a.n s2 = s0.a.f.a.n.s(m0Var.t());
                u.b bVar = new u.b(new s(s.d, s0.a.f.b.h.c.b(b.a(nVar).getAlgorithmName())));
                bVar.c = h3.P(h3.I(s2.c));
                bVar.b = h3.P(h3.I(s2.d));
                return new u(bVar, (u.a) null);
            }
            byte[] bArr = o.B(m0Var.t()).c;
            u.b bVar2 = new u.b(s.a.get(Integer.valueOf(h3.y(bArr, 0))));
            bVar2.d = h3.P(bArr);
            return new u(bVar2, (u.a) null);
        }
    }

    public static class h extends f {
        public h(C0305a aVar) {
            super((C0305a) null);
        }

        public s0.a.b.k0.b a(m0 m0Var, Object obj) throws IOException {
            j s = j.s(m0Var.c.d);
            if (s != null) {
                n nVar = s.x.c;
                s0.a.f.a.n s2 = s0.a.f.a.n.s(m0Var.t());
                q.b bVar = new q.b(new s0.a.f.b.h.o(s.d, s.q, s0.a.f.b.h.c.b(b.a(nVar).getAlgorithmName())));
                bVar.c = h3.P(h3.I(s2.c));
                bVar.b = h3.P(h3.I(s2.d));
                return new q(bVar, (q.a) null);
            }
            byte[] bArr = o.B(m0Var.t()).c;
            q.b bVar2 = new q.b(s0.a.f.b.h.o.a.get(Integer.valueOf(h3.y(bArr, 0))));
            bVar2.d = h3.P(bArr);
            return new q(bVar2, (q.a) null);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(s0.a.f.a.e.q, new d((C0305a) null));
        a.put(s0.a.f.a.e.r, new d((C0305a) null));
        a.put(s0.a.f.a.e.e, new e((C0305a) null));
        a.put(s0.a.f.a.e.f, new c((C0305a) null));
        a.put(s0.a.f.a.e.g, new g((C0305a) null));
        a.put(s0.a.f.a.e.l, new h((C0305a) null));
        a.put(s0.a.a.m2.a.a, new g((C0305a) null));
        a.put(s0.a.a.m2.a.b, new h((C0305a) null));
        a.put(s0.a.a.w2.n.f66s0, new b((C0305a) null));
    }

    public static s0.a.b.k0.b a(m0 m0Var) throws IOException {
        s0.a.a.c3.b bVar = m0Var.c;
        f fVar = (f) a.get(bVar.c);
        if (fVar != null) {
            return fVar.a(m0Var, (Object) null);
        }
        StringBuilder P0 = i0.d.a.a.a.P0("algorithm identifier in public key not recognised: ");
        P0.append(bVar.c);
        throw new IOException(P0.toString());
    }
}
