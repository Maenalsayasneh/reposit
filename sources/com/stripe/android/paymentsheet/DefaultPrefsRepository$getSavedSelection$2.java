package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.SavedSelection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.DefaultPrefsRepository$getSavedSelection$2", f = "DefaultPrefsRepository.kt", l = {25}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultPrefsRepository.kt */
public final class DefaultPrefsRepository$getSavedSelection$2 extends SuspendLambda implements p<f0, m0.l.c<? super SavedSelection>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ DefaultPrefsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultPrefsRepository$getSavedSelection$2(DefaultPrefsRepository defaultPrefsRepository, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultPrefsRepository;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultPrefsRepository$getSavedSelection$2(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultPrefsRepository$getSavedSelection$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (java.lang.Boolean.valueOf(((java.lang.Boolean) r7).booleanValue()).booleanValue() == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r0 = r6.L$0
            com.stripe.android.paymentsheet.model.SavedSelection$GooglePay r0 = (com.stripe.android.paymentsheet.model.SavedSelection.GooglePay) r0
            i0.j.f.p.h.d4(r7)
            goto L_0x008b
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001b:
            i0.j.f.p.h.d4(r7)
            com.stripe.android.paymentsheet.DefaultPrefsRepository r7 = r6.this$0
            android.content.SharedPreferences r7 = r7.getPrefs()
            com.stripe.android.paymentsheet.DefaultPrefsRepository r1 = r6.this$0
            java.lang.String r1 = r1.getKey()
            java.lang.String r7 = r7.getString(r1, r3)
            if (r7 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            java.lang.String r7 = ""
        L_0x0033:
            java.lang.String r1 = ":"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r4 = 6
            r5 = 0
            java.util.List r7 = kotlin.text.StringsKt__IndentKt.E(r7, r1, r5, r5, r4)
            java.lang.Object r1 = m0.j.g.w(r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0048
            goto L_0x009c
        L_0x0048:
            int r4 = r1.hashCode()
            r5 = -1534821982(0xffffffffa48479a2, float:-5.745193E-17)
            if (r4 == r5) goto L_0x006e
            r0 = -1029412550(0xffffffffc2a4693a, float:-82.20552)
            if (r4 == r0) goto L_0x0057
            goto L_0x009c
        L_0x0057:
            java.lang.String r0 = "payment_method"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
            java.lang.Object r7 = m0.j.g.z(r7, r2)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x009c
            com.stripe.android.paymentsheet.model.SavedSelection$PaymentMethod r0 = new com.stripe.android.paymentsheet.model.SavedSelection$PaymentMethod
            r0.<init>(r7)
        L_0x006c:
            r3 = r0
            goto L_0x009c
        L_0x006e:
            java.lang.String r7 = "google_pay"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x009c
            com.stripe.android.paymentsheet.model.SavedSelection$GooglePay r7 = com.stripe.android.paymentsheet.model.SavedSelection.GooglePay.INSTANCE
            com.stripe.android.paymentsheet.DefaultPrefsRepository r1 = r6.this$0
            m0.n.a.l r1 = r1.isGooglePayReady
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r1 = r1.invoke(r6)
            if (r1 != r0) goto L_0x0089
            return r0
        L_0x0089:
            r0 = r7
            r7 = r1
        L_0x008b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x009c
            goto L_0x006c
        L_0x009c:
            if (r3 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            com.stripe.android.paymentsheet.model.SavedSelection$None r3 = com.stripe.android.paymentsheet.model.SavedSelection.None.INSTANCE
        L_0x00a1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.DefaultPrefsRepository$getSavedSelection$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
