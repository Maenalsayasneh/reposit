package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.l.c;
import m0.n.a.p;

/* compiled from: ChannelManager.kt */
public final /* synthetic */ class ChannelManager$Actor$newProducer$1 extends FunctionReferenceImpl implements p<ChannelManager.b<T>, c<? super i>, Object> {
    public ChannelManager$Actor$newProducer$1(ChannelManager.Actor actor) {
        super(2, actor, ChannelManager.Actor.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((ChannelManager.Actor) this.receiver).e((ChannelManager.b) obj, (c) obj2);
    }
}
