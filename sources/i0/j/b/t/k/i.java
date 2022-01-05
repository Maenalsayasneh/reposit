package i0.j.b.t.k;

import com.instabug.bug.StateCreatorEventBus;
import com.instabug.bug.view.reporting.c;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.ref.WeakReference;
import k0.b.y.d;

/* compiled from: BaseReportingPresenter */
public class i implements d<Throwable> {
    public final /* synthetic */ c c;

    public i(c cVar) {
        this.c = cVar;
    }

    public void b(Object obj) throws Exception {
        c.m(this.c);
        ((Throwable) obj).printStackTrace();
        WeakReference<V> weakReference = this.c.view;
        if (weakReference != null) {
            c.k(this.c, (l) weakReference.get());
        }
        InstabugSDKLogger.e(this, "State Building finished error");
        StateCreatorEventBus.release();
    }
}
