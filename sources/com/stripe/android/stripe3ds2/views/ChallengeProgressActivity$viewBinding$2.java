package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.databinding.StripeProgressViewLayoutBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/databinding/StripeProgressViewLayoutBinding;", "invoke", "()Lcom/stripe/android/stripe3ds2/databinding/StripeProgressViewLayoutBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeProgressActivity.kt */
public final class ChallengeProgressActivity$viewBinding$2 extends Lambda implements a<StripeProgressViewLayoutBinding> {
    public final /* synthetic */ ChallengeProgressActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeProgressActivity$viewBinding$2(ChallengeProgressActivity challengeProgressActivity) {
        super(0);
        this.this$0 = challengeProgressActivity;
    }

    public final StripeProgressViewLayoutBinding invoke() {
        StripeProgressViewLayoutBinding inflate = StripeProgressViewLayoutBinding.inflate(this.this$0.getLayoutInflater());
        i.d(inflate, "StripeProgressViewLayout…g.inflate(layoutInflater)");
        return inflate;
    }
}
