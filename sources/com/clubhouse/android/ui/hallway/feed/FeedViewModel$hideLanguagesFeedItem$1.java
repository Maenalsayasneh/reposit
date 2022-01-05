package com.clubhouse.android.ui.hallway.feed;

import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.p.c0.r;
import i0.e.b.g3.p.c0.v;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$hideLanguagesFeedItem$1 extends Lambda implements l<v, i> {
    public final /* synthetic */ FeedViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$hideLanguagesFeedItem$1(FeedViewModel feedViewModel) {
        super(1);
        this.c = feedViewModel;
    }

    public Object invoke(Object obj) {
        v vVar = (v) obj;
        m0.n.b.i.e(vVar, "state");
        List a = vVar.a.a();
        final List A0 = a == null ? null : g.A0(a);
        if (A0 != null) {
            A0.removeIf(r.a);
        }
        this.c.m(new l<v, v>() {
            public Object invoke(Object obj) {
                v vVar = (v) obj;
                m0.n.b.i.e(vVar, "$this$setState");
                return v.copy$default(vVar, new f0(A0), (Set) null, (List) null, (b) null, false, false, false, false, 0, 0, false, false, 4094, (Object) null);
            }
        });
        return i.a;
    }
}
