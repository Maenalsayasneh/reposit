package i0.h.a.d.a.b;

import android.os.Bundle;
import i0.h.a.d.a.j.m;

public final class l extends i<Void> {
    public final /* synthetic */ n c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(n nVar, m<Void> mVar) {
        super(nVar, mVar);
        this.c = nVar;
    }

    public final void O(Bundle bundle, Bundle bundle2) {
        super.O(bundle, bundle2);
        if (!this.c.g.compareAndSet(true, false)) {
            n.a.b(5, "Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.h();
        }
    }
}
