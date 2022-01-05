package com.stripe.android.stripe3ds2.views;

import android.content.Intent;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "invoke", "()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$viewArgs$2 extends Lambda implements a<ChallengeViewArgs> {
    public final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$viewArgs$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    public final ChallengeViewArgs invoke() {
        ChallengeViewArgs.Companion companion = ChallengeViewArgs.Companion;
        Intent intent = this.this$0.getIntent();
        i.d(intent, "intent");
        return companion.create(intent.getExtras());
    }
}
