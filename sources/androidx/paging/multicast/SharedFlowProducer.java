package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f1;
import n0.a.g2.d;

/* compiled from: SharedFlowProducer.kt */
public final class SharedFlowProducer<T> {
    public final f1 a;
    public final f0 b;
    public final d<T> c;
    public final p<ChannelManager.b.C0004b<T>, c<? super i>, Object> d;

    public SharedFlowProducer(f0 f0Var, d<? extends T> dVar, p<? super ChannelManager.b.C0004b<T>, ? super c<? super i>, ? extends Object> pVar) {
        m0.n.b.i.e(f0Var, "scope");
        m0.n.b.i.e(dVar, "src");
        m0.n.b.i.e(pVar, "sendUpsteamMessage");
        this.b = f0Var;
        this.c = dVar;
        this.d = pVar;
        this.a = a.E2(f0Var, (e) null, CoroutineStart.LAZY, new SharedFlowProducer$collectionJob$1(this, (c) null), 1, (Object) null);
    }
}
