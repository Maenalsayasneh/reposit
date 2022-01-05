package com.stripe.android;

import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1", f = "CustomerSession.kt", l = {60}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CustomerSession.kt */
public final class CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ EphemeralKey $ephemeralKey;
    public final /* synthetic */ EphemeralOperation $operation;
    public int label;
    public final /* synthetic */ CustomerSession$ephemeralKeyManager$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1(CustomerSession$ephemeralKeyManager$1 customerSession$ephemeralKeyManager$1, EphemeralKey ephemeralKey, EphemeralOperation ephemeralOperation, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = customerSession$ephemeralKeyManager$1;
        this.$ephemeralKey = ephemeralKey;
        this.$operation = ephemeralOperation;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1(this.this$0, this.$ephemeralKey, this.$operation, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            CustomerSessionOperationExecutor access$getOperationExecutor$p = this.this$0.this$0.operationExecutor;
            EphemeralKey ephemeralKey = this.$ephemeralKey;
            EphemeralOperation ephemeralOperation = this.$operation;
            this.label = 1;
            if (access$getOperationExecutor$p.execute$payments_core_release(ephemeralKey, ephemeralOperation, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
