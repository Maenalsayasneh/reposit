package com.stripe.android;

import com.stripe.android.model.StripeModel;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.Stripe$executeAsync$1", f = "Stripe.kt", l = {2043, 2045}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/model/StripeModel;", "T", "Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe$executeAsync$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ l $apiMethod;
    public final /* synthetic */ ApiResultCallback $callback;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Stripe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Stripe$executeAsync$1(Stripe stripe, l lVar, ApiResultCallback apiResultCallback, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripe;
        this.$apiMethod = lVar;
        this.$callback = apiResultCallback;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        Stripe$executeAsync$1 stripe$executeAsync$1 = new Stripe$executeAsync$1(this.this$0, this.$apiMethod, this.$callback, cVar);
        stripe$executeAsync$1.L$0 = obj;
        return stripe$executeAsync$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Stripe$executeAsync$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            l lVar = this.$apiMethod;
            this.label = 1;
            obj = lVar.invoke(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else if (i == 2) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (obj != null) {
            obj2 = (StripeModel) obj;
            Stripe stripe = this.this$0;
            ApiResultCallback apiResultCallback = this.$callback;
            this.label = 2;
            if (stripe.dispatchResult(obj2, apiResultCallback, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return i.a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
