package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "it", "", "invoke", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeZoneSelectView.kt */
public final class ChallengeZoneSelectView$userEntry$1 extends Lambda implements l<ChallengeResponseData.ChallengeSelectOption, CharSequence> {
    public static final ChallengeZoneSelectView$userEntry$1 INSTANCE = new ChallengeZoneSelectView$userEntry$1();

    public ChallengeZoneSelectView$userEntry$1() {
        super(1);
    }

    public final CharSequence invoke(ChallengeResponseData.ChallengeSelectOption challengeSelectOption) {
        i.e(challengeSelectOption, "it");
        return challengeSelectOption.getName();
    }
}
