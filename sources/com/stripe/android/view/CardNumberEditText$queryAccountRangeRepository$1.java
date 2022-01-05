package com.stripe.android.view;

import com.stripe.android.cards.CardNumber;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.view.CardNumberEditText$queryAccountRangeRepository$1", f = "CardNumberEditText.kt", l = {265, 270}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardNumberEditText.kt */
public final class CardNumberEditText$queryAccountRangeRepository$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ CardNumber.Unvalidated $cardNumber;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ CardNumberEditText this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardNumberEditText$queryAccountRangeRepository$1(CardNumberEditText cardNumberEditText, CardNumber.Unvalidated unvalidated, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = cardNumberEditText;
        this.$cardNumber = unvalidated;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new CardNumberEditText$queryAccountRangeRepository$1(this.this$0, this.$cardNumber, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CardNumberEditText$queryAccountRangeRepository$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(T r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            i0.j.f.p.h.d4(r7)
            goto L_0x0068
        L_0x0011:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0019:
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r3 = r6.L$0
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            i0.j.f.p.h.d4(r7)
            goto L_0x004b
        L_0x0025:
            i0.j.f.p.h.d4(r7)
            com.stripe.android.cards.CardNumber$Unvalidated r7 = r6.$cardNumber
            com.stripe.android.cards.Bin r7 = r7.getBin()
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            if (r7 == 0) goto L_0x004e
            com.stripe.android.view.CardNumberEditText r7 = r6.this$0
            com.stripe.android.cards.CardAccountRangeRepository r7 = r7.cardAccountRangeRepository
            com.stripe.android.cards.CardNumber$Unvalidated r5 = r6.$cardNumber
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r7 = r7.getAccountRange(r5, r6)
            if (r7 != r0) goto L_0x004a
            return r0
        L_0x004a:
            r3 = r1
        L_0x004b:
            com.stripe.android.model.AccountRange r7 = (com.stripe.android.model.AccountRange) r7
            goto L_0x0050
        L_0x004e:
            r3 = r1
            r7 = r4
        L_0x0050:
            r1.c = r7
            n0.a.d0 r7 = n0.a.m0.a
            n0.a.l1 r7 = n0.a.h2.o.c
            com.stripe.android.view.CardNumberEditText$queryAccountRangeRepository$1$1 r1 = new com.stripe.android.view.CardNumberEditText$queryAccountRangeRepository$1$1
            r1.<init>(r6, r3, r4)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r2
            java.lang.Object r7 = m0.r.t.a.r.m.a1.a.k4(r7, r1, r6)
            if (r7 != r0) goto L_0x0068
            return r0
        L_0x0068:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardNumberEditText$queryAccountRangeRepository$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
