package com.clubhouse.android.ui.hallway.feed;

import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.p.c0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$toggleFollowUser$2 extends Lambda implements p<v, b<? extends i>, v> {
    public final /* synthetic */ FeedViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$toggleFollowUser$2(FeedViewModel feedViewModel) {
        super(2);
        this.c = feedViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        v vVar = (v) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(vVar, "$this$execute");
        m0.n.b.i.e(bVar, "it");
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return vVar;
    }
}
