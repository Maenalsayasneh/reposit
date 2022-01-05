package com.stripe.android.cards;

import android.content.Context;
import com.stripe.android.AppInfo;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.Token;
import com.stripe.android.networking.AnalyticsEvent;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.ApiRequestExecutor;
import com.stripe.android.networking.FraudDetectionDataParamsUtils;
import com.stripe.android.networking.StripeApiRepository;
import i0.j.f.p.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import n0.a.g2.d;
import n0.a.g2.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "createRemoteCardAccountRangeSource", "()Lcom/stripe/android/cards/CardAccountRangeSource;", "", "publishableKey", "Lcom/stripe/android/networking/AnalyticsEvent;", "event", "Lm0/i;", "fireAnalyticsEvent", "(Ljava/lang/String;Lcom/stripe/android/networking/AnalyticsEvent;)V", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "create", "()Lcom/stripe/android/cards/CardAccountRangeRepository;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "context", "<init>", "(Landroid/content/Context;Lcom/stripe/android/networking/AnalyticsRequestExecutor;)V", "(Landroid/content/Context;)V", "NullCardAccountRangeSource", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultCardAccountRangeRepositoryFactory.kt */
public final class DefaultCardAccountRangeRepositoryFactory implements CardAccountRangeRepository.Factory {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Context appContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory$NullCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lm0/l/c;)Ljava/lang/Object;", "Ln0/a/g2/d;", "", "loading", "Ln0/a/g2/d;", "getLoading", "()Ln0/a/g2/d;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultCardAccountRangeRepositoryFactory.kt */
    public static final class NullCardAccountRangeSource implements CardAccountRangeSource {
        private final d<Boolean> loading = new f(Boolean.FALSE);

        public Object getAccountRange(CardNumber.Unvalidated unvalidated, c<? super AccountRange> cVar) {
            return null;
        }

        public d<Boolean> getLoading() {
            return this.loading;
        }
    }

    public DefaultCardAccountRangeRepositoryFactory(Context context, AnalyticsRequestExecutor analyticsRequestExecutor2) {
        i.e(context, "context");
        i.e(analyticsRequestExecutor2, "analyticsRequestExecutor");
        this.analyticsRequestExecutor = analyticsRequestExecutor2;
        this.appContext = context.getApplicationContext();
    }

    private final CardAccountRangeSource createRemoteCardAccountRangeSource() {
        Object obj;
        try {
            PaymentConfiguration.Companion companion = PaymentConfiguration.Companion;
            Context context = this.appContext;
            i.d(context, "appContext");
            obj = companion.getInstance(context).getPublishableKey();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        if (!(obj instanceof Result.Failure)) {
            fireAnalyticsEvent((String) obj, AnalyticsEvent.CardMetadataPublishableKeyAvailable);
        }
        if (Result.a(obj) != null) {
            fireAnalyticsEvent(ApiRequest.Options.UNDEFINED_PUBLISHABLE_KEY, AnalyticsEvent.CardMetadataPublishableKeyUnavailable);
        }
        if (Result.a(obj) != null) {
            return new NullCardAccountRangeSource();
        }
        String str = (String) obj;
        Context context2 = this.appContext;
        i.d(context2, "appContext");
        StripeApiRepository stripeApiRepository = new StripeApiRepository(context2, str, (AppInfo) null, (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8188, (m0.n.b.f) null);
        ApiRequest.Options options = new ApiRequest.Options(str, (String) null, (String) null, 6, (m0.n.b.f) null);
        Context context3 = this.appContext;
        i.d(context3, "appContext");
        DefaultCardAccountRangeStore defaultCardAccountRangeStore = new DefaultCardAccountRangeStore(context3);
        AnalyticsRequestExecutor.Default defaultR = new AnalyticsRequestExecutor.Default((Logger) null, (e) null, 3, (m0.n.b.f) null);
        Context context4 = this.appContext;
        i.d(context4, "appContext");
        return new RemoteCardAccountRangeSource(stripeApiRepository, options, defaultCardAccountRangeStore, defaultR, new AnalyticsRequestFactory(context4, str));
    }

    private final void fireAnalyticsEvent(String str, AnalyticsEvent analyticsEvent) {
        AnalyticsRequestExecutor analyticsRequestExecutor2 = this.analyticsRequestExecutor;
        Context context = this.appContext;
        i.d(context, "appContext");
        analyticsRequestExecutor2.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(new AnalyticsRequestFactory(context, str), analyticsEvent, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }

    public CardAccountRangeRepository create() throws IllegalStateException {
        Context context = this.appContext;
        i.d(context, "appContext");
        DefaultCardAccountRangeStore defaultCardAccountRangeStore = new DefaultCardAccountRangeStore(context);
        return new DefaultCardAccountRangeRepository(new InMemoryCardAccountRangeSource(defaultCardAccountRangeStore), createRemoteCardAccountRangeSource(), new StaticCardAccountRangeSource((StaticCardAccountRanges) null, 1, (m0.n.b.f) null), defaultCardAccountRangeStore);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeRepositoryFactory(Context context) {
        this(context, new AnalyticsRequestExecutor.Default((Logger) null, (e) null, 3, (m0.n.b.f) null));
        i.e(context, "context");
    }
}
