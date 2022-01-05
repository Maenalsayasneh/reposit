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
public final class FeedViewModel$toggleBlockedChannels$1 extends Lambda implements l<v, v> {
    public final /* synthetic */ FeedViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$toggleBlockedChannels$1(FeedViewModel feedViewModel) {
        super(1);
        this.c = feedViewModel;
    }

    public Object invoke(Object obj) {
        v vVar = (v) obj;
        i.e(vVar, "$this$setState");
        List a = vVar.a.a();
        List<T> list = null;
        if (vVar.g) {
            if (a != null) {
                List<? extends e> list2 = this.c.y;
                if (list2 != null) {
                    list = g.P(a, list2);
                } else {
                    i.m("blockedChannels");
                    throw null;
                }
            }
        } else if (a != null) {
            List<? extends e> list3 = this.c.y;
            if (list3 != null) {
                list = g.Z(a, list3);
            } else {
                i.m("blockedChannels");
                throw null;
            }
        }
        return v.copy$default(vVar, new f0(list), (Set) null, (List) null, (b) null, false, false, !vVar.g, false, 0, 0, false, false, 4030, (Object) null);
    }
}
