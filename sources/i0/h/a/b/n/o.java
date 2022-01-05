package i0.h.a.b.n;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import i0.h.a.b.g.k.e;
import i0.h.a.b.m.c;
import i0.h.a.b.m.g;
import i0.h.a.b.n.a;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class o<TResult extends a> implements c<TResult>, Runnable {
    public static final Handler c = new e(Looper.getMainLooper());
    public static final SparseArray<o<?>> d = new SparseArray<>(2);
    public static final AtomicInteger q = new AtomicInteger();
    public g<TResult> Y1;
    public int x;
    public p y;

    public final void a() {
        if (this.Y1 != null && this.y != null) {
            d.delete(this.x);
            c.removeCallbacks(this);
            p pVar = this.y;
            if (pVar != null) {
                g<TResult> gVar = this.Y1;
                int i = p.c;
                pVar.a(gVar);
            }
        }
    }

    public final void onComplete(g<TResult> gVar) {
        this.Y1 = gVar;
        a();
    }

    public final void run() {
        d.delete(this.x);
    }
}
