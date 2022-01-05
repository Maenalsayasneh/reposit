package o0.a.a.p;

import android.content.Context;
import h0.d.a.c;
import h0.d.a.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CustomTabManager */
public class f {
    public final WeakReference<Context> a;
    public final AtomicReference<c> b = new AtomicReference<>();
    public final CountDownLatch c = new CountDownLatch(1);
    public d d;

    public f(Context context) {
        this.a = new WeakReference<>(context);
    }
}
