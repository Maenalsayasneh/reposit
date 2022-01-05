package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.q.j;
import h0.q.n;
import h0.q.p;

public class FullLifecycleObserverAdapter implements n {
    public final j c;
    public final n d;

    public FullLifecycleObserverAdapter(j jVar, n nVar) {
        this.c = jVar;
        this.d = nVar;
    }

    public void a(p pVar, Lifecycle.Event event) {
        switch (event.ordinal()) {
            case 0:
                this.c.onCreate(pVar);
                break;
            case 1:
                this.c.onStart(pVar);
                break;
            case 2:
                this.c.onResume(pVar);
                break;
            case 3:
                this.c.onPause(pVar);
                break;
            case 4:
                this.c.onStop(pVar);
                break;
            case 5:
                this.c.onDestroy(pVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.d;
        if (nVar != null) {
            nVar.a(pVar, event);
        }
    }
}
