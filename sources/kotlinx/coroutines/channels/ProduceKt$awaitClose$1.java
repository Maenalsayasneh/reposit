package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;
import n0.a.f2.l;

@c(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {157}, m = "awaitClose")
/* compiled from: Produce.kt */
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public int x;

    public ProduceKt$awaitClose$1(m0.l.c<? super ProduceKt$awaitClose$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.x |= Integer.MIN_VALUE;
        return ProduceKt.a((l<?>) null, (a<i>) null, this);
    }
}
