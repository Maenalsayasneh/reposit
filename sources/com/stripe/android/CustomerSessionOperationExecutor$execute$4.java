package com.stripe.android;

import com.stripe.android.CustomerSession;
import com.stripe.android.model.Source;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.CustomerSessionOperationExecutor$execute$4", f = "CustomerSessionOperationExecutor.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CustomerSessionOperationExecutor.kt */
public final class CustomerSessionOperationExecutor$execute$4 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ EphemeralOperation $operation;
    public final /* synthetic */ Ref$ObjectRef $result;
    public int label;
    public final /* synthetic */ CustomerSessionOperationExecutor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomerSessionOperationExecutor$execute$4(CustomerSessionOperationExecutor customerSessionOperationExecutor, EphemeralOperation ephemeralOperation, Ref$ObjectRef ref$ObjectRef, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = customerSessionOperationExecutor;
        this.$operation = ephemeralOperation;
        this.$result = ref$ObjectRef;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new CustomerSessionOperationExecutor$execute$4(this.this$0, this.$operation, this.$result, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CustomerSessionOperationExecutor$execute$4) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            CustomerSession.SourceRetrievalListener sourceRetrievalListener = (CustomerSession.SourceRetrievalListener) this.this$0.getListener(this.$operation.getId$payments_core_release());
            T t = this.$result.c;
            Throwable a = Result.a(t);
            if (a == null) {
                Source source = (Source) t;
                if (sourceRetrievalListener == null) {
                    return null;
                }
                sourceRetrievalListener.onSourceRetrieved(source);
                return i.a;
            }
            this.this$0.onError(sourceRetrievalListener, a);
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
