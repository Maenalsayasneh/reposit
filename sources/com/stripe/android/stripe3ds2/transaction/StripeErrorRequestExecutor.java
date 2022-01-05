package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeHttpClient;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "errorData", "Lm0/i;", "executeAsync", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "httpClient", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/HttpClient;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lm0/l/e;)V", "Companion", "Factory", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeErrorRequestExecutor.kt */
public final class StripeErrorRequestExecutor implements ErrorRequestExecutor {
    @Deprecated
    private static final String CONTENT_TYPE = "application/json; charset=utf-8";
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public final ErrorReporter errorReporter;
    /* access modifiers changed from: private */
    public final HttpClient httpClient;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Companion;", "", "", "CONTENT_TYPE", "Ljava/lang/String;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeErrorRequestExecutor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "", "acsUrl", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "create", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeErrorRequestExecutor.kt */
    public static final class Factory implements ErrorRequestExecutor.Factory {
        public ErrorRequestExecutor create(String str, ErrorReporter errorReporter) {
            i.e(str, "acsUrl");
            i.e(errorReporter, "errorReporter");
            return new StripeErrorRequestExecutor(new StripeHttpClient(str, (StripeHttpClient.ConnectionFactory) null, errorReporter, (e) null, 10, (f) null), errorReporter, m0.c);
        }
    }

    public StripeErrorRequestExecutor(HttpClient httpClient2, ErrorReporter errorReporter2, e eVar) {
        i.e(httpClient2, "httpClient");
        i.e(errorReporter2, "errorReporter");
        i.e(eVar, "workContext");
        this.httpClient = httpClient2;
        this.errorReporter = errorReporter2;
        this.workContext = eVar;
    }

    public void executeAsync(ErrorData errorData) {
        Object obj;
        i.e(errorData, "errorData");
        try {
            obj = errorData.toJson$3ds2sdk_release().toString();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            this.errorReporter.reportError(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, a));
        }
        if (obj instanceof Result.Failure) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            a.E2(a.h(this.workContext), (e) null, (CoroutineStart) null, new StripeErrorRequestExecutor$executeAsync$$inlined$let$lambda$1(str, (c) null, this), 3, (Object) null);
        }
    }
}
