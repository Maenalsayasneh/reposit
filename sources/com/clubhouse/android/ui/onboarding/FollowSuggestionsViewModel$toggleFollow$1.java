package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel$toggleFollow$1 extends Lambda implements l<FollowSuggestionsState, i> {
    public final /* synthetic */ UserInList c;
    public final /* synthetic */ FollowSuggestionsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsViewModel$toggleFollow$1(UserInList userInList, FollowSuggestionsViewModel followSuggestionsViewModel) {
        super(1);
        this.c = userInList;
        this.d = followSuggestionsViewModel;
    }

    public Object invoke(Object obj) {
        FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
        m0.n.b.i.e(followSuggestionsState, "state");
        if (followSuggestionsState.c.contains(this.c.getId())) {
            this.d.m(new e0(0, this.c));
        } else {
            this.d.p.a(SourceLocation.ONBOARDING_SUGGESTED, this.c.b2);
            this.d.m(new e0(1, this.c));
        }
        return i.a;
    }
}
