package com.stripe.android.googlepay;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import h0.q.v;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.e;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.stripe.android.googlepay.StripeGooglePayViewModel$createPaymentMethod$1", f = "StripeGooglePayViewModel.kt", l = {75}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh0/q/v;", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeGooglePayViewModel.kt */
public final class StripeGooglePayViewModel$createPaymentMethod$1 extends SuspendLambda implements p<v<Result<? extends PaymentMethod>>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PaymentMethodCreateParams $params;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StripeGooglePayViewModel this$0;

    @c(c = "com.stripe.android.googlepay.StripeGooglePayViewModel$createPaymentMethod$1$1", f = "StripeGooglePayViewModel.kt", l = {81, 77}, m = "invokeSuspend")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.stripe.android.googlepay.StripeGooglePayViewModel$createPaymentMethod$1$1  reason: invalid class name */
    /* compiled from: StripeGooglePayViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ StripeGooglePayViewModel$createPaymentMethod$1 this$0;

        {
            this.this$0 = r1;
        }

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.this$0, vVar, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            v vVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                h.d4(obj);
                f0 f0Var = (f0) this.L$0;
                vVar = vVar;
                StripeRepository access$getStripeRepository$p = this.this$0.this$0.stripeRepository;
                PaymentMethodCreateParams paymentMethodCreateParams = this.this$0.$params;
                ApiRequest.Options options = new ApiRequest.Options(this.this$0.this$0.publishableKey, this.this$0.this$0.stripeAccountId, (String) null, 4, (f) null);
                this.L$0 = vVar;
                this.label = 1;
                obj = access$getStripeRepository$p.createPaymentMethod(paymentMethodCreateParams, options, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                vVar = (v) this.L$0;
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
                obj2 = (PaymentMethod) obj;
                Result result = new Result(obj2);
                this.L$0 = null;
                this.label = 2;
                if (vVar.emit(result, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return i.a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeGooglePayViewModel$createPaymentMethod$1(StripeGooglePayViewModel stripeGooglePayViewModel, PaymentMethodCreateParams paymentMethodCreateParams, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripeGooglePayViewModel;
        this.$params = paymentMethodCreateParams;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        StripeGooglePayViewModel$createPaymentMethod$1 stripeGooglePayViewModel$createPaymentMethod$1 = new StripeGooglePayViewModel$createPaymentMethod$1(this.this$0, this.$params, cVar);
        stripeGooglePayViewModel$createPaymentMethod$1.L$0 = obj;
        return stripeGooglePayViewModel$createPaymentMethod$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripeGooglePayViewModel$createPaymentMethod$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            final v vVar = (v) this.L$0;
            e access$getWorkContext$p = this.this$0.workContext;
            AnonymousClass1 r3 = new AnonymousClass1(this, (m0.l.c) null);
            this.label = 1;
            if (a.k4(access$getWorkContext$p, r3, this) == coroutineSingletons) {
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
