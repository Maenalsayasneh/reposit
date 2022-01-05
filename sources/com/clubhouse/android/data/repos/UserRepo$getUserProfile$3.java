package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.e.a.a;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: UserRepo.kt */
public final class UserRepo$getUserProfile$3 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ UserRepo c;
    public final /* synthetic */ Integer d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getUserProfile$3(UserRepo userRepo, Integer num) {
        super(1);
        this.c = userRepo;
        this.d = num;
    }

    public Object invoke(Object obj) {
        Map map;
        m0.n.b.i.e((Exception) obj, "it");
        a aVar = this.c.i;
        Integer num = this.d;
        if (num == null) {
            map = null;
        } else {
            num.intValue();
            map = h.S2(new Pair("UserId", num));
        }
        if (map == null) {
            map = g.o();
        }
        ((AmplitudeAnalytics) aVar).b("Server-GetProfile-Error", map);
        return i.a;
    }
}
