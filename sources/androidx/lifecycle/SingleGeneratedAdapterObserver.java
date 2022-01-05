package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.q.k;
import h0.q.n;
import h0.q.p;
import h0.q.x;

public class SingleGeneratedAdapterObserver implements n {
    public final k c;

    public SingleGeneratedAdapterObserver(k kVar) {
        this.c = kVar;
    }

    public void a(p pVar, Lifecycle.Event event) {
        this.c.a(pVar, event, false, (x) null);
        this.c.a(pVar, event, true, (x) null);
    }
}
