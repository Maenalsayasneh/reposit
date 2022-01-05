package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.views.ChallengeSubmitDialogFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "invoke", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeSubmitDialogFactory.kt */
public final class ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2 extends Lambda implements a<StripeChallengeSubmitDialogBinding> {
    public final /* synthetic */ ChallengeSubmitDialogFactory.ChallengeSubmitDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2(ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog) {
        super(0);
        this.this$0 = challengeSubmitDialog;
    }

    public final StripeChallengeSubmitDialogBinding invoke() {
        StripeChallengeSubmitDialogBinding inflate = StripeChallengeSubmitDialogBinding.inflate(this.this$0.getLayoutInflater());
        i.d(inflate, "StripeChallengeSubmitDia…g.inflate(layoutInflater)");
        return inflate;
    }
}
