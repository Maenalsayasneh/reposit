package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$create$isGooglePayReadySupplier$1", f = "FlowControllerFactory.kt", l = {98}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "environment", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FlowControllerFactory.kt */
public final class FlowControllerFactory$create$isGooglePayReadySupplier$1 extends SuspendLambda implements p<PaymentSheet.GooglePayConfiguration.Environment, m0.l.c<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FlowControllerFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowControllerFactory$create$isGooglePayReadySupplier$1(FlowControllerFactory flowControllerFactory, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = flowControllerFactory;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        FlowControllerFactory$create$isGooglePayReadySupplier$1 flowControllerFactory$create$isGooglePayReadySupplier$1 = new FlowControllerFactory$create$isGooglePayReadySupplier$1(this.this$0, cVar);
        flowControllerFactory$create$isGooglePayReadySupplier$1.L$0 = obj;
        return flowControllerFactory$create$isGooglePayReadySupplier$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FlowControllerFactory$create$isGooglePayReadySupplier$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.stripe.android.paymentsheet.DefaultGooglePayRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: com.stripe.android.paymentsheet.GooglePayRepository$Disabled} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: com.stripe.android.paymentsheet.DefaultGooglePayRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.stripe.android.paymentsheet.DefaultGooglePayRepository} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            i0.j.f.p.h.d4(r10)
            goto L_0x003e
        L_0x000d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0015:
            i0.j.f.p.h.d4(r10)
            java.lang.Object r10 = r9.L$0
            r5 = r10
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration$Environment r5 = (com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration.Environment) r5
            if (r5 == 0) goto L_0x002f
            com.stripe.android.paymentsheet.DefaultGooglePayRepository r10 = new com.stripe.android.paymentsheet.DefaultGooglePayRepository
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory r1 = r9.this$0
            android.content.Context r4 = r1.appContext
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0031
        L_0x002f:
            com.stripe.android.paymentsheet.GooglePayRepository$Disabled r10 = com.stripe.android.paymentsheet.GooglePayRepository.Disabled.INSTANCE
        L_0x0031:
            n0.a.g2.d r10 = r10.isReady()
            r9.label = r2
            java.lang.Object r10 = m0.r.t.a.r.m.a1.a.s1(r10, r9)
            if (r10 != r0) goto L_0x003e
            return r0
        L_0x003e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$create$isGooglePayReadySupplier$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
