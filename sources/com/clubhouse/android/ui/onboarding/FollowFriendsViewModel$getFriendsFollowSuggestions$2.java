package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.e;
import i0.b.b.f0;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.r.e1;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: FollowFriendsViewModel.kt */
public final class FollowFriendsViewModel$getFriendsFollowSuggestions$2 extends Lambda implements p<e1, b<? extends List<? extends UserInList>>, e1> {
    public final /* synthetic */ FollowFriendsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsViewModel$getFriendsFollowSuggestions$2(FollowFriendsViewModel followFriendsViewModel) {
        super(2);
        this.c = followFriendsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        e1 e1Var = (e1) obj;
        b bVar = (b) obj2;
        i.e(e1Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        boolean z = bVar instanceof f0;
        if (z) {
            f0 f0Var = (f0) bVar;
            if (!((Collection) f0Var.b).isEmpty()) {
                Iterable<UserInList> iterable = (Iterable) f0Var.b;
                ArrayList arrayList = new ArrayList(h.K(iterable, 10));
                for (UserInList mVar : iterable) {
                    arrayList.add(new m(mVar, false, false, false, (Map) null, 30));
                }
                ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((m) it.next()).g.getId().intValue()));
                }
                Set D0 = g.D0(arrayList2);
                i.e(arrayList, MessageExtension.FIELD_DATA);
                i.e(D0, "preSelected");
                i.e(D0, "usersToFollow");
                return new e1(arrayList, D0, D0, false);
            }
        }
        if (bVar instanceof e) {
            return e1Var;
        }
        if (z) {
            ((AmplitudeAnalytics) this.c.o).a("Onboarding-Follow-Friends-Empty");
        }
        this.c.q(true, bVar instanceof c);
        return e1Var;
    }
}
