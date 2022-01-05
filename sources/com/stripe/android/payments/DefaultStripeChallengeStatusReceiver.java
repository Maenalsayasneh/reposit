package com.stripe.android.payments;

import com.stripe.android.Logger;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.networking.AnalyticsEvent;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.RetryDelaySupplier;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome;
import com.stripe.android.stripe3ds2.transaction.CompletionEvent;
import com.stripe.android.stripe3ds2.transaction.ProtocolErrorEvent;
import com.stripe.android.stripe3ds2.transaction.RuntimeErrorEvent;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeStatusReceiver;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import n0.a.d0;
import n0.a.h2.o;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001IBs\b\u0000\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u00101\u001a\u00020\r\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u00104\u001a\u000203\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.\u0012\b\b\u0002\u00107\u001a\u000206\u0012\b\b\u0002\u0010F\u001a\u00020E\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bG\u0010HJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010D\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"Lcom/stripe/android/payments/DefaultStripeChallengeStatusReceiver;", "Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeStatusReceiver;", "Lm0/i;", "log3ds2ChallengePresented", "()V", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;", "flowOutcome", "", "remainingRetries", "complete3ds2Auth", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;I)V", "Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;", "completionEvent", "", "uiTypeCode", "completed", "(Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;)V", "cancelled", "(Ljava/lang/String;)V", "timedout", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "protocolErrorEvent", "protocolError", "(Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;)V", "Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;", "runtimeErrorEvent", "runtimeError", "(Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;)V", "", "error", "onComplete3ds2AuthFailure", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;ILjava/lang/Throwable;Lm0/l/c;)Ljava/lang/Object;", "startCompletionActivity", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "analyticsRequestFactory", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lkotlin/Function0;", "onEndChallenge", "Lm0/n/a/a;", "sourceId", "Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "transaction", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "Lcom/stripe/android/networking/RetryDelaySupplier;", "retryDelaySupplier", "Lcom/stripe/android/networking/RetryDelaySupplier;", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;", "stripe3ds2CompletionStarter", "Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;", "", "enableLogging", "<init>", "(Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/AnalyticsRequestFactory;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Lm0/n/a/a;Lcom/stripe/android/networking/RetryDelaySupplier;ZLm0/l/e;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultStripeChallengeStatusReceiver.kt */
public final class DefaultStripeChallengeStatusReceiver extends StripeChallengeStatusReceiver {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final int MAX_RETRIES = 3;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    /* access modifiers changed from: private */
    public final Logger logger;
    /* access modifiers changed from: private */
    public final a<i> onEndChallenge;
    /* access modifiers changed from: private */
    public final ApiRequest.Options requestOptions;
    private final RetryDelaySupplier retryDelaySupplier;
    /* access modifiers changed from: private */
    public final String sourceId;
    /* access modifiers changed from: private */
    public final Stripe3ds2CompletionStarter stripe3ds2CompletionStarter;
    /* access modifiers changed from: private */
    public final StripeIntent stripeIntent;
    /* access modifiers changed from: private */
    public final StripeRepository stripeRepository;
    private final Transaction transaction;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/DefaultStripeChallengeStatusReceiver$Companion;", "", "", "MAX_RETRIES", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultStripeChallengeStatusReceiver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            ChallengeFlowOutcome.values();
            int[] iArr = new int[6];
            $EnumSwitchMapping$0 = iArr;
            iArr[ChallengeFlowOutcome.CompleteSuccessful.ordinal()] = 1;
            iArr[ChallengeFlowOutcome.Cancel.ordinal()] = 2;
            iArr[ChallengeFlowOutcome.Timeout.ordinal()] = 3;
            iArr[ChallengeFlowOutcome.CompleteUnsuccessful.ordinal()] = 4;
            iArr[ChallengeFlowOutcome.ProtocolError.ordinal()] = 5;
            iArr[ChallengeFlowOutcome.RuntimeError.ordinal()] = 6;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DefaultStripeChallengeStatusReceiver(com.stripe.android.payments.Stripe3ds2CompletionStarter r20, com.stripe.android.networking.StripeRepository r21, com.stripe.android.model.StripeIntent r22, java.lang.String r23, com.stripe.android.networking.ApiRequest.Options r24, com.stripe.android.networking.AnalyticsRequestExecutor r25, com.stripe.android.networking.AnalyticsRequestFactory r26, com.stripe.android.stripe3ds2.transaction.Transaction r27, m0.n.a.a r28, com.stripe.android.networking.RetryDelaySupplier r29, boolean r30, m0.l.e r31, int r32, m0.n.b.f r33) {
        /*
            r19 = this;
            r0 = r32
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0012
            com.stripe.android.networking.RetryDelaySupplier r1 = new com.stripe.android.networking.RetryDelaySupplier
            r2 = 0
            r4 = 1
            r5 = 0
            r1.<init>(r2, r4, r5)
            r16 = r1
            goto L_0x0014
        L_0x0012:
            r16 = r29
        L_0x0014:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r17 = r0
            goto L_0x001e
        L_0x001c:
            r17 = r30
        L_0x001e:
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r18 = r31
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.DefaultStripeChallengeStatusReceiver.<init>(com.stripe.android.payments.Stripe3ds2CompletionStarter, com.stripe.android.networking.StripeRepository, com.stripe.android.model.StripeIntent, java.lang.String, com.stripe.android.networking.ApiRequest$Options, com.stripe.android.networking.AnalyticsRequestExecutor, com.stripe.android.networking.AnalyticsRequestFactory, com.stripe.android.stripe3ds2.transaction.Transaction, m0.n.a.a, com.stripe.android.networking.RetryDelaySupplier, boolean, m0.l.e, int, m0.n.b.f):void");
    }

    private final void complete3ds2Auth(ChallengeFlowOutcome challengeFlowOutcome, int i) {
        m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.workContext), (e) null, (CoroutineStart) null, new DefaultStripeChallengeStatusReceiver$complete3ds2Auth$1(this, i, challengeFlowOutcome, (c) null), 3, (Object) null);
    }

    public static /* synthetic */ void complete3ds2Auth$default(DefaultStripeChallengeStatusReceiver defaultStripeChallengeStatusReceiver, ChallengeFlowOutcome challengeFlowOutcome, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        defaultStripeChallengeStatusReceiver.complete3ds2Auth(challengeFlowOutcome, i);
    }

    private final void log3ds2ChallengePresented() {
        AnalyticsRequestExecutor analyticsRequestExecutor2 = this.analyticsRequestExecutor;
        AnalyticsRequestFactory analyticsRequestFactory2 = this.analyticsRequestFactory;
        AnalyticsEvent analyticsEvent = AnalyticsEvent.Auth3ds2ChallengePresented;
        String initialChallengeUiType = this.transaction.getInitialChallengeUiType();
        if (initialChallengeUiType == null) {
            initialChallengeUiType = "";
        }
        analyticsRequestExecutor2.executeAsync(analyticsRequestFactory2.create3ds2Challenge$payments_core_release(analyticsEvent, initialChallengeUiType));
    }

    public void cancelled(String str) {
        m0.n.b.i.e(str, "uiTypeCode");
        super.cancelled(str);
        this.analyticsRequestExecutor.executeAsync(this.analyticsRequestFactory.create3ds2Challenge$payments_core_release(AnalyticsEvent.Auth3ds2ChallengeCanceled, str));
        log3ds2ChallengePresented();
        complete3ds2Auth$default(this, ChallengeFlowOutcome.Cancel, 0, 2, (Object) null);
    }

    public void completed(CompletionEvent completionEvent, String str, ChallengeFlowOutcome challengeFlowOutcome) {
        m0.n.b.i.e(completionEvent, "completionEvent");
        m0.n.b.i.e(str, "uiTypeCode");
        m0.n.b.i.e(challengeFlowOutcome, "flowOutcome");
        super.completed(completionEvent, str, challengeFlowOutcome);
        this.analyticsRequestExecutor.executeAsync(this.analyticsRequestFactory.create3ds2Challenge$payments_core_release(AnalyticsEvent.Auth3ds2ChallengeCompleted, str));
        log3ds2ChallengePresented();
        complete3ds2Auth$default(this, challengeFlowOutcome, 0, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object onComplete3ds2AuthFailure(com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome r7, int r8, java.lang.Throwable r9, m0.l.c<? super m0.i> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.stripe.android.payments.DefaultStripeChallengeStatusReceiver$onComplete3ds2AuthFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.stripe.android.payments.DefaultStripeChallengeStatusReceiver$onComplete3ds2AuthFailure$1 r0 = (com.stripe.android.payments.DefaultStripeChallengeStatusReceiver$onComplete3ds2AuthFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.payments.DefaultStripeChallengeStatusReceiver$onComplete3ds2AuthFailure$1 r0 = new com.stripe.android.payments.DefaultStripeChallengeStatusReceiver$onComplete3ds2AuthFailure$1
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            i0.j.f.p.h.d4(r10)
            goto L_0x009a
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            int r8 = r0.I$0
            java.lang.Object r7 = r0.L$1
            com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome r7 = (com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome) r7
            java.lang.Object r9 = r0.L$0
            com.stripe.android.payments.DefaultStripeChallengeStatusReceiver r9 = (com.stripe.android.payments.DefaultStripeChallengeStatusReceiver) r9
            i0.j.f.p.h.d4(r10)
            goto L_0x0085
        L_0x0041:
            i0.j.f.p.h.d4(r10)
            com.stripe.android.Logger r10 = r6.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "3DS2 challenge completion request failed. Remaining retries: "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r10.error(r2, r9)
            boolean r10 = r9 instanceof com.stripe.android.exception.StripeException
            r2 = 0
            if (r10 == 0) goto L_0x0066
            com.stripe.android.exception.StripeException r9 = (com.stripe.android.exception.StripeException) r9
            boolean r9 = r9.isClientError$payments_core_release()
            goto L_0x0067
        L_0x0066:
            r9 = r2
        L_0x0067:
            if (r8 <= 0) goto L_0x006c
            if (r9 == 0) goto L_0x006c
            r2 = r4
        L_0x006c:
            if (r2 == 0) goto L_0x008a
            com.stripe.android.networking.RetryDelaySupplier r9 = r6.retryDelaySupplier
            r10 = 3
            long r9 = r9.getDelayMillis(r10, r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.I$0 = r8
            r0.label = r4
            java.lang.Object r9 = m0.r.t.a.r.m.a1.a.d1(r9, r0)
            if (r9 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r9 = r6
        L_0x0085:
            int r8 = r8 - r4
            r9.complete3ds2Auth(r7, r8)
            goto L_0x009a
        L_0x008a:
            com.stripe.android.Logger r8 = r6.logger
            java.lang.String r9 = "Did not make a successful 3DS2 challenge completion request after retrying."
            r8.debug(r9)
            r0.label = r3
            java.lang.Object r7 = r6.startCompletionActivity(r7, r0)
            if (r7 != r1) goto L_0x009a
            return r1
        L_0x009a:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.DefaultStripeChallengeStatusReceiver.onComplete3ds2AuthFailure(com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome, int, java.lang.Throwable, m0.l.c):java.lang.Object");
    }

    public void protocolError(ProtocolErrorEvent protocolErrorEvent) {
        m0.n.b.i.e(protocolErrorEvent, "protocolErrorEvent");
        super.protocolError(protocolErrorEvent);
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.Auth3ds2ChallengeErrored, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
        log3ds2ChallengePresented();
        complete3ds2Auth$default(this, ChallengeFlowOutcome.ProtocolError, 0, 2, (Object) null);
    }

    public void runtimeError(RuntimeErrorEvent runtimeErrorEvent) {
        m0.n.b.i.e(runtimeErrorEvent, "runtimeErrorEvent");
        super.runtimeError(runtimeErrorEvent);
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.Auth3ds2ChallengeErrored, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
        log3ds2ChallengePresented();
        complete3ds2Auth$default(this, ChallengeFlowOutcome.RuntimeError, 0, 2, (Object) null);
    }

    public final Object startCompletionActivity(ChallengeFlowOutcome challengeFlowOutcome, c<? super i> cVar) {
        d0 d0Var = m0.a;
        Object k4 = m0.r.t.a.r.m.a1.a.k4(o.c, new DefaultStripeChallengeStatusReceiver$startCompletionActivity$2(this, challengeFlowOutcome, (c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return i.a;
    }

    public void timedout(String str) {
        m0.n.b.i.e(str, "uiTypeCode");
        super.timedout(str);
        this.analyticsRequestExecutor.executeAsync(this.analyticsRequestFactory.create3ds2Challenge$payments_core_release(AnalyticsEvent.Auth3ds2ChallengeTimedOut, str));
        log3ds2ChallengePresented();
        complete3ds2Auth$default(this, ChallengeFlowOutcome.Timeout, 0, 2, (Object) null);
    }

    public DefaultStripeChallengeStatusReceiver(Stripe3ds2CompletionStarter stripe3ds2CompletionStarter2, StripeRepository stripeRepository2, StripeIntent stripeIntent2, String str, ApiRequest.Options options, AnalyticsRequestExecutor analyticsRequestExecutor2, AnalyticsRequestFactory analyticsRequestFactory2, Transaction transaction2, a<i> aVar, RetryDelaySupplier retryDelaySupplier2, boolean z, e eVar) {
        m0.n.b.i.e(stripe3ds2CompletionStarter2, "stripe3ds2CompletionStarter");
        m0.n.b.i.e(stripeRepository2, "stripeRepository");
        m0.n.b.i.e(stripeIntent2, "stripeIntent");
        m0.n.b.i.e(str, "sourceId");
        m0.n.b.i.e(options, "requestOptions");
        m0.n.b.i.e(analyticsRequestExecutor2, "analyticsRequestExecutor");
        m0.n.b.i.e(analyticsRequestFactory2, "analyticsRequestFactory");
        m0.n.b.i.e(transaction2, "transaction");
        m0.n.b.i.e(aVar, "onEndChallenge");
        m0.n.b.i.e(retryDelaySupplier2, "retryDelaySupplier");
        m0.n.b.i.e(eVar, "workContext");
        this.stripe3ds2CompletionStarter = stripe3ds2CompletionStarter2;
        this.stripeRepository = stripeRepository2;
        this.stripeIntent = stripeIntent2;
        this.sourceId = str;
        this.requestOptions = options;
        this.analyticsRequestExecutor = analyticsRequestExecutor2;
        this.analyticsRequestFactory = analyticsRequestFactory2;
        this.transaction = transaction2;
        this.onEndChallenge = aVar;
        this.retryDelaySupplier = retryDelaySupplier2;
        this.workContext = eVar;
        this.logger = Logger.Companion.getInstance$payments_core_release(z);
    }
}
