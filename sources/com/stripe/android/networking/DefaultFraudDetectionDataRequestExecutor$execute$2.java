package com.stripe.android.networking;

import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.networking.DefaultFraudDetectionDataRequestExecutor$execute$2", f = "FraudDetectionDataRequestExecutor.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/networking/FraudDetectionData;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRequestExecutor.kt */
public final class DefaultFraudDetectionDataRequestExecutor$execute$2 extends SuspendLambda implements p<f0, m0.l.c<? super FraudDetectionData>, Object> {
    public final /* synthetic */ FraudDetectionDataRequest $request;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DefaultFraudDetectionDataRequestExecutor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRequestExecutor$execute$2(DefaultFraudDetectionDataRequestExecutor defaultFraudDetectionDataRequestExecutor, FraudDetectionDataRequest fraudDetectionDataRequest, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultFraudDetectionDataRequestExecutor;
        this.$request = fraudDetectionDataRequest;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        DefaultFraudDetectionDataRequestExecutor$execute$2 defaultFraudDetectionDataRequestExecutor$execute$2 = new DefaultFraudDetectionDataRequestExecutor$execute$2(this.this$0, this.$request, cVar);
        defaultFraudDetectionDataRequestExecutor$execute$2.L$0 = obj;
        return defaultFraudDetectionDataRequestExecutor$execute$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFraudDetectionDataRequestExecutor$execute$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            try {
                obj2 = this.this$0.executeInternal(this.$request);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
            if (obj2 instanceof Result.Failure) {
                return null;
            }
            return obj2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
