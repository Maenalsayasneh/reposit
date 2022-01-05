package n0.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m0.i;
import m0.n.a.l;

/* compiled from: JobSupport.kt */
public final class d1 extends g1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_invoked");
    public final l<Throwable, i> Y1;
    private volatile /* synthetic */ int _invoked = 0;

    public d1(l<? super Throwable, i> lVar) {
        this.Y1 = lVar;
    }

    public void H(Throwable th) {
        if (y.compareAndSet(this, 0, 1)) {
            this.Y1.invoke(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        H((Throwable) obj);
        return i.a;
    }
}
