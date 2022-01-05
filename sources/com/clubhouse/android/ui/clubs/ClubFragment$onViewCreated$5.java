package com.clubhouse.android.ui.clubs;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.g3.l.k2;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$onViewCreated$5 extends Lambda implements l<String, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$onViewCreated$5(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        m0.n.b.i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        this.c.T0().p(new k2(str));
        return i.a;
    }
}
