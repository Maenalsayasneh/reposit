package com.clubhouse.android.ui.hallway.feed;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.b3.a.a.d.a.a;
import i0.e.b.b3.a.a.d.a.e;
import i0.e.b.g3.p.c0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$loadFeed$2 extends Lambda implements p<v, b<? extends List<? extends e>>, v> {
    public final /* synthetic */ FeedViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$loadFeed$2(FeedViewModel feedViewModel) {
        super(2);
        this.c = feedViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        v vVar = (v) obj;
        b bVar = (b) obj2;
        i.e(vVar, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        List list = (List) bVar.a();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof a) {
                    arrayList.add(next);
                }
            }
            FeedViewModel feedViewModel = this.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (i.a(((a) next2).a.y, Boolean.TRUE)) {
                    arrayList2.add(next2);
                }
            }
            feedViewModel.x = arrayList2;
            FeedViewModel feedViewModel2 = this.c;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next3 = it2.next();
                if (i.a(((a) next3).a.x, Boolean.TRUE)) {
                    arrayList3.add(next3);
                }
            }
            feedViewModel2.y = arrayList3;
            List<? extends e> list2 = this.c.x;
            if (list2 != null) {
                List<T> P = g.P(list, list2);
                List<? extends e> list3 = this.c.y;
                if (list3 != null) {
                    f0 f0Var = new f0(g.P(P, list3));
                    List<? extends e> list4 = this.c.x;
                    if (list4 != null) {
                        boolean z = !list4.isEmpty();
                        List<? extends e> list5 = this.c.y;
                        if (list5 != null) {
                            boolean z2 = !list5.isEmpty();
                            List<? extends e> list6 = this.c.y;
                            if (list6 != null) {
                                return v.copy$default(vVar, f0Var, (Set) null, (List) null, (b) null, z, z2, false, false, list6.size(), System.currentTimeMillis(), false, false, 3214, (Object) null);
                            }
                            i.m("blockedChannels");
                            throw null;
                        }
                        i.m("blockedChannels");
                        throw null;
                    }
                    i.m("exploreChannels");
                    throw null;
                }
                i.m("blockedChannels");
                throw null;
            }
            i.m("exploreChannels");
            throw null;
        } else if (bVar instanceof c) {
            return v.copy$default(vVar, new c(((c) bVar).b, (Object) null, 2), (Set) null, (List) null, (b) null, false, false, false, false, 0, 0, false, false, 4046, (Object) null);
        } else {
            return v.copy$default(vVar, new f((Object) null, 1), (Set) null, (List) null, (b) null, false, false, false, false, 0, 0, false, false, 4046, (Object) null);
        }
    }
}
