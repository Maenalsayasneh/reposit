package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default", f = "ChallengeActionHandler.kt", l = {79, 82}, m = "executeChallengeRequest")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lm0/l/c;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "continuation", "", "executeChallengeRequest", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActionHandler.kt */
public final class ChallengeActionHandler$Default$executeChallengeRequest$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActionHandler$Default$executeChallengeRequest$1(ChallengeActionHandler.Default defaultR, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultR;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.executeChallengeRequest((ChallengeRequestData) null, this);
    }
}
