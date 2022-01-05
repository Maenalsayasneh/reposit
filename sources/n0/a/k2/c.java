package n0.a.k2;

import kotlinx.coroutines.sync.MutexImpl;
import n0.a.h2.j;
import n0.a.h2.k;

/* compiled from: LockFreeLinkedList.kt */
public final class c extends k.b {
    public final /* synthetic */ MutexImpl d;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(k kVar, MutexImpl mutexImpl, Object obj) {
        super(kVar);
        this.d = mutexImpl;
        this.e = obj;
    }

    public Object i(Object obj) {
        k kVar = (k) obj;
        if (this.d._state == this.e) {
            return null;
        }
        return j.a;
    }
}
