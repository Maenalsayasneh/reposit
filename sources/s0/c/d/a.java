package s0.c.d;

import java.util.Queue;
import org.slf4j.event.Level;
import s0.c.b;

/* compiled from: EventRecodingLogger */
public class a implements b {
    public String c;
    public s0.c.e.b d;
    public Queue<c> q;

    public a(s0.c.e.b bVar, Queue<c> queue) {
        this.d = bVar;
        this.c = bVar.c;
        this.q = queue;
    }

    public void a(String str, Throwable th) {
        d(Level.WARN, str, (Object[]) null, th);
    }

    public void b(String str, Throwable th) {
        d(Level.TRACE, str, (Object[]) null, th);
    }

    public void c(String str) {
        d(Level.WARN, str, (Object[]) null, (Throwable) null);
    }

    public final void d(Level level, String str, Object[] objArr, Throwable th) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.a = this.d;
        cVar.b = null;
        Thread.currentThread().getName();
        this.q.add(cVar);
    }

    public void debug(String str) {
        d(Level.DEBUG, str, (Object[]) null, (Throwable) null);
    }

    public String getName() {
        return this.c;
    }

    public void info(String str) {
        d(Level.INFO, str, (Object[]) null, (Throwable) null);
    }
}
