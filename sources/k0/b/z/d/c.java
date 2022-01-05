package k0.b.z.d;

import java.util.concurrent.CountDownLatch;
import k0.b.i;
import k0.b.t;
import k0.b.w.a;

/* compiled from: BlockingMultiObserver */
public final class c<T> extends CountDownLatch implements t<T>, k0.b.c, i<T> {
    public T c;
    public Throwable d;
    public a q;
    public volatile boolean x;

    public c() {
        super(1);
    }

    public void a(a aVar) {
        this.q = aVar;
        if (this.x) {
            aVar.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onError(Throwable th) {
        this.d = th;
        countDown();
    }

    public void onSuccess(T t) {
        this.c = t;
        countDown();
    }
}
