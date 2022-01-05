package i0.j.b.t.k;

import com.instabug.bug.StateCreatorEventBus;
import com.instabug.bug.view.reporting.c;
import com.instabug.library.model.State;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.ref.WeakReference;
import k0.b.y.d;

/* compiled from: BaseReportingPresenter */
public class h implements d<State.Action> {
    public final /* synthetic */ c c;

    public h(c cVar) {
        this.c = cVar;
    }

    public void b(Object obj) throws Exception {
        State.Action action = (State.Action) obj;
        c.m(this.c);
        WeakReference<V> weakReference = this.c.view;
        if (weakReference != null) {
            c.k(this.c, (l) weakReference.get());
        }
        InstabugSDKLogger.d(this, "State Building finished action");
        StateCreatorEventBus.release();
    }
}
