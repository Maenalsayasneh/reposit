package androidx.paging;

import h0.u.r;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.k2.b;

@c(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {595, 223}, m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$startConsumingHints$3 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object c;
    public Object d;
    public Object q;
    public int x;
    public final /* synthetic */ PageFetcherSnapshot y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$3(PageFetcherSnapshot pageFetcherSnapshot, m0.l.c cVar) {
        super(2, cVar);
        this.y = pageFetcherSnapshot;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PageFetcherSnapshot$startConsumingHints$3(this.y, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new PageFetcherSnapshot$startConsumingHints$3(this.y, cVar).invokeSuspend(i.a);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        r.a<Key, Value> aVar;
        b bVar;
        PageFetcherSnapshot pageFetcherSnapshot;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.x;
        if (i == 0) {
            h.d4(obj);
            pageFetcherSnapshot = this.y;
            aVar = pageFetcherSnapshot.e;
            b bVar2 = aVar.a;
            this.c = aVar;
            this.d = bVar2;
            this.q = pageFetcherSnapshot;
            this.x = 1;
            if (bVar2.a((Object) null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
        } else if (i == 1) {
            pageFetcherSnapshot = (PageFetcherSnapshot) this.q;
            bVar = (b) this.d;
            aVar = (r.a) this.c;
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            r<Key, Value> rVar = aVar.b;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(rVar, (m0.l.c) null), a.J0(rVar.i));
            bVar.b((Object) null);
            LoadType loadType = LoadType.APPEND;
            this.c = null;
            this.d = null;
            this.q = null;
            this.x = 2;
            if (pageFetcherSnapshot.b(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, loadType, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return i.a;
        } catch (Throwable th) {
            bVar.b((Object) null);
            throw th;
        }
    }
}
