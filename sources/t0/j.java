package t0;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.n.b.i;
import n0.a.n;
import q0.f;
import q0.f0;
import retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1;
import retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1;
import s0.a.e.b.b0.c.h3;

/* compiled from: HttpServiceMethod */
public abstract class j<ResponseT, ReturnT> extends x<ReturnT> {
    public final u a;
    public final f.a b;
    public final h<f0, ResponseT> c;

    /* compiled from: HttpServiceMethod */
    public static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {
        public final e<ResponseT, ReturnT> d;

        public a(u uVar, f.a aVar, h<f0, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(uVar, aVar, hVar);
            this.d = eVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [t0.d, t0.d<ResponseT>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT c(t0.d<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                t0.e<ResponseT, ReturnT> r2 = r0.d
                java.lang.Object r1 = r2.b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.j.a.c(t0.d, java.lang.Object[]):java.lang.Object");
        }
    }

    /* compiled from: HttpServiceMethod */
    public static final class b<ResponseT> extends j<ResponseT, Object> {
        public final e<ResponseT, d<ResponseT>> d;

        public b(u uVar, f.a aVar, h<f0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z) {
            super(uVar, aVar, hVar);
            this.d = eVar;
        }

        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d dVar2 = (d) this.d.b(dVar);
            m0.l.c cVar = objArr[objArr.length - 1];
            try {
                n nVar = new n(h.b2(cVar), 1);
                nVar.p(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(dVar2));
                dVar2.J(new k(nVar));
                Object o = nVar.o();
                if (o == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    i.e(cVar, "frame");
                }
                return o;
            } catch (Exception e) {
                return h3.k3(e, cVar);
            }
        }
    }

    /* compiled from: HttpServiceMethod */
    public static final class c<ResponseT> extends j<ResponseT, Object> {
        public final e<ResponseT, d<ResponseT>> d;

        public c(u uVar, f.a aVar, h<f0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(uVar, aVar, hVar);
            this.d = eVar;
        }

        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d dVar2 = (d) this.d.b(dVar);
            m0.l.c cVar = objArr[objArr.length - 1];
            try {
                n nVar = new n(h.b2(cVar), 1);
                nVar.p(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(dVar2));
                dVar2.J(new l(nVar));
                Object o = nVar.o();
                if (o == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    i.e(cVar, "frame");
                }
                return o;
            } catch (Exception e) {
                return h3.k3(e, cVar);
            }
        }
    }

    public j(u uVar, f.a aVar, h<f0, ResponseT> hVar) {
        this.a = uVar;
        this.b = aVar;
        this.c = hVar;
    }

    public final ReturnT a(Object[] objArr) {
        return c(new n(this.a, objArr, this.b, this.c), objArr);
    }

    public abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
