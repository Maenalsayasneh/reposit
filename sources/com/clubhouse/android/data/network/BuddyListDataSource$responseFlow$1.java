package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import i0.e.b.b3.b.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.android.data.network.BuddyListDataSource$responseFlow$1", f = "BuddyListDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: BuddyListDataSource.kt */
public final class BuddyListDataSource$responseFlow$1 extends SuspendLambda implements q<a, Map<Integer, ? extends i0.e.b.b3.a.a.f.a>, m0.l.c<? super a>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    public BuddyListDataSource$responseFlow$1(m0.l.c<? super BuddyListDataSource$responseFlow$1> cVar) {
        super(3, cVar);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        BuddyListDataSource$responseFlow$1 buddyListDataSource$responseFlow$1 = new BuddyListDataSource$responseFlow$1((m0.l.c) obj3);
        buddyListDataSource$responseFlow$1.c = (a) obj;
        buddyListDataSource$responseFlow$1.d = (Map) obj2;
        return buddyListDataSource$responseFlow$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        a aVar = (a) this.c;
        Map map = (Map) this.d;
        List<UserInStatus> list = aVar.b;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (UserInStatus userInStatus : list) {
            i0.e.b.b3.a.a.f.a aVar2 = (i0.e.b.b3.a.a.f.a) map.get(userInStatus.getId());
            if (aVar2 == null) {
                num = null;
            } else {
                num = new Integer(aVar2.d);
            }
            arrayList.add(UserInStatus.a(userInStatus, (Boolean) null, (String) null, (String) null, num, 0, (String) null, (String) null, (String) null, 247));
        }
        List<ClubInStatus> list2 = aVar.a;
        boolean z = aVar.c;
        m0.n.b.i.e(list2, "allClubs");
        m0.n.b.i.e(arrayList, "onlineUsers");
        return new a(list2, arrayList, z);
    }
}
