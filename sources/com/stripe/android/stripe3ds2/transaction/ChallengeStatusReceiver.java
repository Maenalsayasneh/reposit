package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "", "Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;", "completionEvent", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;", "flowOutcome", "Lm0/i;", "completed", "(Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;)V", "cancelled", "(Ljava/lang/String;)V", "timedout", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "protocolErrorEvent", "protocolError", "(Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;)V", "Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;", "runtimeErrorEvent", "runtimeError", "(Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeStatusReceiver.kt */
public interface ChallengeStatusReceiver {
    void cancelled(String str);

    void completed(CompletionEvent completionEvent, String str, ChallengeFlowOutcome challengeFlowOutcome);

    void protocolError(ProtocolErrorEvent protocolErrorEvent);

    void runtimeError(RuntimeErrorEvent runtimeErrorEvent);

    void timedout(String str);
}
