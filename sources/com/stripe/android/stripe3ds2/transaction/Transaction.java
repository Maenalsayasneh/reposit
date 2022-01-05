package com.stripe.android.stripe3ds2.transaction;

import android.app.Activity;
import kotlin.Metadata;
import m0.i;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00158&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "createAuthenticationRequestParameters", "(Lm0/l/c;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "", "timeoutMins", "Lm0/i;", "doChallenge", "(Landroid/app/Activity;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;ILm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;", "host", "(Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;ILm0/l/c;)Ljava/lang/Object;", "close", "()V", "", "getInitialChallengeUiType", "()Ljava/lang/String;", "setInitialChallengeUiType", "(Ljava/lang/String;)V", "initialChallengeUiType", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Transaction.kt */
public interface Transaction {
    void close();

    Object createAuthenticationRequestParameters(c<? super AuthenticationRequestParameters> cVar);

    Object doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i, c<? super i> cVar);

    Object doChallenge(Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i, c<? super i> cVar);

    String getInitialChallengeUiType();

    SdkTransactionId getSdkTransactionId();

    void setInitialChallengeUiType(String str);
}
