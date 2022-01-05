package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import h0.q.v;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.stripe.android.cards.CardWidgetViewModel$getAccountRange$1", f = "CardWidgetViewModel.kt", l = {29, 29}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/q/v;", "Lcom/stripe/android/model/AccountRange;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardWidgetViewModel.kt */
public final class CardWidgetViewModel$getAccountRange$1 extends SuspendLambda implements p<v<AccountRange>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ CardNumber.Unvalidated $cardNumber;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CardWidgetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel$getAccountRange$1(CardWidgetViewModel cardWidgetViewModel, CardNumber.Unvalidated unvalidated, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = cardWidgetViewModel;
        this.$cardNumber = unvalidated;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        CardWidgetViewModel$getAccountRange$1 cardWidgetViewModel$getAccountRange$1 = new CardWidgetViewModel$getAccountRange$1(this.this$0, this.$cardNumber, cVar);
        cardWidgetViewModel$getAccountRange$1.L$0 = obj;
        return cardWidgetViewModel$getAccountRange$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CardWidgetViewModel$getAccountRange$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: h0.q.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            i0.j.f.p.h.d4(r6)
            goto L_0x0047
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            java.lang.Object r1 = r5.L$0
            h0.q.v r1 = (h0.q.v) r1
            i0.j.f.p.h.d4(r6)
            goto L_0x003b
        L_0x0020:
            i0.j.f.p.h.d4(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            h0.q.v r1 = (h0.q.v) r1
            com.stripe.android.cards.CardWidgetViewModel r6 = r5.this$0
            com.stripe.android.cards.CardAccountRangeRepository r6 = r6.getCardAccountRangeRepository()
            com.stripe.android.cards.CardNumber$Unvalidated r4 = r5.$cardNumber
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.getAccountRange(r4, r5)
            if (r6 != r0) goto L_0x003b
            return r0
        L_0x003b:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L_0x0047
            return r0
        L_0x0047:
            m0.i r6 = m0.i.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.cards.CardWidgetViewModel$getAccountRange$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
