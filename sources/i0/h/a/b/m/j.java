package i0.h.a.b.m;

import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class j implements b, d, e {
    public final CountDownLatch a = new CountDownLatch(1);

    public j(d0 d0Var) {
    }

    public final void a(Exception exc) {
        this.a.countDown();
    }

    public final void c() {
        this.a.countDown();
    }

    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
