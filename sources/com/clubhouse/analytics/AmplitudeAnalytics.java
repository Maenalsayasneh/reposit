package com.clubhouse.analytics;

import android.content.Context;
import com.clubhouse.android.shared.Flag;
import i0.c.a.f;
import i0.e.a.a;
import i0.e.b.f3.e;
import i0.e.b.h3.a.b;
import i0.j.f.p.h;
import java.util.Map;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: AmplitudeAnalytics.kt */
public final class AmplitudeAnalytics implements a {
    public final i0.e.b.f3.i.a a;
    public final c b;

    public AmplitudeAnalytics(Context context, e eVar, i0.e.b.f3.i.a aVar) {
        i.e(context, "context");
        i.e(eVar, "environment");
        i.e(aVar, "userComponentHandler");
        this.a = aVar;
        this.b = h.H2(new AmplitudeAnalytics$client$2(context, eVar));
    }

    public void a(String str) {
        i.e(str, "event");
        c(new AmplitudeAnalytics$trackEvent$1(str));
    }

    public void b(String str, Map<String, ? extends Object> map) {
        i.e(str, "event");
        i.e(map, "props");
        c(new AmplitudeAnalytics$trackEvent$2(str, map));
    }

    public final void c(l<? super f, m0.i> lVar) {
        b bVar = this.a.d;
        boolean z = true;
        if (bVar == null || !((i0.e.b.f3.h) h.L0(bVar, i0.e.b.f3.h.class)).e().a(Flag.DisableAmplitude)) {
            z = false;
        }
        if (!z) {
            Object value = this.b.getValue();
            i.d(value, "<get-client>(...)");
            lVar.invoke((f) value);
        }
    }
}
