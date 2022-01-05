package n0.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: lambda */
public final /* synthetic */ class c implements ThreadFactory {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ AtomicInteger q;

    public /* synthetic */ c(int i, String str, AtomicInteger atomicInteger) {
        this.c = i;
        this.d = str;
        this.q = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        int i = this.c;
        String str = this.d;
        AtomicInteger atomicInteger = this.q;
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
