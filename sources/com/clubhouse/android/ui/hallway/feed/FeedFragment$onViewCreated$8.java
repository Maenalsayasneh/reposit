package com.clubhouse.android.ui.hallway.feed;

import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.g3.p.y;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedFragment$onViewCreated$8", f = "FeedFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FeedFragment.kt */
public final class FeedFragment$onViewCreated$8 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FeedFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$onViewCreated$8(FeedFragment feedFragment, m0.l.c<? super FeedFragment$onViewCreated$8> cVar) {
        super(2, cVar);
        this.d = feedFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FeedFragment$onViewCreated$8 feedFragment$onViewCreated$8 = new FeedFragment$onViewCreated$8(this.d, cVar);
        feedFragment$onViewCreated$8.c = obj;
        return feedFragment$onViewCreated$8;
    }

    public Object invoke(Object obj, Object obj2) {
        FeedFragment$onViewCreated$8 feedFragment$onViewCreated$8 = new FeedFragment$onViewCreated$8(this.d, (m0.l.c) obj2);
        feedFragment$onViewCreated$8.c = (b) obj;
        i iVar = i.a;
        feedFragment$onViewCreated$8.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof y) {
            FeedFragment feedFragment = this.d;
            String str = ((y) bVar).a;
            Objects.requireNonNull(feedFragment);
            if (str != null) {
                i iVar = (i) v.v2(feedFragment.P0(), new FeedFragment$showHideOption$1$1(str, feedFragment));
            }
        }
        return i.a;
    }
}
