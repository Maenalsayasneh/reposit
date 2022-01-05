package androidx.paging.multicast;

import h0.u.i0.c;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: Multicaster.kt */
public final class Multicaster$channelManager$2 extends Lambda implements a<ChannelManager<T>> {
    public final /* synthetic */ c c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$channelManager$2(c cVar, int i) {
        super(0);
        this.c = cVar;
        this.d = i;
    }

    public Object invoke() {
        c cVar = this.c;
        return new ChannelManager(cVar.c, this.d, cVar.e, cVar.f, cVar.g, cVar.d);
    }
}
