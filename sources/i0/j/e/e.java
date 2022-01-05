package i0.j.e;

import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import i0.j.e.l0.b.j.a;
import i0.j.e.l0.b.k.d;
import i0.j.e.l0.j.b;
import java.util.Objects;

/* compiled from: InstabugDelegate */
public class e implements Runnable {
    public final /* synthetic */ f c;

    public e(f fVar) {
        this.c = fVar;
    }

    public void run() {
        Objects.requireNonNull(this.c.c);
        ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new b(new d(new i0.j.e.l0.b.k.e()), new a[0])).orchestrate();
    }
}
