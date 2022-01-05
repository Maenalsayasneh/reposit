package com.stripe.android.cards;

import com.stripe.android.model.Token;
import com.stripe.android.networking.AnalyticsEvent;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import java.util.Set;
import kotlin.Metadata;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/stripe/android/cards/RemoteCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "Lm0/i;", "onCardMetadataMissingRange", "()V", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "cardAccountRangeStore", "Lcom/stripe/android/cards/CardAccountRangeStore;", "Ln0/a/g2/q;", "", "_loading", "Ln0/a/g2/q;", "Ln0/a/g2/d;", "getLoading", "()Ln0/a/g2/d;", "loading", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "analyticsRequestFactory", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/cards/CardAccountRangeStore;Lcom/stripe/android/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/AnalyticsRequestFactory;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: RemoteCardAccountRangeSource.kt */
public final class RemoteCardAccountRangeSource implements CardAccountRangeSource {
    private final q<Boolean> _loading = a0.a(Boolean.FALSE);
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private final CardAccountRangeStore cardAccountRangeStore;
    private final ApiRequest.Options requestOptions;
    private final StripeRepository stripeRepository;

    public RemoteCardAccountRangeSource(StripeRepository stripeRepository2, ApiRequest.Options options, CardAccountRangeStore cardAccountRangeStore2, AnalyticsRequestExecutor analyticsRequestExecutor2, AnalyticsRequestFactory analyticsRequestFactory2) {
        i.e(stripeRepository2, "stripeRepository");
        i.e(options, "requestOptions");
        i.e(cardAccountRangeStore2, "cardAccountRangeStore");
        i.e(analyticsRequestExecutor2, "analyticsRequestExecutor");
        i.e(analyticsRequestFactory2, "analyticsRequestFactory");
        this.stripeRepository = stripeRepository2;
        this.requestOptions = options;
        this.cardAccountRangeStore = cardAccountRangeStore2;
        this.analyticsRequestExecutor = analyticsRequestExecutor2;
        this.analyticsRequestFactory = analyticsRequestFactory2;
    }

    private final void onCardMetadataMissingRange() {
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.CardMetadataMissingRange, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.stripe.android.model.AccountRange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAccountRange(com.stripe.android.cards.CardNumber.Unvalidated r7, m0.l.c<? super com.stripe.android.model.AccountRange> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1 r0 = (com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1 r0 = new com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r7 = r0.L$2
            com.stripe.android.cards.Bin r7 = (com.stripe.android.cards.Bin) r7
            java.lang.Object r1 = r0.L$1
            com.stripe.android.cards.CardNumber$Unvalidated r1 = (com.stripe.android.cards.CardNumber.Unvalidated) r1
            java.lang.Object r0 = r0.L$0
            com.stripe.android.cards.RemoteCardAccountRangeSource r0 = (com.stripe.android.cards.RemoteCardAccountRangeSource) r0
            i0.j.f.p.h.d4(r8)
            goto L_0x0063
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.cards.Bin r8 = r7.getBin()
            if (r8 == 0) goto L_0x00b6
            n0.a.g2.q<java.lang.Boolean> r2 = r6._loading
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.setValue(r5)
            com.stripe.android.networking.StripeRepository r2 = r6.stripeRepository
            com.stripe.android.networking.ApiRequest$Options r5 = r6.requestOptions
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r0 = r2.getCardMetadata(r8, r5, r0)
            if (r0 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r6
        L_0x0063:
            com.stripe.android.model.CardMetadata r8 = (com.stripe.android.model.CardMetadata) r8
            if (r8 == 0) goto L_0x006c
            java.util.List r8 = r8.getAccountRanges()
            goto L_0x006d
        L_0x006c:
            r8 = r4
        L_0x006d:
            if (r8 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.c
        L_0x0072:
            com.stripe.android.cards.CardAccountRangeStore r2 = r0.cardAccountRangeStore
            r2.save(r7, r8)
            n0.a.g2.q<java.lang.Boolean> r7 = r0._loading
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r7.setValue(r2)
            boolean r7 = r8.isEmpty()
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x00b6
            java.util.Iterator r7 = r8.iterator()
        L_0x0089:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00a9
            java.lang.Object r8 = r7.next()
            r2 = r8
            com.stripe.android.model.AccountRange r2 = (com.stripe.android.model.AccountRange) r2
            com.stripe.android.model.BinRange r2 = r2.component1()
            boolean r2 = r2.matches$payments_core_release(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0089
            r4 = r8
        L_0x00a9:
            com.stripe.android.model.AccountRange r4 = (com.stripe.android.model.AccountRange) r4
            if (r4 != 0) goto L_0x00b6
            boolean r7 = r1.isValidLuhn()
            if (r7 == 0) goto L_0x00b6
            r0.onCardMetadataMissingRange()
        L_0x00b6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.cards.RemoteCardAccountRangeSource.getAccountRange(com.stripe.android.cards.CardNumber$Unvalidated, m0.l.c):java.lang.Object");
    }

    public d<Boolean> getLoading() {
        return this._loading;
    }
}
