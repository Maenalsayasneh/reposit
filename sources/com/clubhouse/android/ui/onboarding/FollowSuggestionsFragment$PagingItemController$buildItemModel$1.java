package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.k;

/* compiled from: FollowSuggestionsFragment.kt */
public final class FollowSuggestionsFragment$PagingItemController$buildItemModel$1 extends Lambda implements a<i> {
    public final /* synthetic */ FollowSuggestionsFragment c;
    public final /* synthetic */ UserInList d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsFragment$PagingItemController$buildItemModel$1(FollowSuggestionsFragment followSuggestionsFragment, UserInList userInList) {
        super(0);
        this.c = followSuggestionsFragment;
        this.d = userInList;
    }

    public Object invoke() {
        FollowSuggestionsFragment followSuggestionsFragment = this.c;
        k<Object>[] kVarArr = FollowSuggestionsFragment.Z1;
        FollowSuggestionsViewModel O0 = followSuggestionsFragment.O0();
        final FollowSuggestionsFragment followSuggestionsFragment2 = this.c;
        final UserInList userInList = this.d;
        v.v2(O0, new l<FollowSuggestionsState, i>() {
            public Object invoke(Object obj) {
                m0.n.b.i.e((FollowSuggestionsState) obj, "state");
                i0.e.a.b.a aVar = FollowSuggestionsFragment.this.a2;
                if (aVar != null) {
                    aVar.c(SourceLocation.ONBOARDING_SUGGESTED, userInList.b2);
                    return i.a;
                }
                m0.n.b.i.m("actionTrailRecorder");
                throw null;
            }
        });
        return i.a;
    }
}
