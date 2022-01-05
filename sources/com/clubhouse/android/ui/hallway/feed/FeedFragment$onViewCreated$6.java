package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.wave.data.models.local.ReceivedWave;
import i0.b.b.b;
import i0.e.b.b3.a.a.d.a.e;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedFragment$onViewCreated$6", f = "FeedFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FeedFragment.kt */
public final class FeedFragment$onViewCreated$6 extends SuspendLambda implements q<b<? extends List<? extends e>>, List<? extends ReceivedWave>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ FeedFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$onViewCreated$6(FeedFragment feedFragment, m0.l.c<? super FeedFragment$onViewCreated$6> cVar) {
        super(3, cVar);
        this.c = feedFragment;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        List list = (List) obj2;
        FeedFragment feedFragment = this.c;
        new FeedFragment$onViewCreated$6(feedFragment, (m0.l.c) obj3);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        k<Object>[] kVarArr = FeedFragment.Z1;
        feedFragment.O0().d.g();
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        FeedFragment feedFragment = this.c;
        k<Object>[] kVarArr = FeedFragment.Z1;
        feedFragment.O0().d.g();
        return i.a;
    }
}
