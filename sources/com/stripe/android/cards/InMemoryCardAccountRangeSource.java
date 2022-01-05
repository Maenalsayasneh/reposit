package com.stripe.android.cards;

import kotlin.Metadata;
import m0.n.b.i;
import n0.a.g2.d;
import n0.a.g2.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/cards/InMemoryCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "store", "Lcom/stripe/android/cards/CardAccountRangeStore;", "Ln0/a/g2/d;", "", "loading", "Ln0/a/g2/d;", "getLoading", "()Ln0/a/g2/d;", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeStore;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: InMemoryCardAccountRangeSource.kt */
public final class InMemoryCardAccountRangeSource implements CardAccountRangeSource {
    private final d<Boolean> loading = new f(Boolean.FALSE);
    private final CardAccountRangeStore store;

    public InMemoryCardAccountRangeSource(CardAccountRangeStore cardAccountRangeStore) {
        i.e(cardAccountRangeStore, "store");
        this.store = cardAccountRangeStore;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[EDGE_INSN: B:24:0x0070->B:23:0x0070 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAccountRange(com.stripe.android.cards.CardNumber.Unvalidated r6, m0.l.c<? super com.stripe.android.model.AccountRange> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1 r0 = (com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1 r0 = new com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r6 = r0.L$0
            com.stripe.android.cards.CardNumber$Unvalidated r6 = (com.stripe.android.cards.CardNumber.Unvalidated) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x004a
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            i0.j.f.p.h.d4(r7)
            com.stripe.android.cards.Bin r7 = r6.getBin()
            if (r7 == 0) goto L_0x0072
            com.stripe.android.cards.CardAccountRangeStore r2 = r5.store
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r2.get(r7, r0)
            if (r7 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0050:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r7.next()
            r1 = r0
            com.stripe.android.model.AccountRange r1 = (com.stripe.android.model.AccountRange) r1
            com.stripe.android.model.BinRange r1 = r1.component1()
            boolean r1 = r1.matches$payments_core_release(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0050
            r3 = r0
        L_0x0070:
            com.stripe.android.model.AccountRange r3 = (com.stripe.android.model.AccountRange) r3
        L_0x0072:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.cards.InMemoryCardAccountRangeSource.getAccountRange(com.stripe.android.cards.CardNumber$Unvalidated, m0.l.c):java.lang.Object");
    }

    public d<Boolean> getLoading() {
        return this.loading;
    }
}
