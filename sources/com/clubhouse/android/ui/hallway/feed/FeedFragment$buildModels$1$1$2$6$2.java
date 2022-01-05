package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.clubhouse.android.user.model.User;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FeedFragment.kt */
public final class FeedFragment$buildModels$1$1$2$6$2 extends Lambda implements l<User, i> {
    public final /* synthetic */ FeedFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$buildModels$1$1$2$6$2(FeedFragment feedFragment) {
        super(1);
        this.c = feedFragment;
    }

    public Object invoke(Object obj) {
        User user = (User) obj;
        FeedFragment feedFragment = this.c;
        m0.n.b.i.d(user, "user");
        SourceLocation sourceLocation = SourceLocation.HALLWAY;
        m0.n.b.i.e(feedFragment, "<this>");
        m0.n.b.i.e(user, "user");
        m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        v.f(feedFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(user, sourceLocation, false, false, false, 16));
        return i.a;
    }
}
