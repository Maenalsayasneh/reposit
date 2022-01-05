package com.clubhouse.android.ui.onboarding;

import h0.u.w;
import i0.b.b.b;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel$toggleSuggestions$1 extends Lambda implements l<FollowSuggestionsState, i> {
    public final /* synthetic */ FollowSuggestionsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsViewModel$toggleSuggestions$1(FollowSuggestionsViewModel followSuggestionsViewModel) {
        super(1);
        this.c = followSuggestionsViewModel;
    }

    public Object invoke(Object obj) {
        final FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
        m0.n.b.i.e(followSuggestionsState, "state");
        this.c.m(new l<FollowSuggestionsState, FollowSuggestionsState>() {
            public Object invoke(Object obj) {
                FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
                m0.n.b.i.e(followSuggestionsState, "$this$setState");
                if (!FollowSuggestionsState.this.c.isEmpty()) {
                    return FollowSuggestionsState.copy$default(followSuggestionsState, (w) null, (b) null, EmptySet.c, (Set) null, 11, (Object) null);
                }
                return FollowSuggestionsState.copy$default(followSuggestionsState, (w) null, (b) null, g.d0(followSuggestionsState.c, FollowSuggestionsState.this.d), (Set) null, 11, (Object) null);
            }
        });
        return i.a;
    }
}
