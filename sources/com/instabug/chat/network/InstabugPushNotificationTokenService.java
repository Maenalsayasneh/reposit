package com.instabug.chat.network;

import com.instabug.library.core.InstabugCore;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import i0.j.c.k.d.d;
import i0.j.c.k.d.f;
import i0.j.c.k.d.g;
import i0.j.c.k.d.h;
import i0.j.c.k.d.i;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import k0.b.r;
import k0.b.z.e.d.a;
import k0.b.z.e.d.b;

public class InstabugPushNotificationTokenService extends InstabugNetworkBasedBackgroundService {
    public static final /* synthetic */ int c = 0;

    public void runBackgroundTask() {
        String pushNotificationToken = InstabugCore.getPushNotificationToken();
        d a = d.a();
        Objects.requireNonNull(a);
        r onAssembly = RxJavaPlugins.onAssembly(new a(new i(a, this)));
        h hVar = new h(pushNotificationToken);
        Objects.requireNonNull(onAssembly);
        r onAssembly2 = RxJavaPlugins.onAssembly(new b(onAssembly, hVar));
        g gVar = new g(a);
        Objects.requireNonNull(onAssembly2);
        RxJavaPlugins.onAssembly(new SingleFlatMapObservable(onAssembly2, gVar)).l(new f()).f(k0.b.d0.a.b()).a(new i0.j.c.k.a());
    }
}
