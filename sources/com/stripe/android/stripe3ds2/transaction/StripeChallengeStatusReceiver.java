package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.utils.ImageCache;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fB\t\b\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeStatusReceiver;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "Lm0/i;", "statusReceived", "()V", "Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;", "completionEvent", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;", "flowOutcome", "completed", "(Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;)V", "cancelled", "(Ljava/lang/String;)V", "timedout", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "protocolErrorEvent", "protocolError", "(Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;)V", "Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;", "runtimeErrorEvent", "runtimeError", "(Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;)V", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "<init>", "(Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeChallengeStatusReceiver.kt */
public class StripeChallengeStatusReceiver implements ChallengeStatusReceiver {
    private final ImageCache imageCache;
    private final Logger logger;

    public StripeChallengeStatusReceiver(ImageCache imageCache2, Logger logger2) {
        i.e(imageCache2, "imageCache");
        i.e(logger2, "logger");
        this.imageCache = imageCache2;
        this.logger = logger2;
    }

    private final void statusReceived() {
        this.imageCache.clear();
    }

    public void cancelled(String str) {
        i.e(str, "uiTypeCode");
        this.logger.info("StripeChallengeStatusReceiver#cancelled()");
        statusReceived();
    }

    public void completed(CompletionEvent completionEvent, String str, ChallengeFlowOutcome challengeFlowOutcome) {
        i.e(completionEvent, "completionEvent");
        i.e(str, "uiTypeCode");
        i.e(challengeFlowOutcome, "flowOutcome");
        this.logger.info("StripeChallengeStatusReceiver#completed()");
        statusReceived();
    }

    public void protocolError(ProtocolErrorEvent protocolErrorEvent) {
        i.e(protocolErrorEvent, "protocolErrorEvent");
        this.logger.info("StripeChallengeStatusReceiver#protocolError()");
        statusReceived();
    }

    public void runtimeError(RuntimeErrorEvent runtimeErrorEvent) {
        i.e(runtimeErrorEvent, "runtimeErrorEvent");
        this.logger.info("StripeChallengeStatusReceiver#runtimeError()");
        statusReceived();
    }

    public void timedout(String str) {
        i.e(str, "uiTypeCode");
        this.logger.info("StripeChallengeStatusReceiver#timedout()");
        statusReceived();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StripeChallengeStatusReceiver(ImageCache imageCache2, Logger logger2, int i, f fVar) {
        this(imageCache2, (i & 2) != 0 ? Logger.Companion.noop$3ds2sdk_release() : logger2);
    }

    public StripeChallengeStatusReceiver() {
        this(ImageCache.Default.INSTANCE, (Logger) null, 2, (f) null);
    }
}
