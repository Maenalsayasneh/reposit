package com.stripe.android.paymentsheet;

import android.app.Application;
import android.content.Context;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.SessionId;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "invoke", "()Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsActivity.kt */
public final class PaymentOptionsActivity$eventReporter$2 extends Lambda implements a<DefaultEventReporter> {
    public final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$eventReporter$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    public final DefaultEventReporter invoke() {
        EventReporter.Mode mode = EventReporter.Mode.Custom;
        PaymentOptionContract.Args access$getStarterArgs$p = this.this$0.getStarterArgs();
        SessionId sessionId = access$getStarterArgs$p != null ? access$getStarterArgs$p.getSessionId() : null;
        Application application = this.this$0.getApplication();
        i.d(application, "application");
        return new DefaultEventReporter(mode, sessionId, (Context) application, (e) null, 8, (f) null);
    }
}
