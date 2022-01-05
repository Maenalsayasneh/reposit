package com.stripe.android.stripe3ds2.views;

import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "shouldFinish", "Lm0/i;", "onChanged", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeProgressActivity.kt */
public final class ChallengeProgressActivity$onCreate$1<T> implements z<Boolean> {
    public final /* synthetic */ ChallengeProgressActivity this$0;

    public ChallengeProgressActivity$onCreate$1(ChallengeProgressActivity challengeProgressActivity) {
        this.this$0 = challengeProgressActivity;
    }

    public final void onChanged(Boolean bool) {
        i.d(bool, "shouldFinish");
        if (bool.booleanValue()) {
            this.this$0.finish();
        }
    }
}
