package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import kotlin.Metadata;
import m0.l.c;
import n0.a.g2.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\fJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeRepository;", "", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lm0/l/c;)Ljava/lang/Object;", "Ln0/a/g2/d;", "", "getLoading", "()Ln0/a/g2/d;", "loading", "Factory", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardAccountRangeRepository.kt */
public interface CardAccountRangeRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "create", "()Lcom/stripe/android/cards/CardAccountRangeRepository;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardAccountRangeRepository.kt */
    public interface Factory {
        CardAccountRangeRepository create();
    }

    Object getAccountRange(CardNumber.Unvalidated unvalidated, c<? super AccountRange> cVar);

    d<Boolean> getLoading();
}
