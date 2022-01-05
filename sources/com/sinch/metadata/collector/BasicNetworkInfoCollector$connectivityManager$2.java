package com.sinch.metadata.collector;

import android.net.ConnectivityManager;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: BasicNetworkInfoCollector.kt */
public final class BasicNetworkInfoCollector$connectivityManager$2 extends Lambda implements a<ConnectivityManager> {
    public final /* synthetic */ BasicNetworkInfoCollector c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicNetworkInfoCollector$connectivityManager$2(BasicNetworkInfoCollector basicNetworkInfoCollector) {
        super(0);
        this.c = basicNetworkInfoCollector;
    }

    public Object invoke() {
        Object systemService = this.c.d.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }
}
