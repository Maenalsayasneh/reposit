package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FeedFragment.kt */
public final class FeedFragment$buildModels$1$1$2$6$1 extends Lambda implements l<UserInList, i> {
    public final /* synthetic */ FeedFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$buildModels$1$1$2$6$1(FeedFragment feedFragment) {
        super(1);
        this.c = feedFragment;
    }

    public Object invoke(Object obj) {
        this.c.N0().c(SourceLocation.HALLWAY, ((UserInList) obj).b2);
        return i.a;
    }
}
