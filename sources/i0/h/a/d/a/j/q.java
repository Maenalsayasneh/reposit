package i0.h.a.d.a.j;

import java.util.concurrent.CountDownLatch;

public final class q implements c, b {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ q(byte[] bArr) {
    }

    public final void a(Exception exc) {
        this.a.countDown();
    }

    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
