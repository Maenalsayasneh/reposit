package defpackage;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import i0.e.b.b3.a.a.d.a.e;
import i0.e.b.b3.a.a.d.a.g;
import i0.e.b.b3.a.a.d.a.h;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* renamed from: b0  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class b0 extends Lambda implements a<i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(int i, Object obj, Object obj2) {
        super(0);
        this.c = i;
        this.d = obj;
        this.q = obj2;
    }

    public final Object invoke() {
        int i = this.c;
        if (i == 0) {
            ((FeedFragment) this.d).N0().c(SourceLocation.HALLWAY, ((g) ((e) this.q)).a);
            return i.a;
        } else if (i == 1) {
            ((FeedFragment) this.d).N0().c(SourceLocation.HALLWAY, ((i0.e.b.b3.a.a.d.a.a) ((e) this.q)).a.Y1);
            return i.a;
        } else if (i == 2) {
            ((FeedFragment) this.d).N0().c(SourceLocation.HALLWAY, ((i0.e.b.b3.a.a.d.a.i) ((e) this.q)).c);
            return i.a;
        } else if (i == 3) {
            ((FeedFragment) this.d).N0().c(SourceLocation.HALLWAY, ((h) ((e) this.q)).d);
            return i.a;
        } else {
            throw null;
        }
    }
}
