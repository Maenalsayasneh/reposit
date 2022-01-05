package com.stripe.android.stripe3ds2.views;

import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "challengeText", "Lm0/i;", "onChanged", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeFragment.kt */
public final class ChallengeFragment$onViewCreated$1<T> implements z<String> {
    public final /* synthetic */ ChallengeFragment this$0;

    public ChallengeFragment$onViewCreated$1(ChallengeFragment challengeFragment) {
        this.this$0 = challengeFragment;
    }

    public final void onChanged(String str) {
        ChallengeZoneTextView challengeZoneTextView$3ds2sdk_release = this.this$0.getChallengeZoneTextView$3ds2sdk_release();
        if (challengeZoneTextView$3ds2sdk_release != null) {
            i.d(str, "challengeText");
            challengeZoneTextView$3ds2sdk_release.setText(str);
        }
    }
}
