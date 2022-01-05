package com.clubhouse.analytics;

import com.stripe.android.model.PaymentMethodOptionsParams;
import i0.c.a.f;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import org.json.JSONObject;

/* compiled from: AmplitudeAnalytics.kt */
public final class AmplitudeAnalytics$trackEvent$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeAnalytics$trackEvent$1(String str) {
        super(1);
        this.c = str;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        m0.n.b.i.e(fVar, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        fVar.h(this.c, (JSONObject) null);
        return i.a;
    }
}
