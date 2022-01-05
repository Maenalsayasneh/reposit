package com.clubhouse.analytics;

import com.stripe.android.model.PaymentMethodOptionsParams;
import i0.c.a.f;
import i0.c.a.p;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AmplitudeAnalytics.kt */
public final class AmplitudeAnalytics$setMicrophonePermissionsGranted$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeAnalytics$setMicrophonePermissionsGranted$1(boolean z) {
        super(1);
        this.c = z;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        m0.n.b.i.e(fVar, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        p pVar = new p();
        pVar.a("Microphone", m0.n.b.i.a(Boolean.valueOf(this.c), Boolean.TRUE) ? "YES" : "NO");
        fVar.c(pVar);
        return i.a;
    }
}
