package com.stripe.android.cards;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import g0.a.b.b.a;
import h0.q.b;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.l.e;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/cards/CardWidgetViewModel;", "Lh0/q/b;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository$delegate", "Lm0/c;", "getCardAccountRangeRepository", "()Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository", "Landroid/app/Application;", "application", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "cardAccountRangeRepositoryFactory", "<init>", "(Landroid/app/Application;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;)V", "(Landroid/app/Application;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardWidgetViewModel.kt */
public final class CardWidgetViewModel extends b {
    private final c cardAccountRangeRepository$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel(Application application, CardAccountRangeRepository.Factory factory) {
        super(application);
        i.e(application, "application");
        i.e(factory, "cardAccountRangeRepositoryFactory");
        this.cardAccountRangeRepository$delegate = h.H2(new CardWidgetViewModel$cardAccountRangeRepository$2(factory));
    }

    /* access modifiers changed from: private */
    public final CardAccountRangeRepository getCardAccountRangeRepository() {
        return (CardAccountRangeRepository) this.cardAccountRangeRepository$delegate.getValue();
    }

    public final LiveData<AccountRange> getAccountRange(CardNumber.Unvalidated unvalidated) {
        i.e(unvalidated, "cardNumber");
        return a.a0((e) null, 0, new CardWidgetViewModel$getAccountRange$1(this, unvalidated, (m0.l.c) null), 3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel(Application application) {
        this(application, new DefaultCardAccountRangeRepositoryFactory(application));
        i.e(application, "application");
    }
}
