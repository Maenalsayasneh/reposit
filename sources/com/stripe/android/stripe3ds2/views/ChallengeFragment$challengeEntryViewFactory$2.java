package com.stripe.android.stripe3ds2.views;

import h0.o.a.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "invoke", "()Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeFragment.kt */
public final class ChallengeFragment$challengeEntryViewFactory$2 extends Lambda implements a<ChallengeEntryViewFactory> {
    public final /* synthetic */ ChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$challengeEntryViewFactory$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    public final ChallengeEntryViewFactory invoke() {
        k requireActivity = this.this$0.requireActivity();
        i.d(requireActivity, "requireActivity()");
        return new ChallengeEntryViewFactory(requireActivity);
    }
}
