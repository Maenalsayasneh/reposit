package androidx.paging;

import h0.u.h0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", l = {212}, m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$startConsumingHints$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ PageFetcherSnapshot d;

    @c(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2  reason: invalid class name */
    /* compiled from: PageFetcherSnapshot.kt */
    public static final class AnonymousClass2 extends SuspendLambda implements p<h0, m0.l.c<? super i>, Object> {
        public final /* synthetic */ PageFetcherSnapshot$startConsumingHints$1 c;

        {
            this.c = r1;
        }

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            return new AnonymousClass2(this.c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m0.l.c cVar = (m0.l.c) obj2;
            m0.n.b.i.e(cVar, "completion");
            PageFetcherSnapshot$startConsumingHints$1 pageFetcherSnapshot$startConsumingHints$1 = this.c;
            new AnonymousClass2(pageFetcherSnapshot$startConsumingHints$1, cVar);
            i iVar = i.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(iVar);
            pageFetcherSnapshot$startConsumingHints$1.d.o.invoke();
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            this.c.d.o.invoke();
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1(PageFetcherSnapshot pageFetcherSnapshot, m0.l.c cVar) {
        super(2, cVar);
        this.d = pageFetcherSnapshot;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PageFetcherSnapshot$startConsumingHints$1(this.d, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new PageFetcherSnapshot$startConsumingHints$1(this.d, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 pageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 = new PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1(this.d.a, this);
            AnonymousClass2 r5 = new AnonymousClass2(this, (m0.l.c) null);
            this.c = 1;
            if (a.E0(pageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1, r5, this) == coroutineSingletons) {
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
