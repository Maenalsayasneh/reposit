package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import n0.a.f2.r;

@c(c = "androidx.paging.multicast.ChannelManager$Actor", f = "ChannelManager.kt", l = {206}, m = "doRemove")
/* compiled from: ChannelManager.kt */
public final class ChannelManager$Actor$doRemove$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ ChannelManager.Actor q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelManager$Actor$doRemove$1(ChannelManager.Actor actor, m0.l.c cVar) {
        super(cVar);
        this.q = actor;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.j((r) null, this);
    }
}
