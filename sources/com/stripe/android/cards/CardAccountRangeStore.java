package com.stripe.android.cards;

import com.stripe.android.model.AccountRange;
import java.util.List;
import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeStore;", "", "Lcom/stripe/android/cards/Bin;", "bin", "", "Lcom/stripe/android/model/AccountRange;", "get", "(Lcom/stripe/android/cards/Bin;Lm0/l/c;)Ljava/lang/Object;", "accountRanges", "Lm0/i;", "save", "(Lcom/stripe/android/cards/Bin;Ljava/util/List;)V", "", "contains", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardAccountRangeStore.kt */
public interface CardAccountRangeStore {
    Object contains(Bin bin, c<? super Boolean> cVar);

    Object get(Bin bin, c<? super List<AccountRange>> cVar);

    void save(Bin bin, List<AccountRange> list);
}
