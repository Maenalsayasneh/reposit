package kotlinx.coroutines.sync;

import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexImpl;
import m0.i;
import m0.n.a.l;

/* compiled from: Mutex.kt */
public final class MutexImpl$LockCont$tryResumeLockWaiter$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ MutexImpl c;
    public final /* synthetic */ MutexImpl.LockCont d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl mutexImpl, MutexImpl.LockCont lockCont) {
        super(1);
        this.c = mutexImpl;
        this.d = lockCont;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.c.b(this.d.x);
        return i.a;
    }
}
