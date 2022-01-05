package com.clubhouse.analytics;

import com.stripe.android.model.PaymentMethodOptionsParams;
import i0.c.a.f;
import i0.c.a.j;
import i0.c.a.p;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AmplitudeAnalytics.kt */
public final class AmplitudeAnalytics$setUserId$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ Integer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeAnalytics$setUserId$1(Integer num) {
        super(1);
        this.c = num;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        m0.n.b.i.e(fVar, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        String valueOf = String.valueOf(this.c);
        if (fVar.a("setUserId()")) {
            fVar.n(new j(fVar, fVar, false, valueOf));
        }
        p pVar = new p();
        pVar.a("MyUserId", String.valueOf(this.c));
        fVar.c(pVar);
        return i.a;
    }
}
