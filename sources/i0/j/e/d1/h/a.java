package i0.j.e.d1.h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: MainThreadExecutor */
public class a implements Executor {
    public final Handler c = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        this.c.post(runnable);
    }
}
