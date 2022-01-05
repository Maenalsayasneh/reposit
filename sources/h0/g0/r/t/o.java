package h0.g0.r.t;

import h0.g0.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer */
public class o {
    public static final String a = i.e("WorkTimer");
    public final ThreadFactory b;
    public final ScheduledExecutorService c;
    public final Map<String, c> d = new HashMap();
    public final Map<String, b> e = new HashMap();
    public final Object f = new Object();

    /* compiled from: WorkTimer */
    public class a implements ThreadFactory {
        public int c = 0;

        public a(o oVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder P0 = i0.d.a.a.a.P0("WorkManager-WorkTimer-thread-");
            P0.append(this.c);
            newThread.setName(P0.toString());
            this.c++;
            return newThread;
        }
    }

    /* compiled from: WorkTimer */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer */
    public static class c implements Runnable {
        public final o c;
        public final String d;

        public c(o oVar, String str) {
            this.c = oVar;
            this.d = str;
        }

        public void run() {
            synchronized (this.c.f) {
                if (this.c.d.remove(this.d) != null) {
                    b remove = this.c.e.remove(this.d);
                    if (remove != null) {
                        remove.a(this.d);
                    }
                } else {
                    i.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.d}), new Throwable[0]);
                }
            }
        }
    }

    public o() {
        a aVar = new a(this);
        this.b = aVar;
        this.c = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a(String str, long j, b bVar) {
        synchronized (this.f) {
            i.c().a(a, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.d.put(str, cVar);
            this.e.put(str, bVar);
            this.c.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public void b(String str) {
        synchronized (this.f) {
            if (this.d.remove(str) != null) {
                i.c().a(a, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.e.remove(str);
            }
        }
    }
}
