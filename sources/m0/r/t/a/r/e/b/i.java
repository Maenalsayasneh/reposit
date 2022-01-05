package m0.r.t.a.r.e.b;

import m0.n.b.f;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.k.b.o;

/* compiled from: KotlinClassFinder.kt */
public interface i extends o {

    /* compiled from: KotlinClassFinder.kt */
    public static abstract class a {

        /* renamed from: m0.r.t.a.r.e.b.i$a$a  reason: collision with other inner class name */
        /* compiled from: KotlinClassFinder.kt */
        public static final class C0262a extends a {
        }

        /* compiled from: KotlinClassFinder.kt */
        public static final class b extends a {
            public final j a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(j jVar, byte[] bArr, int i) {
                super((f) null);
                m0.n.b.i.e(jVar, "kotlinJvmBinaryClass");
                this.a = jVar;
            }
        }

        public a(f fVar) {
        }

        public final j a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar == null) {
                return null;
            }
            return bVar.a;
        }
    }

    a a(g gVar);

    a c(m0.r.t.a.r.g.a aVar);
}
