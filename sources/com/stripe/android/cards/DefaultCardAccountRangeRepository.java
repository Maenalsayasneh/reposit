package com.stripe.android.cards;

import java.util.Objects;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.i;
import n0.a.g2.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "staticSource", "Lcom/stripe/android/cards/CardAccountRangeSource;", "remoteSource", "Ln0/a/g2/d;", "", "loading", "Ln0/a/g2/d;", "getLoading", "()Ln0/a/g2/d;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "store", "Lcom/stripe/android/cards/CardAccountRangeStore;", "inMemorySource", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeStore;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultCardAccountRangeRepository.kt */
public final class DefaultCardAccountRangeRepository implements CardAccountRangeRepository {
    private final CardAccountRangeSource inMemorySource;
    private final d<Boolean> loading;
    private final CardAccountRangeSource remoteSource;
    private final CardAccountRangeSource staticSource;
    private final CardAccountRangeStore store;

    public DefaultCardAccountRangeRepository(CardAccountRangeSource cardAccountRangeSource, CardAccountRangeSource cardAccountRangeSource2, CardAccountRangeSource cardAccountRangeSource3, CardAccountRangeStore cardAccountRangeStore) {
        i.e(cardAccountRangeSource, "inMemorySource");
        i.e(cardAccountRangeSource2, "remoteSource");
        i.e(cardAccountRangeSource3, "staticSource");
        i.e(cardAccountRangeStore, "store");
        this.inMemorySource = cardAccountRangeSource;
        this.remoteSource = cardAccountRangeSource2;
        this.staticSource = cardAccountRangeSource3;
        this.store = cardAccountRangeStore;
        Object[] array = g.v0(g.K(cardAccountRangeSource.getLoading(), cardAccountRangeSource2.getLoading(), cardAccountRangeSource3.getLoading())).toArray(new d[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.loading = new DefaultCardAccountRangeRepository$$special$$inlined$combine$1((d[]) array);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAccountRange(com.stripe.android.cards.CardNumber.Unvalidated r9, m0.l.c<? super com.stripe.android.model.AccountRange> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1 r0 = (com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1 r0 = new com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005e
            if (r2 == r6) goto L_0x0052
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            i0.j.f.p.h.d4(r10)
            goto L_0x00b4
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            java.lang.Object r9 = r0.L$1
            com.stripe.android.cards.CardNumber$Unvalidated r9 = (com.stripe.android.cards.CardNumber.Unvalidated) r9
            java.lang.Object r2 = r0.L$0
            com.stripe.android.cards.DefaultCardAccountRangeRepository r2 = (com.stripe.android.cards.DefaultCardAccountRangeRepository) r2
            i0.j.f.p.h.d4(r10)
            goto L_0x00a0
        L_0x0046:
            java.lang.Object r9 = r0.L$1
            com.stripe.android.cards.CardNumber$Unvalidated r9 = (com.stripe.android.cards.CardNumber.Unvalidated) r9
            java.lang.Object r2 = r0.L$0
            com.stripe.android.cards.DefaultCardAccountRangeRepository r2 = (com.stripe.android.cards.DefaultCardAccountRangeRepository) r2
            i0.j.f.p.h.d4(r10)
            goto L_0x008e
        L_0x0052:
            java.lang.Object r9 = r0.L$1
            com.stripe.android.cards.CardNumber$Unvalidated r9 = (com.stripe.android.cards.CardNumber.Unvalidated) r9
            java.lang.Object r2 = r0.L$0
            com.stripe.android.cards.DefaultCardAccountRangeRepository r2 = (com.stripe.android.cards.DefaultCardAccountRangeRepository) r2
            i0.j.f.p.h.d4(r10)
            goto L_0x0077
        L_0x005e:
            i0.j.f.p.h.d4(r10)
            com.stripe.android.cards.Bin r10 = r9.getBin()
            if (r10 == 0) goto L_0x00b7
            com.stripe.android.cards.CardAccountRangeStore r2 = r8.store
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r2.contains(r10, r0)
            if (r10 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r2 = r8
        L_0x0077:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0091
            com.stripe.android.cards.CardAccountRangeSource r10 = r2.inMemorySource
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.getAccountRange(r9, r0)
            if (r10 != r1) goto L_0x008e
            return r1
        L_0x008e:
            com.stripe.android.model.AccountRange r10 = (com.stripe.android.model.AccountRange) r10
            goto L_0x00a2
        L_0x0091:
            com.stripe.android.cards.CardAccountRangeSource r10 = r2.remoteSource
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.getAccountRange(r9, r0)
            if (r10 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            com.stripe.android.model.AccountRange r10 = (com.stripe.android.model.AccountRange) r10
        L_0x00a2:
            if (r10 == 0) goto L_0x00a5
            goto L_0x00b6
        L_0x00a5:
            com.stripe.android.cards.CardAccountRangeSource r10 = r2.staticSource
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r10 = r10.getAccountRange(r9, r0)
            if (r10 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            com.stripe.android.model.AccountRange r10 = (com.stripe.android.model.AccountRange) r10
        L_0x00b6:
            r7 = r10
        L_0x00b7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.cards.DefaultCardAccountRangeRepository.getAccountRange(com.stripe.android.cards.CardNumber$Unvalidated, m0.l.c):java.lang.Object");
    }

    public d<Boolean> getLoading() {
        return this.loading;
    }
}
