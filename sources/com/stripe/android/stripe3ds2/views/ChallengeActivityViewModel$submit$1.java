package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$submit$1", f = "ChallengeActivityViewModel.kt", l = {80}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivityViewModel.kt */
public final class ChallengeActivityViewModel$submit$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ChallengeAction $action;
    public Object L$0;
    public int label;
    public final /* synthetic */ ChallengeActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel$submit$1(ChallengeActivityViewModel challengeActivityViewModel, ChallengeAction challengeAction, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = challengeActivityViewModel;
        this.$action = challengeAction;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new ChallengeActivityViewModel$submit$1(this.this$0, this.$action, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeActivityViewModel$submit$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        ChallengeActivityViewModel.OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            ChallengeActivityViewModel.OnInactiveAwareMutableLiveData access$get_challengeRequestResult$p = this.this$0._challengeRequestResult;
            ChallengeActionHandler access$getChallengeActionHandler$p = this.this$0.challengeActionHandler;
            ChallengeAction challengeAction = this.$action;
            this.L$0 = access$get_challengeRequestResult$p;
            this.label = 1;
            Object submit = access$getChallengeActionHandler$p.submit(challengeAction, this);
            if (submit == coroutineSingletons) {
                return coroutineSingletons;
            }
            onInactiveAwareMutableLiveData = access$get_challengeRequestResult$p;
            obj = submit;
        } else if (i == 1) {
            onInactiveAwareMutableLiveData = (ChallengeActivityViewModel.OnInactiveAwareMutableLiveData) this.L$0;
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        onInactiveAwareMutableLiveData.postValue(obj);
        return i.a;
    }
}
