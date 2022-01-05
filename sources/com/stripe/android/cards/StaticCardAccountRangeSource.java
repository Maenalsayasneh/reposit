package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import kotlin.Metadata;
import m0.l.c;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.g2.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/cards/StaticCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "accountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "Ln0/a/g2/d;", "", "loading", "Ln0/a/g2/d;", "getLoading", "()Ln0/a/g2/d;", "<init>", "(Lcom/stripe/android/cards/StaticCardAccountRanges;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StaticCardAccountRangeSource.kt */
public final class StaticCardAccountRangeSource implements CardAccountRangeSource {
    private final StaticCardAccountRanges accountRanges;
    private final d<Boolean> loading;

    public StaticCardAccountRangeSource() {
        this((StaticCardAccountRanges) null, 1, (f) null);
    }

    public StaticCardAccountRangeSource(StaticCardAccountRanges staticCardAccountRanges) {
        i.e(staticCardAccountRanges, "accountRanges");
        this.accountRanges = staticCardAccountRanges;
        this.loading = new n0.a.g2.f(Boolean.FALSE);
    }

    public Object getAccountRange(CardNumber.Unvalidated unvalidated, c<? super AccountRange> cVar) {
        return this.accountRanges.first(unvalidated);
    }

    public d<Boolean> getLoading() {
        return this.loading;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StaticCardAccountRangeSource(StaticCardAccountRanges staticCardAccountRanges, int i, f fVar) {
        this((i & 1) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges);
    }
}
