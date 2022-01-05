package com.stripe.android.networking;

import com.stripe.android.Logger;
import com.stripe.android.networking.ConnectionFactory;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\b\u0001\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/stripe/android/networking/DefaultApiRequestExecutor;", "Lcom/stripe/android/networking/ApiRequestExecutor;", "Lcom/stripe/android/networking/StripeRequest;", "request", "Lcom/stripe/android/networking/StripeResponse;", "makeRequest", "(Lcom/stripe/android/networking/StripeRequest;)Lcom/stripe/android/networking/StripeResponse;", "Lcom/stripe/android/networking/ApiRequest;", "execute", "(Lcom/stripe/android/networking/ApiRequest;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/networking/FileUploadRequest;", "(Lcom/stripe/android/networking/FileUploadRequest;Lm0/l/c;)Ljava/lang/Object;", "", "remainingRetries", "executeInternal$payments_core_release", "(Lcom/stripe/android/networking/StripeRequest;ILm0/l/c;)Ljava/lang/Object;", "executeInternal", "Lcom/stripe/android/networking/ConnectionFactory;", "connectionFactory", "Lcom/stripe/android/networking/ConnectionFactory;", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Lcom/stripe/android/networking/RetryDelaySupplier;", "retryDelaySupplier", "Lcom/stripe/android/networking/RetryDelaySupplier;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "<init>", "(Lm0/l/e;Lcom/stripe/android/networking/ConnectionFactory;Lcom/stripe/android/networking/RetryDelaySupplier;Lcom/stripe/android/Logger;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultApiRequestExecutor.kt */
public final class DefaultApiRequestExecutor implements ApiRequestExecutor {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final int MAX_RETRIES = 3;
    private final ConnectionFactory connectionFactory;
    /* access modifiers changed from: private */
    public final Logger logger;
    /* access modifiers changed from: private */
    public final RetryDelaySupplier retryDelaySupplier;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/DefaultApiRequestExecutor$Companion;", "", "", "MAX_RETRIES", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultApiRequestExecutor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultApiRequestExecutor() {
        this((e) null, (ConnectionFactory) null, (RetryDelaySupplier) null, (Logger) null, 15, (f) null);
    }

    public DefaultApiRequestExecutor(e eVar) {
        this(eVar, (ConnectionFactory) null, (RetryDelaySupplier) null, (Logger) null, 14, (f) null);
    }

    public DefaultApiRequestExecutor(e eVar, ConnectionFactory connectionFactory2) {
        this(eVar, connectionFactory2, (RetryDelaySupplier) null, (Logger) null, 12, (f) null);
    }

    public DefaultApiRequestExecutor(e eVar, ConnectionFactory connectionFactory2, RetryDelaySupplier retryDelaySupplier2) {
        this(eVar, connectionFactory2, retryDelaySupplier2, (Logger) null, 8, (f) null);
    }

    public DefaultApiRequestExecutor(e eVar, ConnectionFactory connectionFactory2, RetryDelaySupplier retryDelaySupplier2, Logger logger2) {
        i.e(eVar, "workContext");
        i.e(connectionFactory2, "connectionFactory");
        i.e(retryDelaySupplier2, "retryDelaySupplier");
        i.e(logger2, "logger");
        this.workContext = eVar;
        this.connectionFactory = connectionFactory2;
        this.retryDelaySupplier = retryDelaySupplier2;
        this.logger = logger2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        i0.j.f.p.h.H(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.stripe.android.networking.StripeResponse makeRequest(com.stripe.android.networking.StripeRequest r5) {
        /*
            r4 = this;
            com.stripe.android.networking.ConnectionFactory r0 = r4.connectionFactory
            com.stripe.android.networking.StripeConnection r0 = r0.create(r5)
            com.stripe.android.networking.StripeResponse r1 = r0.getResponse()     // Catch:{ all -> 0x0014 }
            com.stripe.android.Logger r2 = r4.logger     // Catch:{ all -> 0x0014 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0014 }
            r2.info(r3)     // Catch:{ all -> 0x0014 }
            goto L_0x0019
        L_0x0014:
            r1 = move-exception
            java.lang.Object r1 = i0.j.f.p.h.l0(r1)     // Catch:{ all -> 0x003e }
        L_0x0019:
            java.lang.Throwable r2 = kotlin.Result.a(r1)     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x0026
            com.stripe.android.networking.StripeResponse r1 = (com.stripe.android.networking.StripeResponse) r1     // Catch:{ all -> 0x003e }
            r5 = 0
            i0.j.f.p.h.H(r0, r5)
            return r1
        L_0x0026:
            com.stripe.android.Logger r1 = r4.logger     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "Exception while making Stripe API request"
            r1.error(r3, r2)     // Catch:{ all -> 0x003e }
            boolean r1 = r2 instanceof java.io.IOException     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003d
            com.stripe.android.exception.APIConnectionException$Companion r1 = com.stripe.android.exception.APIConnectionException.Companion     // Catch:{ all -> 0x003e }
            java.io.IOException r2 = (java.io.IOException) r2     // Catch:{ all -> 0x003e }
            java.lang.String r5 = r5.getBaseUrl()     // Catch:{ all -> 0x003e }
            com.stripe.android.exception.APIConnectionException r2 = r1.create$payments_core_release(r2, r5)     // Catch:{ all -> 0x003e }
        L_0x003d:
            throw r2     // Catch:{ all -> 0x003e }
        L_0x003e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r1 = move-exception
            i0.j.f.p.h.H(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.DefaultApiRequestExecutor.makeRequest(com.stripe.android.networking.StripeRequest):com.stripe.android.networking.StripeResponse");
    }

    public Object execute(ApiRequest apiRequest, c<? super StripeResponse> cVar) {
        return executeInternal$payments_core_release(apiRequest, 3, cVar);
    }

    public final Object executeInternal$payments_core_release(StripeRequest stripeRequest, int i, c<? super StripeResponse> cVar) {
        return a.k4(this.workContext, new DefaultApiRequestExecutor$executeInternal$2(this, stripeRequest, i, (c) null), cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultApiRequestExecutor(e eVar, ConnectionFactory connectionFactory2, RetryDelaySupplier retryDelaySupplier2, Logger logger2, int i, f fVar) {
        this((i & 1) != 0 ? m0.c : eVar, (i & 2) != 0 ? new ConnectionFactory.Default() : connectionFactory2, (i & 4) != 0 ? new RetryDelaySupplier(0, 1, (f) null) : retryDelaySupplier2, (i & 8) != 0 ? Logger.Companion.noop$payments_core_release() : logger2);
    }

    public Object execute(FileUploadRequest fileUploadRequest, c<? super StripeResponse> cVar) {
        return executeInternal$payments_core_release(fileUploadRequest, 3, cVar);
    }
}
