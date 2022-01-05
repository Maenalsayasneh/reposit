package com.stripe.android.stripe3ds2.service;

import com.stripe.android.stripe3ds2.transaction.Transaction;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJQ\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "Lcom/stripe/android/stripe3ds2/service/ThreeDS2Service;", "", "directoryServerID", "messageVersion", "", "isLiveMode", "directoryServerName", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "createTransaction", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "dsPublicKey", "keyId", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeThreeDs2Service.kt */
public interface StripeThreeDs2Service extends ThreeDS2Service {
    Transaction createTransaction(String str, String str2, boolean z, String str3);

    Transaction createTransaction(String str, String str2, boolean z, String str3, List<? extends X509Certificate> list, PublicKey publicKey, String str4);
}
