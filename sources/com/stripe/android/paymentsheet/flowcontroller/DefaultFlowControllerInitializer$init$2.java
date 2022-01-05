package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.repositories.PaymentMethodsRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$init$2", f = "DefaultFlowControllerInitializer.kt", l = {38, 45, 50}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowControllerInitializer.kt */
public final class DefaultFlowControllerInitializer$init$2 extends SuspendLambda implements p<f0, m0.l.c<? super FlowControllerInitializer.InitResult>, Object> {
    public final /* synthetic */ ClientSecret $clientSecret;
    public final /* synthetic */ PaymentMethodsRepository $paymentMethodsRepository;
    public final /* synthetic */ PaymentSheet.Configuration $paymentSheetConfiguration;
    public final /* synthetic */ StripeIntentRepository $stripeIntentRepository;
    public int I$0;
    public int label;
    public final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$init$2(DefaultFlowControllerInitializer defaultFlowControllerInitializer, StripeIntentRepository stripeIntentRepository, PaymentMethodsRepository paymentMethodsRepository, PaymentSheet.Configuration configuration, ClientSecret clientSecret, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultFlowControllerInitializer;
        this.$stripeIntentRepository = stripeIntentRepository;
        this.$paymentMethodsRepository = paymentMethodsRepository;
        this.$paymentSheetConfiguration = configuration;
        this.$clientSecret = clientSecret;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultFlowControllerInitializer$init$2(this.this$0, this.$stripeIntentRepository, this.$paymentMethodsRepository, this.$paymentSheetConfiguration, this.$clientSecret, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlowControllerInitializer$init$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r5) goto L_0x0024
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            i0.j.f.p.h.d4(r13)
            goto L_0x00a9
        L_0x0015:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001d:
            int r1 = r12.I$0
            i0.j.f.p.h.d4(r13)
            goto L_0x0092
        L_0x0024:
            i0.j.f.p.h.d4(r13)
            goto L_0x005e
        L_0x0028:
            i0.j.f.p.h.d4(r13)
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r13 = r12.this$0
            com.stripe.android.paymentsheet.repositories.StripeIntentRepository r1 = r12.$stripeIntentRepository
            r13.stripeIntentRepository = r1
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r13 = r12.this$0
            com.stripe.android.paymentsheet.repositories.PaymentMethodsRepository r1 = r12.$paymentMethodsRepository
            r13.paymentMethodsRepository = r1
            com.stripe.android.paymentsheet.model.ClientSecret r13 = r12.$clientSecret
            boolean r13 = r13 instanceof com.stripe.android.paymentsheet.model.PaymentIntentClientSecret
            if (r13 == 0) goto L_0x0074
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r13 = r12.$paymentSheetConfiguration
            if (r13 == 0) goto L_0x006f
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r1 = r12.this$0
            m0.n.a.p r1 = r1.isGooglePayReadySupplier
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration r13 = r13.getGooglePay()
            if (r13 == 0) goto L_0x0054
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration$Environment r13 = r13.getEnvironment()
            goto L_0x0055
        L_0x0054:
            r13 = 0
        L_0x0055:
            r12.label = r5
            java.lang.Object r13 = r1.invoke(r13, r12)
            if (r13 != r0) goto L_0x005e
            return r0
        L_0x005e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            if (r13 == 0) goto L_0x006f
            boolean r13 = r13.booleanValue()
            goto L_0x0070
        L_0x006f:
            r13 = r4
        L_0x0070:
            if (r13 == 0) goto L_0x0074
            r1 = r5
            goto L_0x0075
        L_0x0074:
            r1 = r4
        L_0x0075:
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r13 = r12.$paymentSheetConfiguration
            if (r13 == 0) goto L_0x0097
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r8 = r13.getCustomer()
            if (r8 == 0) goto L_0x0097
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r6 = r12.this$0
            com.stripe.android.paymentsheet.model.ClientSecret r7 = r12.$clientSecret
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r9 = r12.$paymentSheetConfiguration
            r12.I$0 = r1
            r12.label = r3
            r10 = r1
            r11 = r12
            java.lang.Object r13 = r6.createWithCustomer(r7, r8, r9, r10, r11)
            if (r13 != r0) goto L_0x0092
            return r0
        L_0x0092:
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult r13 = (com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult) r13
            if (r13 == 0) goto L_0x0097
            goto L_0x00ab
        L_0x0097:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r13 = r12.this$0
            com.stripe.android.paymentsheet.model.ClientSecret r3 = r12.$clientSecret
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r6 = r12.$paymentSheetConfiguration
            if (r1 == 0) goto L_0x00a0
            r4 = r5
        L_0x00a0:
            r12.label = r2
            java.lang.Object r13 = r13.createWithoutCustomer(r3, r6, r4, r12)
            if (r13 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult r13 = (com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult) r13
        L_0x00ab:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$init$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
