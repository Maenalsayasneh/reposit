package com.clubhouse.android.ui.hallway.buddyList;

import com.clubhouse.wave.data.models.local.SentWave;
import i0.e.b.g3.p.b0.q;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel$subscribeToSentWaves$1", f = "BuddyListViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: BuddyListViewModel.kt */
public final class BuddyListViewModel$subscribeToSentWaves$1 extends SuspendLambda implements p<List<? extends SentWave>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BuddyListViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListViewModel$subscribeToSentWaves$1(BuddyListViewModel buddyListViewModel, m0.l.c<? super BuddyListViewModel$subscribeToSentWaves$1> cVar) {
        super(2, cVar);
        this.d = buddyListViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BuddyListViewModel$subscribeToSentWaves$1 buddyListViewModel$subscribeToSentWaves$1 = new BuddyListViewModel$subscribeToSentWaves$1(this.d, cVar);
        buddyListViewModel$subscribeToSentWaves$1.c = obj;
        return buddyListViewModel$subscribeToSentWaves$1;
    }

    public Object invoke(Object obj, Object obj2) {
        BuddyListViewModel$subscribeToSentWaves$1 buddyListViewModel$subscribeToSentWaves$1 = new BuddyListViewModel$subscribeToSentWaves$1(this.d, (m0.l.c) obj2);
        buddyListViewModel$subscribeToSentWaves$1.c = (List) obj;
        i iVar = i.a;
        buddyListViewModel$subscribeToSentWaves$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final List list = (List) this.c;
        BuddyListViewModel buddyListViewModel = this.d;
        AnonymousClass1 r1 = new l<q, q>() {
            public Object invoke(Object obj) {
                q qVar = (q) obj;
                m0.n.b.i.e(qVar, "$this$setState");
                return q.copy$default(qVar, (List) null, (List) null, (List) null, list, false, false, false, false, false, false, 1015, (Object) null);
            }
        };
        int i = BuddyListViewModel.m;
        buddyListViewModel.m(r1);
        return i.a;
    }
}
