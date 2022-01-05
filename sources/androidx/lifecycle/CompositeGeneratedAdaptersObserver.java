package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.q.k;
import h0.q.n;
import h0.q.p;
import h0.q.x;

public class CompositeGeneratedAdaptersObserver implements n {
    public final k[] c;

    public CompositeGeneratedAdaptersObserver(k[] kVarArr) {
        this.c = kVarArr;
    }

    public void a(p pVar, Lifecycle.Event event) {
        x xVar = new x();
        for (k a : this.c) {
            a.a(pVar, event, false, xVar);
        }
        for (k a2 : this.c) {
            a2.a(pVar, event, true, xVar);
        }
    }
}
