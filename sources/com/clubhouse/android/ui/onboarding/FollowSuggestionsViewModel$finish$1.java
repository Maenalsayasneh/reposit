package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import h0.u.w;
import i0.b.b.f0;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel$finish$1 extends Lambda implements l<FollowSuggestionsState, FollowSuggestionsState> {
    public final /* synthetic */ FollowSuggestionsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsViewModel$finish$1(FollowSuggestionsViewModel followSuggestionsViewModel) {
        super(1);
        this.c = followSuggestionsViewModel;
    }

    public Object invoke(Object obj) {
        FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
        i.e(followSuggestionsState, "$this$setState");
        return FollowSuggestionsState.copy$default(followSuggestionsState, (w) null, new f0(this.c.o.h(SourceLocation.ONBOARDING_SUGGESTED)), (Set) null, (Set) null, 13, (Object) null);
    }
}
