package t0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import q0.b0;
import t0.e;

/* compiled from: DefaultCallAdapterFactory */
public final class i extends e.a {
    public final Executor a;

    /* compiled from: DefaultCallAdapterFactory */
    public class a implements e<Object, d<?>> {
        public final /* synthetic */ Type a;
        public final /* synthetic */ Executor b;

        public a(i iVar, Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        public Type a() {
            return this.a;
        }

        public Object b(d dVar) {
            Executor executor = this.b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    /* compiled from: DefaultCallAdapterFactory */
    public static final class b<T> implements d<T> {
        public final Executor c;
        public final d<T> d;

        /* compiled from: DefaultCallAdapterFactory */
        public class a implements f<T> {
            public final /* synthetic */ f a;

            public a(f fVar) {
                this.a = fVar;
            }

            public void onFailure(d<T> dVar, Throwable th) {
                b.this.c.execute(new a(this, this.a, th));
            }

            public void onResponse(d<T> dVar, v<T> vVar) {
                b.this.c.execute(new b(this, this.a, vVar));
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.c = executor;
            this.d = dVar;
        }

        public void J(f<T> fVar) {
            this.d.J(new a(fVar));
        }

        public void cancel() {
            this.d.cancel();
        }

        public Object clone() throws CloneNotSupportedException {
            return new b(this.c, this.d.clone());
        }

        public v<T> execute() throws IOException {
            return this.d.execute();
        }

        public boolean isCanceled() {
            return this.d.isCanceled();
        }

        public b0 request() {
            return this.d.request();
        }

        /* renamed from: clone  reason: collision with other method in class */
        public d<T> m59clone() {
            return new b(this.c, this.d.clone());
        }
    }

    public i(Executor executor) {
        this.a = executor;
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr, w wVar) {
        Executor executor = null;
        if (a0.f(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e = a0.e(0, (ParameterizedType) type);
            if (!a0.i(annotationArr, y.class)) {
                executor = this.a;
            }
            return new a(this, e, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
