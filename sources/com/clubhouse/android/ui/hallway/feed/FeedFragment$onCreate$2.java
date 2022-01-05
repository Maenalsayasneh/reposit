package com.clubhouse.android.ui.hallway.feed;

import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedFragment$onCreate$2", f = "FeedFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FeedFragment.kt */
public final class FeedFragment$onCreate$2 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FeedFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$onCreate$2(FeedFragment feedFragment, m0.l.c<? super FeedFragment$onCreate$2> cVar) {
        super(2, cVar);
        this.d = feedFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FeedFragment$onCreate$2 feedFragment$onCreate$2 = new FeedFragment$onCreate$2(this.d, cVar);
        feedFragment$onCreate$2.c = obj;
        return feedFragment$onCreate$2;
    }

    public Object invoke(Object obj, Object obj2) {
        FeedFragment feedFragment = this.d;
        FeedFragment$onCreate$2 feedFragment$onCreate$2 = new FeedFragment$onCreate$2(feedFragment, (m0.l.c) obj2);
        feedFragment$onCreate$2.c = (Throwable) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final Throwable th = (Throwable) feedFragment$onCreate$2.c;
        v.f2(feedFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                jVar.e(r3.getMessage());
                return i.a;
            }
        });
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final Throwable th = (Throwable) this.c;
        v.f2(this.d, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                jVar.e(th.getMessage());
                return i.a;
            }
        });
        return i.a;
    }
}
