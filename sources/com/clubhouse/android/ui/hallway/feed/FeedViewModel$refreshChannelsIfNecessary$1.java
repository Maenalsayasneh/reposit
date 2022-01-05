package com.clubhouse.android.ui.hallway.feed;

import i0.b.b.f;
import i0.e.b.g3.p.c0.v;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$refreshChannelsIfNecessary$1 extends Lambda implements l<v, i> {
    public final /* synthetic */ FeedViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$refreshChannelsIfNecessary$1(FeedViewModel feedViewModel) {
        super(1);
        this.c = feedViewModel;
    }

    public Object invoke(Object obj) {
        v vVar = (v) obj;
        m0.n.b.i.e(vVar, "state");
        if (System.currentTimeMillis() - vVar.j > TimeUnit.SECONDS.toMillis(30) && !(vVar.a instanceof f)) {
            FeedViewModel.q(this.c);
        }
        return i.a;
    }
}
