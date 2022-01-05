package com.clubhouse.android.ui.hallway.feed;

import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.b3.a.a.d.a.e;
import i0.e.b.g3.p.c0.v;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$loadExploreChannels$1 extends Lambda implements l<v, v> {
    public final /* synthetic */ FeedViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$loadExploreChannels$1(FeedViewModel feedViewModel) {
        super(1);
        this.c = feedViewModel;
    }

    public Object invoke(Object obj) {
        v vVar = (v) obj;
        i.e(vVar, "$this$setState");
        List a = vVar.a.a();
        if (a == null) {
            return v.copy$default(vVar, vVar.a, (Set) null, (List) null, (b) null, false, false, false, false, 0, 0, false, false, 4094, (Object) null);
        }
        List<? extends e> list = this.c.x;
        if (list != null) {
            return v.copy$default(vVar, new f0(g.Z(a, list)), (Set) null, (List) null, (b) null, false, false, false, false, 0, 0, false, false, 4078, (Object) null);
        }
        i.m("exploreChannels");
        throw null;
    }
}
