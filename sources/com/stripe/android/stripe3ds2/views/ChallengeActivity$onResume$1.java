package com.stripe.android.stripe3ds2.views;

import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isTimeout", "Lm0/i;", "onChanged", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$onResume$1<T> implements z<Boolean> {
    public final /* synthetic */ ChallengeActivity this$0;

    public ChallengeActivity$onResume$1(ChallengeActivity challengeActivity) {
        this.this$0 = challengeActivity;
    }

    public final void onChanged(Boolean bool) {
        if (i.a(bool, Boolean.TRUE)) {
            this.this$0.getViewModel$3ds2sdk_release().onFinish();
        }
    }
}
