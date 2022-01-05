package androidx.paging;

import androidx.paging.PageFetcher;
import g0.a.b.b.a;
import h0.u.a0;
import h0.u.w;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {105}, m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 extends SuspendLambda implements q<e<? super w<Value>>, PageFetcher.a<Key, Value>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public int q;
    public final /* synthetic */ PageFetcher$flow$1 x;
    public final /* synthetic */ a0 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(m0.l.c cVar, PageFetcher$flow$1 pageFetcher$flow$1, a0 a0Var) {
        super(3, cVar);
        this.x = pageFetcher$flow$1;
        this.y = a0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = (e) obj;
        m0.l.c cVar = (m0.l.c) obj3;
        m0.n.b.i.e(eVar, "$this$create");
        m0.n.b.i.e(cVar, "continuation");
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(cVar, this.x, this.y);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.c = eVar;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.d = obj2;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        d<PageEvent<Value>> dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.q;
        if (i == 0) {
            h.d4(obj);
            e eVar = (e) this.c;
            PageFetcher.a aVar = (PageFetcher.a) this.d;
            PageFetcher pageFetcher = this.x.q;
            PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = aVar.a;
            a0 a0Var = this.y;
            Objects.requireNonNull(pageFetcher);
            if (a0Var == null) {
                dVar = pageFetcherSnapshot.g;
            } else {
                dVar = a.z0(new PageFetcher$injectRemoteEvents$1(pageFetcherSnapshot, a0Var, (m0.l.c) null));
            }
            PageFetcher pageFetcher2 = this.x.q;
            w wVar = new w(dVar, new PageFetcher.b(pageFetcher2, aVar.a, pageFetcher2.b));
            this.q = 1;
            if (eVar.emit(wVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
