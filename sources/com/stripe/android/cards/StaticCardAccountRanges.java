package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/cards/StaticCardAccountRanges;", "", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "first", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Lcom/stripe/android/model/AccountRange;", "", "filter", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Ljava/util/List;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StaticCardAccountRanges.kt */
public interface StaticCardAccountRanges {
    List<AccountRange> filter(CardNumber.Unvalidated unvalidated);

    AccountRange first(CardNumber.Unvalidated unvalidated);
}
