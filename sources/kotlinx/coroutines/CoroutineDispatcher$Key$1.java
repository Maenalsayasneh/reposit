package kotlinx.coroutines;

import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.l;
import n0.a.d0;

/* compiled from: CoroutineDispatcher.kt */
public final class CoroutineDispatcher$Key$1 extends Lambda implements l<e.a, d0> {
    public static final CoroutineDispatcher$Key$1 c = new CoroutineDispatcher$Key$1();

    public CoroutineDispatcher$Key$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        e.a aVar = (e.a) obj;
        if (aVar instanceof d0) {
            return (d0) aVar;
        }
        return null;
    }
}
