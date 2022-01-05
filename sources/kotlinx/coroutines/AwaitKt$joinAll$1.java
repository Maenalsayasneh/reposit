package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

@c(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {54}, m = "joinAll")
/* compiled from: Await.kt */
public final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public Object c;
    public int d;
    public int q;
    public /* synthetic */ Object x;
    public int y;

    public AwaitKt$joinAll$1(m0.l.c<? super AwaitKt$joinAll$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return a.D2((f1[]) null, this);
    }
}
