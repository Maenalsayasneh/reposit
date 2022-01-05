package kotlinx.coroutines.channels;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import n0.a.f2.g;

@c(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {632}, m = "receiveCatching-JP2dKIU")
/* compiled from: AbstractChannel.kt */
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractChannel<E> d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, m0.l.c<? super AbstractChannel$receiveCatching$1> cVar) {
        super(cVar);
        this.d = abstractChannel;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        Object n = this.d.n(this);
        if (n == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return n;
        }
        return new g(n);
    }
}
