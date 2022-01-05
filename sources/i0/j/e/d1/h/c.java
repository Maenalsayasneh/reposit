package i0.j.e.d1.h;

import com.instabug.library.util.threading.PoolProvider;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SingleThreadPoolExecutor */
public class c extends ThreadPoolExecutor {
    public String c;
    public d d;

    public c() {
        super(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(10));
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        String str;
        super.afterExecute(runnable, th);
        if (getActiveCount() == 0 && this.d != null && (str = this.c) != null) {
            PoolProvider.singleThreadPoolExecutorhMap.remove(str);
        }
    }
}
