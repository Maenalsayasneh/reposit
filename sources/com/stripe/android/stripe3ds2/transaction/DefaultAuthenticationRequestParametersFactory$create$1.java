package com.stripe.android.stripe3ds2.transaction;

import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory", f = "DefaultAuthenticationRequestParametersFactory.kt", l = {128}, m = "create")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "directoryServerId", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "sdkPublicKey", "Lm0/l/c;", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "continuation", "", "create", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/PublicKey;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultAuthenticationRequestParametersFactory.kt */
public final class DefaultAuthenticationRequestParametersFactory$create$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultAuthenticationRequestParametersFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultAuthenticationRequestParametersFactory$create$1(DefaultAuthenticationRequestParametersFactory defaultAuthenticationRequestParametersFactory, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultAuthenticationRequestParametersFactory;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create((String) null, (PublicKey) null, (String) null, (SdkTransactionId) null, (PublicKey) null, this);
    }
}
