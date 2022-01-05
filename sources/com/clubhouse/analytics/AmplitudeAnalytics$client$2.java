package com.clubhouse.analytics;

import android.content.Context;
import i0.c.a.d;
import i0.c.a.f;
import i0.c.a.k;
import i0.c.a.r;
import i0.e.b.f3.e;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import q0.f;

/* compiled from: AmplitudeAnalytics.kt */
public final class AmplitudeAnalytics$client$2 extends Lambda implements a<f> {
    public final /* synthetic */ Context c;
    public final /* synthetic */ e d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeAnalytics$client$2(Context context, e eVar) {
        super(0);
        this.c = context;
        this.d = eVar;
    }

    public Object invoke() {
        f fVar;
        Map<String, f> map = d.a;
        synchronized (d.class) {
            String e = r.e((String) null);
            Map<String, f> map2 = d.a;
            f fVar2 = map2.get(e);
            if (fVar2 == null) {
                fVar2 = new f(e);
                map2.put(e, fVar2);
            }
            fVar = fVar2;
        }
        Context context = this.c;
        Objects.requireNonNull(this.d);
        synchronized (fVar) {
            fVar.f(context, "9098a21a950e7cb0933fb5b30affe5be", (String) null, (String) null, (f.a) null);
        }
        k.a.b = false;
        k.a.c = 2;
        return fVar;
    }
}
