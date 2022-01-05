package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$dispatchResult$2", f = "DefaultFlowController.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$dispatchResult$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PaymentSheet.FlowController.ConfigCallback $callback;
    public final /* synthetic */ FlowControllerInitializer.InitResult $result;
    public int label;
    public final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$dispatchResult$2(DefaultFlowController defaultFlowController, FlowControllerInitializer.InitResult initResult, PaymentSheet.FlowController.ConfigCallback configCallback, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultFlowController;
        this.$result = initResult;
        this.$callback = configCallback;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultFlowController$dispatchResult$2(this.this$0, this.$result, this.$callback, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlowController$dispatchResult$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            FlowControllerInitializer.InitResult initResult = this.$result;
            if (initResult instanceof FlowControllerInitializer.InitResult.Success) {
                this.this$0.onInitSuccess(((FlowControllerInitializer.InitResult.Success) initResult).getInitData(), this.$callback);
            } else if (initResult instanceof FlowControllerInitializer.InitResult.Failure) {
                this.$callback.onConfigured(false, ((FlowControllerInitializer.InitResult.Failure) initResult).getThrowable());
            }
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
