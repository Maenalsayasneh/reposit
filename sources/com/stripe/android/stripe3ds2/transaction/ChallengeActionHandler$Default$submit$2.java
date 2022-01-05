package com.stripe.android.stripe3ds2.transaction;

import androidx.core.app.FrameMetricsAggregator;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import i0.j.f.p.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$submit$2", f = "ChallengeActionHandler.kt", l = {73}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActionHandler.kt */
public final class ChallengeActionHandler$Default$submit$2 extends SuspendLambda implements p<f0, m0.l.c<? super ChallengeRequestResult>, Object> {
    public final /* synthetic */ ChallengeAction $action;
    public int label;
    public final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActionHandler$Default$submit$2(ChallengeActionHandler.Default defaultR, ChallengeAction challengeAction, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultR;
        this.$action = challengeAction;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new ChallengeActionHandler$Default$submit$2(this.this$0, this.$action, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeActionHandler$Default$submit$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        ChallengeRequestData challengeRequestData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            ChallengeRequestData challengeRequestData2 = new ChallengeRequestData(this.this$0.creqData.getMessageVersion(), this.this$0.creqData.getThreeDsServerTransId(), this.this$0.creqData.getAcsTransId(), this.this$0.creqData.getSdkTransId(), (String) null, (ChallengeRequestData.CancelReason) null, (String) null, this.this$0.creqData.getMessageExtensions(), (Boolean) null, (Boolean) null, 880, (f) null);
            ChallengeAction challengeAction = this.$action;
            if (challengeAction instanceof ChallengeAction.NativeForm) {
                challengeRequestData = ChallengeRequestData.copy$default(challengeRequestData2, (String) null, (String) null, (String) null, (SdkTransactionId) null, ((ChallengeAction.NativeForm) challengeAction).getUserEntry$3ds2sdk_release(), (ChallengeRequestData.CancelReason) null, (String) null, (List) null, (Boolean) null, (Boolean) null, 1007, (Object) null);
            } else if (challengeAction instanceof ChallengeAction.HtmlForm) {
                challengeRequestData = ChallengeRequestData.copy$default(challengeRequestData2, (String) null, (String) null, (String) null, (SdkTransactionId) null, (String) null, (ChallengeRequestData.CancelReason) null, ((ChallengeAction.HtmlForm) challengeAction).getUserEntry$3ds2sdk_release(), (List) null, (Boolean) null, (Boolean) null, 959, (Object) null);
            } else if (challengeAction instanceof ChallengeAction.Oob) {
                challengeRequestData = ChallengeRequestData.copy$default(challengeRequestData2, (String) null, (String) null, (String) null, (SdkTransactionId) null, (String) null, (ChallengeRequestData.CancelReason) null, (String) null, (List) null, Boolean.TRUE, (Boolean) null, 767, (Object) null);
            } else if (challengeAction instanceof ChallengeAction.Resend) {
                challengeRequestData = ChallengeRequestData.copy$default(challengeRequestData2, (String) null, (String) null, (String) null, (SdkTransactionId) null, (String) null, (ChallengeRequestData.CancelReason) null, (String) null, (List) null, (Boolean) null, Boolean.TRUE, FrameMetricsAggregator.EVERY_DURATION, (Object) null);
            } else if (challengeAction instanceof ChallengeAction.Cancel) {
                challengeRequestData = ChallengeRequestData.copy$default(challengeRequestData2, (String) null, (String) null, (String) null, (SdkTransactionId) null, (String) null, ChallengeRequestData.CancelReason.UserSelected, (String) null, (List) null, (Boolean) null, (Boolean) null, 991, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ChallengeActionHandler.Default defaultR = this.this$0;
            this.label = 1;
            Object executeChallengeRequest = defaultR.executeChallengeRequest(challengeRequestData, this);
            return executeChallengeRequest == coroutineSingletons ? coroutineSingletons : executeChallengeRequest;
        } else if (i == 1) {
            h.d4(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
