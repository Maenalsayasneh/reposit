package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import h0.q.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1", f = "PaymentFlowViewModel.kt", l = {71, 89}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh0/q/v;", "Lkotlin/Result;", "", "Lcom/stripe/android/model/ShippingMethod;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowViewModel.kt */
public final class PaymentFlowViewModel$validateShippingInformation$1 extends SuspendLambda implements p<v<Result<? extends List<? extends ShippingMethod>>>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PaymentSessionConfig.ShippingInformationValidator $shippingInfoValidator;
    public final /* synthetic */ ShippingInformation $shippingInformation;
    public final /* synthetic */ PaymentSessionConfig.ShippingMethodsFactory $shippingMethodsFactory;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PaymentFlowViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewModel$validateShippingInformation$1(PaymentFlowViewModel paymentFlowViewModel, PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, ShippingInformation shippingInformation, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = paymentFlowViewModel;
        this.$shippingInfoValidator = shippingInformationValidator;
        this.$shippingInformation = shippingInformation;
        this.$shippingMethodsFactory = shippingMethodsFactory;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        PaymentFlowViewModel$validateShippingInformation$1 paymentFlowViewModel$validateShippingInformation$1 = new PaymentFlowViewModel$validateShippingInformation$1(this.this$0, this.$shippingInfoValidator, this.$shippingInformation, this.$shippingMethodsFactory, cVar);
        paymentFlowViewModel$validateShippingInformation$1.L$0 = obj;
        return paymentFlowViewModel$validateShippingInformation$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentFlowViewModel$validateShippingInformation$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: h0.q.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r4) goto L_0x0019
            if (r1 != r3) goto L_0x0011
            i0.j.f.p.h.d4(r8)
            goto L_0x0062
        L_0x0011:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0019:
            java.lang.Object r1 = r7.L$0
            h0.q.v r1 = (h0.q.v) r1
            i0.j.f.p.h.d4(r8)
            goto L_0x003f
        L_0x0021:
            i0.j.f.p.h.d4(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            h0.q.v r1 = (h0.q.v) r1
            com.stripe.android.view.PaymentFlowViewModel r8 = r7.this$0
            m0.l.e r8 = r8.workContext
            com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1$result$1 r5 = new com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1$result$1
            r5.<init>(r7, r2)
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = m0.r.t.a.r.m.a1.a.k4(r8, r5, r7)
            if (r8 != r0) goto L_0x003f
            return r0
        L_0x003f:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.c
            com.stripe.android.view.PaymentFlowViewModel r4 = r7.this$0
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.c
            boolean r6 = r8 instanceof kotlin.Result.Failure
            if (r6 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r5 = r8
        L_0x004d:
            java.util.List r5 = (java.util.List) r5
            r4.setShippingMethods$payments_core_release(r5)
            kotlin.Result r4 = new kotlin.Result
            r4.<init>(r8)
            r7.L$0 = r2
            r7.label = r3
            java.lang.Object r8 = r1.emit(r4, r7)
            if (r8 != r0) goto L_0x0062
            return r0
        L_0x0062:
            m0.i r8 = m0.i.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
