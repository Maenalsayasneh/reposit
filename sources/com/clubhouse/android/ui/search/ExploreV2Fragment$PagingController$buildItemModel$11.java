package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.e.b.b3.b.e.g;
import i0.e.b.b3.b.e.j;
import i0.e.b.g3.w.d0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;
import m0.r.k;

/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$PagingController$buildItemModel$11 extends Lambda implements p<EventInClub, Boolean, i> {
    public final /* synthetic */ ExploreV2Fragment c;
    public final /* synthetic */ j d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$PagingController$buildItemModel$11(ExploreV2Fragment exploreV2Fragment, j jVar) {
        super(2);
        this.c = exploreV2Fragment;
        this.d = jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        EventInClub eventInClub = (EventInClub) obj;
        Boolean bool = (Boolean) obj2;
        ExploreV2Fragment exploreV2Fragment = this.c;
        k<Object>[] kVarArr = ExploreV2Fragment.Z1;
        ExploreV2ViewModel P0 = exploreV2Fragment.P0();
        m0.n.b.i.d(bool, "isAttending");
        P0.p(new d0((g) this.d, bool.booleanValue()));
        return i.a;
    }
}
