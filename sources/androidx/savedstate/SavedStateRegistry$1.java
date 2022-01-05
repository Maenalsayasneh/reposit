package androidx.savedstate;

import androidx.lifecycle.Lifecycle;
import h0.q.n;
import h0.q.p;
import h0.x.a;

public class SavedStateRegistry$1 implements n {
    public final /* synthetic */ a c;

    public SavedStateRegistry$1(a aVar) {
        this.c = aVar;
    }

    public void a(p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.c.e = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this.c.e = false;
        }
    }
}
