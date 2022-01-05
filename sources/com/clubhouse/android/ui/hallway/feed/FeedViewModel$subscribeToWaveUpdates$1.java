package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.wave.data.models.local.ReceivedWave;
import i0.b.b.b;
import i0.e.b.g3.p.c0.v;
import i0.j.f.p.h;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToWaveUpdates$1", f = "FeedViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$subscribeToWaveUpdates$1 extends SuspendLambda implements p<List<? extends ReceivedWave>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FeedViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$subscribeToWaveUpdates$1(FeedViewModel feedViewModel, m0.l.c<? super FeedViewModel$subscribeToWaveUpdates$1> cVar) {
        super(2, cVar);
        this.d = feedViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FeedViewModel$subscribeToWaveUpdates$1 feedViewModel$subscribeToWaveUpdates$1 = new FeedViewModel$subscribeToWaveUpdates$1(this.d, cVar);
        feedViewModel$subscribeToWaveUpdates$1.c = obj;
        return feedViewModel$subscribeToWaveUpdates$1;
    }

    public Object invoke(Object obj, Object obj2) {
        FeedViewModel$subscribeToWaveUpdates$1 feedViewModel$subscribeToWaveUpdates$1 = new FeedViewModel$subscribeToWaveUpdates$1(this.d, (m0.l.c) obj2);
        feedViewModel$subscribeToWaveUpdates$1.c = (List) obj;
        i iVar = i.a;
        feedViewModel$subscribeToWaveUpdates$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final List list = (List) this.c;
        FeedViewModel feedViewModel = this.d;
        AnonymousClass1 r1 = new l<v, v>() {
            public Object invoke(Object obj) {
                v vVar = (v) obj;
                m0.n.b.i.e(vVar, "$this$setState");
                return v.copy$default(vVar, (b) null, (Set) null, list, (b) null, false, false, false, false, 0, 0, false, false, 4091, (Object) null);
            }
        };
        int i = FeedViewModel.m;
        feedViewModel.m(r1);
        return i.a;
    }
}
