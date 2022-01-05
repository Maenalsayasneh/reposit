package k0.b.z.g;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import k0.b.q;

/* compiled from: NewThreadScheduler */
public final class d extends q {
    public static final RxThreadFactory b = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final ThreadFactory c;

    public d() {
        this.c = b;
    }

    public q.c a() {
        return new e(this.c);
    }

    public d(ThreadFactory threadFactory) {
        this.c = threadFactory;
    }
}
