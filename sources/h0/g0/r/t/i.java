package h0.g0.r.t;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor */
public class i implements Executor {
    public final ArrayDeque<a> c = new ArrayDeque<>();
    public final Executor d;
    public final Object q = new Object();
    public volatile Runnable x;

    /* compiled from: SerialExecutor */
    public static class a implements Runnable {
        public final i c;
        public final Runnable d;

        public a(i iVar, Runnable runnable) {
            this.c = iVar;
            this.d = runnable;
        }

        public void run() {
            try {
                this.d.run();
            } finally {
                this.c.a();
            }
        }
    }

    public i(Executor executor) {
        this.d = executor;
    }

    public void a() {
        synchronized (this.q) {
            Runnable poll = this.c.poll();
            this.x = poll;
            if (poll != null) {
                this.d.execute(this.x);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.q) {
            this.c.add(new a(this, runnable));
            if (this.x == null) {
                a();
            }
        }
    }
}
