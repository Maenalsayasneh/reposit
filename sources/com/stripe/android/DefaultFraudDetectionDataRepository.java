package com.stripe.android;

import android.content.Context;
import com.stripe.android.networking.ConnectionFactory;
import com.stripe.android.networking.DefaultFraudDetectionDataRequestExecutor;
import com.stripe.android.networking.DefaultFraudDetectionDataRequestFactory;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.networking.FraudDetectionDataRequestExecutor;
import com.stripe.android.networking.FraudDetectionDataRequestFactory;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0017\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataRepository;", "Lcom/stripe/android/FraudDetectionDataRepository;", "Lm0/i;", "refresh", "()V", "Lcom/stripe/android/networking/FraudDetectionData;", "getLatest", "(Lm0/l/c;)Ljava/lang/Object;", "getCached", "()Lcom/stripe/android/networking/FraudDetectionData;", "fraudDetectionData", "save", "(Lcom/stripe/android/networking/FraudDetectionData;)V", "Lcom/stripe/android/networking/FraudDetectionDataRequestExecutor;", "fraudDetectionDataRequestExecutor", "Lcom/stripe/android/networking/FraudDetectionDataRequestExecutor;", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "fraudDetectionDataRequestFactory", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "Lcom/stripe/android/FraudDetectionDataStore;", "localStore", "Lcom/stripe/android/FraudDetectionDataStore;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "cachedFraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "Lkotlin/Function0;", "", "timestampSupplier", "Lm0/n/a/a;", "<init>", "(Lcom/stripe/android/FraudDetectionDataStore;Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataRequestExecutor;Lm0/l/e;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Lm0/l/e;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRepository.kt */
public final class DefaultFraudDetectionDataRepository implements FraudDetectionDataRepository {
    /* access modifiers changed from: private */
    public FraudDetectionData cachedFraudDetectionData;
    /* access modifiers changed from: private */
    public final FraudDetectionDataRequestExecutor fraudDetectionDataRequestExecutor;
    /* access modifiers changed from: private */
    public final FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory;
    /* access modifiers changed from: private */
    public final FraudDetectionDataStore localStore;
    /* access modifiers changed from: private */
    public final a<Long> timestampSupplier;
    private final e workContext;

    public DefaultFraudDetectionDataRepository(Context context) {
        this(context, (e) null, 2, (f) null);
    }

    public DefaultFraudDetectionDataRepository(FraudDetectionDataStore fraudDetectionDataStore, FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory2, FraudDetectionDataRequestExecutor fraudDetectionDataRequestExecutor2, e eVar) {
        i.e(fraudDetectionDataStore, "localStore");
        i.e(fraudDetectionDataRequestFactory2, "fraudDetectionDataRequestFactory");
        i.e(fraudDetectionDataRequestExecutor2, "fraudDetectionDataRequestExecutor");
        i.e(eVar, "workContext");
        this.localStore = fraudDetectionDataStore;
        this.fraudDetectionDataRequestFactory = fraudDetectionDataRequestFactory2;
        this.fraudDetectionDataRequestExecutor = fraudDetectionDataRequestExecutor2;
        this.workContext = eVar;
        this.timestampSupplier = DefaultFraudDetectionDataRepository$timestampSupplier$1.INSTANCE;
    }

    public FraudDetectionData getCached() {
        FraudDetectionData fraudDetectionData = this.cachedFraudDetectionData;
        if (Stripe.Companion.getAdvancedFraudSignalsEnabled()) {
            return fraudDetectionData;
        }
        return null;
    }

    public Object getLatest(c<? super FraudDetectionData> cVar) {
        return m0.r.t.a.r.m.a1.a.k4(this.workContext, new DefaultFraudDetectionDataRepository$getLatest$2(this, (c) null), cVar);
    }

    public void refresh() {
        if (Stripe.Companion.getAdvancedFraudSignalsEnabled()) {
            m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.workContext), (e) null, (CoroutineStart) null, new DefaultFraudDetectionDataRepository$refresh$1(this, (c) null), 3, (Object) null);
        }
    }

    public void save(FraudDetectionData fraudDetectionData) {
        i.e(fraudDetectionData, "fraudDetectionData");
        this.cachedFraudDetectionData = fraudDetectionData;
        this.localStore.save(fraudDetectionData);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRepository(Context context, e eVar) {
        this((FraudDetectionDataStore) new DefaultFraudDetectionDataStore(context, eVar), (FraudDetectionDataRequestFactory) new DefaultFraudDetectionDataRequestFactory(context), (FraudDetectionDataRequestExecutor) new DefaultFraudDetectionDataRequestExecutor((ConnectionFactory) null, eVar, 1, (f) null), eVar);
        i.e(context, "context");
        i.e(eVar, "workContext");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRepository(Context context, e eVar, int i, f fVar) {
        this(context, (i & 2) != 0 ? m0.c : eVar);
    }
}
