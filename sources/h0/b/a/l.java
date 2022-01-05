package h0.b.a;

import android.view.View;
import h0.i.i.a0;
import h0.i.i.q;
import h0.i.i.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatDelegateImpl */
public class l extends a0 {
    public final /* synthetic */ h a;

    public l(h hVar) {
        this.a = hVar;
    }

    public void b(View view) {
        this.a.l2.setAlpha(1.0f);
        this.a.o2.e((z) null);
        this.a.o2 = null;
    }

    public void c(View view) {
        this.a.l2.setVisibility(0);
        this.a.l2.sendAccessibilityEvent(32);
        if (this.a.l2.getParent() instanceof View) {
            AtomicInteger atomicInteger = q.a;
            ((View) this.a.l2.getParent()).requestApplyInsets();
        }
    }
}
