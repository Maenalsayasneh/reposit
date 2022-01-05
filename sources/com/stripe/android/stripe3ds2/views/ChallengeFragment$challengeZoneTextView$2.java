package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "invoke", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeFragment.kt */
public final class ChallengeFragment$challengeZoneTextView$2 extends Lambda implements a<ChallengeZoneTextView> {
    public final /* synthetic */ ChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$challengeZoneTextView$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    public final ChallengeZoneTextView invoke() {
        if (ChallengeFragment.access$getCresData$p(this.this$0).getUiType() == ChallengeResponseData.UiType.TEXT) {
            return this.this$0.getChallengeEntryViewFactory().createChallengeEntryTextView(ChallengeFragment.access$getCresData$p(this.this$0), this.this$0.uiCustomization);
        }
        return null;
    }
}
