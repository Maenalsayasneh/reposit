package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.i;

@c(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {101}, m = "withTimeoutOrNull")
/* compiled from: Timeout.kt */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    public long c;
    public Object d;
    public Object q;
    public /* synthetic */ Object x;
    public int y;

    public TimeoutKt$withTimeoutOrNull$1(m0.l.c<? super TimeoutKt$withTimeoutOrNull$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return i.b(0, (p) null, this);
    }
}
