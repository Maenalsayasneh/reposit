package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.multicast.ChannelManager$Actor", f = "ChannelManager.kt", l = {172, 181}, m = "doDispatchValue")
/* compiled from: ChannelManager.kt */
public final class ChannelManager$Actor$doDispatchValue$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ ChannelManager.Actor q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelManager$Actor$doDispatchValue$1(ChannelManager.Actor actor, m0.l.c cVar) {
        super(cVar);
        this.q = actor;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.i((ChannelManager.b.C0004b.c) null, this);
    }
}
