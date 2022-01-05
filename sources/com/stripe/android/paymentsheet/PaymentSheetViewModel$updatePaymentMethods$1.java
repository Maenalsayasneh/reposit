package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$updatePaymentMethods$1", f = "PaymentSheetViewModel.kt", l = {158}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewModel.kt */
public final class PaymentSheetViewModel$updatePaymentMethods$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$updatePaymentMethods$1(PaymentSheetViewModel paymentSheetViewModel, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = paymentSheetViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PaymentSheetViewModel$updatePaymentMethods$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentSheetViewModel$updatePaymentMethods$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r0 = r6.L$0
            h0.q.y r0 = (h0.q.y) r0
            i0.j.f.p.h.d4(r7)
            goto L_0x003f
        L_0x0011:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0019:
            i0.j.f.p.h.d4(r7)
            com.stripe.android.paymentsheet.PaymentSheetViewModel r7 = r6.this$0
            h0.q.y r7 = r7.get_paymentMethods()
            com.stripe.android.paymentsheet.PaymentSheetViewModel r1 = r6.this$0
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r1 = r1.getCustomerConfig$payments_core_release()
            if (r1 == 0) goto L_0x0042
            com.stripe.android.paymentsheet.PaymentSheetViewModel r3 = r6.this$0
            com.stripe.android.paymentsheet.repositories.PaymentMethodsRepository r3 = r3.paymentMethodsRepository
            com.stripe.android.model.PaymentMethod$Type r4 = com.stripe.android.model.PaymentMethod.Type.Card
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r1 = r3.get(r1, r4, r6)
            if (r1 != r0) goto L_0x003d
            return r0
        L_0x003d:
            r0 = r7
            r7 = r1
        L_0x003f:
            java.util.List r7 = (java.util.List) r7
            goto L_0x0046
        L_0x0042:
            r0 = 0
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0046:
            if (r7 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.c
        L_0x004b:
            r0.setValue(r7)
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetViewModel$updatePaymentMethods$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
