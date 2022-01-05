package com.stripe.android.stripe3ds2.transaction;

import com.pubnub.api.builder.PubNubErrorBuilder;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.q;
import n0.a.g2.z;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "", "Lm0/i;", "start", "(Lm0/l/c;)Ljava/lang/Object;", "Ln0/a/g2/d;", "", "getTimeout", "()Ln0/a/g2/d;", "timeout", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TransactionTimer.kt */
public interface TransactionTimer {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160 8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer$Default;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "createTimeoutErrorData", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Lm0/i;", "start", "(Lm0/l/c;)Ljava/lang/Object;", "", "uiTypeCode", "setUiTypeCode", "(Ljava/lang/String;)V", "onTimeout$3ds2sdk_release", "()V", "onTimeout", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "Ln0/a/g2/q;", "", "mutableTimeoutFlow", "Ln0/a/g2/q;", "", "timeoutMillis", "J", "Ljava/lang/String;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Ln0/a/g2/z;", "timeout", "Ln0/a/g2/z;", "getTimeout", "()Ln0/a/g2/z;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "", "timeoutMinutes", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;ILcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lm0/l/e;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: TransactionTimer.kt */
    public static final class Default implements TransactionTimer {
        private final ChallengeStatusReceiver challengeStatusReceiver;
        private final ChallengeRequestData creqData;
        private final ErrorRequestExecutor errorRequestExecutor;
        private final q<Boolean> mutableTimeoutFlow;
        private final z<Boolean> timeout;
        /* access modifiers changed from: private */
        public final long timeoutMillis;
        private String uiTypeCode;
        private final e workContext;

        public Default(ChallengeStatusReceiver challengeStatusReceiver2, int i, ErrorRequestExecutor errorRequestExecutor2, ChallengeRequestData challengeRequestData, e eVar) {
            i.e(challengeStatusReceiver2, "challengeStatusReceiver");
            i.e(errorRequestExecutor2, "errorRequestExecutor");
            i.e(challengeRequestData, "creqData");
            i.e(eVar, "workContext");
            this.challengeStatusReceiver = challengeStatusReceiver2;
            this.errorRequestExecutor = errorRequestExecutor2;
            this.creqData = challengeRequestData;
            this.workContext = eVar;
            this.timeoutMillis = TimeUnit.MINUTES.toMillis((long) i);
            q<Boolean> a = a0.a(Boolean.FALSE);
            this.mutableTimeoutFlow = a;
            this.timeout = a;
        }

        private final ErrorData createTimeoutErrorData() {
            String threeDsServerTransId = this.creqData.getThreeDsServerTransId();
            String acsTransId = this.creqData.getAcsTransId();
            ProtocolError protocolError = ProtocolError.TransactionTimedout;
            return new ErrorData(threeDsServerTransId, acsTransId, (String) null, String.valueOf(protocolError.getCode()), ErrorData.ErrorComponent.ThreeDsSdk, protocolError.getDescription(), "Timeout expiry reached for the transaction", (String) null, this.creqData.getMessageVersion(), this.creqData.getSdkTransId(), PubNubErrorBuilder.PNERR_CHANNEL_MISSING, (f) null);
        }

        public final void onTimeout$3ds2sdk_release() {
            this.errorRequestExecutor.executeAsync(createTimeoutErrorData());
            ChallengeStatusReceiver challengeStatusReceiver2 = this.challengeStatusReceiver;
            String str = this.uiTypeCode;
            if (str == null) {
                str = "";
            }
            challengeStatusReceiver2.timedout(str);
            this.mutableTimeoutFlow.setValue(Boolean.TRUE);
        }

        public final void setUiTypeCode(String str) {
            this.uiTypeCode = str;
        }

        public Object start(c<? super m0.i> cVar) {
            Object k4 = a.k4(this.workContext, new TransactionTimer$Default$start$2(this, (c) null), cVar);
            if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k4;
            }
            return m0.i.a;
        }

        public z<Boolean> getTimeout() {
            return this.timeout;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Default(ChallengeStatusReceiver challengeStatusReceiver2, int i, ErrorRequestExecutor errorRequestExecutor2, ChallengeRequestData challengeRequestData, e eVar, int i2, f fVar) {
            this(challengeStatusReceiver2, i, errorRequestExecutor2, challengeRequestData, (i2 & 16) != 0 ? m0.c : eVar);
        }
    }

    d<Boolean> getTimeout();

    Object start(c<? super m0.i> cVar);
}
