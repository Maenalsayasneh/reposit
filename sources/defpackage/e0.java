package defpackage;

import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.onboarding.FollowSuggestionsState;
import h0.u.w;
import i0.b.b.b;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* renamed from: e0  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class e0 extends Lambda implements l<FollowSuggestionsState, FollowSuggestionsState> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
            i.e(followSuggestionsState, "$this$setState");
            return FollowSuggestionsState.copy$default(followSuggestionsState, (w) null, (b) null, g.T(followSuggestionsState.c, ((UserInList) this.d).getId()), (Set) null, 11, (Object) null);
        } else if (i == 1) {
            FollowSuggestionsState followSuggestionsState2 = (FollowSuggestionsState) obj;
            i.e(followSuggestionsState2, "$this$setState");
            return FollowSuggestionsState.copy$default(followSuggestionsState2, (w) null, (b) null, g.e0(followSuggestionsState2.c, ((UserInList) this.d).getId()), (Set) null, 11, (Object) null);
        } else {
            throw null;
        }
    }
}
