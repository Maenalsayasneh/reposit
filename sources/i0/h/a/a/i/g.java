package i0.h.a.a.i;

import h0.b0.v;
import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor */
public class g implements Executor {
    public final Executor c;

    /* compiled from: SafeLoggingExecutor */
    public static class a implements Runnable {
        public final Runnable c;

        public a(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            try {
                this.c.run();
            } catch (Exception e) {
                v.Z("Executor", "Background execution failure.", e);
            }
        }
    }

    public g(Executor executor) {
        this.c = executor;
    }

    public void execute(Runnable runnable) {
        this.c.execute(new a(runnable));
    }
}
