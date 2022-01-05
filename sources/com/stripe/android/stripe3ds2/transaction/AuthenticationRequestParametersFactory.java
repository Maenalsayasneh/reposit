package com.stripe.android.stripe3ds2.transaction;

import java.security.PublicKey;
import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "", "", "directoryServerId", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "sdkPublicKey", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "create", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/PublicKey;Lm0/l/c;)Ljava/lang/Object;", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AuthenticationRequestParametersFactory.kt */
public interface AuthenticationRequestParametersFactory {
    Object create(String str, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, PublicKey publicKey2, c<? super AuthenticationRequestParameters> cVar);
}
