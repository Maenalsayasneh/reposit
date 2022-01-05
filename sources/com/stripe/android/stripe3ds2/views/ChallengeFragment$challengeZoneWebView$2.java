package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "invoke", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeFragment.kt */
public final class ChallengeFragment$challengeZoneWebView$2 extends Lambda implements a<ChallengeZoneWebView> {
    public final /* synthetic */ ChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$challengeZoneWebView$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    public final ChallengeZoneWebView invoke() {
        if (ChallengeFragment.access$getCresData$p(this.this$0).getUiType() == ChallengeResponseData.UiType.HTML) {
            return this.this$0.getChallengeEntryViewFactory().createChallengeEntryWebView(ChallengeFragment.access$getCresData$p(this.this$0));
        }
        return null;
    }
}
