package com.stripe.android.networking;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.Logger;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.networking.ConnectionFactory;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.io.IOException;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "", "Lcom/stripe/android/networking/AnalyticsRequest;", "request", "Lm0/i;", "executeAsync", "(Lcom/stripe/android/networking/AnalyticsRequest;)V", "Default", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AnalyticsRequestExecutor.kt */
public interface AnalyticsRequestExecutor {
    void executeAsync(AnalyticsRequest analyticsRequest);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/networking/AnalyticsRequestExecutor$Default;", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/AnalyticsRequest;", "request", "", "execute$payments_core_release", "(Lcom/stripe/android/networking/AnalyticsRequest;)I", "execute", "Lm0/i;", "executeAsync", "(Lcom/stripe/android/networking/AnalyticsRequest;)V", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Lcom/stripe/android/networking/ConnectionFactory$Default;", "connectionFactory", "Lcom/stripe/android/networking/ConnectionFactory$Default;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "<init>", "(Lcom/stripe/android/Logger;Lm0/l/e;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AnalyticsRequestExecutor.kt */
    public static final class Default implements AnalyticsRequestExecutor {
        private final ConnectionFactory.Default connectionFactory;
        /* access modifiers changed from: private */
        public final Logger logger;
        private final e workContext;

        public Default() {
            this((Logger) null, (e) null, 3, (f) null);
        }

        public Default(Logger logger2, e eVar) {
            i.e(logger2, "logger");
            i.e(eVar, "workContext");
            this.logger = logger2;
            this.workContext = eVar;
            this.connectionFactory = new ConnectionFactory.Default();
        }

        public final int execute$payments_core_release(AnalyticsRequest analyticsRequest) {
            i.e(analyticsRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
            StripeConnection create = this.connectionFactory.create(analyticsRequest);
            try {
                int responseCode = create.getResponseCode();
                h.H(create, (Throwable) null);
                return responseCode;
            } catch (IOException e) {
                throw APIConnectionException.Companion.create$payments_core_release(e, analyticsRequest.getBaseUrl());
            } catch (Throwable th) {
                h.H(create, r4);
                throw th;
            }
        }

        public void executeAsync(AnalyticsRequest analyticsRequest) {
            i.e(analyticsRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
            Logger logger2 = this.logger;
            StringBuilder P0 = a.P0("Event: ");
            P0.append(analyticsRequest.getParams().get("event"));
            logger2.info(P0.toString());
            m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.workContext), (e) null, (CoroutineStart) null, new AnalyticsRequestExecutor$Default$executeAsync$1(this, analyticsRequest, (c) null), 3, (Object) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Default(Logger logger2, e eVar, int i, f fVar) {
            this((i & 1) != 0 ? Logger.Companion.noop$payments_core_release() : logger2, (i & 2) != 0 ? m0.c : eVar);
        }
    }
}
