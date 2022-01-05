package kotlinx.coroutines;

import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.l;
import n0.a.w0;

/* compiled from: Executors.kt */
public final class ExecutorCoroutineDispatcher$Key$1 extends Lambda implements l<e.a, w0> {
    public static final ExecutorCoroutineDispatcher$Key$1 c = new ExecutorCoroutineDispatcher$Key$1();

    public ExecutorCoroutineDispatcher$Key$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        e.a aVar = (e.a) obj;
        if (aVar instanceof w0) {
            return (w0) aVar;
        }
        return null;
    }
}
