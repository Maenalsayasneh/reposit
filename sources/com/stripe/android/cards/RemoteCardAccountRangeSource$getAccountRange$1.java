package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.cards.RemoteCardAccountRangeSource", f = "RemoteCardAccountRangeSource.kt", l = {32}, m = "getAccountRange")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lm0/l/c;", "Lcom/stripe/android/model/AccountRange;", "continuation", "", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: RemoteCardAccountRangeSource.kt */
public final class RemoteCardAccountRangeSource$getAccountRange$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RemoteCardAccountRangeSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteCardAccountRangeSource$getAccountRange$1(RemoteCardAccountRangeSource remoteCardAccountRangeSource, m0.l.c cVar) {
        super(cVar);
        this.this$0 = remoteCardAccountRangeSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAccountRange((CardNumber.Unvalidated) null, this);
    }
}
