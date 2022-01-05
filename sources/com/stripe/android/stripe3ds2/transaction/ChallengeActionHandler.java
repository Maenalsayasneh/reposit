package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "action", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "submit", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lm0/l/c;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeActionHandler.kt */
public interface ChallengeActionHandler {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016B1\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u001bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "action", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "submit", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "executeChallengeRequest", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "challengeRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;Lm0/l/e;)V", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "creqExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "creqExecutorConfig", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lm0/l/e;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeActionHandler.kt */
    public static final class Default implements ChallengeActionHandler {
        /* access modifiers changed from: private */
        public static final long CREQ_DELAY = TimeUnit.SECONDS.toMillis(1);
        public static final Companion Companion = new Companion((f) null);
        private final ChallengeRequestExecutor challengeRequestExecutor;
        /* access modifiers changed from: private */
        public final ChallengeRequestData creqData;
        private final ErrorReporter errorReporter;
        private final e workContext;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$Companion;", "", "", "CREQ_DELAY", "J", "getCREQ_DELAY$3ds2sdk_release", "()J", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ChallengeActionHandler.kt */
        public static final class Companion {
            private Companion() {
            }

            public final long getCREQ_DELAY$3ds2sdk_release() {
                return Default.CREQ_DELAY;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Default(ChallengeRequestData challengeRequestData, ErrorReporter errorReporter2, ChallengeRequestExecutor challengeRequestExecutor2, e eVar) {
            i.e(challengeRequestData, "creqData");
            i.e(errorReporter2, "errorReporter");
            i.e(challengeRequestExecutor2, "challengeRequestExecutor");
            i.e(eVar, "workContext");
            this.creqData = challengeRequestData;
            this.errorReporter = errorReporter2;
            this.challengeRequestExecutor = challengeRequestExecutor2;
            this.workContext = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object executeChallengeRequest(com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r8, m0.l.c<? super com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1 r0 = (com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1 r0 = new com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0048
                if (r2 == r4) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                java.lang.Object r8 = r0.L$1
                com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r8 = (com.stripe.android.stripe3ds2.transactions.ChallengeRequestData) r8
                java.lang.Object r0 = r0.L$0
                com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default r0 = (com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler.Default) r0
                i0.j.f.p.h.d4(r9)     // Catch:{ all -> 0x0032 }
                goto L_0x006b
            L_0x0032:
                r9 = move-exception
                goto L_0x006e
            L_0x0034:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x003c:
                java.lang.Object r8 = r0.L$1
                com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r8 = (com.stripe.android.stripe3ds2.transactions.ChallengeRequestData) r8
                java.lang.Object r2 = r0.L$0
                com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default r2 = (com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler.Default) r2
                i0.j.f.p.h.d4(r9)
                goto L_0x005b
            L_0x0048:
                i0.j.f.p.h.d4(r9)
                long r5 = CREQ_DELAY
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                java.lang.Object r9 = m0.r.t.a.r.m.a1.a.d1(r5, r0)
                if (r9 != r1) goto L_0x005a
                return r1
            L_0x005a:
                r2 = r7
            L_0x005b:
                com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor r9 = r2.challengeRequestExecutor     // Catch:{ all -> 0x0070 }
                r0.L$0 = r2     // Catch:{ all -> 0x0070 }
                r0.L$1 = r8     // Catch:{ all -> 0x0070 }
                r0.label = r3     // Catch:{ all -> 0x0070 }
                java.lang.Object r9 = r9.execute(r8, r0)     // Catch:{ all -> 0x0070 }
                if (r9 != r1) goto L_0x006a
                return r1
            L_0x006a:
                r0 = r2
            L_0x006b:
                com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult r9 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult) r9     // Catch:{ all -> 0x0032 }
                goto L_0x0076
            L_0x006e:
                r2 = r0
                goto L_0x0071
            L_0x0070:
                r9 = move-exception
            L_0x0071:
                java.lang.Object r9 = i0.j.f.p.h.l0(r9)
                r0 = r2
            L_0x0076:
                java.lang.Throwable r1 = kotlin.Result.a(r9)
                if (r1 == 0) goto L_0x00a0
                com.stripe.android.stripe3ds2.observability.ErrorReporter r0 = r0.errorReporter
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "\n                            Failed to execute challenge request.\n\n                            CReq = "
                java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
                com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r8 = r8.sanitize$3ds2sdk_release()
                r3.append(r8)
                java.lang.String r8 = "\n                        "
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                java.lang.String r8 = kotlin.text.StringsKt__IndentKt.Y(r8)
                r2.<init>(r8, r1)
                r0.reportError(r2)
            L_0x00a0:
                java.lang.Throwable r8 = kotlin.Result.a(r9)
                if (r8 != 0) goto L_0x00a7
                goto L_0x00ac
            L_0x00a7:
                com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$RuntimeError r9 = new com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$RuntimeError
                r9.<init>(r8)
            L_0x00ac:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler.Default.executeChallengeRequest(com.stripe.android.stripe3ds2.transactions.ChallengeRequestData, m0.l.c):java.lang.Object");
        }

        public Object submit(ChallengeAction challengeAction, c<? super ChallengeRequestResult> cVar) {
            return a.k4(this.workContext, new ChallengeActionHandler$Default$submit$2(this, challengeAction, (c) null), cVar);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Default(ChallengeRequestData challengeRequestData, ErrorReporter errorReporter2, ChallengeRequestExecutor.Factory factory, ChallengeRequestExecutor.Config config, e eVar) {
            this(challengeRequestData, errorReporter2, factory.create(config, errorReporter2), eVar);
            i.e(challengeRequestData, "creqData");
            i.e(errorReporter2, "errorReporter");
            i.e(factory, "creqExecutorFactory");
            i.e(config, "creqExecutorConfig");
            i.e(eVar, "workContext");
        }
    }

    Object submit(ChallengeAction challengeAction, c<? super ChallengeRequestResult> cVar);
}
