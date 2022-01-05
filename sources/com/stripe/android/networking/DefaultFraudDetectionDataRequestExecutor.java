package com.stripe.android.networking;

import com.stripe.android.networking.ConnectionFactory;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestExecutor;", "Lcom/stripe/android/networking/FraudDetectionDataRequestExecutor;", "Lcom/stripe/android/networking/FraudDetectionDataRequest;", "request", "Lcom/stripe/android/networking/FraudDetectionData;", "executeInternal", "(Lcom/stripe/android/networking/FraudDetectionDataRequest;)Lcom/stripe/android/networking/FraudDetectionData;", "execute", "(Lcom/stripe/android/networking/FraudDetectionDataRequest;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/networking/ConnectionFactory;", "connectionFactory", "Lcom/stripe/android/networking/ConnectionFactory;", "Lkotlin/Function0;", "", "timestampSupplier", "Lm0/n/a/a;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "<init>", "(Lcom/stripe/android/networking/ConnectionFactory;Lm0/l/e;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRequestExecutor.kt */
public final class DefaultFraudDetectionDataRequestExecutor implements FraudDetectionDataRequestExecutor {
    private final ConnectionFactory connectionFactory;
    private final a<Long> timestampSupplier;
    private final e workContext;

    public DefaultFraudDetectionDataRequestExecutor() {
        this((ConnectionFactory) null, (e) null, 3, (f) null);
    }

    public DefaultFraudDetectionDataRequestExecutor(ConnectionFactory connectionFactory2, e eVar) {
        i.e(connectionFactory2, "connectionFactory");
        i.e(eVar, "workContext");
        this.connectionFactory = connectionFactory2;
        this.workContext = eVar;
        this.timestampSupplier = DefaultFraudDetectionDataRequestExecutor$timestampSupplier$1.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        i0.j.f.p.h.H(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.stripe.android.networking.FraudDetectionData executeInternal(com.stripe.android.networking.FraudDetectionDataRequest r5) {
        /*
            r4 = this;
            com.stripe.android.networking.ConnectionFactory r0 = r4.connectionFactory
            com.stripe.android.networking.StripeConnection r5 = r0.create(r5)
            r0 = 0
            com.stripe.android.networking.StripeResponse r1 = r5.getResponse()     // Catch:{ all -> 0x0027 }
            boolean r2 = r1.isOk$payments_core_release()     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            if (r1 == 0) goto L_0x0025
            com.stripe.android.model.parsers.FraudDetectionDataJsonParser r2 = new com.stripe.android.model.parsers.FraudDetectionDataJsonParser     // Catch:{ all -> 0x0027 }
            m0.n.a.a<java.lang.Long> r3 = r4.timestampSupplier     // Catch:{ all -> 0x0027 }
            r2.<init>(r3)     // Catch:{ all -> 0x0027 }
            org.json.JSONObject r1 = r1.getResponseJson$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.FraudDetectionData r1 = r2.parse((org.json.JSONObject) r1)     // Catch:{ all -> 0x0027 }
            goto L_0x002c
        L_0x0025:
            r1 = r0
            goto L_0x002c
        L_0x0027:
            r1 = move-exception
            java.lang.Object r1 = i0.j.f.p.h.l0(r1)     // Catch:{ all -> 0x0037 }
        L_0x002c:
            boolean r2 = r1 instanceof kotlin.Result.Failure     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0031
            r1 = r0
        L_0x0031:
            com.stripe.android.networking.FraudDetectionData r1 = (com.stripe.android.networking.FraudDetectionData) r1     // Catch:{ all -> 0x0037 }
            i0.j.f.p.h.H(r5, r0)
            return r1
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            i0.j.f.p.h.H(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.DefaultFraudDetectionDataRequestExecutor.executeInternal(com.stripe.android.networking.FraudDetectionDataRequest):com.stripe.android.networking.FraudDetectionData");
    }

    public Object execute(FraudDetectionDataRequest fraudDetectionDataRequest, c<? super FraudDetectionData> cVar) {
        return m0.r.t.a.r.m.a1.a.k4(this.workContext, new DefaultFraudDetectionDataRequestExecutor$execute$2(this, fraudDetectionDataRequest, (c) null), cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRequestExecutor(ConnectionFactory connectionFactory2, e eVar, int i, f fVar) {
        this((i & 1) != 0 ? new ConnectionFactory.Default() : connectionFactory2, (i & 2) != 0 ? m0.c : eVar);
    }
}
