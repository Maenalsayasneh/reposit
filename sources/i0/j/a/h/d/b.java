package i0.j.a.h.d;

import i0.j.a.e.c;
import i0.j.a.g.a;
import java.lang.Thread;

/* compiled from: APMUncaughtExceptionHandler */
public class b implements Thread.UncaughtExceptionHandler {
    public Thread.UncaughtExceptionHandler c = Thread.getDefaultUncaughtExceptionHandler();
    public i0.j.a.e.b d = a.g();
    public c q = a.a();

    public void uncaughtException(Thread thread, Throwable th) {
        if (((c) this.d).j()) {
            ((d) this.q).a(1);
        }
        this.c.uncaughtException(thread, th);
    }
}
