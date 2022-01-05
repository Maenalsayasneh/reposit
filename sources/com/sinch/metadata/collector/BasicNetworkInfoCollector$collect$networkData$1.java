package com.sinch.metadata.collector;

import com.sinch.metadata.model.network.NetworkData;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.n.a.a;

/* compiled from: BasicNetworkInfoCollector.kt */
public final /* synthetic */ class BasicNetworkInfoCollector$collect$networkData$1 extends FunctionReferenceImpl implements a<NetworkData> {
    public BasicNetworkInfoCollector$collect$networkData$1(BasicNetworkInfoCollector basicNetworkInfoCollector) {
        super(0, basicNetworkInfoCollector, BasicNetworkInfoCollector.class, "collectNetworkData", "collectNetworkData()Lcom/sinch/metadata/model/network/NetworkData;", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.receiver
            com.sinch.metadata.collector.BasicNetworkInfoCollector r0 = (com.sinch.metadata.collector.BasicNetworkInfoCollector) r0
            com.sinch.metadata.model.network.NetworkData r1 = new com.sinch.metadata.model.network.NetworkData
            m0.c r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.Network r2 = r0.getActiveNetwork()
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r2)
            if (r0 == 0) goto L_0x0045
            com.sinch.metadata.model.network.NetworkType$Companion r2 = com.sinch.metadata.model.network.NetworkType.Companion
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = "capabilities"
            m0.n.b.i.e(r0, r2)
            r2 = 1
            boolean r2 = r0.hasTransport(r2)
            if (r2 == 0) goto L_0x002c
            com.sinch.metadata.model.network.NetworkType r0 = com.sinch.metadata.model.network.NetworkType.WIFI
            goto L_0x0042
        L_0x002c:
            r2 = 0
            boolean r2 = r0.hasTransport(r2)
            if (r2 == 0) goto L_0x0036
            com.sinch.metadata.model.network.NetworkType r0 = com.sinch.metadata.model.network.NetworkType.MOBILE
            goto L_0x0042
        L_0x0036:
            r2 = 3
            boolean r0 = r0.hasTransport(r2)
            if (r0 == 0) goto L_0x0040
            com.sinch.metadata.model.network.NetworkType r0 = com.sinch.metadata.model.network.NetworkType.ETHERNET
            goto L_0x0042
        L_0x0040:
            com.sinch.metadata.model.network.NetworkType r0 = com.sinch.metadata.model.network.NetworkType.NONE
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            com.sinch.metadata.model.network.NetworkType r0 = com.sinch.metadata.model.network.NetworkType.NONE
        L_0x0047:
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sinch.metadata.collector.BasicNetworkInfoCollector$collect$networkData$1.invoke():java.lang.Object");
    }
}
