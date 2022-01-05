package com.stripe.android;

import com.stripe.android.exception.StripeException;
import com.stripe.android.model.StripeModel;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.Stripe$dispatchResult$2", f = "Stripe.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/model/StripeModel;", "T", "Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe$dispatchResult$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ApiResultCallback $callback;
    public final /* synthetic */ Object $result;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Stripe$dispatchResult$2(Object obj, ApiResultCallback apiResultCallback, m0.l.c cVar) {
        super(2, cVar);
        this.$result = obj;
        this.$callback = apiResultCallback;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Stripe$dispatchResult$2(this.$result, this.$callback, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Stripe$dispatchResult$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            Object obj2 = this.$result;
            Throwable a = Result.a(obj2);
            if (a == null) {
                this.$callback.onSuccess((StripeModel) obj2);
            } else {
                this.$callback.onError(StripeException.Companion.create(a));
            }
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
