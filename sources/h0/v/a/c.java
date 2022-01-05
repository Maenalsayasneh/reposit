package h0.v.a;

import h0.v.a.g;
import java.util.concurrent.Executor;

/* compiled from: AsyncDifferConfig */
public final class c<T> {
    public final Executor a;
    public final g.e<T> b;

    /* compiled from: AsyncDifferConfig */
    public static final class a<T> {
        public static final Object a = new Object();
        public static Executor b;
        public Executor c;
        public Executor d;
        public final g.e<T> e;

        public a(g.e<T> eVar) {
            this.e = eVar;
        }
    }

    public c(Executor executor, Executor executor2, g.e<T> eVar) {
        this.a = executor2;
        this.b = eVar;
    }
}
