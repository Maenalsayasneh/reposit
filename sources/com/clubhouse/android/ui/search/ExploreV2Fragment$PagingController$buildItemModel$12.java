package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.events.HalfEventArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.a.b.a;
import i0.e.b.b3.b.e.g;
import i0.e.b.b3.b.e.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$PagingController$buildItemModel$12 extends Lambda implements l<EventInClub, i> {
    public final /* synthetic */ ExploreV2Fragment c;
    public final /* synthetic */ j d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$PagingController$buildItemModel$12(ExploreV2Fragment exploreV2Fragment, j jVar) {
        super(1);
        this.c = exploreV2Fragment;
        this.d = jVar;
    }

    public Object invoke(Object obj) {
        a N0 = this.c.N0();
        SourceLocation sourceLocation = SourceLocation.SEARCH;
        N0.a(sourceLocation, ((g) this.d).e);
        ExploreV2Fragment exploreV2Fragment = this.c;
        HalfEventArgs halfEventArgs = new HalfEventArgs((String) null, (Integer) null, (String) null, (String) null, (EventInClub) obj, sourceLocation, ((g) this.d).e, 15);
        m0.n.b.i.e(halfEventArgs, "mavericksArg");
        v.a1(exploreV2Fragment, new i0.e.b.g3.w.v(halfEventArgs), (q) null, 2);
        return i.a;
    }
}
