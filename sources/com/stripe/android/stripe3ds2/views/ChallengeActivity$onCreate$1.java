package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "kotlin.jvm.PlatformType", "challengeAction", "Lm0/i;", "onChanged", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$onCreate$1<T> implements z<ChallengeAction> {
    public final /* synthetic */ ChallengeActivity this$0;

    public ChallengeActivity$onCreate$1(ChallengeActivity challengeActivity) {
        this.this$0 = challengeActivity;
    }

    public final void onChanged(ChallengeAction challengeAction) {
        if (!this.this$0.isFinishing()) {
            this.this$0.dismissKeyboard();
            ChallengeActivity challengeActivity = this.this$0;
            Dialog create = challengeActivity.getProgressDialogFactory().create();
            create.show();
            challengeActivity.progressDialog = create;
            ChallengeActivityViewModel viewModel$3ds2sdk_release = this.this$0.getViewModel$3ds2sdk_release();
            i.d(challengeAction, "challengeAction");
            viewModel$3ds2sdk_release.submit(challengeAction);
        }
    }
}
