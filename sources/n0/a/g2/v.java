package n0.a.g2;

import kotlinx.coroutines.flow.SharedFlowImpl;
import m0.i;
import n0.a.g2.d0.c;

/* compiled from: SharedFlow.kt */
public final class v extends c<SharedFlowImpl<?>> {
    public long a = -1;
    public m0.l.c<? super i> b;

    public boolean a(Object obj) {
        SharedFlowImpl sharedFlowImpl = (SharedFlowImpl) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = sharedFlowImpl.b2;
        if (j < sharedFlowImpl.c2) {
            sharedFlowImpl.c2 = j;
        }
        this.a = j;
        return true;
    }

    public m0.l.c[] b(Object obj) {
        long j = this.a;
        this.a = -1;
        this.b = null;
        return ((SharedFlowImpl) obj).w(j);
    }
}
