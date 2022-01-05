package k0.b.d0;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import k0.b.q;
import k0.b.z.g.i;

/* compiled from: Schedulers */
public final class a {
    public static final q a = RxJavaPlugins.initSingleScheduler(new h());
    public static final q b = RxJavaPlugins.initComputationScheduler(new b());
    public static final q c = RxJavaPlugins.initIoScheduler(new c());
    public static final q d = RxJavaPlugins.initNewThreadScheduler(new f());

    /* renamed from: k0.b.d0.a$a  reason: collision with other inner class name */
    /* compiled from: Schedulers */
    public static final class C0226a {
        public static final q a = new k0.b.z.g.a(k0.b.z.g.a.c);
    }

    /* compiled from: Schedulers */
    public static final class b implements Callable<q> {
        public Object call() throws Exception {
            return C0226a.a;
        }
    }

    /* compiled from: Schedulers */
    public static final class c implements Callable<q> {
        public Object call() throws Exception {
            return d.a;
        }
    }

    /* compiled from: Schedulers */
    public static final class d {
        public static final q a = new k0.b.z.g.c(k0.b.z.g.c.b);
    }

    /* compiled from: Schedulers */
    public static final class e {
        public static final q a = new k0.b.z.g.d();
    }

    /* compiled from: Schedulers */
    public static final class f implements Callable<q> {
        public Object call() throws Exception {
            return e.a;
        }
    }

    /* compiled from: Schedulers */
    public static final class g {
        public static final q a = new k0.b.z.g.h();
    }

    /* compiled from: Schedulers */
    public static final class h implements Callable<q> {
        public Object call() throws Exception {
            return g.a;
        }
    }

    static {
        i iVar = i.b;
        i iVar2 = i.b;
    }

    public static q a() {
        return RxJavaPlugins.onComputationScheduler(b);
    }

    public static q b() {
        return RxJavaPlugins.onIoScheduler(c);
    }

    public static q c() {
        return RxJavaPlugins.onNewThreadScheduler(d);
    }
}
