package defpackage;

import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.hallway.feed.FeedViewModel;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.c0;
import i0.e.b.g3.p.c0.d0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* renamed from: p  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class p extends Lambda implements l<m, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            m mVar = (m) obj;
            k<Object>[] kVarArr = FeedFragment.Z1;
            FeedViewModel P0 = ((FeedFragment) this.d).P0();
            m0.n.b.i.d(mVar, "user");
            P0.p(new d0(mVar));
            return i.a;
        } else if (i == 1) {
            m mVar2 = (m) obj;
            k<Object>[] kVarArr2 = FeedFragment.Z1;
            FeedViewModel P02 = ((FeedFragment) this.d).P0();
            m0.n.b.i.d(mVar2, "user");
            P02.p(new c0(mVar2));
            return i.a;
        } else {
            throw null;
        }
    }
}
