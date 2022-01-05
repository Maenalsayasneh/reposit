package t0;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;
import t0.e;

@IgnoreJRERequirement
/* compiled from: CompletableFutureCallAdapterFactory */
public final class g extends e.a {
    public static final e.a a = new g();

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class a<R> implements e<R, CompletableFuture<R>> {
        public final Type a;

        @IgnoreJRERequirement
        /* renamed from: t0.g$a$a  reason: collision with other inner class name */
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class C0307a implements f<R> {
            public final CompletableFuture<R> a;

            public C0307a(a aVar, CompletableFuture<R> completableFuture) {
                this.a = completableFuture;
            }

            public void onFailure(d<R> dVar, Throwable th) {
                this.a.completeExceptionally(th);
            }

            public void onResponse(d<R> dVar, v<R> vVar) {
                if (vVar.a()) {
                    this.a.complete(vVar.b);
                } else {
                    this.a.completeExceptionally(new HttpException(vVar));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        public Type a() {
            return this.a;
        }

        public Object b(d dVar) {
            b bVar = new b(dVar);
            dVar.J(new C0307a(this, bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class b<T> extends CompletableFuture<T> {
        public final d<?> c;

        public b(d<?> dVar) {
            this.c = dVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.c.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class c<R> implements e<R, CompletableFuture<v<R>>> {
        public final Type a;

        @IgnoreJRERequirement
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class a implements f<R> {
            public final CompletableFuture<v<R>> a;

            public a(c cVar, CompletableFuture<v<R>> completableFuture) {
                this.a = completableFuture;
            }

            public void onFailure(d<R> dVar, Throwable th) {
                this.a.completeExceptionally(th);
            }

            public void onResponse(d<R> dVar, v<R> vVar) {
                this.a.complete(vVar);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        public Type a() {
            return this.a;
        }

        public Object b(d dVar) {
            b bVar = new b(dVar);
            dVar.J(new a(this, bVar));
            return bVar;
        }
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr, w wVar) {
        if (a0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e = a0.e(0, (ParameterizedType) type);
            if (a0.f(e) != v.class) {
                return new a(e);
            }
            if (e instanceof ParameterizedType) {
                return new c(a0.e(0, (ParameterizedType) e));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
