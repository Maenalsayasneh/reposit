package k0.b.v.a;

import android.os.Handler;
import android.os.Looper;
import i0.j.f.p.h;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.Callable;
import k0.b.q;
import k0.b.y.e;

/* compiled from: AndroidSchedulers */
public final class a {
    public static final q a;

    /* renamed from: k0.b.v.a.a$a  reason: collision with other inner class name */
    /* compiled from: AndroidSchedulers */
    public static class C0228a implements Callable<q> {
        public Object call() throws Exception {
            return b.a;
        }
    }

    /* compiled from: AndroidSchedulers */
    public static final class b {
        public static final q a = new b(new Handler(Looper.getMainLooper()));
    }

    static {
        q qVar;
        C0228a aVar = new C0228a();
        e<Callable<q>, q> eVar = h.c;
        if (eVar == null) {
            try {
                qVar = (q) aVar.call();
                if (qVar == null) {
                    throw new NullPointerException("Scheduler Callable returned null");
                }
            } catch (Throwable th) {
                throw ExceptionHelper.a(th);
            }
        } else {
            try {
                qVar = eVar.apply(aVar);
                Objects.requireNonNull(qVar, "Scheduler Callable returned null");
            } catch (Throwable th2) {
                throw ExceptionHelper.a(th2);
            }
        }
        a = qVar;
    }

    public static q a() {
        q qVar = a;
        Objects.requireNonNull(qVar, "scheduler == null");
        e<q, q> eVar = h.d;
        if (eVar == null) {
            return qVar;
        }
        try {
            return eVar.apply(qVar);
        } catch (Throwable th) {
            throw ExceptionHelper.a(th);
        }
    }
}
