package com.stripe.android.stripe3ds2.transaction;

import i0.d.a.a.a;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/NoopChallengeStatusReceiver;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;", "completionEvent", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;", "flowOutcome", "Lm0/i;", "completed", "(Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;)V", "cancelled", "(Ljava/lang/String;)V", "timedout", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "protocolErrorEvent", "protocolError", "(Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;)V", "Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;", "runtimeErrorEvent", "runtimeError", "(Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;)V", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: NoopChallengeStatusReceiver.kt */
public final class NoopChallengeStatusReceiver implements ChallengeStatusReceiver {
    public void cancelled(String str) {
        i.e(str, "uiTypeCode");
        throw new NotImplementedError(a.n0("An operation is not implemented: ", "Not yet implemented"));
    }

    public void completed(CompletionEvent completionEvent, String str, ChallengeFlowOutcome challengeFlowOutcome) {
        i.e(completionEvent, "completionEvent");
        i.e(str, "uiTypeCode");
        i.e(challengeFlowOutcome, "flowOutcome");
    }

    public void protocolError(ProtocolErrorEvent protocolErrorEvent) {
        i.e(protocolErrorEvent, "protocolErrorEvent");
        throw new NotImplementedError(a.n0("An operation is not implemented: ", "Not yet implemented"));
    }

    public void runtimeError(RuntimeErrorEvent runtimeErrorEvent) {
        i.e(runtimeErrorEvent, "runtimeErrorEvent");
        throw new NotImplementedError(a.n0("An operation is not implemented: ", "Not yet implemented"));
    }

    public void timedout(String str) {
        i.e(str, "uiTypeCode");
        throw new NotImplementedError(a.n0("An operation is not implemented: ", "Not yet implemented"));
    }
}
