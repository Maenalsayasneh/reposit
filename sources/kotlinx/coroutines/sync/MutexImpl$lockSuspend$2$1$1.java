package kotlinx.coroutines.sync;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: Mutex.kt */
public final class MutexImpl$lockSuspend$2$1$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ MutexImpl c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutexImpl$lockSuspend$2$1$1(MutexImpl mutexImpl, Object obj) {
        super(1);
        this.c = mutexImpl;
        this.d = obj;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.c.b(this.d);
        return i.a;
    }
}
