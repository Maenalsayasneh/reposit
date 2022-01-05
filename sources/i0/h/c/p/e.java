package i0.h.c.p;

import com.google.firebase.iid.FirebaseInstanceId;
import i0.h.a.b.m.c;
import i0.h.a.b.m.g;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final /* synthetic */ class e implements c {
    public final CountDownLatch c;

    public e(CountDownLatch countDownLatch) {
        this.c = countDownLatch;
    }

    public void onComplete(g gVar) {
        CountDownLatch countDownLatch = this.c;
        t tVar = FirebaseInstanceId.b;
        countDownLatch.countDown();
    }
}
