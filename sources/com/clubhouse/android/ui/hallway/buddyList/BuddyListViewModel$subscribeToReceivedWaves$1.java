package com.clubhouse.android.ui.hallway.buddyList;

import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import i0.e.b.b3.a.a.f.a;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.q;

@c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel$subscribeToReceivedWaves$1", f = "BuddyListViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: BuddyListViewModel.kt */
public final class BuddyListViewModel$subscribeToReceivedWaves$1 extends SuspendLambda implements q<List<? extends ReceivedWave>, Map<Integer, ? extends a>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ BuddyListViewModel q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListViewModel$subscribeToReceivedWaves$1(BuddyListViewModel buddyListViewModel, m0.l.c<? super BuddyListViewModel$subscribeToReceivedWaves$1> cVar) {
        super(3, cVar);
        this.q = buddyListViewModel;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        BuddyListViewModel$subscribeToReceivedWaves$1 buddyListViewModel$subscribeToReceivedWaves$1 = new BuddyListViewModel$subscribeToReceivedWaves$1(this.q, (m0.l.c) obj3);
        buddyListViewModel$subscribeToReceivedWaves$1.c = (List) obj;
        buddyListViewModel$subscribeToReceivedWaves$1.d = (Map) obj2;
        i iVar = i.a;
        buddyListViewModel$subscribeToReceivedWaves$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        List<ReceivedWave> list = (List) this.c;
        Map map = (Map) this.d;
        final ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (ReceivedWave receivedWave : list) {
            UserInStatus userInStatus = receivedWave.c;
            a aVar = (a) map.get(userInStatus.getId());
            if (aVar == null) {
                num = null;
            } else {
                num = new Integer(aVar.d);
            }
            arrayList.add(ReceivedWave.a(receivedWave, UserInStatus.a(userInStatus, (Boolean) null, (String) null, (String) null, num, 0, (String) null, (String) null, (String) null, 247), (String) null, 0, false, (OffsetDateTime) null, 30));
        }
        BuddyListViewModel buddyListViewModel = this.q;
        AnonymousClass1 r02 = new l<i0.e.b.g3.p.b0.q, i0.e.b.g3.p.b0.q>() {
            public Object invoke(Object obj) {
                i0.e.b.g3.p.b0.q qVar = (i0.e.b.g3.p.b0.q) obj;
                m0.n.b.i.e(qVar, "$this$setState");
                return i0.e.b.g3.p.b0.q.copy$default(qVar, (List) null, (List) null, arrayList, (List) null, false, false, false, false, false, false, 1019, (Object) null);
            }
        };
        int i = BuddyListViewModel.m;
        buddyListViewModel.m(r02);
        return i.a;
    }
}
