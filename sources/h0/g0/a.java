package h0.g0;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Configuration */
public final class a {
    public final Executor a = a();
    public final Executor b = a();
    public final q c;
    public final h d;
    public final h0.g0.r.a e;
    public final int f;
    public final int g;
    public final int h;

    /* renamed from: h0.g0.a$a  reason: collision with other inner class name */
    /* compiled from: Configuration */
    public static final class C0037a {
        public q a;
    }

    /* compiled from: Configuration */
    public interface b {
        a a();
    }

    public a(C0037a aVar) {
        q qVar = aVar.a;
        if (qVar == null) {
            String str = q.a;
            this.c = new p();
        } else {
            this.c = qVar;
        }
        this.d = new g();
        this.e = new h0.g0.r.a();
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }

    public final Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
