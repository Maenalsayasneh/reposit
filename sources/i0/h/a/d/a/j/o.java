package i0.h.a.d.a.j;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class o implements Executor {
    public final Handler c = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.c.post(runnable);
    }
}
