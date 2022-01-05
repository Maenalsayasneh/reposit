package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.Fragment;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "invoke", "()Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$fragment$2 extends Lambda implements a<ChallengeFragment> {
    public final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$fragment$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    public final ChallengeFragment invoke() {
        Fragment I = this.this$0.getSupportFragmentManager().I(this.this$0.getFragmentContainerId());
        Objects.requireNonNull(I, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.views.ChallengeFragment");
        return (ChallengeFragment) I;
    }
}
