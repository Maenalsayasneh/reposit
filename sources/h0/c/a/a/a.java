package h0.c.a.a;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor */
public class a extends c {
    public static volatile a a;
    public static final Executor b = new C0025a();
    public static final Executor c = new b();
    public c d;
    public c e;

    /* renamed from: h0.c.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: ArchTaskExecutor */
    public static class C0025a implements Executor {
        public void execute(Runnable runnable) {
            a.d().d.c(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor */
    public static class b implements Executor {
        public void execute(Runnable runnable) {
            a.d().d.a(runnable);
        }
    }

    public a() {
        b bVar = new b();
        this.e = bVar;
        this.d = bVar;
    }

    public static a d() {
        if (a != null) {
            return a;
        }
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }

    public void a(Runnable runnable) {
        this.d.a(runnable);
    }

    public boolean b() {
        return this.d.b();
    }

    public void c(Runnable runnable) {
        this.d.c(runnable);
    }
}
