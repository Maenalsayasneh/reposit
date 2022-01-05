package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.Logger;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.repositories.PaymentMethodsApiRepository;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.repositories.PaymentMethodsApiRepository$get$2", f = "PaymentMethodsApiRepository.kt", l = {40}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln0/a/f0;", "", "Lcom/stripe/android/model/PaymentMethod;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsApiRepository.kt */
public final class PaymentMethodsApiRepository$get$2 extends SuspendLambda implements p<f0, m0.l.c<? super List<? extends PaymentMethod>>, Object> {
    public final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    public final /* synthetic */ PaymentMethod.Type $type;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PaymentMethodsApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsApiRepository$get$2(PaymentMethodsApiRepository paymentMethodsApiRepository, PaymentSheet.CustomerConfiguration customerConfiguration, PaymentMethod.Type type, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = paymentMethodsApiRepository;
        this.$customerConfig = customerConfiguration;
        this.$type = type;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        PaymentMethodsApiRepository$get$2 paymentMethodsApiRepository$get$2 = new PaymentMethodsApiRepository$get$2(this.this$0, this.$customerConfig, this.$type, cVar);
        paymentMethodsApiRepository$get$2.L$0 = obj;
        return paymentMethodsApiRepository$get$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsApiRepository$get$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            StripeRepository access$getStripeRepository$p = this.this$0.stripeRepository;
            ListPaymentMethodsParams listPaymentMethodsParams = new ListPaymentMethodsParams(this.$customerConfig.getId(), this.$type, (Integer) null, (String) null, (String) null, 28, (f) null);
            String access$getPublishableKey$p = this.this$0.publishableKey;
            PaymentMethodsApiRepository.Companion unused = PaymentMethodsApiRepository.Companion;
            Set access$getPRODUCT_USAGE$cp = PaymentMethodsApiRepository.PRODUCT_USAGE;
            ApiRequest.Options options = new ApiRequest.Options(this.$customerConfig.getEphemeralKeySecret(), this.this$0.stripeAccountId, (String) null, 4, (f) null);
            this.label = 1;
            obj = access$getStripeRepository$p.getPaymentMethods(listPaymentMethodsParams, access$getPublishableKey$p, access$getPRODUCT_USAGE$cp, options, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (List) obj;
        Throwable a = Result.a(obj2);
        if (a != null) {
            Logger access$getLogger$p = this.this$0.logger;
            StringBuilder P0 = a.P0("Failed to retrieve ");
            P0.append(this.$customerConfig.getId());
            P0.append("'s payment methods.");
            access$getLogger$p.error(P0.toString(), a);
        }
        return obj2 instanceof Result.Failure ? EmptyList.c : obj2;
    }
}
