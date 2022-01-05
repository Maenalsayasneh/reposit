package n0.a.g2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.flow.StateFlowImpl;
import n0.a.g2.d0.b;
import n0.a.g2.d0.c;

/* compiled from: StateFlow.kt */
public final class b0 extends c<StateFlowImpl<?>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    public boolean a(Object obj) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) obj;
        if (this._state != null) {
            return false;
        }
        this._state = a0.a;
        return true;
    }

    public m0.l.c[] b(Object obj) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) obj;
        this._state = null;
        return b.a;
    }
}
