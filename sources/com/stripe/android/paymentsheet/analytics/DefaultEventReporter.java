package com.stripe.android.paymentsheet.analytics;

import android.content.Context;
import com.instabug.library.model.session.config.SessionsConfigParameter;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(B-\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010+J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "event", "Lm0/i;", "fireEvent", "(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "configuration", "onInit", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "onDismiss", "()V", "onShowExistingPaymentOptions", "onShowNewPaymentOptionForm", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "onSelectPaymentOption", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "onPaymentSuccess", "onPaymentFailure", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "sessionId", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "Lcom/stripe/android/paymentsheet/analytics/DeviceIdRepository;", "deviceIdRepository", "Lcom/stripe/android/paymentsheet/analytics/DeviceIdRepository;", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "analyticsRequestFactory", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/SessionId;Lcom/stripe/android/paymentsheet/analytics/DeviceIdRepository;Lcom/stripe/android/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/AnalyticsRequestFactory;Lm0/l/e;)V", "Landroid/content/Context;", "context", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/SessionId;Landroid/content/Context;Lm0/l/e;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultEventReporter.kt */
public final class DefaultEventReporter implements EventReporter {
    /* access modifiers changed from: private */
    public final AnalyticsRequestExecutor analyticsRequestExecutor;
    /* access modifiers changed from: private */
    public final AnalyticsRequestFactory analyticsRequestFactory;
    /* access modifiers changed from: private */
    public final DeviceIdRepository deviceIdRepository;
    private final EventReporter.Mode mode;
    /* access modifiers changed from: private */
    public final SessionId sessionId;
    private final e workContext;

    public DefaultEventReporter(EventReporter.Mode mode2, SessionId sessionId2, DeviceIdRepository deviceIdRepository2, AnalyticsRequestExecutor analyticsRequestExecutor2, AnalyticsRequestFactory analyticsRequestFactory2, e eVar) {
        i.e(mode2, SessionsConfigParameter.SYNC_MODE);
        i.e(deviceIdRepository2, "deviceIdRepository");
        i.e(analyticsRequestExecutor2, "analyticsRequestExecutor");
        i.e(analyticsRequestFactory2, "analyticsRequestFactory");
        i.e(eVar, "workContext");
        this.mode = mode2;
        this.sessionId = sessionId2;
        this.deviceIdRepository = deviceIdRepository2;
        this.analyticsRequestExecutor = analyticsRequestExecutor2;
        this.analyticsRequestFactory = analyticsRequestFactory2;
        this.workContext = eVar;
    }

    private final void fireEvent(PaymentSheetEvent paymentSheetEvent) {
        a.E2(a.h(this.workContext), (e) null, (CoroutineStart) null, new DefaultEventReporter$fireEvent$1(this, paymentSheetEvent, (c) null), 3, (Object) null);
    }

    public void onDismiss() {
        fireEvent(new PaymentSheetEvent.Dismiss(this.mode));
    }

    public void onInit(PaymentSheet.Configuration configuration) {
        fireEvent(new PaymentSheetEvent.Init(this.mode, configuration));
    }

    public void onPaymentFailure(PaymentSelection paymentSelection) {
        fireEvent(new PaymentSheetEvent.Payment(this.mode, PaymentSheetEvent.Payment.Result.Failure, paymentSelection));
    }

    public void onPaymentSuccess(PaymentSelection paymentSelection) {
        fireEvent(new PaymentSheetEvent.Payment(this.mode, PaymentSheetEvent.Payment.Result.Success, paymentSelection));
    }

    public void onSelectPaymentOption(PaymentSelection paymentSelection) {
        i.e(paymentSelection, "paymentSelection");
        fireEvent(new PaymentSheetEvent.SelectPaymentOption(this.mode, paymentSelection));
    }

    public void onShowExistingPaymentOptions() {
        fireEvent(new PaymentSheetEvent.ShowExistingPaymentOptions(this.mode));
    }

    public void onShowNewPaymentOptionForm() {
        fireEvent(new PaymentSheetEvent.ShowNewPaymentOptionForm(this.mode));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultEventReporter(EventReporter.Mode mode2, SessionId sessionId2, Context context, e eVar) {
        this(mode2, sessionId2, (DeviceIdRepository) new DefaultDeviceIdRepository(context, eVar), (AnalyticsRequestExecutor) new AnalyticsRequestExecutor.Default((Logger) null, (e) null, 3, (f) null), new AnalyticsRequestFactory(context, PaymentConfiguration.Companion.getInstance(context).getPublishableKey()), eVar);
        i.e(mode2, SessionsConfigParameter.SYNC_MODE);
        i.e(context, "context");
        i.e(eVar, "workContext");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultEventReporter(EventReporter.Mode mode2, SessionId sessionId2, Context context, e eVar, int i, f fVar) {
        this(mode2, sessionId2, context, (i & 8) != 0 ? m0.c : eVar);
    }
}
