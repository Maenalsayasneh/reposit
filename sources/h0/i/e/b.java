package h0.i.e;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat */
public class b implements Executor {
    public final Handler c;

    public b(Handler handler) {
        Objects.requireNonNull(handler);
        this.c = handler;
    }

    public void execute(Runnable runnable) {
        Handler handler = this.c;
        Objects.requireNonNull(runnable);
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(this.c + " is shutting down");
        }
    }
}
