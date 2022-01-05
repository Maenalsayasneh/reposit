package k0.b.z.b;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: Functions */
public final class a {
    public static final k0.b.y.e<Object, Object> a = new h();
    public static final Runnable b = new g();
    public static final k0.b.y.a c = new e();
    public static final k0.b.y.d<Object> d = new f();
    public static final k0.b.y.d<Throwable> e = new j();

    /* renamed from: k0.b.z.b.a$a  reason: collision with other inner class name */
    /* compiled from: Functions */
    public static final class C0230a<T1, T2, R> implements k0.b.y.e<Object[], R> {
        public final k0.b.y.b<? super T1, ? super T2, ? extends R> c;

        public C0230a(k0.b.y.b<? super T1, ? super T2, ? extends R> bVar) {
            this.c = bVar;
        }

        public Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                k0.b.y.b<? super T1, ? super T2, ? extends R> bVar = this.c;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                i0.j.e.v0.e.h hVar = (i0.j.e.v0.e.h) bVar;
                Objects.requireNonNull(hVar);
                Integer num = (Integer) obj3;
                hVar.a.c.onFailed((Throwable) obj2);
                return num;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Array of size 2 expected but got ");
            P0.append(objArr.length);
            throw new IllegalArgumentException(P0.toString());
        }
    }

    /* compiled from: Functions */
    public static final class b<T> implements Callable<List<T>> {
        public final int c;

        public b(int i) {
            this.c = i;
        }

        public Object call() throws Exception {
            return new ArrayList(this.c);
        }
    }

    /* compiled from: Functions */
    public static final class c<T, U> implements k0.b.y.e<T, U> {
        public final Class<U> c;

        public c(Class<U> cls) {
            this.c = cls;
        }

        public U apply(T t) throws Exception {
            return this.c.cast(t);
        }
    }

    /* compiled from: Functions */
    public static final class d<T, U> implements k0.b.y.f<T> {
        public final Class<U> c;

        public d(Class<U> cls) {
            this.c = cls;
        }

        public boolean test(T t) throws Exception {
            return this.c.isInstance(t);
        }
    }

    /* compiled from: Functions */
    public static final class e implements k0.b.y.a {
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* compiled from: Functions */
    public static final class f implements k0.b.y.d<Object> {
        public void b(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* compiled from: Functions */
    public static final class g implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* compiled from: Functions */
    public static final class h implements k0.b.y.e<Object, Object> {
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* compiled from: Functions */
    public static final class i<T, U> implements Callable<U>, k0.b.y.e<T, U> {
        public final U c;

        public i(U u) {
            this.c = u;
        }

        public U apply(T t) throws Exception {
            return this.c;
        }

        public U call() throws Exception {
            return this.c;
        }
    }

    /* compiled from: Functions */
    public static final class j implements k0.b.y.d<Throwable> {
        public void b(Object obj) throws Exception {
            RxJavaPlugins.onError(new OnErrorNotImplementedException((Throwable) obj));
        }
    }
}
