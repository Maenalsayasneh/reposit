package com.stripe.android.cards;

import com.stripe.android.cards.CardAccountRangeRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeRepository;", "invoke", "()Lcom/stripe/android/cards/CardAccountRangeRepository;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardWidgetViewModel.kt */
public final class CardWidgetViewModel$cardAccountRangeRepository$2 extends Lambda implements a<CardAccountRangeRepository> {
    public final /* synthetic */ CardAccountRangeRepository.Factory $cardAccountRangeRepositoryFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel$cardAccountRangeRepository$2(CardAccountRangeRepository.Factory factory) {
        super(0);
        this.$cardAccountRangeRepositoryFactory = factory;
    }

    public final CardAccountRangeRepository invoke() {
        return this.$cardAccountRangeRepositoryFactory.create();
    }
}
